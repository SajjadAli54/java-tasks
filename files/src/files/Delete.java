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
public class Delete {
    public static void main(String args[]){
        File f = new File("E:\\Coding\\OOP\\Practice\\Mid-II\\Child.class");
        boolean del = f.delete();
        if(del){
            System.out.println(f.getName()+ " is deleted");
        }
        else{
            System.out.println("Given file can't be deleted");
        }
    }
    
}
