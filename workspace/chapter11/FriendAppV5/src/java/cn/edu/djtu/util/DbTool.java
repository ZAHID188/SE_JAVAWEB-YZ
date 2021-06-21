/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.djtu.util;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class DbTool {

    private static String DB_DRIVER = "org.apache.derby.jdbc.ClientDriver";
    private static String DB_URL = "jdbc:derby://localhost:1527/FriendDb";
    private static String DB_USER = "djtu";
    private static String DB_PASSWORD = "djtu";
//获得连接对象
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName(DB_DRIVER);
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (SQLException ex) {
            Logger.getLogger(DbTool.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbTool.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
//关闭结果集对象
    public static void close(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(DbTool.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
//关闭预编译语句对象
    public static void close(PreparedStatement prst) {
        if (prst != null) {
            try {
                prst.close();
            } catch (SQLException ex) {
                Logger.getLogger(DbTool.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
//关闭连接对象
    public static void close(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DbTool.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
//针对更新操作，关闭资源
    public static void close(PreparedStatement prst, Connection conn) {
        close(prst);
        close(conn);
    }
//针对查询操作，关闭资源
    public static void close(ResultSet rs, PreparedStatement prst, Connection conn) {
        close(rs);
        close(prst);
        close(conn);
    }
}
