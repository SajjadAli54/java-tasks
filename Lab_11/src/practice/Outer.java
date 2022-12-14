/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Sajjad Ali
 */
public class Outer implements ActionListener{
    AEvent2 obj;
    Outer(AEvent2 e){
        obj = e;
    }
    
    public void actionPerformed(ActionEvent e){
        obj.tf.setBackground(Color.red);
        obj.tf.setText("Hello! I am Sajjad Ali");
    }
}
