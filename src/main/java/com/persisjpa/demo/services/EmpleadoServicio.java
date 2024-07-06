package com.persisjpa.demo.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.persisjpa.demo.Entity.Empleados;
import com.persisjpa.demo.repositorio1.EmpleadoRepositorio;



@Service
public class EmpleadoServicio {

    @Autowired
    private EmpleadoRepositorio empleadoRepositorio;
    
    public List <Empleados> consultarEmpleados(){
        return (List<Empleados>) empleadoRepositorio.findAll();
    }

    // @SuppressWarnings("null")
    public Empleados registEmpleados(Empleados empleado){
        return empleadoRepositorio.save(empleado);
    }
}
            