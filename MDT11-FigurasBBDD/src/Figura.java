import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Figura {

    private static final Logger logger = Logger.getLogger(Figura.class);
    private static final String createTable = "DROP TABLE IF EXISTS FIGURA;" +
            "CREATE TABLE FIGURA" +
            "(" +
            "ID INT PRIMARY KEY," +
            "NOMBRE varchar(50) NOT NULL," +
            "COLOR varchar(25) NOT NULL" +
            ")";

    private static final String figuraInsert = "INSERT INTO FIGURA (ID, NOMBRE, COLOR) VALUES (001, 'Triángulo', " +
            "'Rojo')";
    private static final String figuraInsert2 = "INSERT INTO FIGURA (ID, NOMBRE, COLOR) VALUES (002, 'Cuadrado', " +
            "'Azul')";
    private static final String figuraInsert3 = "INSERT INTO FIGURA (ID, NOMBRE, COLOR) VALUES (003, 'Círculo', " +
            "'Amarillo')";
    private static final String figuraInsert4 = "INSERT INTO FIGURA (ID, NOMBRE, COLOR) VALUES (004, 'Rectángulo', " +
            "'Verde')";

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }


    public static void main(String[] args) throws Exception{

        File lof4jfile = new File("src/logging/config/log4j.properties");
        PropertyConfigurator.configure(lof4jfile.getAbsolutePath());

        Connection connection = null;

        try {
            connection = getConnection();
            logger.info("Se conectó a la BBDD");

            Statement statement = connection.createStatement();

            statement.execute(createTable);
            statement.execute(figuraInsert);
            statement.execute(figuraInsert2);
            statement.execute(figuraInsert3);
            statement.execute(figuraInsert4);

            String consultaSQL = "SELECT * FROM FIGURA";

            ResultSet resultSet = statement.executeQuery(consultaSQL);

            while (resultSet.next()){
                System.out.println(resultSet.getInt(1) + " - " +resultSet.getString(2) + " - " + resultSet.getString(3));
                logger.info(resultSet.getInt(1) + " - " +resultSet.getString(2) + " - " + resultSet.getString(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Se produjo el siguiente error: " + e);
        } finally {
            connection.close();
            logger.info("Se cerró la conexión");
        }


    }
}
