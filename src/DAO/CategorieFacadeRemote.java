/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entities.Categorie;
import entities.Produit;
import java.util.Collection;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author admin
 */
@Remote
public interface CategorieFacadeRemote {

    void create(Categorie categorie);

    void edit(Categorie categorie);

    void remove(Categorie categorie);

    public Categorie find(int id);

    List<Categorie> findAll();

    List<Categorie> findRange(int[] range);
    
 

    int count();
    
}
