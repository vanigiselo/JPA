/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistecia;

import java.util.List;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;

/**
 *
 * @author VANNI
 */
public class EditorialDAO extends DAO<Editorial> {

    @Override
    public void guardar(Editorial editorial) {
        super.guardar(editorial);
    }

    public void eliminar(Integer id) throws Exception {
        Editorial editorial = buscarPorID(id);
        super.eliminar(editorial);
    }

    private Editorial buscarPorID(Integer id) {
        conectar();
        Editorial editorial = em.find(Editorial.class, id);
        desconectar();
        return editorial;

    }

    public List<Editorial> ListarTodos() throws Exception {
        conectar();
        List<Editorial> editores = em.createQuery(" SELECT E from Autor E").getResultList();
        desconectar();
        return editores;
    }
}
