/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_11;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Sajjad Ali
 */
public class Alphabets extends Frame {
    TextField tf;
    Button b[] = new Button[26];
    
    Alphabets(){
        tf = new TextField();
        tf.setBounds(50,50,170,20);
        
        initButtons();
        
        
        addFields();
        addListeners();
    }
    
    private void initButtons(){
        int x[] = {20,80,140,200,260,320,380,440,480};
        int y[] = {120,160,200};
        for(int i=0;i<b.length;i++){
            b[i] = new Button();
        }
        int k=0;
        for(int i=0;i<y.length;i++){
            for(int j=0;j<x.length;j++){
                if(k<26)
                    b[k].setBounds(x[j],y[i],50,30);
                k++;
            }
        }
    }
    private void addFields(){
        add(tf);
        for(int i=0;i<b.length;i++){
            add(b[i]);
        }
    }
    
    private void addListeners(){
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        for(int i=0;i<b.length;i++){
            b[i].addActionListener(new MyActionListener());
            b[i].addKeyListener(new MyKeyListener());
        }
        
        tf.addKeyListener(new MyKeyListener());
        
        
    }
    
    class MyActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            int[] alp = new int[26];
            int lit = 65;
            for(int i=0;i<alp.length;i++){
                alp[i] = lit++;
            }
            
            for(int i=0;i<b.length;i++){
                if(e.getSource() == b[i]){
                    b[i].setLabel(((char)alp[i])+"");
                    b[i].setBackground(Color.red);
                    b[i].setForeground(Color.BLACK);
                    b[i].setVisible(true);
                }
            }
            
        }
    }
    
    class MyKeyListener extends KeyAdapter{
        char typed = 'n';
        int[] alp = new int[26];

        
        public void keyPressed(KeyEvent e){
            int lit = 65;
            for(int i=0;i<alp.length;i++){
                alp[i] = lit++;
            }
            if(e.getExtendedKeyCode() == KeyEvent.VK_ENTER){
                typed = tf.getText().charAt(0);
                for(int i=0;i<b.length;i++){
                    if(typed == alp[i]){
                        b[i].setLabel(typed+"");
                        b[i].setBackground(Color.red);
                        b[i].setForeground(Color.BLACK);
                        b[i].setVisible(true);
                        tf.setText("");
                    }
                }
            }
        }
    }
    
    public static void main(String args[]){
        Alphabets alph = new Alphabets();
        alph.setSize(600,300);
        alph.setLayout(null);
        alph.setTitle("Complete Alphabet");
        alph.setBackground(Color.cyan);
        alph.setForeground(Color.BLACK);
        alph.setResizable(false);
        alph.setVisible(true);
    }
}
