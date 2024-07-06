package com.persisjpa.demo.repositorio1;

import org.springframework.data.jpa.repository.JpaRepository;

import com.persisjpa.demo.Entity.Empleados;




public interface EmpleadoRepositorio extends JpaRepository<Empleados, Long>{
    
}
