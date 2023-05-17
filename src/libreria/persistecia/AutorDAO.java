/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistecia;


import java.util.List;
import libreria.entidades.Autor;

/**
 *
 * @author VANNI
 */
public class AutorDAO extends DAO<Autor> {
    
    @Override
    public void guardar (Autor autor){
        super.guardar(autor);
    }
    
    public void eliminar (Integer id) throws Exception{
        Autor autor = buscarPorID (id);
        super.eliminar(autor);
    }

    private Autor buscarPorID(Integer id) {
        conectar();
        Autor autor = em.find(Autor.class, id);
         desconectar();
         return autor;
       
    }
    
    
    public List<Autor> ListarTodos ()throws Exception{
         conectar();
         List<Autor> autores = em.createQuery(" SELECT A from Autor A").getResultList();
         desconectar();
         return autores;
    }
}
