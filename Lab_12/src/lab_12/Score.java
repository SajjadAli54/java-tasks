/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_12;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Sajjad Ali
 */
public class Score extends JFrame{
    Score(){
        setTitle("Score Card");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        
        JLabel score = new JLabel("You Scored "+Trivia.marks+" marks");
        score.setBounds(30,30,170,30);
        add(score);
        
        JLabel cor = new JLabel("Correct Options are");
        cor.setBounds(30,70,170,30);
        add(cor);
        
        JLabel a = new JLabel("1. 1921");
        a.setBounds(30,110,170,30);
        add(a);
        
        JLabel b = new JLabel("2. Sushant");
        b.setBounds(30,150,170,30);
        add(b);
        
        JLabel c = new JLabel("3. Both a and b");
        c.setBounds(30,190,170,30);
        add(c);
        
    }
}
