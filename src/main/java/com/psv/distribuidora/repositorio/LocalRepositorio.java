package com.psv.distribuidora.repositorio;

import com.psv.distribuidora.modelo.Local;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalRepositorio extends JpaRepository<Local, Integer> {
}
