package com.psv.distribuidora.controlador;

import com.psv.distribuidora.servicio.LocalServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/local")
public class LocalControlador {
    private final LocalServicio localServicio;

    @Autowired
    public LocalControlador(LocalServicio localServicio){
        this.localServicio = localServicio;
    }
}
