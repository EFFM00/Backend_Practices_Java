package test.com.dh.odontologo.service;

import com.dh.odontologo.dao.IDao;
import com.dh.odontologo.dao.impl.OdontologoDaoH2;
import com.dh.odontologo.entity.Odontologo;
import com.dh.odontologo.service.OdontologoService;
import org.testng.annotations.Test;

public class TestService {

    private IDao<Odontologo> odontologoDaoH2 = new OdontologoDaoH2();
    private OdontologoService odontologoService = new OdontologoService(odontologoDaoH2);

    Odontologo odontologo1 = new Odontologo("20220306", "Marco", "Pérez");
    Odontologo odontologo2 = new Odontologo("62423306", "Daniela", "Méndez");
    Odontologo odontologo3 = new Odontologo("75423463", "Ana", "García");
    Odontologo odontologo4 = new Odontologo("13474423", "Alan", "López");


    @Test
    public void registrarNuevoOdontologoH2() {
        odontologoService.registrar(odontologo1);
        odontologoService.registrar(odontologo2);
        odontologoService.registrar(odontologo3);
        odontologoService.registrar(odontologo4);
    }

    @Test
    public void listarOdontologos() {
        odontologoService.listarTodos();
    }

}
