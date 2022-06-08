package com.dh.pacientebien.pacientebien.controller;

import com.dh.pacientebien.pacientebien.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class PacienteController {
    @GetMapping("/index")
    public String welcome(Model model) {
        model.addAttribute("nombre", "diez");
        model.addAttribute("apellido", "dieeeez");
        return "index.html";
    }
}
