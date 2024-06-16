/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

/**
 *
 * @author icbt
 */
public class Person {
    
//    public void test();
//    
    
    private int id;
    private String firstName;
    private String lastName;
    private String nic;

    public Person() {
    }
    
    

    public Person(String firstName, String lastName, String nic, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nic = nic;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }
    
    
    public void test() {
        System.out.println("Test");
    }
    
}
