/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Page;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SearchStaff extends JFrame {
    JLabel[] ns = new JLabel[13];
    JLabel[] ds = new JLabel[13];

    public SearchStaff(Page.sms.Staff obj){
        
        left(obj);
        right(obj);
        
        
        setSize(710,427);
        setTitle("Staff Data");
        setLayout(null);
        setBackground(Color.WHITE);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    
    private void left(Page.sms.Staff obj){
        int x = 30 , x2 = 120;
        int y[] = {30,70,110,150,190,230,270};
        for(int i=0;i<7;i++){
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
        ns[5].setText("Salary   : ");
        ds[5].setText(obj.getSalary()+"");
        ns[6].setText("Religion : ");
        ds[6].setText(obj.getReligion());
        
    }
    
    private void right(Page.sms.Staff obj){
        int x = 270 , x2 = 340;
        int y[] = {30,70,110,150,190,230}; 
        int j = 0;
        for(int i=7;i<13;i++){
            ns[i] = new JLabel();
            ns[i].setBounds(x,y[j],60,20);
            ns[i].setBackground(Color.cyan);
            add(ns[i]);
            
            ds[i] = new JLabel();
            ds[i].setBounds(x2,y[j],150,20);
            add(ds[i]);
            j++;
            
        }
        
        
        ns[7].setText("Surname   : ");
        ds[7].setText(obj.getSurname());
        ns[8].setText("Degree    : ");
        ds[8].setText(obj.getDegree());
        ns[9].setText("Designation :");
        ds[9].setText(obj.getDesignation());
        ns[10].setText("Birth    : ");
        ds[10].setText(obj.getBirthDate());
        ns[11].setText("Contact  : ");
        ds[11].setText(obj.getContact());
        ns[12].setText("Country : ");
        ds[12].setText(obj.getNationality());
        
    }
}
