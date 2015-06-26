/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db4o;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

/**
 *
 * @author LAGO
 */
public class InsercionBD {

    final static String RUTABD4 = System.getProperty("user.home") + "/EscuelaOM.db4o";

    public static void main(String[] args) {
        
        /*
        ObjectContainer es la bd4o 
        Db4oEmbedded es la clase para abrit la instancia ala db4 en modo envebido
        la configuracion permite agregar escenarios como agregados.
        */
        
        ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), RUTABD4);

        try {
            //Agregado Grupos
            
            Grupo g1 = new Grupo("GSI0511", "Aguilas");
            db.store(g1);
            Grupo g2 = new Grupo("GSI0522", "Chivas");
            db.store(g2);
            Grupo g3 = new Grupo("GSI0533", "Pumas");
            db.store(g3);
            
            //Agregado alumnos
            
            Alumno a1 = new Alumno("1111", "Luis", 23, "Gsi0511");
            db.store(a1);
            Alumno a2 = new Alumno("2222", "Aldo", 23, "Gsi0533");
            db.store(a2);
            Alumno a3 = new Alumno("3333", "Ruben", 20, "Gsi0544");
            db.store(a3);
            
            
            System.out.println("BD Creada");

        } catch (Exception e) {
            System.out.println("Error-" + e.getMessage());
            
        } finally {
            db.close();
        }
    }

}
