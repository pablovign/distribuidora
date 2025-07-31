package com.psv.distribuidora.repositorio;

import com.psv.distribuidora.modelo.Distrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistritoRepositorio extends JpaRepository<Distrito, Integer> {
}
