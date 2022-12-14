/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_11;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Sajjad Ali
 */
public class MouseEventsDemo extends Frame{
    Button button;
    Label l;
    
    MouseEventsDemo(){
        button = new Button();
        button.setBounds(20,30,300,200);
        button.setBackground(Color.YELLOW);
        
        l = new Label();
        l.setBounds(20,250,350,30);
        
        add(button);
        add(l);
        addMouseListener(new MyMouseListener());
        
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                l.setText("Clicked on yellow area");
            }
        });
        
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        setTitle("Mouse Events Demo");
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    
    class MyMouseListener implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
           l.setText("Mouse entered clicked detected on Events.Blank Area.");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            l.setText("Mouse entered pressed detected on Events.Blank Area.");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            l.setText("Mouse entered detected on Events.Mouse Events Demo.");
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            l.setText("Mouse entered detected on Events.Mouse Events Demo.");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            l.setText("Mouse exited detected on Events.Blank Area.");
        }
        
    }
    
    public static void main(String args[]){
        new MouseEventsDemo();
    }
}
