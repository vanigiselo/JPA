/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import libreria.entidades.Autor;
import libreria.persistecia.AutorDAO;



/**
 *
 * @author VANNI
 */
public class AutorSERVICIO  {
    private EditorialSERVICIO editorialServicio;
    private LibroSERVICIO libroServicio;
    private final AutorDAO DAO;
    
    public AutorSERVICIO (){
        this.DAO = new AutorDAO ();
    }
   
    public void setServicios (EditorialSERVICIO editorialServicio, LibroSERVICIO libroServicio){
        this.editorialServicio = editorialServicio;
        this.libroServicio = libroServicio;
    }
    
    public Autor crearAutor (String Nombre){
        Autor autor = new Autor ();
        try{
            autor.setNombre(Nombre);
            autor.setAlta(true);         
            DAO.guardar(autor);
            
          return autor;  
        } catch (Exception e) {
            System.out.println(e.getMessage());
          return null;
        }
    }
}
