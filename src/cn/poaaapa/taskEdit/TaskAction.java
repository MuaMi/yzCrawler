package cn.poaaapa.taskEdit;

import cn.poaaapa.db.Pa_db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TaskAction {

    public List<TaskEntity> queryAllTask (){
        try{
            Connection con=Pa_db.getConnection();
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from Task");

            List<TaskEntity> tl = new ArrayList<TaskEntity>();
            while (rs.next()){
                TaskEntity t = new TaskEntity();
                t.setId(rs.getInt("id"));
                t.setTaskName(rs.getString("taskName"));
                t.setTaskType(rs.getInt("taskType"));
                t.setTaskState(rs.getInt("taskState"));
                t.setUrl(rs.getString("url"));
                t.setUrlType(rs.getInt("urlType"));
                t.setUserId(rs.getString("userId"));
                t.setComment(rs.getString("comment"));
                t.setCreateTime(rs.getDate("createTime"));
                t.setStartTime(rs.getDate("startTime"));
                tl.add(t);
            }
            return tl;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public TaskEntity queryTask(int id){
        try{
            Connection con=Pa_db.getConnection();
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from Task where id = "+id+";");

            List<TaskEntity> tl = new ArrayList<TaskEntity>();
            TaskEntity t = null;
            if (rs.next()){
                t = new TaskEntity();
                t.setTaskName(rs.getString("taskName"));
                t.setTaskType(rs.getInt("taskType"));
                t.setTaskState(rs.getInt("taskState"));
                t.setUrl(rs.getString("url"));
                t.setUrlType(rs.getInt("urlType"));
                t.setComment(rs.getString("comment"));
                t.setCreateTime(rs.getDate("createTime"));
                t.setStartTime(rs.getDate("startTime"));
                t.setUserId(rs.getString("userId"));
            }
            return t;
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public boolean deleteTask(int id){
        try {
            Connection con = Pa_db.getConnection();
            Statement stmt = con.createStatement();
            String sql = "delete from Task where id= " + id + ";";
            boolean r= stmt.execute(sql);
            return r;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateTask(TaskEntity task ){
        try {
            Connection con = Pa_db.getConnection();
            String sql= "update Task set taskName =? ,taskType =? ,taskState =? ,url =? ,urlType =? ,comment =? ,userId =? ,createTime =?,startTime =? where id =? ;";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1,task.getTaskName());
            pstmt.setInt(2,task.getTaskType());
            pstmt.setInt(3,task.getTaskState());
            pstmt.setString(4,task.getUrl());
            pstmt.setInt(5,task.getUrlType());
            pstmt.setString(6,task.getComment());
            pstmt.setString(7,task.getUserId());
            pstmt.setString(8,task.getCreateTime().toString());
            pstmt.setString(9,task.getStartTime().toString());
            pstmt.setInt(10,task.getId());

            boolean r = pstmt.execute();
            return r;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
