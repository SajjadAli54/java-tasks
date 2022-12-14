/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package second;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

/**
 *
 * @author Sajjad Ali
 */
public class SumWithBuffered {
    public static void main(String args[]){
        int sum = 0;
        Vector<String> v = new Vector<String>();
        File file = new File("C:\\Users\\Sajjad Ali\\Documents\\NetBeansProjects\\files\\src\\second\\data.txt");
        try(FileReader f = new FileReader(file);
                BufferedReader br = new BufferedReader(f)){
            int b = 0;
            String str = "";
            while(true){
                b = br.read();
                if(b == ' ' || b == -1){
                    try{
                        sum += Integer.parseInt(str);
                        v.add(str+"");
                        str = "";
                    }
                    catch(Exception e){
                        //System.out.println(e);
                    }
                    if(b == -1){
                        break;
                    }
                }
                else{
                    str += (char) b;
                }
            }
            System.out.println(sum);
            
        }
        catch(IOException e){
            System.out.println(e);
        }
    
        try(FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw)){
            String str = "";
            for(int i=0;i<v.size();i++){
                str = v.get(i)+" ";
                bw.write(str);
            }
            str = sum + " ";
            bw.write(str);
            
            bw.flush();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
