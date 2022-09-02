/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistecia;

import java.util.List;
import libreria.entidades.Autor;
import libreria.entidades.Libro;

/**
 *
 * @author VANNI
 */
public class LibroDAO extends DAO<Libro> {
  @Override
    public void guardar (Libro libro){
        super.guardar(libro);
    }
    
    public void eliminar (Long id) throws Exception{
        Libro libro = buscarPorID (id);
        super.eliminar(libro);
    }

    private Libro buscarPorID(Long id) {
        conectar();
        Libro libro = em.find(Libro.class, id);
         desconectar();
         return libro;
       
    }
    
    
    public List<Libro> ListarTodos ()throws Exception{
         conectar();
         List<Libro>libros = em.createQuery(" SELECT L from Autor L").getResultList();
         desconectar();
         return libros;
    }  
}
