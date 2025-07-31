package com.psv.distribuidora.servicio;

import com.psv.distribuidora.repositorio.DistritoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DistritoServicio {
    private final DistritoRepositorio distritoRepositorio;

    @Autowired
    public DistritoServicio(DistritoRepositorio distritoRepositorio){
        this.distritoRepositorio = distritoRepositorio;
    }
}
