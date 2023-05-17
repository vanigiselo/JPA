/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import libreria.persistecia.LibroDAO;



/**
 *
 * @author VANNI
 */
public class LibroSERVICIO  {
    private EditorialSERVICIO editorialServicio;
    private AutorSERVICIO autorServicio;
    private final LibroDAO DAO;
    
    public LibroSERVICIO (){
        this.DAO = new LibroDAO ();
    }
    
    public void setServicios (EditorialSERVICIO editorialServicio, AutorSERVICIO autorServicio){
        this.autorServicio = autorServicio;
        this.editorialServicio = editorialServicio;
    }
  
    
}
