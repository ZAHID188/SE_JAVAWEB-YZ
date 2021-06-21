/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.djtu.dao;

import cn.edu.djtu.util.DbTool;
import cn.edu.djtu.vo.Friend;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class FriendDaoImpl implements FriendDao{

    @Override
    public int insertFriend(Friend friend) {
        int i = 0;
        Connection conn = null;
        PreparedStatement prst = null;
        String sql = "insert into friend(fname,fgender,ftelephone,fcellphone,fremark,username) values(?,?,?,?,?,?)";
        conn = DbTool.getConnection();
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, friend.getFname());
            prst.setString(2, friend.getFgender());
            prst.setString(3, friend.getFtelephone());
            prst.setString(4, friend.getFcellphone());
            prst.setString(5, friend.getFremark());
            prst.setString(6, friend.getUsername());
            i = prst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FriendDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DbTool.close(prst, conn);
        }
        return i;
    }

    @Override
    public List<Friend> queryByFname(String fname, String username) {
        List<Friend> list = new ArrayList<Friend>();
        Connection conn = null;
        PreparedStatement prst = null;
        ResultSet rs = null;
        String sql = "select * from friend where fname =? and username=?";
        conn = DbTool.getConnection();
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, fname);
            prst.setString(2, username);
            rs = prst.executeQuery();
            while (rs.next()) {
                Friend friend = new Friend();
                friend.setFid(rs.getInt("fid"));
                friend.setFname(rs.getString("fname"));
                friend.setFgender(rs.getString("fgender"));
                friend.setFtelephone(rs.getString("ftelephone"));
                friend.setFcellphone(rs.getString("fcellphone"));
                friend.setFremark(rs.getString("fremark"));
                friend.setUsername(rs.getString("username"));
                list.add(friend);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FriendDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DbTool.close(rs, prst, conn);
        }
        return list;
    }

    @Override
    public List<Friend> queryByFnameLike(String fname, String username) {
        List<Friend> list = new ArrayList<Friend>();
        Connection conn = null;
        PreparedStatement prst = null;
        ResultSet rs = null;
        String sql = "select * from friend where fname like ? and username=?";
        conn = DbTool.getConnection();
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, fname + "%");
            prst.setString(2, username);
            rs = prst.executeQuery();
            while (rs.next()) {
                Friend friend = new Friend();
                friend.setFid(rs.getInt("fid"));
                friend.setFname(rs.getString("fname"));
                friend.setFgender(rs.getString("fgender"));
                friend.setFtelephone(rs.getString("ftelephone"));
                friend.setFcellphone(rs.getString("fcellphone"));
                friend.setFremark(rs.getString("fremark"));
                friend.setUsername(rs.getString("username"));
                list.add(friend);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FriendDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DbTool.close(rs, prst, conn);
        }
        return list;
    }

    @Override
    public List<Friend> queryAll(String username) {
        List<Friend> list = new ArrayList<Friend>();
        Connection conn = null;
        PreparedStatement prst = null;
        ResultSet rs = null;
        String sql = "select * from friend where username=?";
        conn = DbTool.getConnection();
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, username);
            rs = prst.executeQuery();
            while (rs.next()) {
                Friend friend = new Friend();
                friend.setFid(rs.getInt("fid"));
                friend.setFname(rs.getString("fname"));
                friend.setFgender(rs.getString("fgender"));
                friend.setFtelephone(rs.getString("ftelephone"));
                friend.setFcellphone(rs.getString("fcellphone"));
                friend.setFremark(rs.getString("fremark"));
                friend.setUsername(rs.getString("username"));
                list.add(friend);

            }
        } catch (SQLException ex) {
            Logger.getLogger(FriendDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DbTool.close(rs, prst, conn);
        }
        return list;
    }

    @Override
    public Friend queryByFid(Integer fid) {
        Friend friend = null;
        Connection conn = null;
        PreparedStatement prst = null;
        ResultSet rs = null;
        String sql = "select * from friend where fid =?";
        conn = DbTool.getConnection();
        try {
            prst = conn.prepareStatement(sql);
            prst.setInt(1, fid);
            rs = prst.executeQuery();
            if (rs.next()) {
                friend = new Friend();
                friend.setFid(rs.getInt("fid"));
                friend.setFname(rs.getString("fname"));
                friend.setFgender(rs.getString("fgender"));
                friend.setFtelephone(rs.getString("ftelephone"));
                friend.setFcellphone(rs.getString("fcellphone"));
                friend.setFremark(rs.getString("fremark"));
                friend.setUsername(rs.getString("username"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FriendDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DbTool.close(rs, prst, conn);
        }
        return friend;
    }

    @Override
    public int updateFriend(Friend friend) {
        int i = 0;
        Connection conn = null;
        PreparedStatement prst = null;
        String sql = "update friend set fname=?,fgender=?,ftelephone=?,fcellphone=?,fremark=?,username=? where fid=?";
        conn = DbTool.getConnection();
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, friend.getFname());
            prst.setString(2, friend.getFgender());
            prst.setString(3, friend.getFtelephone());
            prst.setString(4, friend.getFcellphone());
            prst.setString(5, friend.getFremark());
            prst.setString(6, friend.getUsername());
            prst.setInt(7, friend.getFid());
            i = prst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FriendDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DbTool.close(prst, conn);
        }
        return i;
    }

    @Override
    public int deleteFriend(Integer fid) {
        int i = 0;
        Connection conn = null;
        PreparedStatement prst = null;
        String sql = "delete from friend where fid=?";
        conn = DbTool.getConnection();
        try {
            prst = conn.prepareStatement(sql);
            prst.setInt(1, fid);
            i = prst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FriendDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DbTool.close(prst, conn);
        }
        return i;
    }

}
