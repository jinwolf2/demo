package com.persisjpa.demo.Entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="empleado")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Empleados {

    @Id
    @Column(name = "id_empleado")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID idEmpleado;

    @Column(name = "nombre_empleado")
    private String nombreEmpleado;
    
    private String direccion;
    private int edad;
    private String puesto;
}
