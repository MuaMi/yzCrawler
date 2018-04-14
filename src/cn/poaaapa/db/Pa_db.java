package cn.poaaapa.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class Pa_db {
    /*
     * MySQL
     */
    public static final String dbdr="com.mysql.jdbc.Driver" ; //数据库驱动
    public static final String dburl="jdbc:mysql://localhost:3306/paapa?useUnicode=true&characterEncoding=UTF-8" ;//连接数据库
    public static final String dbuser="root" ;//数据库用户名
    public static final String dbpwd="root" ;//数据库密码

    /**
     * 获得MySQL数据的连接
     * @return
     * @throws Exception
     */
    public static Connection getConnection() throws Exception{
        Class.forName(dbdr);
        return DriverManager.getConnection(dburl, dbuser, dbpwd);
    }
}
