/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

// Import GUI classes
//import View.IntClient;
import View.IntHome;

/**
 *
 * @author maverick
 */
public class Main {
    
    public static void main(String[] args) {
        
        //UIManager viewer = new UIManager();
        //IntClient clientViewr = new IntClient();
        IntHome homeViewer = new IntHome();
        
        //viewer.setVisible(true); // Set initial window visible
        homeViewer.setVisible(true);
    }
    
}
