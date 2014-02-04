/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entities.Commande;
import java.util.Collection;
import java.util.List;
import javax.ejb.Remote;
import javax.persistence.Query;

/**
 *
 * @author admin
 */
@Remote
public interface CommandeFacadeRemote {

    void create(Commande commande);

    void edit(Commande commande);

    void remove(Commande commande);

    Commande find(int id);
    
    Collection<Commande> findUserCommandes(int id);

    List<Commande> findAll();

    List<Commande> findRange(int[] range);

    int count();
    
}
