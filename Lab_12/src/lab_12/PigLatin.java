/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_12;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author Sajjad Ali
 */
public class PigLatin extends JFrame {

    private JLabel[] label = new JLabel[2];
    private JTextField tf;
    private JButton button;
    
    PigLatin(){
        setTitle("Pig Latin");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBackground(Color.magenta);
        setLayout(null);
        
        init();
        
        setVisible(true);
        
        
    }
    
    private void init(){
        label[0] = new JLabel("Input any Text");
        label[0].setBounds(20,30,100,30);
        add(label[0]);
        
        
        tf = new JTextField();
        tf.setBounds(140,30,200,30);
        add(tf);
        
        label[1] = new JLabel();
        label[1].setBounds(140,80,250,30);
        add(label[1]);
        
        button = new JButton("Pig Latin");
        button.setBounds(140,120,100,30);
        add(button);
        
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(tf.getText() == null){
                    return;
                }
                else{
                    String text = tf.getText();
                    text = pigLatin(text);
                    label[1].setText(text);
                }
            }
        });
    }
    
    private String pigLatin(String str){
        String pl = "";
        String[] arr = str.split(" ");
        char[] vow = {'A','E','I','O','U','a','e','i','o','u'};
        for(String x:arr){
            char i = x.charAt(0);
            int ch = 0;
            for(char v:vow){
                if (i == v){
                    ch++;
                }
            }
            if(ch == 0){
                pl += x.substring(1) + i +"ay ";
            }
            else{
                pl += x +"way ";
            }
        }
        return pl;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new PigLatin();
            }
        });
    }
    
}
