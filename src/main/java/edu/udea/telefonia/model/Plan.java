package edu.udea.telefonia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Plan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private Double precio;
    private Integer minutos;
    private Integer gigas;

    public Plan() {
    }

    public Plan(String nombre, Double precio, Integer minutos, Integer gigas) {
        this.nombre = nombre;
        this.precio = precio;
        this.minutos = minutos;
        this.gigas = gigas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public void setMinutos(Integer minutos) {
        this.minutos = minutos;
    }

    public Integer getGigas() {
        return gigas;
    }

    public void setGigas(Integer gigas) {
        this.gigas = gigas;
    }
}