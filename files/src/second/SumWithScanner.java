/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package second;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sajjad Ali
 */
public class SumWithScanner {
    public static void main(String args[]){
        int sum = 0;
        ArrayList<String> arr = new ArrayList<String>();
        File file = new File("C:\\Users\\Sajjad Ali\\Documents\\NetBeansProjects\\files\\src\\second\\data.txt");
        try(Scanner obj = new Scanner(file)){
            while(obj.hasNext()){
                try{
                    String str = obj.next();
                    arr.add(str);
                    System.out.println(str);
                    sum += Integer.parseInt(str);
                }catch(Exception e){
                    //System.out.println("Inside error : "+e);
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        try(PrintWriter obj = new PrintWriter(file)){
            String str = "";
            for(int i=0;i<arr.size();i++){
                str = arr.get(i) + " ";
                obj.write(str);
            }
            str = sum + " ";
            obj.write(str);
           
        }catch(Exception e){
            System.out.println(e);
        }
        
        
    }
    
}
