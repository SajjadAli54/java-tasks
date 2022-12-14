/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package third;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *
 * @author Sajjad Ali
 */
public class ReadingPoem {
    public static void main(String args[]){
        String line = "";
        File f = new File("C:\\Users\\Sajjad Ali\\Documents\\NetBeansProjects\\files\\src\\third\\sample.txt");
        try(Scanner sc = new Scanner(f.getAbsoluteFile(),StandardCharsets.UTF_8.name());
                PrintWriter wr = new PrintWriter("C:\\Users\\Sajjad Ali\\Documents\\NetBeansProjects\\files\\src\\third\\write.txt")){
            
            while(sc.hasNextLine()){
                line +="\n"+sc.nextLine();  
            }
            char[] buf = line.toCharArray();
            wr.write(buf);
            
            
        }
        catch(SecurityException e){
            System.out.println("SE"+e.getMessage());
            
        }catch(FileNotFoundException e){
            System.out.println("FE"+e.getMessage());
        }catch(Exception e){
            System.out.println("EE"+e.getMessage());
        }
    }
    
}
