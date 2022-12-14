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
public class Check {
    public static void main(String args[]){
        File f = new File("E:\\BSCS-II\\Labs");
        File list[] = f.listFiles();
        for(File x:list){
            if(x.isFile()){
                System.out.println(x.getName() + " is file");
            }
            else{
                System.out.println(x.getName() + " is Directory");
            }
        }
    }
    
}
