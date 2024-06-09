/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lecture02;

/**
 *
 * @author icbt
 */
public class Lecture02 {

    public static void main(String[] args) {
        System.out.println("Hello World!!!!!!" + Process.total);
       
        Process process = new Process();
        process.test();
        
        System.out.println(process.total); // 57
        System.out.println(process.sum); // 57
        
        process.total = 100;
        process.sum = 100;
        
         Process process2 = new Process();
         
        System.out.println(process.total); // 100
        System.out.println(process2.total); //100
        
        
                System.out.println(process.sum); // 100
        System.out.println(process2.sum); //
        
        
        
    }
}
