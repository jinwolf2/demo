package com.persisjpa.demo.persisjpa.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmpleadoDTO {

    private String nombreEmpleado;
    private String direccion;
    private int edad;
    private String puesto;

}
