/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.djtu.service;

import cn.edu.djtu.dao.UserDaoImpl;
import cn.edu.djtu.vo.User;

/**
 *
 * @author Administrator
 */
public class UserService {
    //验证用户是否存在
    public boolean validateUser(User user) {
        boolean b = false;
        UserDaoImpl udi = new UserDaoImpl();
        if (udi.queryByUsername(user.getUsername()) != null) {
            b = true;
        }
        return b;
    }
    //用户登录服务
    public boolean login(User user) {
        boolean b = false;
        UserDaoImpl udi = new UserDaoImpl();
        if (udi.queryByUsernameUserpass(user.getUsername(), user.getUserpass())) {
            b = true;
        }
        return b;
    }
    //用户注册服务
    public void reg(User user) {
        UserDaoImpl udi = new UserDaoImpl();
        udi.insertUser(user.getUsername(), user.getUserpass());
    }
}
