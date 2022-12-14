/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_12;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Sajjad Ali
 */
public class Trivia extends JFrame  {
    static int marks = 0;
    JLabel tim = new JLabel("Timer : 0");
    public Trivia(){
        setSize(500,500);
        setTitle("Kaun Banega Crore Pati");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        init();
    }
    
    private void init(){
        add(tim,BorderLayout.NORTH);
        JTabbedPane tp = new JTabbedPane();
        tp.add(new Q1(),"Question 1");
        tp.add(new Q2(),"Question 2");
        tp.add(new Q3(),"Question 3");
        
        add(tp,BorderLayout.CENTER);
        new Timer().start();
        
        
        
    }
    
    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new Trivia().setVisible(true);
            }
        });
    }
    
    class Timer extends Thread{
        public void run(){
            for(int i=1;i<=60;i++){
                try{
                    sleep(1000);
                }
                catch(InterruptedException e){
                    
                }
                tim.setText("Timer : "+i);
                if(i == 60){
                    new Score().setVisible(true);
                }
            }
        }
    }
}
