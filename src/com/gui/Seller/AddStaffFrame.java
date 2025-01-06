
package com.gui.Seller;

import com.dao.CompanyDao;
import com.dao.StaffDao;
import com.pojo.StaffPojo;
import com.util.Mailer;
import com.util.OwnerProfile;
import com.util.PasswordEncryption;
import com.util.Validator;
import java.awt.Color;
import java.sql.SQLException;
import java.util.Map;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;

public class AddStaffFrame extends javax.swing.JFrame {

    
    public AddStaffFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setLocationRelativeTo(null);
        this.lblName.setText("Hi, "+OwnerProfile.getOwnerName());
        this.txtCmpNmae.setText(OwnerProfile.getCompanyName());
    }
    
    public boolean validateInputs(){
        char[] pwd=this.txtPassword.getPassword();
        if(pwd.length==0||this.txtName.getText().trim().isEmpty()||this.txtEmail.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null,"please fill all the details");
            return false;
        }
        if(Validator.isValidEmail(this.txtEmail.getText().trim())==false){
            JOptionPane.showMessageDialog(null,"please input a valid email");
            return false;
        }
        return true;
    }
    
    private void clearAll() {
        this.txtName.setText("");
        this.txtEmail.setText("");
        this.txtPassword.setText("");
        
        this.txtEmail.requestFocus();
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
        btnAdd = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtCmpNmae = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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
        jLabel1.setText("Add Staff");

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
        lblAddStaff2.setIcon(new javax.swing.ImageIcon("D:\\database\\Happy Tummy\\src\\com\\icons\\add food.png")); // NOI18N
        lblAddStaff2.setText("Add Food");

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
        lblViewFood1.setIcon(new javax.swing.ImageIcon("D:\\database\\Happy Tummy\\src\\com\\icons\\view food.png")); // NOI18N
        lblViewFood1.setText("View Food");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAdd.setBackground(new java.awt.Color(0, 127, 255));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add Staff");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 127, 255));
        jLabel3.setText("Compnay Name");

        txtCmpNmae.setEditable(false);
        txtCmpNmae.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCmpNmae.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 127, 255));
        jLabel4.setText("Enter Email");

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 127, 255));
        jLabel8.setText("Enter Name");

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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
                .addGap(0, 488, Short.MAX_VALUE)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 127, 255));
        jLabel5.setText("Password");

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                                .addComponent(txtCmpNmae, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                                    .addComponent(txtPassword))))
                        .addGap(100, 100, 100))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(txtCmpNmae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(137, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if(!validateInputs()){
            return;
        }
        try{
            StaffPojo staff = new StaffPojo();
            staff.setCompanyId(OwnerProfile.getCompanyId());
            staff.setEmailId(this.txtEmail.getText().trim());
            staff.setStaffName(this.txtName.getText().trim());
            char [] pwd=this.txtPassword.getPassword();
            String pwdStr=String.valueOf(pwd);
            pwdStr=PasswordEncryption.getEncryptedPassword(pwdStr);
            staff.setPassword(pwdStr);
            String staffId = StaffDao.addStaff(staff);
            if(staffId==null){
                JOptionPane.showMessageDialog(null, "Staff not added");
                return;
            }
            JOptionPane.showMessageDialog(null, "Registration Successfull");
            Map<String,String> emailCredentials = CompanyDao.getEmailCredentialsByCompanyId(OwnerProfile.getCompanyId());
            Mailer.sendMail(emailCredentials, staff);
            clearAll();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "DB ERROE in add delivey staff frame");
            ex.printStackTrace();
        }catch(MessagingException ex){
            JOptionPane.showMessageDialog(null, "Error in sending mail");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void pnlAddStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAddStaffMouseClicked
        new AddFoodItem().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlAddStaffMouseClicked

    private void pnlViewFoodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlViewFoodMouseClicked
        new ViewFoodFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlViewFoodMouseClicked

    private void pnlViewStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlViewStaffMouseClicked
        new ViewStaffFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlViewStaffMouseClicked

    private void pnlOrderListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlOrderListMouseClicked
        new OrderListFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlOrderListMouseClicked

   
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
            java.util.logging.Logger.getLogger(AddStaffFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStaffFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStaffFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStaffFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStaffFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lblAddStaff2;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOrderList;
    private javax.swing.JLabel lblViewFood1;
    private javax.swing.JLabel lblViewStaff1;
    private javax.swing.JPanel pnlAddStaff;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JPanel pnlOrderList;
    private javax.swing.JPanel pnlViewFood;
    private javax.swing.JPanel pnlViewStaff;
    private javax.swing.JTextField txtCmpNmae;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
