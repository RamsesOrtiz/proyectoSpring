package com.educacionit.spring.configuracion;

import com.educacionit.spring.entidades.Alumno;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AlumnoConfig {

    @Bean(name = "alumnoClass")
    public Alumno getAlumno(){
        Alumno alumno = new Alumno("Alumno 2 - desde Clase", "DNI - 02", "Java", "alumno2@cursos.com");
        return alumno;
    }
}
