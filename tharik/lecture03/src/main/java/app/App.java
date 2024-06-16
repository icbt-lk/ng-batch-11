/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import db.MongoDBUtils;
import logic.Logic;
//import db.MySQLUtils;

/**
 *
 * @author icbt
 */
public class App {
    public static void main(String[] args) {
        Logic logic = new Logic();
        logic.process(new MongoDBUtils());
    }
}
