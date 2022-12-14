/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Sajjad Ali
 */
public class AEvent extends Frame implements ActionListener {
    TextField tf;
    
    public AEvent(){
        tf = new TextField();
        tf.setBounds(60,50,170,20);
        
        Button b = new Button("Click me");
        b.setBounds(100,120,80,30);
        
        b.addActionListener(this);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        add(tf);
        add(b);
        
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        tf.setText("Welcome to Event Handling");
    }
    
    public static void main(String args[]){
        new AEvent();
    }
}
