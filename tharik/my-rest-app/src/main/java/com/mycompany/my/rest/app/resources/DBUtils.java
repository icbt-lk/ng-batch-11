/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.my.rest.app.resources;

import java.util.List;

/**
 *
 * @author icbt
 */
public interface DBUtils {
    public List<Student> getStudents();
    
    public Student getStudent(int id);
    
    public boolean addStudent(Student st);
    
    public boolean updateStudent(Student st);
    
    public boolean deleteStudent(int id);
}
