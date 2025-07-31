package com.psv.distribuidora.controlador;

import com.psv.distribuidora.servicio.DistritoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/distrito")
public class DistritoControlador {
    private final DistritoServicio distritoServicio;

    @Autowired
    public DistritoControlador(DistritoServicio distritoServicio){
        this.distritoServicio = distritoServicio;
    }
}
