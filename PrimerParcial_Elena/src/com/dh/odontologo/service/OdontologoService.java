package com.dh.odontologo.service;

import com.dh.odontologo.dao.IDao;
import com.dh.odontologo.entity.Odontologo;

import java.sql.SQLException;
import java.util.List;

public class OdontologoService {

    private IDao<Odontologo> odontologoDao;

    public OdontologoService(IDao<Odontologo> odontologoDao) {
        this.odontologoDao = odontologoDao;
    }

    public Odontologo registrar(Odontologo odontologo) {
        return odontologoDao.registrar(odontologo);
    }

    public List<Odontologo> listarTodos(){
        return odontologoDao.listarTodos();
    }

}
