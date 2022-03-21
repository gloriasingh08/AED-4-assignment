/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author gloriasingh
 */

import java.util.*;
import javax.swing.*;
import java.io.*;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

public class DisplayPatients extends javax.swing.JFrame {

    /**
     * Creates new form DisplayPatients
     */
    
     ArrayList<Person> persons;
    ArrayList<Patient> patients;

    public DisplayPatients() {
        initComponents();
         persons=new ArrayList<Person>();
        patients=new ArrayList<Patient>();
        populatePatientDirectory();
    }

    public void populatePatientDirectory()
    {
        try{
               
                FileInputStream f = new FileInputStream("per.dat");
                ObjectInputStream input = new ObjectInputStream(f);

                boolean endOfFile=false; 
                    // setting the end of file to false first, 
                    //because you have start reading

                while(!endOfFile)
                {
                    try
                    {
                        persons.add((Person)input.readObject()); // here reading the object and casting it as person object
                        
                    }
                    catch(EOFException e)
                    {
                        endOfFile= true;
                    } 
                    catch (Exception ex)
                    {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                        this.dispose();
                    }
                }
                input.close();
                   
            }
        
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
            this.dispose();
        }
         
         try{
               
                FileInputStream f1 = new FileInputStream("patient.dat");
                ObjectInputStream input2 = new ObjectInputStream(f1);

                boolean endOfFile=false; 
                    // setting the end of file to false first, 
                    //because you have start reading

                while(!endOfFile)
                {
                    try
                    {
                        patients.add((Patient)input2.readObject()); // here reading the object and casting it as person object
                        
                    }
                    catch(EOFException e)
                    {
                        endOfFile= true;
                    }  
                    catch (Exception ex)
                    {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                        this.dispose();
                    }
                }
                input2.close();
                   
            }
        
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
            this.dispose();
        }
        
    }
  
    
    public void manageTable()
{    
    try {
            //JOptionPane.showMessageDialog(null, "hello");
            FileInputStream file = new FileInputStream("patient.dat");
            ObjectInputStream input = new ObjectInputStream(file);
            Vector<Patient> dataPat = new Vector<Patient>();
            
            
              FileInputStream file1 = new FileInputStream("per.dat");
            ObjectInputStream inputPer = new ObjectInputStream(file1);
            Vector<Person> dataPer = new Vector<Person>();
           Boolean endOFFile = false;
           
            while (endOFFile != true) 
            {
                try 
                {
                    dataPer.add((Person) inputPer.readObject());
                    dataPat.add((Patient) input.readObject());
                }
                catch (EOFException ef)
                {
                    endOFFile = true;
                    //JOptionPane.showMessageDialog(null, "The file has reached its end!");

                } 
                catch (IOException ex)
                {
                   JOptionPane.showMessageDialog(null, "input exceptionx");
                }
                catch (ClassNotFoundException ex)
                {
                   
                 JOptionPane.showMessageDialog(null, "Class not found exception");

                }
            }
         
        file.close();
        input.close();
        file1.close();
        inputPer.close();
//      
//        JOptionPane.showMessageDialog(null, dataPat.size());
//        JOptionPane.showMessageDialog(null, dataPer.size());
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        table.setRowCount(0);
        
        for (int i = 0; i < dataPat.size(); i++) 
        {
            Patient row = dataPat.get(i);
            Person row1=dataPer.get(i);
               SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd, yyyy hh:mm:ss");
            Date d = new Date(row.getEncounter_date());
            String dateToDisplay = simpleDateFormat.format(d);
            
            table.addRow(new Object[]{row1.getFirst_name(),row1.getLast_name(),row1.getSSN(),row1.getCommunity(),row1.getCity(),row1.getDate_of_birth(),row.getBlood_pressure1() +"/" +row.getBloodpressure2(),row.getPulse(),row.getTemperature(),row.getBreathing(),row.getInsurance_Number(),row.getIllness(),dateToDisplay,row.getPerson().getGender()});
         }
    }
    catch(Exception ex)
    {
            
              JOptionPane.showMessageDialog(null, "can not be displayed");  

    }
}
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setBackground(new java.awt.Color(225, 204, 215));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "SSN", "Community", "City", "Date of birth", "Blood pressure", "Pulse", "Temp", "Breathing rate", "Insurance ID", "Illness", "Encounter date", "Gender"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/istockphoto-1046447804-612x612.jpeg"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jButton1.setText("Display ");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jButton1)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            manageTable();

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(DisplayPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayPatients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayPatients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
