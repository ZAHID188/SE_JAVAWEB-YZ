/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.djtu.dao;

import cn.edu.djtu.util.DbTool;
import cn.edu.djtu.vo.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class UserDaoImpl implements UserDao {

    @Override
    public User queryByUsername(String username) {
        User user = null;
        Connection conn = null;
        PreparedStatement prst = null;
        ResultSet rs = null;
        String sqlq = "select * from userinfo where username=?";
        conn = DbTool.getConnection();
        try {
            prst = conn.prepareStatement(sqlq);
            prst.setString(1, username);
            rs = prst.executeQuery();
            if (rs.next()) {
                user = new User();
                user.setUsername(rs.getString("username"));
                user.setUserpass(rs.getString("userpass"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DbTool.close(rs, prst, conn);
        }
        return user;
    }

    @Override
    public boolean queryByUsernameUserpass(String username, String userpass) {
        boolean b = false;
        Connection conn = null;
        PreparedStatement prst = null;
        ResultSet rs = null;
        String sqlq = "select * from userinfo where username=? and userpass=?";
        conn = DbTool.getConnection();
        try {
            prst = conn.prepareStatement(sqlq);
            prst.setString(1, username);
            prst.setString(2, userpass);
            rs = prst.executeQuery();
            if (rs.next()) {
                b = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DbTool.close(rs, prst, conn);
        }
        return b;
    }

    @Override
    public void insertUser(String username, String userpass) {
        Connection conn = null;
        PreparedStatement prst = null;
        String sql = "insert into userinfo values(?,?)";
        conn = DbTool.getConnection();
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, username);
            prst.setString(2, userpass);
            prst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DbTool.close(prst, conn);
        }
    }
}
