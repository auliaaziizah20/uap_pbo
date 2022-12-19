/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcproject;

import db.DBHelper;

/**
 *
 * @author User
 */
public class Jdbcproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DBHelper.getConnection();
    }
    
}
