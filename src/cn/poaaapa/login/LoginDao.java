package cn.poaaapa.login;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import cn.poaaapa.db.Pa_db;

public class LoginDao {

    public static String Login(String phone,String pass) throws Exception{
        Connection conn = Pa_db.getConnection();
        Statement stm = conn.createStatement();
        String sql = "select user from user where user='"+phone+"'  and  password='"+pass+"'";
        ResultSet rs = stm.executeQuery(sql);

        if (rs.next()) {
            conn.close();
            return "success";
        }else{
            conn.close();
            return "sorry";
        }
    }
}
