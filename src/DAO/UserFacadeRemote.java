/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entities.User;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author admin
 */
@Remote
public interface UserFacadeRemote {

    void create(User user);

    void edit(User user);

    void remove(User user);

    User find(int id);
    
    User checkLogin(String email, String pwd);

    List<User> findAll();

    List<User> findRange(int[] range);

    int count();
    
}
