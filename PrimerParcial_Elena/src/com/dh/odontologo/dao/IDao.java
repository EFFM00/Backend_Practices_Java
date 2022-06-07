package com.dh.odontologo.dao;

import java.sql.SQLException;
import java.util.List;

public interface IDao<T> {

    public T registrar(T t);

    public List<T> listarTodos();

}
