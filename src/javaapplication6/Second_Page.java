/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;
import net.proteanit.sql.DbUtils;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
/**
 *
 * @author ajeet
 */
public class Second_Page extends javax.swing.JFrame {
     Connection con;
     PreparedStatement pst;
     ResultSet rs;
    /**
     * Creates new form Second_Page
     */
    public Second_Page() {
        initComponents();
       
    }
    public void close()
    {
     WindowEvent windo = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
     Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(windo);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Id = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        Quantity = new javax.swing.JTextField();
        Price = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Name1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Gst1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Hsn1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jButton17 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Updation Page");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(1350, 690));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(19, 150, 166), 8, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Waree", 1, 36)); // NOI18N
        jLabel1.setText("Update Details");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 350, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication6/receipt.png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 70));

        jLabel11.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(212, 56, 56));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication6/ext.png"))); // NOI18N
        jLabel11.setText("Help");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 10, 110, 70));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1330, 90));

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(19, 150, 166), 8, true));

        jButton5.setFont(new java.awt.Font("Waree", 1, 24)); // NOI18N
        jButton5.setText("Sales");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Waree", 1, 24)); // NOI18N
        jButton6.setText("Exit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Waree", 1, 24)); // NOI18N
        jButton7.setText("History");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Waree", 1, 24)); // NOI18N
        jButton8.setText("Main");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 1330, -1));

        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(19, 150, 166), 8, true));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Waree", 1, 18)); // NOI18N
        jLabel2.setText("Product Id");
        jLabel2.setPreferredSize(new java.awt.Dimension(71, 40));
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 120, 30));

        jLabel3.setFont(new java.awt.Font("Waree", 1, 18)); // NOI18N
        jLabel3.setText("GST TABLE UPDATE");
        jLabel3.setPreferredSize(new java.awt.Dimension(98, 40));
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 230, 30));

        jLabel4.setFont(new java.awt.Font("Waree", 1, 18)); // NOI18N
        jLabel4.setText("Product Quantity");
        jLabel4.setPreferredSize(new java.awt.Dimension(119, 40));
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 180, 30));

        jLabel5.setFont(new java.awt.Font("Waree", 1, 18)); // NOI18N
        jLabel5.setText("Product Price");
        jLabel5.setPreferredSize(new java.awt.Dimension(92, 40));
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 170, 30));

        Id.setFont(new java.awt.Font("Waree", 1, 18)); // NOI18N
        Id.setPreferredSize(new java.awt.Dimension(10, 40));
        Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdActionPerformed(evt);
            }
        });
        Id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IdKeyTyped(evt);
            }
        });
        jPanel6.add(Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 170, -1));

        Name.setFont(new java.awt.Font("Waree", 1, 18)); // NOI18N
        Name.setPreferredSize(new java.awt.Dimension(10, 40));
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NameKeyTyped(evt);
            }
        });
        jPanel6.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 170, -1));

        Quantity.setFont(new java.awt.Font("Waree", 1, 18)); // NOI18N
        Quantity.setPreferredSize(new java.awt.Dimension(10, 40));
        Quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantityActionPerformed(evt);
            }
        });
        Quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                QuantityKeyTyped(evt);
            }
        });
        jPanel6.add(Quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 170, -1));

        Price.setFont(new java.awt.Font("Waree", 1, 18)); // NOI18N
        Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceActionPerformed(evt);
            }
        });
        Price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PriceKeyTyped(evt);
            }
        });
        jPanel6.add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 170, 40));

        jButton11.setFont(new java.awt.Font("Waree", 1, 24)); // NOI18N
        jButton11.setText("Delete");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 170, 50));

        jButton12.setFont(new java.awt.Font("Waree", 1, 24)); // NOI18N
        jButton12.setText("Prod. List");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 170, 50));

        jButton13.setFont(new java.awt.Font("Waree", 1, 24)); // NOI18N
        jButton13.setText("Update");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 170, 50));

        jPanel4.setBackground(new java.awt.Color(101, 129, 137));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(142, 164, 175), 1, true));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 10, 390));

        jLabel7.setFont(new java.awt.Font("Waree", 1, 18)); // NOI18N
        jLabel7.setText("Product Name");
        jLabel7.setPreferredSize(new java.awt.Dimension(98, 40));
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 150, 30));

        Name1.setFont(new java.awt.Font("Waree", 1, 18)); // NOI18N
        Name1.setPreferredSize(new java.awt.Dimension(10, 40));
        Name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Name1ActionPerformed(evt);
            }
        });
        Name1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Name1KeyTyped(evt);
            }
        });
        jPanel6.add(Name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 160, 40));

        jLabel8.setFont(new java.awt.Font("Waree", 1, 18)); // NOI18N
        jLabel8.setText("Name");
        jLabel8.setPreferredSize(new java.awt.Dimension(98, 40));
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 150, 30));
        jPanel6.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 320, 10));

        Gst1.setFont(new java.awt.Font("Waree", 1, 18)); // NOI18N
        Gst1.setPreferredSize(new java.awt.Dimension(10, 40));
        Gst1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gst1ActionPerformed(evt);
            }
        });
        Gst1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Gst1KeyTyped(evt);
            }
        });
        jPanel6.add(Gst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 160, -1));

        jLabel9.setFont(new java.awt.Font("Waree", 1, 18)); // NOI18N
        jLabel9.setText("GST");
        jLabel9.setPreferredSize(new java.awt.Dimension(119, 40));
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 120, 30));

        Hsn1.setFont(new java.awt.Font("Waree", 1, 18)); // NOI18N
        Hsn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hsn1ActionPerformed(evt);
            }
        });
        Hsn1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Hsn1KeyTyped(evt);
            }
        });
        jPanel6.add(Hsn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 160, 40));

        jLabel10.setFont(new java.awt.Font("Waree", 1, 18)); // NOI18N
        jLabel10.setText("HSN NO.");
        jLabel10.setPreferredSize(new java.awt.Dimension(92, 40));
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 120, 30));

        jButton14.setFont(new java.awt.Font("Waree", 1, 24)); // NOI18N
        jButton14.setText("Insert");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 160, 50));

        jButton15.setFont(new java.awt.Font("Waree", 1, 24)); // NOI18N
        jButton15.setText("Reset");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 160, 50));

        jButton16.setFont(new java.awt.Font("Waree", 1, 24)); // NOI18N
        jButton16.setText("Gst List");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, 160, 50));
        jPanel6.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 320, 10));

        jButton17.setFont(new java.awt.Font("Waree", 1, 24)); // NOI18N
        jButton17.setText("Reset");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 170, 50));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 840, 430));

        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(19, 150, 166), 8, true));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Quantity", "Price", "Hsn", "Gst"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel7.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 440, 390));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 110, 480, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        History_Page his = new History_Page();
        his.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     int yesOrNo = JOptionPane.showConfirmDialog(null,"Do you want to close it?"+"Exit"+JOptionPane.YES_NO_OPTION);
        if(yesOrNo==0)
        {   
          close();
        }
        else
        {}    
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        History_Page his = new History_Page();
        his.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       Main_Oage main = new Main_Oage();
        main.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       int index = jTable1.getSelectedRow();
       TableModel model = jTable1.getModel();
       Id.setText(model.getValueAt(index, 0).toString());
       Name.setText(model.getValueAt(index, 1).toString()); 
       Quantity.setText(model.getValueAt(index, 2).toString());
       Price.setText(model.getValueAt(index, 3).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdActionPerformed

    private void IdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdKeyTyped
        Child_Biling number = new Child_Biling();
        try{
            number.NumbersOnly(evt);
        }
        catch(Exception e)
        {
        }
    }//GEN-LAST:event_IdKeyTyped

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void NameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NameKeyTyped
      /*  Child_Biling string = new Child_Biling();
        try{
            string.StringOnly(evt);
        }
        catch(Exception e)
        {
        }*/
    }//GEN-LAST:event_NameKeyTyped

    private void QuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantityActionPerformed

    private void QuantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QuantityKeyTyped
        Child_Biling number = new Child_Biling();
        try{
            number.NumbersOnly(evt);
        }
        catch(Exception e)
        {
        }
    }//GEN-LAST:event_QuantityKeyTyped

    private void PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceActionPerformed

    private void PriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PriceKeyTyped
        Child_Biling number = new Child_Biling();
        try{
            number.NumbersOnly(evt);
        }
        catch(Exception e)
        {
        }
    }//GEN-LAST:event_PriceKeyTyped
   public void ExtraUpdate()
    {
      try
      {
          String sql1 = "UPDATE `Costumer` SET Hsn_No=(SELECT `Hsn_No` FROM `Gst_Table`WHERE Costumer.Name = Gst_Table.Prod_Name), Gst=(SELECT `Gst`FROM `Gst_Table`WHERE Costumer.Name = Gst_Table.Prod_Name)";
          con = (Connection) DriverManager.getConnection("jdbc:sqlite:C:/sqllite/ajeet.db");
          pst = (PreparedStatement) con.prepareStatement(sql1);
          pst.executeUpdate(); 
      }
      catch(SQLException e)
      {
         JOptionPane.showMessageDialog(null,"Could not Updated ");
      }
    }
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
       try
        {
            String sql = "DELETE FROM `Costumer` WHERE Id=? AND Name=?" ;
            con = (Connection) DriverManager.getConnection("jdbc:sqlite:C:/sqllite/ajeet.db");
            pst = (PreparedStatement) con.prepareStatement(sql);
            pst.setString(1,Id.getText());
            pst.setString(2,Name.getText());
            pst.executeUpdate();

        }
        catch(HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Not Deleted");
        }
        Show_Data();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
         Show_Data();     
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
      try
        {
            String sql = "UPDATE `Costumer` SET `Id`=?,`Name`=?,`Quantity`=?,`Price`=? WHERE Id=?";
            con = (Connection) DriverManager.getConnection("jdbc:sqlite:C:/sqllite/ajeet.db");
            pst = (PreparedStatement) con.prepareStatement(sql);
            pst.setString(5,Id.getText());
            pst.setString(1,Id.getText());
            pst.setString(2,Name.getText());
            pst.setString(3,Quantity.getText());
            pst.setString(4,Price.getText());
            pst.executeUpdate();

        }
        catch(HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Not Updated");
        }
        Show_Data();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void Name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Name1ActionPerformed

    private void Name1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Name1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Name1KeyTyped

    private void Gst1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gst1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Gst1ActionPerformed

    private void Gst1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Gst1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Gst1KeyTyped

    private void Hsn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hsn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Hsn1ActionPerformed

    private void Hsn1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Hsn1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Hsn1KeyTyped

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
       try
        {
            String sql = "INSERT INTO `Gst_Table`(`Hsn_No`,`Prod_Name`,`Gst`) VALUES (?,?,?)";
            con = (Connection) DriverManager.getConnection("jdbc:sqlite:C:/sqllite/ajeet.db");
            pst = (PreparedStatement) con.prepareStatement(sql);
            pst.setString(1,Hsn1.getText());
            pst.setString(2,Name1.getText());
            pst.setString(3,Gst1.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Successfully Inserted into Gst");
        }
        catch(HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Not Inserted in HSN Table");
        }
       try
        {
            String sql = "INSERT INTO `Costumer`(`Name`,`Quantity`, `Price`,`Hsn_No`,`Gst`) VALUES (?,0,0,?,?)";
            con = (Connection) DriverManager.getConnection("jdbc:sqlite:C:/sqllite/ajeet.db");
            pst = (PreparedStatement) con.prepareStatement(sql);
            pst.setString(1,Name1.getText());
            pst.setString(2,Hsn1.getText());
            pst.setString(3,Gst1.getText());
            pst.executeUpdate();
        }
        catch(HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Not Inserted in Customer");
        }
       showGst();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
       Name1.setText("");
       Gst1.setText("");
       Hsn1.setText("");
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
       showGst();       
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        JOptionPane.showMessageDialog(null,"Ajeet Kumar Maurya 9919886550\nAyush Sharma 8445296404\nAnmol Yadav 9808974360");
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
          Name.setText("");
        Id.setText("");
        Quantity.setText("");
        Price.setText("");
    }//GEN-LAST:event_jButton17ActionPerformed
  public void Show_Data()
    {
       try
        {
         String sql = "SELECT * FROM `Costumer` ORDER BY Id";
         con = (Connection) DriverManager.getConnection("jdbc:sqlite:C:/sqllite/ajeet.db");
         pst = (PreparedStatement) con.prepareStatement(sql);
         rs = pst.executeQuery();
         jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(HeadlessException | SQLException e)
        {
          JOptionPane.showMessageDialog(null,"Error");
        } 
    } 
 public void showGst()
 {
     try
        {
         String sql = "SELECT * FROM `Gst_Table` ORDER BY `S_No`";
         con = (Connection) DriverManager.getConnection("jdbc:sqlite:C:/sqllite/ajeet.db");
         pst = (PreparedStatement) con.prepareStatement(sql);
         rs = pst.executeQuery();
         jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(HeadlessException | SQLException e)
        {
          JOptionPane.showMessageDialog(null,"Error");
        } 
 }
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
            java.util.logging.Logger.getLogger(Second_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Second_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Second_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Second_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Second_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Gst1;
    private javax.swing.JTextField Hsn1;
    private javax.swing.JTextField Id;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Name1;
    private javax.swing.JTextField Price;
    private javax.swing.JTextField Quantity;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
