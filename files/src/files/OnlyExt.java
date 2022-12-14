/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author Sajjad Ali
 */
public class OnlyExt {
    public static void main(String args[]){
        String dir = "pdf";
        File files = new File("E:\\BSCS-II\\Labs");
        File[] list = files.listFiles(new Filtered(dir));
        for(File x:list){
            System.out.println(x.getName());
        }
    }
    
}

class Filtered implements FilenameFilter{

    
    String ext = null;
    Filtered(String ext){
        this.ext = "." + ext;
    }
    
    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
                //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
