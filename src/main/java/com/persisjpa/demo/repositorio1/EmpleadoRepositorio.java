package com.persisjpa.demo.repositorio1;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.persisjpa.demo.Entity.Empleados;

public interface EmpleadoRepositorio extends JpaRepository<Empleados,UUID>{  //usamos JPARepository por que CRUDRepository esta deprecated
    
}
