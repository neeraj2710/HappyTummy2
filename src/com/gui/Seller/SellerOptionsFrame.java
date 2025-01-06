package com.gui.Seller;

import com.dao.CompanyDao;
import com.util.OwnerProfile;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class SellerOptionsFrame extends javax.swing.JFrame {

    public SellerOptionsFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.lblName.setText("Hi, " + OwnerProfile.getOwnerName());

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
        pnlViewFood = new javax.swing.JPanel();
        lblViewFood1 = new javax.swing.JLabel();
        pnlAddStaff = new javax.swing.JPanel();
        lblAddStaff3 = new javax.swing.JLabel();
        pnlAddFood = new javax.swing.JPanel();
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
                .addContainerGap()
                .addComponent(lblViewStaff1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlViewStaffLayout.setVerticalGroup(
            pnlViewStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlViewStaffLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblViewStaff1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap()
                .addComponent(lblOrderList)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlOrderListLayout.setVerticalGroup(
            pnlOrderListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblOrderList, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
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
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(163, Short.MAX_VALUE))
        );
        pnlBackLayout.setVerticalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seller Options");

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
        lblViewFood1.setIcon(new javax.swing.ImageIcon("D:\\database\\Happy Tummy\\src\\com\\icons\\view food.png")); // NOI18N
        lblViewFood1.setText("View Food");

        javax.swing.GroupLayout pnlViewFoodLayout = new javax.swing.GroupLayout(pnlViewFood);
        pnlViewFood.setLayout(pnlViewFoodLayout);
        pnlViewFoodLayout.setHorizontalGroup(
            pnlViewFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlViewFoodLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblViewFood1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlViewFoodLayout.setVerticalGroup(
            pnlViewFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlViewFoodLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblViewFood1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        lblAddStaff3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAddStaff3.setForeground(new java.awt.Color(255, 255, 255));
        lblAddStaff3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddStaff3.setIcon(new javax.swing.ImageIcon("D:\\database\\Happy Tummy\\src\\com\\icons\\add staff.png")); // NOI18N
        lblAddStaff3.setText("Add Staff");

        javax.swing.GroupLayout pnlAddStaffLayout = new javax.swing.GroupLayout(pnlAddStaff);
        pnlAddStaff.setLayout(pnlAddStaffLayout);
        pnlAddStaffLayout.setHorizontalGroup(
            pnlAddStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddStaffLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAddStaff3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAddStaffLayout.setVerticalGroup(
            pnlAddStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddStaffLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAddStaff3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlAddFood.setBackground(new java.awt.Color(51, 51, 255));
        pnlAddFood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlAddFoodMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlAddFoodMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlAddFoodMouseExited(evt);
            }
        });

        lblAddStaff2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAddStaff2.setForeground(new java.awt.Color(255, 255, 255));
        lblAddStaff2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddStaff2.setIcon(new javax.swing.ImageIcon("D:\\database\\Happy Tummy\\src\\com\\icons\\add food.png")); // NOI18N
        lblAddStaff2.setText("Add food");

        javax.swing.GroupLayout pnlAddFoodLayout = new javax.swing.GroupLayout(pnlAddFood);
        pnlAddFood.setLayout(pnlAddFoodLayout);
        pnlAddFoodLayout.setHorizontalGroup(
            pnlAddFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddFoodLayout.createSequentialGroup()
                .addComponent(lblAddStaff2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlAddFoodLayout.setVerticalGroup(
            pnlAddFoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddFoodLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAddStaff2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(pnlAddFood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlViewStaff, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlViewFood, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlAddStaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(pnlAddFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlAddStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlViewFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlViewStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlOrderList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 698));

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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, 260, 80));

        jButton2.setBackground(new java.awt.Color(51, 51, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Delete Account");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 510, 260, 80));

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

    private void pnlViewStaffMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlViewStaffMouseEntered
        this.pnlViewStaff.setBackground(new Color(0, 140, 255));
    }//GEN-LAST:event_pnlViewStaffMouseEntered

    private void pnlViewStaffMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlViewStaffMouseExited
        this.pnlViewStaff.setBackground(new Color(51, 51, 255));
    }//GEN-LAST:event_pnlViewStaffMouseExited

    private void pnlOrderListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlOrderListMouseEntered
        this.pnlOrderList.setBackground(new Color(0, 140, 255));
    }//GEN-LAST:event_pnlOrderListMouseEntered

    private void pnlOrderListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlOrderListMouseExited
        this.pnlOrderList.setBackground(new Color(51, 51, 255));
    }//GEN-LAST:event_pnlOrderListMouseExited

    private void pnlBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBackMouseEntered
        this.pnlBack.setBackground(new Color(0, 140, 255));
    }//GEN-LAST:event_pnlBackMouseEntered

    private void pnlBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBackMouseExited
        this.pnlBack.setBackground(new Color(51, 51, 255));
    }//GEN-LAST:event_pnlBackMouseExited

    private void pnlAddFoodMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAddFoodMouseEntered
        this.pnlAddFood.setBackground(new Color(0, 140, 255));
    }//GEN-LAST:event_pnlAddFoodMouseEntered

    private void pnlAddFoodMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAddFoodMouseExited
        this.pnlAddFood.setBackground(new Color(51, 51, 255));
    }//GEN-LAST:event_pnlAddFoodMouseExited

    private void pnlViewFoodMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlViewFoodMouseEntered
        this.pnlViewFood.setBackground(new Color(0, 140, 255));
    }//GEN-LAST:event_pnlViewFoodMouseEntered

    private void pnlViewFoodMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlViewFoodMouseExited
        this.pnlViewFood.setBackground(new Color(51, 51, 255));
    }//GEN-LAST:event_pnlViewFoodMouseExited

    private void pnlAddStaffMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAddStaffMouseEntered
        this.pnlAddStaff.setBackground(new Color(0, 140, 255));
    }//GEN-LAST:event_pnlAddStaffMouseEntered

    private void pnlAddStaffMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAddStaffMouseExited
        this.pnlAddStaff.setBackground(new Color(51, 51, 255));
    }//GEN-LAST:event_pnlAddStaffMouseExited

    private void pnlAddFoodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAddFoodMouseClicked
        new AddFoodItem().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlAddFoodMouseClicked

    private void pnlBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBackMouseClicked
        new SellerLoginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlBackMouseClicked

    private void pnlViewFoodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlViewFoodMouseClicked
        new ViewFoodFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlViewFoodMouseClicked

    private void pnlAddStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAddStaffMouseClicked
        new AddStaffFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlAddStaffMouseClicked

    private void pnlViewStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlViewStaffMouseClicked
        new ViewStaffFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlViewStaffMouseClicked

    private void pnlOrderListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlOrderListMouseClicked
        new OrderListFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlOrderListMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            boolean result = CompanyDao.deleteAccoutById(OwnerProfile.getCompanyId());
            if (result) {
                JOptionPane.showMessageDialog(null, "Account deleted");
                new SellerLoginFrame().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Account Not deleted");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DB Error in account deletion of Seller options frame");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(SellerOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellerOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellerOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellerOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellerOptionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JPanel pnlAddFood;
    private javax.swing.JPanel pnlAddStaff;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JPanel pnlOrderList;
    private javax.swing.JPanel pnlViewFood;
    private javax.swing.JPanel pnlViewStaff;
    // End of variables declaration//GEN-END:variables
}
