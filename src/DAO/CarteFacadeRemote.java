/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entities.Carte;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author admin
 */
@Remote
public interface CarteFacadeRemote {

    void create(Carte carte);

    void edit(Carte carte);

    void remove(Carte carte);

    Carte find(Object id);

    List<Carte> findAll();

    List<Carte> findRange(int[] range);

    int count();
    
}
