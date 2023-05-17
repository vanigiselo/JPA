/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import libreria.persistecia.EditorialDAO;


/**
 *
 * @author VANNI
 */
public class EditorialSERVICIO  {
     private LibroSERVICIO libroServicio;
     private AutorSERVICIO autorServicio;
     private final EditorialDAO DAO;
     
     public EditorialSERVICIO (){
         this.DAO = new EditorialDAO ();
     }
     
     public void setServicios (LibroSERVICIO libroServicio, AutorSERVICIO autorServicio){
          this.autorServicio = autorServicio;
          this.libroServicio = libroServicio;
      }
}
