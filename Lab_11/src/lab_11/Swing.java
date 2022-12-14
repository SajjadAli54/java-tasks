/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Sajjad Ali
 */
public class Swing extends JFrame{
    
    JLabel label , text;
    JButton a;
    JButton b;
    JButton c;
    
    Swing(){
        label = new JLabel("Control in Action : JButton");
        label.setBounds(80, 30, 170, 20);
        
        a = new JButton("OK");
        a.setBounds(50,80,70,30);
        
        b = new JButton("Submit");
        b.setBounds(130,80,100,30);
        
        c = new JButton("Cancel");
        c.setBounds(240,80,100,30);
        
        text = new JLabel();
        text.setBounds(80,260,170,30);
        
        addFields();
        setSize(400,400);
        setLayout(null);
        setTitle("Java Swing Examples");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void addFields(){
        add(label);
        add(a);
        add(b);
        add(c);
        add(text);
        
        a.addActionListener(new MyActionListener());
        b.addActionListener(new MyActionListener());
        c.addActionListener(new MyActionListener());
    }
    
    public static void main(String args[]){
        new Swing();
    }
    
    class MyActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            text.setText(e.getActionCommand()+" Button clicked");
        }
    }
}
