/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorysystem;

/**
 *
 * @author Lenovo
 */
public class InventorySystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //init database credentials
        String USER, PASS;
        String URL;
        
        LoginScreen login;
        SystemForm system;
        
        //database credentials declared here
        USER = "root";
        PASS = "toor";
        URL = "jdbc:mysql://localhost:3306/inventory_system";
        
        login = new LoginScreen(URL, USER, PASS);
        login.setVisible(true);
        
    }
    
}
