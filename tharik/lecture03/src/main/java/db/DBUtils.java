/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

/**
 *
 * @author icbt
 */
public interface DBUtils {
    
    public boolean addPerson(Person person);
    
    public Person getPerson(int id);
    
    public boolean updatePerson(Person person);
    
    public boolean deletePerson(int id);
    
}
