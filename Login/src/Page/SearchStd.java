/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Page;

import Page.sms.Students;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SearchStd extends JFrame {
     JLabel[] ns = new JLabel[12];
    JLabel[] ds = new JLabel[12];

    public SearchStd(Students obj){
        
        left(obj);
        right(obj);
        
        
        setSize(710,427);
        setTitle("Student Data");
        setLayout(null);
        setBackground(Color.WHITE);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    
    private void left(Students obj){
        int x = 30 , x2 = 120;
        int y[] = {30,70,110,150,190,230};
        for(int i=0;i<6;i++){
            ns[i] = new JLabel();
            ns[i].setBounds(x,y[i],60,20);
            ns[i].setBackground(Color.cyan);
            add(ns[i]);
            
            ds[i] = new JLabel();
            ds[i].setBounds(x2,y[i],150,20);
            add(ds[i]);
            
        }
        
        ns[0].setText("CMSID    : ");
        ds[0].setText(obj.getId());
        ns[1].setText("Name     : ");
        ds[1].setText(obj.getName());
        ns[2].setText("Father   : ");
        ds[2].setText(obj.getFather());
        ns[3].setText("CNIC     : ");
        ds[3].setText(obj.getCnic());
        ns[4].setText("Gender   : ");
        ds[4].setText(obj.getGender());
        ns[5].setText("Address  : ");
        ds[5].setText(obj.getAddress());
        
    }
    
    private void right(Students obj){
        int x = 270 , x2 = 340;
        int y[] = {30,70,110,150,190,230}; 
        int j = 0;
        for(int i=6;i<12;i++){
            ns[i] = new JLabel();
            ns[i].setBounds(x,y[j],60,20);
            ns[i].setBackground(Color.cyan);
            add(ns[i]);
            
            ds[i] = new JLabel();
            ds[i].setBounds(x2,y[j],150,20);
            add(ds[i]);
            j++;
            
        }
        
        ns[6].setText("Religion : ");
        ds[6].setText(obj.getReligion());
        ns[7].setText("Surname   : ");
        ds[7].setText(obj.getSurname());
        ns[8].setText("Class    : ");
        ds[8].setText(obj.getClas());
        ns[9].setText("Birth    : ");
        ds[9].setText(obj.getBirthDate());
        ns[10].setText("Contact  : ");
        ds[10].setText(obj.getContact());
        ns[11].setText("Country : ");
        ds[11].setText(obj.getNationality());
        
    }
}
