/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author icbt
 */
public class Utils {
    public static List<Person> getPersons() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Lewis", "Hamilton", "123V"));
        persons.add(new Person("Max", "Verstapann", "123V"));
        persons.add(new Person("Carlos", "Sainz", "123V"));
        return persons;
    }
    
    public static boolean authenticate(String username, String password) {
        if (username != null && password != null) {
            if (username.equals("admin") && password.equals("admin123")) {
                return true;
            }
                
        }
        return false;
    }
}
