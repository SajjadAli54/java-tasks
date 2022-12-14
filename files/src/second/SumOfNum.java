/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package second;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;

/**
 *
 * @author Sajjad Ali
 */
public class SumOfNum {
    public static void main(String args[]){
        int addition = 0;
        Vector<Integer> numbers = new Vector<Integer>();
        try(InputStream is = 
                new FileInputStream("C:\\Users\\Sajjad Ali\\Documents\\NetBeansProjects\\files\\src\\second\\data.txt")){
            int b = 0;
            String text = "";
            while(true){
                b = is.read();
                if(b == ' '|| b == -1 || b == '\n'){
                    try{
                        int x = Integer.parseInt(text);
                        addition += x;
                        text = "";
                        numbers.add(x);
                    }catch(Exception e){}
                    if(b==-1){
                        break;
                    }
                }
                else{
                    text += (char)b;
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
        try(OutputStream os =
                new FileOutputStream("C:\\Users\\Sajjad Ali\\Documents\\NetBeansProjects\\files\\src\\second\\data.txt")){
            for(int i=0;i<numbers.size();i++){
                String x = numbers.get(i) + " ";
                byte[] c = x.getBytes();
                os.write(c);
            }
            String writeSum = "" + addition;
            byte[] bytes = writeSum.getBytes();
            os.write(bytes);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
