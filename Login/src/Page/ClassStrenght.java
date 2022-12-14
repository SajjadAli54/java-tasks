/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Page;

import java.awt.BorderLayout;
import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class ClassStrenght extends javax.swing.JFrame {
    public void classStrength(int pg, int one, int two, int three, int four, int five, int six, int seven, int eight){
        DefaultCategoryDataset chart = new DefaultCategoryDataset();
        chart.setValue(pg,"","Class PG");
        chart.setValue(one,"","Class One");
        chart.setValue(two,"","Class Two");
        chart.setValue(three,"","Class Three");
        chart.setValue(four,"","Class Four");
        chart.setValue(five,"","Class Five");
        chart.setValue(six,"","Class Six");
        chart.setValue(seven,"","Class Seven");
        chart.setValue(eight,"","Class Eight");
        JFreeChart barChart = ChartFactory.createBarChart(
         "Classes Strength", 
         "", "Class Name", 
         chart,PlotOrientation.VERTICAL, 
         true, true, false);
         CategoryPlot plot = barChart.getCategoryPlot();
         plot.setRangeGridlinePaint(Color.black);
         ChartPanel barPanel = new ChartPanel(barChart);
         panelChart.removeAll();
         panelChart.add(barPanel,BorderLayout.CENTER);
         panelChart.validate();
         
         
        
    }
    
public void salaryChart(int l1, int l2, int l3, int l4, int l5, int l6, int l7, int l8, int l9){
    
        DefaultCategoryDataset chart = new DefaultCategoryDataset();
        chart.setValue(l1,"Salary","10000<=x< 20000");
        chart.setValue(l2,"Salary","20000<=x< 30000");
        chart.setValue(l3,"Salary","30000<=x< 40000");
        chart.setValue(l4,"Salary","40000<=x< 50000");
        chart.setValue(l5,"Salary","50000<=x< 60000");
        chart.setValue(l6,"Salary","60000<=x< 70000");
        chart.setValue(l7,"Salary","70000<=x< 80000");
        chart.setValue(l8,"Salary","80000<=x< 90000");
        chart.setValue(l9,"Salary","90000<=x< 100000");
        JFreeChart barChart = ChartFactory.createBarChart(
         "Salary Ratio", 
         "", "10000 - 100000", 
         chart,PlotOrientation.VERTICAL, 
         true, true, false);
        
        CategoryPlot plot = barChart.getCategoryPlot();
         plot.setRangeGridlinePaint(Color.black);
         ChartPanel barPanel = new ChartPanel(barChart);
         panelChart.removeAll();
         panelChart.add(barPanel,BorderLayout.CENTER);
         panelChart.validate();
        
    
    }
    





    public ClassStrenght() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelChart = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelChart.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClassStrenght.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClassStrenght.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClassStrenght.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClassStrenght.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClassStrenght().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelChart;
    // End of variables declaration//GEN-END:variables
}
