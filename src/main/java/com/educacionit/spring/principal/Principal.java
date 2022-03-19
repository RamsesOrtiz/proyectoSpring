package com.educacionit.spring.principal;

import com.educacionit.spring.entidades.Alumno;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

    private static final Logger log = LogManager.getLogger(Principal.class);

    public static void main(String [] args){

        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

          //Alumno alumno = (Alumno) context.getBean("alumnoXMLA");
            Alumno alumno = context.getBean("alumnoXML", Alumno.class);
            alumno.setDescripcion("Alumno1");
            alumno.setDocumento("01");
            context.close();
            log.info(alumno);
        }catch (Exception e){
            log.error(e);
        }




    }
}
