/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.djtu.dao;

import cn.edu.djtu.vo.User;

/**
 *
 * @author Administrator
 */
public interface UserDao {
    public User queryByUsername(String username);
    public boolean queryByUsernameUserpass(String username,String userpass);
    public void insertUser(String username,String userpass);
}
