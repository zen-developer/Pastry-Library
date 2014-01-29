/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entities.LigneCommande;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author admin
 */
@Remote
public interface LigneCommandeFacadeRemote {

    void create(LigneCommande ligneCommande);

    void edit(LigneCommande ligneCommande);

    void remove(LigneCommande ligneCommande);

    LigneCommande find(Object id);

    List<LigneCommande> findAll();

    List<LigneCommande> findRange(int[] range);

    int count();
    
}
