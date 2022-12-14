/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author Sajjad Ali
 */
public class ToBinary extends JFrame{
    JTextField input = new JTextField("Input any number in base 10");
    JTextField output = new JTextField("Binary");
    
    JButton bin = new JButton("To Binary");
    JButton clear = new JButton("Clear");
    
    ToBinary(){
        setSize(400,400);
        setTitle("Base 10 to Binary");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        init();
        
        setVisible(true);
    }
    
    private void init(){
        input.setBounds(30,30,300,30);
        add(input);
        
        output.setBounds(30,70,300,30);
        add(output);
        
        bin.setBounds(30,110,135,30);
        bin.addActionListener(new Events());
        add(bin);
        
        clear.setBounds(165,110,135,30);
        clear.addActionListener(new Events());
        add(clear);
        
    }
    
    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new ToBinary();
            }
        });
    }
    
    class Events implements ActionListener{
            public void actionPerformed(ActionEvent e){
                if(e.getSource() == clear){
                    input.setText("");
                    output.setText("");
                }
                else{
                    try{
                        output.setText(toBinary(Integer.parseInt(input.getText())));
                    }
                    catch(Exception ex){
                        input.setText(ex+"");
                    }
                }
            }
    }
    
    private String toBinary(int num){
        String str = "";
        while(num != 0){
            int i = num % 2;
            num /= 2;
            str = i + str;
        }
        return str;
    }
}

