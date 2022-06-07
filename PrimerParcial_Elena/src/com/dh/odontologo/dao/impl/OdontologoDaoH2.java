package com.dh.odontologo.dao.impl;

import com.dh.odontologo.dao.IDao;
import com.dh.odontologo.entity.Odontologo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class OdontologoDaoH2 implements IDao<Odontologo> {

    private final static String DRIVER_JDBC = "org.h2.Driver";

    private final static String URL_DB = "jdbc:h2:~/clinicaOdontologica;INIT=RUNSCRIPT FROM 'create.sql'";

    private static final String USER_DB = "sa";

    private static final String PASS_DB = "";

    final static Logger logger = Logger.getLogger(OdontologoDaoH2.class);
    @Override
    public Odontologo registrar(Odontologo odontologo){

        Connection connection = null;
        Statement statement = null;
        PreparedStatement preparedStatement = null;

        String query = String.format("INSERT INTO ODONTOLOGO (NRO_MATRICULA, NOMBRE, APELLIDO) VALUES ('%s', '%s', '%s')", odontologo.getNroMatricula(), odontologo.getNombre(), odontologo.getApellido());

        try{
            Class.forName(DRIVER_JDBC);
            connection = DriverManager.getConnection(URL_DB, USER_DB, PASS_DB);

            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);

            ResultSet keys = statement.getGeneratedKeys();
            if(keys.next()){
                odontologo.setId(keys.getInt(1));
                statement.close();
            }

            logger.debug("Se agregó un nuevo odontólogo: " + odontologo.toString());

        } catch (SQLException | ClassNotFoundException e) {
            logger.error("Error: " + e);
            e.printStackTrace();
        }

        return odontologo;
    }

    @Override
    public List<Odontologo> listarTodos() {
        Connection connection = null;
        Statement statement = null;
        List<Odontologo> odontologos = new ArrayList<>();
        String query = "SELECT * FROM ODONTOLOGO";

        try{
            Class.forName(DRIVER_JDBC);
            connection = DriverManager.getConnection(URL_DB, USER_DB, PASS_DB);

            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while(resultSet.next()){
                Integer id = resultSet.getInt("ID");
                String nroMatricula = resultSet.getString("NRO_MATRICULA");
                String nombre = resultSet.getString("NOMBRE");
                String apellido = resultSet.getString("APELLIDO");

                odontologos.add(new Odontologo(id, nroMatricula, nombre, apellido));
            }

            statement.close();
            logger.info("Se cerró la conexión");

        } catch (SQLException | ClassNotFoundException e) {
            logger.error("Error: " + e);
            e.printStackTrace();
        }

        logger.debug("Se retorna lista de odontólogos");
        return odontologos;
    }
}
