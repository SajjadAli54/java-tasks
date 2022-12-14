/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Sajjad Ali
 */
public class AEvent2 extends Frame {
    TextField tf;
    
    AEvent2(){
        tf = new TextField();
        tf.setBounds(60,50,170,20);
        
        Button b = new Button("Click me");
        b.setBounds(100,120,80,30);
        
        b.addActionListener(new Outer(this));
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        add(tf);
        add(b);
        
        setSize(300,300);
        setBackground(Color.BLACK);
        setLayout(null);
        setVisible(true);
    }
    
    public static void main(String args[]){
        new AEvent2();
    }
}
