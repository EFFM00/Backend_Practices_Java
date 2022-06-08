package com.dh.pacientebien.pacientebien.service.impl;

import com.dh.pacientebien.pacientebien.model.Paciente;
import com.dh.pacientebien.pacientebien.service.PacienteService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PacienteServiceImpl implements PacienteService {

    @Override
    public List<Paciente> listadoPacientes() {
        return Arrays.asList(new Paciente("Juan", "Pepito"));
    }

}
