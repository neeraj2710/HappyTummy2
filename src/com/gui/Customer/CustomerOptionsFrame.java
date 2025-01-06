

package com.gui.Customer;

import com.gui.Seller.AddFoodItem;
import com.gui.Seller.AddStaffFrame;
import com.gui.Seller.SellerLoginFrame;
import com.gui.Seller.ViewFoodFrame;
import com.gui.Seller.ViewStaffFrame;
import com.util.UserProfile;
import java.awt.Color;


public class CustomerOptionsFrame extends javax.swing.JFrame {


    public CustomerOptionsFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.lblName.setText("Hi, "+UserProfile.getUserName());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        pnlCancelOrder = new javax.swing.JPanel();
        lblViewStaff1 = new javax.swing.JLabel();
        pnlOrderHistory = new javax.swing.JPanel();
        lblOrderList = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlOrderFood = new javax.swing.JPanel();
        lblViewFood1 = new javax.swing.JLabel();
        pnlMyCart = new javax.swing.JPanel();
        lblAddStaff3 = new javax.swing.JLabel();
        pnlMyAccount = new javax.swing.JPanel();
        lblAddStaff2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        pnlCancelOrder.setBackground(new java.awt.Color(51, 51, 255));
        pnlCancelOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlCancelOrderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlCancelOrderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlCancelOrderMouseExited(evt);
            }
        });

        lblViewStaff1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblViewStaff1.setForeground(new java.awt.Color(255, 255, 255));
        lblViewStaff1.setIcon(new javax.swing.ImageIcon("D:\\database\\Happy Tummy\\src\\com\\icons\\cancel-48.png")); // NOI18N
        lblViewStaff1.setText("Cancel Order");

        javax.swing.GroupLayout pnlCancelOrderLayout = new javax.swing.GroupLayout(pnlCancelOrder);
        pnlCancelOrder.setLayout(pnlCancelOrderLayout);
        pnlCancelOrderLayout.setHorizontalGroup(
            pnlCancelOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCancelOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblViewStaff1)
                .addContainerGap(245, Short.MAX_VALUE))
        );
        pnlCancelOrderLayout.setVerticalGroup(
            pnlCancelOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCancelOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblViewStaff1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlOrderHistory.setBackground(new java.awt.Color(51, 51, 255));
        pnlOrderHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlOrderHistoryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlOrderHistoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlOrderHistoryMouseExited(evt);
            }
        });

        lblOrderList.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblOrderList.setForeground(new java.awt.Color(255, 255, 255));
        lblOrderList.setIcon(new javax.swing.ImageIcon("D:\\database\\Happy Tummy\\src\\com\\icons\\order list.png")); // NOI18N
        lblOrderList.setText("Order History");

        javax.swing.GroupLayout pnlOrderHistoryLayout = new javax.swing.GroupLayout(pnlOrderHistory);
        pnlOrderHistory.setLayout(pnlOrderHistoryLayout);
        pnlOrderHistoryLayout.setHorizontalGroup(
            pnlOrderHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrderHistoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOrderList)
                .addContainerGap(131, Short.MAX_VALUE))
        );
        pnlOrderHistoryLayout.setVerticalGroup(
            pnlOrderHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblOrderList, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer Options");

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
        lblViewFood1.setIcon(new javax.swing.ImageIcon("D:\\database\\Happy Tummy\\src\\com\\icons\\view food.png")); // NOI18N
        lblViewFood1.setText("Order Food");

        javax.swing.GroupLayout pnlOrderFoodLayout = new javax.swing.GroupLayout(pnlOrderFood);
        pnlOrderFood.setLayout(pnlOrderFoodLayout);
        pnlOrderFoodLayout.setHorizontalGroup(
            pnlOrderFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrderFoodLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblViewFood1)
                .addContainerGap(257, Short.MAX_VALUE))
        );
        pnlOrderFoodLayout.setVerticalGroup(
            pnlOrderFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrderFoodLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblViewFood1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlMyCart.setBackground(new java.awt.Color(51, 51, 255));
        pnlMyCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlMyCartMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlMyCartMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlMyCartMouseExited(evt);
            }
        });

        lblAddStaff3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAddStaff3.setForeground(new java.awt.Color(255, 255, 255));
        lblAddStaff3.setIcon(new javax.swing.ImageIcon("D:\\database\\Happy Tummy\\src\\com\\icons\\cart-70-48.png")); // NOI18N
        lblAddStaff3.setText("My Cart");

        javax.swing.GroupLayout pnlMyCartLayout = new javax.swing.GroupLayout(pnlMyCart);
        pnlMyCart.setLayout(pnlMyCartLayout);
        pnlMyCartLayout.setHorizontalGroup(
            pnlMyCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMyCartLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAddStaff3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMyCartLayout.setVerticalGroup(
            pnlMyCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMyCartLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAddStaff3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlMyAccount.setBackground(new java.awt.Color(51, 51, 255));
        pnlMyAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlMyAccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlMyAccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlMyAccountMouseExited(evt);
            }
        });

        lblAddStaff2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAddStaff2.setForeground(new java.awt.Color(255, 255, 255));
        lblAddStaff2.setIcon(new javax.swing.ImageIcon("D:\\database\\Happy Tummy\\src\\com\\icons\\user-48.png")); // NOI18N
        lblAddStaff2.setText("My Account");

        javax.swing.GroupLayout pnlMyAccountLayout = new javax.swing.GroupLayout(pnlMyAccount);
        pnlMyAccount.setLayout(pnlMyAccountLayout);
        pnlMyAccountLayout.setHorizontalGroup(
            pnlMyAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMyAccountLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAddStaff2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );
        pnlMyAccountLayout.setVerticalGroup(
            pnlMyAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMyAccountLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAddStaff2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlMyAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 107, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlCancelOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlMyCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlOrderFood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlOrderHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(pnlMyAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlMyCart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlOrderFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCancelOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlOrderHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 698));

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

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 510, 260, 80));

        jButton2.setBackground(new java.awt.Color(51, 51, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Delete Account");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 510, 260, 80));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\database\\Happy Tummy\\src\\com\\icons\\food items (2).png")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 620, 360));

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

    private void pnlCancelOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCancelOrderMouseClicked
        new CancelOrderFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlCancelOrderMouseClicked

    private void pnlCancelOrderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCancelOrderMouseEntered
        this.pnlCancelOrder.setBackground(new Color(0,140,255));
    }//GEN-LAST:event_pnlCancelOrderMouseEntered

    private void pnlCancelOrderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCancelOrderMouseExited
        this.pnlCancelOrder.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_pnlCancelOrderMouseExited

    private void pnlOrderHistoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlOrderHistoryMouseEntered
        this.pnlOrderHistory.setBackground(new Color(0,140,255));
    }//GEN-LAST:event_pnlOrderHistoryMouseEntered

    private void pnlOrderHistoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlOrderHistoryMouseExited
        this.pnlOrderHistory.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_pnlOrderHistoryMouseExited

    private void pnlOrderFoodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlOrderFoodMouseClicked
        new OrderFoodFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlOrderFoodMouseClicked

    private void pnlOrderFoodMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlOrderFoodMouseEntered
        this.pnlOrderFood.setBackground(new Color(0,140,255));
    }//GEN-LAST:event_pnlOrderFoodMouseEntered

    private void pnlOrderFoodMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlOrderFoodMouseExited
        this.pnlOrderFood.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_pnlOrderFoodMouseExited

    private void pnlMyCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMyCartMouseClicked
        new CustomerCartFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlMyCartMouseClicked

    private void pnlMyCartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMyCartMouseEntered
        this.pnlMyCart.setBackground(new Color(0,140,255));
    }//GEN-LAST:event_pnlMyCartMouseEntered

    private void pnlMyCartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMyCartMouseExited
        this.pnlMyCart.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_pnlMyCartMouseExited

    private void pnlMyAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMyAccountMouseClicked
        new CustomerAccountFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlMyAccountMouseClicked

    private void pnlMyAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMyAccountMouseEntered
        this.pnlMyAccount.setBackground(new Color(0,140,255));
    }//GEN-LAST:event_pnlMyAccountMouseEntered

    private void pnlMyAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMyAccountMouseExited
        this.pnlMyAccount.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_pnlMyAccountMouseExited

    private void pnlOrderHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlOrderHistoryMouseClicked
        new OrderHistoryFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlOrderHistoryMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new CustomerLoginFrame().setVisible(true);
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
            java.util.logging.Logger.getLogger(CustomerOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerOptionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lblAddStaff2;
    private javax.swing.JLabel lblAddStaff3;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOrderList;
    private javax.swing.JLabel lblViewFood1;
    private javax.swing.JLabel lblViewStaff1;
    private javax.swing.JPanel pnlCancelOrder;
    private javax.swing.JPanel pnlMyAccount;
    private javax.swing.JPanel pnlMyCart;
    private javax.swing.JPanel pnlOrderFood;
    private javax.swing.JPanel pnlOrderHistory;
    // End of variables declaration//GEN-END:variables

}
