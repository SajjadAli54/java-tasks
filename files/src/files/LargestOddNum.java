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
public class LargestOddNum {
    
    public static void main(String args[]){
        int[] v;
        try(InputStream ins = 
                new FileInputStream("C:\\Users\\Sajjad Ali\\Documents\\NetBeansProjects\\files\\src\\files\\\\Num.txt")){
            int b = 0;
            String msg = "";
            while((b = ins.read()) !=-1){
                msg += (char)b;
            }
            String[] num = msg.split(" ");
            v = new int[num.length];
            int i = 0;
            for(String x : num){
                try{
                    int n = Integer.parseInt(x);
                    if(n%2 == 1)
                        v[i++] = n;
                }catch(Exception e){
                    System.out.println(e.getLocalizedMessage());
                }
            }
            for(i=0;i<v.length-1;i++){
                for(int j=i+1;j<v.length;j++){
                    if(v[i]<v[j]){
                        int k = v[i];
                        v[i] = v[j];
                        v[j] = k;
                    }
                }
            }
            System.out.println(v[0]+" is the longest integer in the file");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        
    }
}
