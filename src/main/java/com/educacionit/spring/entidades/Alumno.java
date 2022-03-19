package com.educacionit.spring.entidades;

import java.util.List;

public class Alumno {

    private String descripcion;
    private String documento;
    private List<String> cursos;
    private String correo;

    public Alumno(List<String> cursos, String correo) {
        this.cursos = cursos;
        this.correo = correo;
    }

    public Alumno(String descripcion, String documento) {
        this.descripcion = descripcion;
        this.documento = documento;
    }

    public Alumno(String descripcion, String documento, String cursos, String correo) {
    }

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


    @Override
    public String toString() {
        return "Alumno{" +
                "descripcion='" + descripcion + '\'' +
                ", documento='" + documento + '\'' +
                ", cursos='" + cursos + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }

    public void setCursos(List cursos) {
    }

    public void setCorreo(String correo) {
    }
}
