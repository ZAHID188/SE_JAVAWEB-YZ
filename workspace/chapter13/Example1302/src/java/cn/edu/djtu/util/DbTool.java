/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.djtu.util;

import java.sql.*;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class DbTool {

    private static String DB_DRIVER = "";
    private static String DB_URL = "";
    private static String DB_USER = "";
    private static String DB_PASSWORD = "";
    //DbTool类加载时，执行getPropertyInfo()方法
    static {
        getPropertyInfo();
    }
    //获得属性文件中的driver、url、username、password信息的方法
    public static void getPropertyInfo() {
        Locale locale = Locale.getDefault();
        ResourceBundle localResource = ResourceBundle.getBundle("cn/edu/djtu/util/database", locale);
        DB_DRIVER = localResource.getString("driver");
        DB_URL = localResource.getString("url");
        DB_USER = localResource.getString("user");
        DB_PASSWORD = localResource.getString("password");
    }
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
