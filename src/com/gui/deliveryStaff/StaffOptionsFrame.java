
package com.gui.deliveryStaff;

import com.gui.Customer.OrderFoodFrame;
import com.gui.UserVerifyFrame;
import com.util.UserProfile;
import java.awt.Color;
import java.awt.Toolkit;

public class StaffOptionsFrame extends javax.swing.JFrame {


    public StaffOptionsFrame() {
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\database\\Happy Tummy\\src\\com\\icons\\download.png"));
        this.lblName.setText("Hi, " + UserProfile.getUserName());
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        pnlLogut = new javax.swing.JPanel();
        lblViewStaff1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlOrderFood = new javax.swing.JPanel();
        lblViewFood1 = new javax.swing.JLabel();
        pnlViewOrders = new javax.swing.JPanel();
        lblAddStaff3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        pnlLogut.setBackground(new java.awt.Color(51, 51, 255));
        pnlLogut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlLogutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlLogutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlLogutMouseExited(evt);
            }
        });

        lblViewStaff1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblViewStaff1.setForeground(new java.awt.Color(255, 255, 255));
        lblViewStaff1.setIcon(new javax.swing.ImageIcon("D:\\database\\Happy Tummy\\src\\com\\icons\\back.png")); // NOI18N
        lblViewStaff1.setText("Back");

        javax.swing.GroupLayout pnlLogutLayout = new javax.swing.GroupLayout(pnlLogut);
        pnlLogut.setLayout(pnlLogutLayout);
        pnlLogutLayout.setHorizontalGroup(
            pnlLogutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblViewStaff1)
                .addContainerGap(237, Short.MAX_VALUE))
        );
        pnlLogutLayout.setVerticalGroup(
            pnlLogutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblViewStaff1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Staff Options");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pnlOrderFood.setBackground(new java.awt.Color(51, 51, 255));
        pnlOrderFood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlOrderFoodMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlOrderFoodMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlOrderFoodMouseExited(evt);
            }
        });

        lblViewFood1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblViewFood1.setForeground(new java.awt.Color(255, 255, 255));
        lblViewFood1.setIcon(new javax.swing.ImageIcon("D:\\database\\Happy Tummy\\src\\com\\icons\\order list.png")); // NOI18N
        lblViewFood1.setText("Order History");

        javax.swing.GroupLayout pnlOrderFoodLayout = new javax.swing.GroupLayout(pnlOrderFood);
        pnlOrderFood.setLayout(pnlOrderFoodLayout);
        pnlOrderFoodLayout.setHorizontalGroup(
            pnlOrderFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrderFoodLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblViewFood1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlOrderFoodLayout.setVerticalGroup(
            pnlOrderFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrderFoodLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblViewFood1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlViewOrders.setBackground(new java.awt.Color(51, 51, 255));
        pnlViewOrders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlViewOrdersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlViewOrdersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlViewOrdersMouseExited(evt);
            }
        });

        lblAddStaff3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAddStaff3.setForeground(new java.awt.Color(255, 255, 255));
        lblAddStaff3.setIcon(new javax.swing.ImageIcon("D:\\database\\Happy Tummy\\src\\com\\icons\\view food.png")); // NOI18N
        lblAddStaff3.setText("View Orders");

        javax.swing.GroupLayout pnlViewOrdersLayout = new javax.swing.GroupLayout(pnlViewOrders);
        pnlViewOrders.setLayout(pnlViewOrdersLayout);
        pnlViewOrdersLayout.setHorizontalGroup(
            pnlViewOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlViewOrdersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAddStaff3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlViewOrdersLayout.setVerticalGroup(
            pnlViewOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlViewOrdersLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAddStaff3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlLogut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlViewOrders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlOrderFood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(pnlViewOrders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlOrderFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlLogut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(232, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 690));

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
                .addGap(0, 460, Short.MAX_VALUE)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 0, 720, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\database\\Happy Tummy\\src\\com\\icons\\food items (2).png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 560, 340));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 520, 260, 80));

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

    private void pnlLogutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLogutMouseClicked
                new StaffLoginFrame().setVisible(true);
                this.dispose();
    }//GEN-LAST:event_pnlLogutMouseClicked

    private void pnlLogutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLogutMouseEntered
        this.pnlLogut.setBackground(new Color(0,140,255));
    }//GEN-LAST:event_pnlLogutMouseEntered

    private void pnlLogutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLogutMouseExited
        this.pnlLogut.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_pnlLogutMouseExited

    private void pnlOrderFoodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlOrderFoodMouseClicked
        new ViewOrderHistoryFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlOrderFoodMouseClicked

    private void pnlOrderFoodMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlOrderFoodMouseEntered
        this.pnlOrderFood.setBackground(new Color(0,140,255));
    }//GEN-LAST:event_pnlOrderFoodMouseEntered

    private void pnlOrderFoodMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlOrderFoodMouseExited
        this.pnlOrderFood.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_pnlOrderFoodMouseExited

    private void pnlViewOrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlViewOrdersMouseClicked
        new ViewOrdersFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlViewOrdersMouseClicked

    private void pnlViewOrdersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlViewOrdersMouseEntered
        this.pnlViewOrders.setBackground(new Color(0,140,255));
    }//GEN-LAST:event_pnlViewOrdersMouseEntered

    private void pnlViewOrdersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlViewOrdersMouseExited
        this.pnlViewOrders.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_pnlViewOrdersMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new UserVerifyFrame().setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(StaffOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffOptionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lblAddStaff3;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblViewFood1;
    private javax.swing.JLabel lblViewStaff1;
    private javax.swing.JPanel pnlLogut;
    private javax.swing.JPanel pnlOrderFood;
    private javax.swing.JPanel pnlViewOrders;
    // End of variables declaration//GEN-END:variables
}
