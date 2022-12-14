/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.io.File;

/**
 *
 * @author Sajjad Ali
 */
public class Existence {
    public static void main(String args[]){
        // Let the specified file is given in arguments
        File f = new File("E:\\BSCS-II\\Lab");
        
        System.out.println(f.exists());
    }
    
}
