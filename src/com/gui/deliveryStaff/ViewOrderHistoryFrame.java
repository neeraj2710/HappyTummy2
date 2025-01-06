package com.gui.deliveryStaff;

import com.dao.OrderDao;
import com.gui.Customer.OrderFoodFrame;
import com.pojo.OrderPojo;
import com.util.UserProfile;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ViewOrderHistoryFrame extends javax.swing.JFrame {

    private DefaultTableModel model;
    private List<OrderPojo> orderList;

    public ViewOrderHistoryFrame() {
        initComponents();
        model = (DefaultTableModel) this.jtViewOrders.getModel();
        this.setLocationRelativeTo(null);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\database\\Happy Tummy\\src\\com\\icons\\download.png"));
        this.lblName.setText("Hi, " + UserProfile.getUserName());
        loadNewOrderDetails(UserProfile.getUserId().trim());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        pnlBack = new javax.swing.JPanel();
        lblViewStaff1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlViewOrders = new javax.swing.JPanel();
        lblAddStaff3 = new javax.swing.JLabel();
        pnlLogout = new javax.swing.JPanel();
        lblViewStaff2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtViewOrders = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

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

        lblViewStaff1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblViewStaff1.setForeground(new java.awt.Color(255, 255, 255));
        lblViewStaff1.setIcon(new javax.swing.ImageIcon("D:\\database\\Happy Tummy\\src\\com\\icons\\back.png")); // NOI18N
        lblViewStaff1.setText("Back");

        javax.swing.GroupLayout pnlBackLayout = new javax.swing.GroupLayout(pnlBack);
        pnlBack.setLayout(pnlBackLayout);
        pnlBackLayout.setHorizontalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblViewStaff1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBackLayout.setVerticalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblViewStaff1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Order History");

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
                .addComponent(lblAddStaff3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlViewOrdersLayout.setVerticalGroup(
            pnlViewOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlViewOrdersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAddStaff3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlLogout.setBackground(new java.awt.Color(51, 51, 255));
        pnlLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlLogoutMouseExited(evt);
            }
        });

        lblViewStaff2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblViewStaff2.setForeground(new java.awt.Color(255, 255, 255));
        lblViewStaff2.setIcon(new javax.swing.ImageIcon("D:\\friends\\s1\\logout-48.png")); // NOI18N
        lblViewStaff2.setText("Logout");

        javax.swing.GroupLayout pnlLogoutLayout = new javax.swing.GroupLayout(pnlLogout);
        pnlLogout.setLayout(pnlLogoutLayout);
        pnlLogoutLayout.setHorizontalGroup(
            pnlLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblViewStaff2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlLogoutLayout.setVerticalGroup(
            pnlLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblViewStaff2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlLogout, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlBack, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlViewOrders, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(pnlViewOrders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(248, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 650));

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
                .addContainerGap(1060, Short.MAX_VALUE)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 0, 1320, 40));

        jtViewOrders.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtViewOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Product Price", "Customer Name", "Customer Phone No", "Address", "Review"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtViewOrders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtViewOrdersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtViewOrders);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 1270, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBackMouseClicked
        new StaffOptionsFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlBackMouseClicked

    private void pnlBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBackMouseEntered
        this.pnlBack.setBackground(new Color(0, 140, 255));
    }//GEN-LAST:event_pnlBackMouseEntered

    private void pnlBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBackMouseExited
        this.pnlBack.setBackground(new Color(51, 51, 255));
    }//GEN-LAST:event_pnlBackMouseExited

    private void pnlViewOrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlViewOrdersMouseClicked
        new ViewOrdersFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlViewOrdersMouseClicked

    private void pnlViewOrdersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlViewOrdersMouseEntered
        this.pnlViewOrders.setBackground(new Color(0, 140, 255));
    }//GEN-LAST:event_pnlViewOrdersMouseEntered

    private void pnlViewOrdersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlViewOrdersMouseExited
        this.pnlViewOrders.setBackground(new Color(51, 51, 255));
    }//GEN-LAST:event_pnlViewOrdersMouseExited

    private void jtViewOrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtViewOrdersMouseClicked

    }//GEN-LAST:event_jtViewOrdersMouseClicked

    private void pnlLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLogoutMouseClicked
        new StaffLoginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlLogoutMouseClicked

    private void pnlLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLogoutMouseEntered
        this.pnlLogout.setBackground(new Color(0, 140, 255));
    }//GEN-LAST:event_pnlLogoutMouseEntered

    private void pnlLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLogoutMouseExited
        this.pnlLogout.setBackground(new Color(51, 51, 255));
    }//GEN-LAST:event_pnlLogoutMouseExited

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
            java.util.logging.Logger.getLogger(ViewOrderHistoryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewOrderHistoryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewOrderHistoryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewOrderHistoryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewOrderHistoryFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtViewOrders;
    private javax.swing.JLabel lblAddStaff3;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblViewStaff1;
    private javax.swing.JLabel lblViewStaff2;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JPanel pnlLogout;
    private javax.swing.JPanel pnlViewOrders;
    // End of variables declaration//GEN-END:variables

    private void loadNewOrderDetails(String staffId) {
        try {
            orderList = OrderDao.getDeliveredOrdersForStaff(staffId);
            if (orderList.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No undelivered orders");
                this.jtViewOrders.setEnabled(false);
                return;
            }
            for (OrderPojo ord : orderList) {
                Vector<String> v = new Vector<>();
                v.add(ord.getProductName());
                v.add(ord.getProductPrice() + "");
                v.add(ord.getCustomerName());
                v.add(ord.getCustomerPhoneNo());
                v.add(ord.getCustomerAddress());
                v.add(ord.getReview());
                model.addRow(v);
                System.out.println(v);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DB Error in view Order frame");
            ex.printStackTrace();
        }
    }
}
