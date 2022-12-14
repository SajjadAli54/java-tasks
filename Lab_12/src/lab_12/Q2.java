/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Sajjad Ali
 */
public class Q2 extends JPanel{
    Q2(){
        setLayout(null);
        JLabel q = new JLabel("M.S Dhoni The Untold Story is acted by ");
            q.setBounds(30,30,300,30);
            add(q);
            
            JRadioButton op1 = new JRadioButton("Amir Khan");
            op1.setBounds(30,70,100,30);
            
            JRadioButton op2 = new JRadioButton("Shah Rukh");
            op2.setBounds(30,110,100,30);
            
            JRadioButton op3 = new JRadioButton("Sushant");
            op3.setBounds(30,150,100,30);
            
            JRadioButton op4 = new JRadioButton("Varun");
            op4.setBounds(30,190,100,30);
            
            ButtonGroup group = new ButtonGroup();
            group.add(op1);
            group.add(op2);
            group.add(op3);
            group.add(op4);
            
            add(op1);
            add(op2);
            add(op3);
            add(op4);
            
            op3.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if(op3.isSelected()){
                        Trivia.marks += 1;
                    }
                }
            });
    }
}
