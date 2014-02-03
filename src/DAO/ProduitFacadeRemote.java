/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entities.Produit;
import java.util.Collection;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author admin
 */
@Remote
public interface ProduitFacadeRemote {

    void create(Produit produit);

    void edit(Produit produit);

    void remove(Produit produit);

    Produit find(Object id);
    
    public Collection<Produit> findAll();

    List<Produit> findRange(int[] range);
    
    public String sayHello(String name);
    
    int count();
    
}
