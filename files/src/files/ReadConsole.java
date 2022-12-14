/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.io.Console;

/**
 *
 * @author Sajjad Ali
 */
public class ReadConsole {
    public static void main(String args[]){
        Console consol = System.console();
        try{
            System.out.println(consol.readLine("Enter a text : "));
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
