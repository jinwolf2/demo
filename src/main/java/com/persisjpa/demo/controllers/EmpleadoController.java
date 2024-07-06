package com.persisjpa.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.persisjpa.demo.Entity.Empleados;
import com.persisjpa.demo.persisjpa.dto.EmpleadoDTO;
import com.persisjpa.demo.services.EmpleadoServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping("/api")
public class EmpleadoController {

    @Autowired
    private EmpleadoServicio servicioEmpleado;

    @GetMapping("/listarEmpleados")
    public List<Empleados> consultarEmpleados() {
        return servicioEmpleado.consultarEmpleados();
    }

    @PostMapping("/registrarEmpleado")
    public Empleados registrarEmpleado(@RequestBody EmpleadoDTO empleadoJson) {

        Empleados empleado = new Empleados();

        empleado.setNombreEmpleado(empleadoJson.getNombreEmpleado());
        empleado.setDireccion(empleadoJson.getDireccion());
        empleado.setEdad(empleadoJson.getEdad());
        empleado.setPuesto(empleadoJson.getPuesto());

        return servicioEmpleado.registEmpleados(empleado);
    }

}
