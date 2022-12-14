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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Sajjad Ali
 */
public class TicTacToe extends JFrame{
    private JLabel msg;
    private JButton b[][];
    private JPanel pan;
    
    private String pos = "X";
    private String data = "";
    private int tie = 0;
    
    public TicTacToe(){
        setTitle("Tic Tac Toe Game");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        init();
        
        JScrollPane sc = new JScrollPane(pan);
        add(sc);
        
        setVisible(true);
    }
    private void init(){
        msg = new JLabel();
        add(msg,BorderLayout.NORTH);
        
        b = new JButton[3][3];
        pan = new JPanel();
        pan.setSize(160,160);
        pan.setLayout(new GridLayout());
        
        addButtons();
    }
    
    private void addButtons(){
        int x[] = {40,90,140};
        int y[] = {50,80,110};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                b[i][j] = new JButton();
                b[i][j].setBounds(x[j],y[i],50,30);
                b[i][j].addActionListener(new EventHandler());
                pan.add(b[i][j]);
                add(b[i][j],BorderLayout.CENTER);
            }
        }
    }
    
    
    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new TicTacToe();
            }
        });
    }
    
    class EventHandler implements ActionListener{
        
        public void actionPerformed(ActionEvent e){
            
            if(e.getActionCommand().equals("X") || e.getActionCommand().equals("O")){
                return;
            }
            if(pos.equals("X")){
                data = "X";
                pos = "O";
                tie++;
            }
            else{
                data = "O";
                pos = "X";
                tie++;
            }
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(e.getSource().equals(b[i][j])){
                       b[i][j].setText(data);
                       break;
                    }
                }
            }
                
            for(int i=0;i<3;i++){
                String wi = "";
                int check = 0;
                for(int j=0;j<3;j++){
                    if(b[i][i].getActionCommand().equals(b[i][j].getActionCommand())){
                        check++;
                        wi = b[i][i].getActionCommand();
                    }
                }
                if(check == 3){
                    String s = "";
                    if(wi.equals("X")){
                        s = "Player 01 won";
                    }
                    else if(wi.equals("O")){
                        s = "Player 02 won";
                    }
                    msg.setText(s);
                    return;
                }
            }
            if(tie == 9){
                msg.setText("It's a Tie");
            }
            
        }
    }
}
