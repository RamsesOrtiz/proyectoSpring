package com.educacionit.spring.entidades;

public class Alumno {

    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    private String documento;


    @Override
    public String toString() {
        return "Alumno{" +
                "descripcion='" + descripcion + '\'' +
                ", documento='" + documento + '\'' +
                '}';
    }
}
