package controlador;

import entidades.Alumno;
import modelo.AlumnoDao;
import org.springframework.beans.factory.annotation.Autowired;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author heltonsmith
 */
public class prueba {

    public static void main(String[] args) {
        Alumno a = new Alumno("888", "mario", "new new");
        
        AlumnoDao dao = new AlumnoDao();
        
        if (dao.createJPQL(a)>0) {
            System.out.println("Registrado");
        }
        else{
            System.out.println("No se pudo");
        }
    }
}
