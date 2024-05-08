package com.student.manager.DAO;

import com.student.manage.DB.DataBaseManager;
import com.student.manager.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImp implements StudentDAO {

    private String SELECT_ALL_STUDENTS = "select * from student";
    private String INSERT_STUDENT = "insert into student values(?,?,?,?)";
    private String DELETE_STUDENT = "delete from student where id_Student = ?";
    private String UPDATE_STUDENT = "update student set first_Name = ?,last_Name = ?,email = ?,status = ? where id_Student = ?";
    private String SELECT_STUDENT_BY_ID = "select * from student where id_Student = ?";


    @Override
    public int insert(Student student) throws SQLException {
        Connection con = new DataBaseManager().getConnection();
        PreparedStatement ps = con.prepareStatement(INSERT_STUDENT);
        ps.setString(1 , student.getFirst_name());
        ps.setString(2 , student.getLast_name());
        ps.setString(3 , student.getEmail());
        ps.setString(4 , student.getStatus());

        return ps.executeUpdate();
    }

    @Override
    public int update(Student student) throws SQLException {
        Connection con = new DataBaseManager().getConnection();
        PreparedStatement ps = con.prepareStatement(UPDATE_STUDENT);
        ps.setString(1 , student.getFirst_name());
        ps.setString(2 , student.getLast_name());
        ps.setString(3 , student.getEmail());
        ps.setString(4 , student.getStatus());
        ps.setInt(5 , student.getId_Student());

        return ps.executeUpdate();
    }

    @Override
    public int delete(int id) throws SQLException {
        Connection con = new DataBaseManager().getConnection();
        PreparedStatement ps = con.prepareStatement(DELETE_STUDENT);
        ps.setInt(1 , id);

        return ps.executeUpdate();
    }

    @Override
    public List<Student> selectAll() throws SQLException {
        List<Student> students = new ArrayList<Student>();
        Connection con = new DataBaseManager().getConnection();
        PreparedStatement ps = con.prepareStatement(SELECT_ALL_STUDENTS);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Integer id = rs.getInt("id_Student");
            String first_name = rs.getString("first_Name");
            String last_name = rs.getString("last_Name");
            String email = rs.getString("email");
            String status = rs.getString("status");
            Student student = new Student(id, first_name, last_name, email, status);
            students.add(student);
        }
        return students;
    }

    @Override
    public List<Student> selectBiId(int id) throws SQLException {
        List<Student> students = new ArrayList<Student>();
        Connection con = new DataBaseManager().getConnection();
        PreparedStatement ps = con.prepareStatement(SELECT_STUDENT_BY_ID);
        ps.setInt(1,id);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Integer id_std = rs.getInt("id_Student");
            String first_name = rs.getString("first_Name");
            String last_name = rs.getString("last_Name");
            String email = rs.getString("email");
            String status = rs.getString("status");
            Student student = new Student(id_std, first_name, last_name, email, status);
            students.add(student);
        }
        return students;
    }
}
