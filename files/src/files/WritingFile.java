/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author Sajjad Ali
 */
public class WritingFile {
    public static void main(String args[]){
        try(OutputStream file = 
            new FileOutputStream("C:\\Users\\Sajjad Ali\\Documents\\NetBeansProjects\\files\\src\\files\\Ali.txt",true)){
            
            String name = "Java input output";
            byte[] b = name.getBytes();
            file.write(b);
            
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
}
