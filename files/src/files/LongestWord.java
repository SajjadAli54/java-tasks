/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Sajjad Ali
 */
public class LongestWord {
    public static void main(String args[]){
        try(InputStream ins = new FileInputStream("C:\\Users\\Sajjad Ali\\Documents\\NetBeansProjects\\files\\src\\files\\Ali.txt")){
            int b = 0;
            String msg = "";
            while((b = ins.read()) != -1){
                msg += (char)b;
            }
            String[] arr = msg.split(" ");
            for(int i=0;i<arr.length-1;i++){
                for(int j=i+1;j<arr.length;j++){
                    int x = arr[i].length();
                    int y = arr[j].length();
                    if(x<=y){
                        String k = arr[i];
                        arr[i] = arr[j];
                        arr[j] = k;
                    }
                }
            }
            System.out.println("Word \""+arr[0]+"\" is the longest word in the file");
        }catch(IOException e){
            
        }
    }
    
}
