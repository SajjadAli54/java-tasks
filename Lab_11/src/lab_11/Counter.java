/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_11;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Sajjad Ali
 */
public class Counter extends Frame{
    Label l;
    TextField tf;
    Button b;
    String t = "";
    
    Counter(){
        l = new Label("Counter");
        tf = new TextField(10);
        b = new Button("Count");
        
        add(l);
        add(tf);
        add(b);
        
        l.setBackground(Color.DARK_GRAY);
        tf.setBackground(Color.DARK_GRAY);
        b.setBackground(Color.DARK_GRAY);
        
        addWindowListener(new WindowAdapter(){
           public void windowClosing(WindowEvent e){
               System.exit(0);
           } 
        });
        
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t = tf.getText();
                int i = 0;
                try{
                    i = Integer.parseInt(t) + 1;
                }catch(Exception ex){
                    i = 1;
                }
                tf.setText(i+"");
            }
        });
        
        setSize(300,200);
        setLayout(new FlowLayout());
        setBackground(Color.CYAN);
        setForeground(Color.WHITE);
        setVisible(true);
    }
    
    public static void main(String args[]){
        new Counter();
    }
    
}
