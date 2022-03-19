package com.educacionit.spring.principal;

import com.educacionit.spring.configuracion.AlumnoConfig;
import com.educacionit.spring.entidades.Alumno;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

    private static final Logger log = LogManager.getLogger(Principal.class);

    public static void main(String [] args){

        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

            Alumno alumno = context.getBean("alumnoXML", Alumno.class);
            context.close();
            log.info(alumno);
        }catch (Exception e){
            log.error(e);
        }

        try {
            ApplicationContext context = new AnnotationConfigApplicationContext(AlumnoConfig.class);
            Alumno alumno = (Alumno) context.getBean("alumnoClass");
            alumno.setDocumento("02");
            alumno.setDescripcion("Alumno2");
            log.info(alumno);
            context = null;
        }catch (Exception e){
            log.error(e);
        }

        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

            Alumno alumno = context.getBean("alumno", Alumno.class);
            context.close();
            log.info(alumno);
        }catch (Exception e){
            log.error(e);
        }






    }
}
