package com.student.manager.DAO;

import com.student.manager.model.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentDAO {
     int insert(Student student) throws SQLException;
     int update(Student student) throws SQLException;
     int delete(int id) throws SQLException;
     List<Student> selectAll() throws SQLException;
     List<Student> selectBiId(int id) throws SQLException;

}
