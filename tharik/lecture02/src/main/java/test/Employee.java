/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author icbt
 */
public class Employee extends Person {
    private int epfNo;

    public Employee() {
    }

    public Employee(int epfNo, String firstName, String lastName, String nic) {
        super(firstName, lastName, nic);
        this.epfNo = epfNo;
    }

    
    
    public int getEpfNo() {
        return epfNo;
    }

    public void setEpfNo(int epfNo) {
        this.epfNo = epfNo;
    }
    
    
}
