/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Sajjad Ali
 */
public class AEvent3 extends Frame {
    TextField tf;
    
    AEvent3(){
        tf = new TextField();
        tf.setBounds(50,60,170,20);
        
        Button b = new Button("Click me");
        b.setBounds(50,120,80,30);
        b.setBackground(Color.CYAN);
        
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setBackground(Color.CYAN);
                tf.setText("Hey Anonymous Class");
            }
        });
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        add(tf);
        add(b);
        
        setSize(300,300);
        setLayout(null);
        setBackground(Color.MAGENTA);
        setForeground(Color.BLACK);
        setVisible(true);
    }
    
    public static void main(String args[]){
        new AEvent3();
    }
}
