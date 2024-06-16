/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import db.DBUtils;
import db.Person;

/**
 *
 * @author icbt
 */
public class Logic {
    public void process(DBUtils utils) {
        Person p = new Person("Lewis", "Hamilton", "123", 1);
        
        utils.addPerson(p);
        p.setFirstName("Lewis 2");
        utils.updatePerson(p);
        
        
        Person p2 = utils.getPerson(1);
        
        utils.deletePerson(1);
    }
}
