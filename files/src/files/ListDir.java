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
public class ListDir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Let suppose given directory
        File file = new File("E:\\BSCS-II\\Labs");
        File list[] = file.listFiles();
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
