/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

/**
 *
 * @author icbt
 */
public class MySQLUtils implements DBUtils {

    @Override
    public boolean addPerson(Person person) {
        // MYSQL logic
        System.out.println("Create MySQL Person table");
        return true;
    }

    @Override
    public Person getPerson(int id) {
        // MYSQL logic
        System.out.println("Read MySQL Person table");
        return new Person();
    }

    @Override
    public boolean updatePerson(Person person) {
        // MYSQL logic
        System.out.println("Update MySQL Person table");
        return true;
    }

    @Override
    public boolean deletePerson(int id) {
        // MYSQL logic
        System.out.println("Delete MySQL Person table");
        return true;
    }
    
}
