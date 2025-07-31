package com.psv.distribuidora.servicio;

import com.psv.distribuidora.repositorio.LocalRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalServicio {
    private final LocalRepositorio localRepositorio;

    @Autowired
    public LocalServicio(LocalRepositorio localRepositorio){
        this.localRepositorio = localRepositorio;
    }
}
