/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author icbt
 */
public class App {
    public static void main(String[] args) {
       Student st = new Student();
       
       st.test();
       
       
       Person p = new Person();
       p = new Student();
       p = new Employee();
       
      // Student st = new Person();
      Person[] perons = new Person[5];
      perons[0] = new Student();
      perons[1] = new Employee();
    }
}
