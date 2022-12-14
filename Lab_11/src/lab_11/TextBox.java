/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_11;

import java.awt.Button;
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
public class TextBox extends Frame{
    TextField a;
    TextField b;
    
    Button ok;
    
    TextBox(){
        a = new TextField(10);
        a.setBounds(20, 40, 170, 20);
        
        b = new TextField(10);
        b.setBounds(20,80,170,20);
        
        ok = new Button("OK");
        ok.setBounds(20,120,40,40);
        
        addFields();
        
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    
    public void addFields(){
        add(a);
        add(b);
        add(ok);
        
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        ok.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e){
                b.setText(a.getText());
            }
        });
    }
    
    public static void main(String args[]){
        new TextBox();
    }
    
}
