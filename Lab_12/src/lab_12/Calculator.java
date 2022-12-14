/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_12;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author Sajjad Ali
 */
public class Calculator extends JFrame{
    
    JTextField operand = new JTextField("Operands");
    JTextField res = new JTextField("0.00");
    JButton a , m , d , s;
    JButton num[] = new JButton[10];
    
    JButton reset = new JButton("Reset");
    JButton clear = new JButton("Clear");
    JButton dot = new JButton(".");
    
    JPanel ops = new JPanel();
    JPanel ns = new JPanel();
    JPanel ots = new JPanel();
    
    String value = "";
    String ch = null;
    
    public Calculator(){
        setTitle("My Calculator");
        setSize(400,400);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        init();
        
        JScrollPane o = new JScrollPane(ots);
        add(o);
        
        JScrollPane pars = new JScrollPane(ops);
        add(pars);
        
        JScrollPane n = new JScrollPane(ns);
        add(n);
        
        setVisible(true);
    }
    
    private void init(){
        ots.setLayout(new GridLayout());
        ops.setLayout(new GridLayout());
        ns.setLayout(new GridLayout());
        
        operand.setBounds(20,30,150,30);
        add(operand);
        res.setBounds(180,30,150,30);
        add(res);
        
        reset.addActionListener(new Events());
        clear.addActionListener(new Events());
        dot.addActionListener(new Events());
        
        dot.setBounds(30,70,40,30);
        ots.add(dot);
        add(dot);
        reset.setBounds(70,70,80,30);
        ots.add(reset);
        add(reset);
        clear.setBounds(150,70,80,30);
        ots.add(clear);
        add(clear);
        
        a = new JButton("+");
        a.setBounds(30,100,50,30);
        a.addActionListener(new Events());
        ops.add(a);
        add(a);
        s = new JButton("-");
        s.setBounds(80,100,50,30);
        s.addActionListener(new Events());
        ops.add(s);
        add(s);
        d = new JButton("/");
        d.setBounds(130,100,50,30);
        d.addActionListener(new Events());
        ops.add(d);
        add(d);
        m = new JButton("X");
        m.setBounds(180,100,50,30);
        m.addActionListener(new Events());
        ops.add(m);
        add(m);
        
        int x[] = {50,100,150};
        int y[] = {130,130,130,160,160,160,190,190,190};
        for(int i=0;i<num.length-1;i++){
            num[i] = new JButton((i+1)+"");
            num[i].setBounds(x[i%3],y[i],50,30);
            num[i].addActionListener(new Events());
            ns.add(num[i]);
            add(num[i]);
        }
        num[9] = new JButton("0");
        num[9].setBounds(100,220,50,30);
        num[9].addActionListener(new Events());
        ns.add(num[9]);
        add(num[9]);
        
        
    }
    
    
    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new Calculator();
            }
        });
    }
    
    class Events implements ActionListener{
        
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == reset){
                operand.setText("");
                //value = "";
                ch = null;
            }
            else if(e.getSource() == clear){
                res.setText("0.00");
                //value = "";
                ch = null;
            }
            else if(e.getSource() == a || e.getSource() == s || e.getSource() == m || e.getSource() == d){
                if(ch == null){
                    res.setText(operand.getText());
                    operand.setText("");
                    //value = "";
                    
                    ch = e.getActionCommand();
                }
                else{
                    
                    ch = e.getActionCommand();
                    operand.setText("");
                }
                
            }
            else{
                //value += e.getActionCommand();
                operand.setText(operand.getText()+e.getActionCommand());
                
                if(e.getSource() != dot){
                    try{
                        double num = 0.0;
                        double val = 0.0;
                        double result = 0.0;
                        try{
                            num = Double.parseDouble(res.getText());
                            val = Double.parseDouble(operand.getText());
                        }
                        catch(Exception ex){
                        
                        }
                        if(ch.equals("+")){
                            result = num + val;
                        }
                        else if(ch.equals("-")){
                            result = num - val;
                        }
                        else if(ch.equals("X")){
                            result = num * val;
                        }
                        else if(ch.equals("/")){
                            try{
                                if(val == 0){
                                    throw new DivisionByZeroException();
                                }
                                result = num / val;
                            }catch(DivisionByZeroException ex){
                                operand.setText(ex+"");
                            }
                        }
                    
                        res.setText(""+result);
                    }
                    catch(Exception esxep){}
                }
                
            }
        }
    }
}


class DivisionByZeroException extends Exception{
    private String str = null;
    DivisionByZeroException(){
        str = "Division By Zero";
    }
    
    public String toString(){
        return str;
    }
}