/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

/**
 *
 * @author icbt
 */
public class MongoDBUtils implements DBUtils {

    @Override
    public boolean addPerson(Person person) {
        // MongoDB logic
        System.out.println("Create MongoDB Person table");
        return true;
    }

    @Override
    public Person getPerson(int id) {
        // MongoDB logic
        System.out.println("Read MongoDB Person table");
        return new Person();
    }

    @Override
    public boolean updatePerson(Person person) {
        // MongoDB logic
        System.out.println("Update MongoDB Person table");
        return true;
    }

    @Override
    public boolean deletePerson(int id) {
        // MongoDB logic
        System.out.println("Delete MongoDB Person table");
        return true;
    }
    
}
