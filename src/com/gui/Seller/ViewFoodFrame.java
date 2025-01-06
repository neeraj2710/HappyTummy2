
package com.gui.Seller;

import com.dao.ProductDao;
import com.pojo.ProductPojo;
import com.util.OwnerProfile;
import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class ViewFoodFrame extends javax.swing.JFrame {

    private Map<String,ProductPojo>productDetails;
    public ViewFoodFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.lblName.setText("Hi, "+OwnerProfile.getOwnerName());
        loadProductDetails();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        pnlViewStaff = new javax.swing.JPanel();
        lblViewStaff1 = new javax.swing.JLabel();
        pnlOrderList = new javax.swing.JPanel();
        lblOrderList = new javax.swing.JLabel();
        pnlBack = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlAddStaff = new javax.swing.JPanel();
        lblAddStaff2 = new javax.swing.JLabel();
        pnlViewFood = new javax.swing.JPanel();
        lblViewFood1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFoodPrice = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        comboBoxSuggestion1 = new combo_suggestion.ComboBoxSuggestion();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        pnlViewStaff.setBackground(new java.awt.Color(51, 51, 255));
        pnlViewStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlViewStaffMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlViewStaffMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlViewStaffMouseExited(evt);
            }
        });

        lblViewStaff1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblViewStaff1.setForeground(new java.awt.Color(255, 255, 255));
        lblViewStaff1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblViewStaff1.setIcon(new javax.swing.ImageIcon("D:\\database\\Happy Tummy\\src\\com\\icons\\add staff.png")); // NOI18N
        lblViewStaff1.setText("View Staff");

        javax.swing.GroupLayout pnlViewStaffLayout = new javax.swing.GroupLayout(pnlViewStaff);
        pnlViewStaff.setLayout(pnlViewStaffLayout);
        pnlViewStaffLayout.setHorizontalGroup(
            pnlViewStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlViewStaffLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblViewStaff1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlViewStaffLayout.setVerticalGroup(
            pnlViewStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlViewStaffLayout.createSequentialGroup()
                .addComponent(lblViewStaff1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pnlOrderList.setBackground(new java.awt.Color(51, 51, 255));
        pnlOrderList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlOrderListMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlOrderListMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlOrderListMouseExited(evt);
            }
        });

        lblOrderList.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblOrderList.setForeground(new java.awt.Color(255, 255, 255));
        lblOrderList.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOrderList.setIcon(new javax.swing.ImageIcon("D:\\database\\Happy Tummy\\src\\com\\icons\\order list.png")); // NOI18N
        lblOrderList.setText("Order List");

        javax.swing.GroupLayout pnlOrderListLayout = new javax.swing.GroupLayout(pnlOrderList);
        pnlOrderList.setLayout(pnlOrderListLayout);
        pnlOrderListLayout.setHorizontalGroup(
            pnlOrderListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrderListLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblOrderList)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlOrderListLayout.setVerticalGroup(
            pnlOrderListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrderListLayout.createSequentialGroup()
                .addComponent(lblOrderList, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pnlBack.setBackground(new java.awt.Color(51, 51, 255));
        pnlBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlBackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlBackMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\database\\Happy Tummy\\src\\com\\icons\\back.png")); // NOI18N
        jLabel2.setText("Back");

        javax.swing.GroupLayout pnlBackLayout = new javax.swing.GroupLayout(pnlBack);
        pnlBack.setLayout(pnlBackLayout);
        pnlBackLayout.setHorizontalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBackLayout.setVerticalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Food ");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pnlAddStaff.setBackground(new java.awt.Color(51, 51, 255));
        pnlAddStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlAddStaffMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlAddStaffMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlAddStaffMouseExited(evt);
            }
        });

        lblAddStaff2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAddStaff2.setForeground(new java.awt.Color(255, 255, 255));
        lblAddStaff2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddStaff2.setIcon(new javax.swing.ImageIcon("D:\\database\\Happy Tummy\\src\\com\\icons\\add staff.png")); // NOI18N
        lblAddStaff2.setText("Add Staff");

        javax.swing.GroupLayout pnlAddStaffLayout = new javax.swing.GroupLayout(pnlAddStaff);
        pnlAddStaff.setLayout(pnlAddStaffLayout);
        pnlAddStaffLayout.setHorizontalGroup(
            pnlAddStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddStaffLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblAddStaff2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAddStaffLayout.setVerticalGroup(
            pnlAddStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddStaffLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAddStaff2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlViewFood.setBackground(new java.awt.Color(51, 51, 255));
        pnlViewFood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlViewFoodMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlViewFoodMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlViewFoodMouseExited(evt);
            }
        });

        lblViewFood1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblViewFood1.setForeground(new java.awt.Color(255, 255, 255));
        lblViewFood1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblViewFood1.setIcon(new javax.swing.ImageIcon("D:\\database\\Happy Tummy\\src\\com\\icons\\add food.png")); // NOI18N
        lblViewFood1.setText("Add Food");

        javax.swing.GroupLayout pnlViewFoodLayout = new javax.swing.GroupLayout(pnlViewFood);
        pnlViewFood.setLayout(pnlViewFoodLayout);
        pnlViewFoodLayout.setHorizontalGroup(
            pnlViewFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlViewFoodLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblViewFood1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlViewFoodLayout.setVerticalGroup(
            pnlViewFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlViewFoodLayout.createSequentialGroup()
                .addComponent(lblViewFood1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlOrderList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
            .addComponent(pnlViewStaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlViewFood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlAddStaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(pnlAddStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlViewFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlViewStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlOrderList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 698));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 127, 255));
        jLabel3.setText("Select Food Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 175, -1, 24));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 127, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Food Image");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 740, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 127, 255));
        jLabel8.setText("Price");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 560, 140, -1));

        txtFoodPrice.setEditable(false);
        txtFoodPrice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtFoodPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtFoodPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 560, 340, -1));

        jPanel7.setBackground(new java.awt.Color(51, 204, 255));

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setIcon(new javax.swing.ImageIcon("D:\\database\\Happy Tummy\\src\\com\\icons\\profile-removebg-preview.png")); // NOI18N
        lblName.setText("Hi ,");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 490, Short.MAX_VALUE)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 0, 750, 40));
        jPanel1.add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 490, 270));

        comboBoxSuggestion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSuggestion1ActionPerformed(evt);
            }
        });
        jPanel1.add(comboBoxSuggestion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 320, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlViewStaffMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlViewStaffMouseEntered
        this.pnlViewStaff.setBackground(new Color(0,140,255));
    }//GEN-LAST:event_pnlViewStaffMouseEntered

    private void pnlViewStaffMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlViewStaffMouseExited
        this.pnlViewStaff.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_pnlViewStaffMouseExited

    private void pnlOrderListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlOrderListMouseEntered
        this.pnlOrderList.setBackground(new Color(0,140,255));
    }//GEN-LAST:event_pnlOrderListMouseEntered

    private void pnlOrderListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlOrderListMouseExited
        this.pnlOrderList.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_pnlOrderListMouseExited

    private void pnlBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBackMouseClicked
        new SellerOptionsFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlBackMouseClicked

    private void pnlBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBackMouseEntered
        this.pnlBack.setBackground(new Color(0,140,255));
    }//GEN-LAST:event_pnlBackMouseEntered

    private void pnlBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBackMouseExited
        this.pnlBack.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_pnlBackMouseExited

    private void pnlAddStaffMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAddStaffMouseEntered
        this.pnlAddStaff.setBackground(new Color(0,140,255));
    }//GEN-LAST:event_pnlAddStaffMouseEntered

    private void pnlAddStaffMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAddStaffMouseExited
        this.pnlAddStaff.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_pnlAddStaffMouseExited

    private void pnlViewFoodMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlViewFoodMouseEntered
        this.pnlViewFood.setBackground(new Color(0,140,255));
    }//GEN-LAST:event_pnlViewFoodMouseEntered

    private void pnlViewFoodMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlViewFoodMouseExited
        this.pnlViewFood.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_pnlViewFoodMouseExited

    private void comboBoxSuggestion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSuggestion1ActionPerformed
        String foodName = this.comboBoxSuggestion1.getSelectedItem().toString();
        ProductPojo product = productDetails.get(foodName);
        Image img=product.getProductImage();
        img = img.getScaledInstance(this.lblImage.getWidth(),this.lblImage.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(img);
        this.lblImage.setIcon(icon);
        this.txtFoodPrice.setText(product.getProductPrice()+"");
    }//GEN-LAST:event_comboBoxSuggestion1ActionPerformed

    private void pnlAddStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAddStaffMouseClicked
        new AddStaffFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlAddStaffMouseClicked

    private void pnlViewFoodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlViewFoodMouseClicked
        new AddFoodItem().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlViewFoodMouseClicked

    private void pnlViewStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlViewStaffMouseClicked
        new ViewFoodFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlViewStaffMouseClicked

    private void pnlOrderListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlOrderListMouseClicked
        new OrderListFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlOrderListMouseClicked

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
            java.util.logging.Logger.getLogger(ViewFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewFoodFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private combo_suggestion.ComboBoxSuggestion comboBoxSuggestion1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lblAddStaff2;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOrderList;
    private javax.swing.JLabel lblViewFood1;
    private javax.swing.JLabel lblViewStaff1;
    private javax.swing.JPanel pnlAddStaff;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JPanel pnlOrderList;
    private javax.swing.JPanel pnlViewFood;
    private javax.swing.JPanel pnlViewStaff;
    private javax.swing.JTextField txtFoodPrice;
    // End of variables declaration//GEN-END:variables

    private void loadProductDetails() {
        try{
            productDetails = ProductDao.getProductDetailsByCompanyId(OwnerProfile.getCompanyId());
            if(productDetails.isEmpty()){
                JOptionPane.showMessageDialog(null,"No food found for "+OwnerProfile.getCompanyId());
                return;
            }
            showProductNames();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "DB ERROR in view food frame");
            ex.printStackTrace();
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Image error in view food frame");
            ex.printStackTrace();
        }
    }

    private void showProductNames() {
        Set<String> foodNames = productDetails.keySet();
        for(String foodName:foodNames){
            this.comboBoxSuggestion1.addItem(foodName);
        }
    }
}
