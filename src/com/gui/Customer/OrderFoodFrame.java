package com.gui.Customer;

import com.dao.CompanyDao;
import com.dao.OrderDao;
import com.dao.ProductDao;
import com.pojo.PlaceOrderPojo;
import com.pojo.ProductPojo;
import com.util.UserProfile;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class OrderFoodFrame extends javax.swing.JFrame {

    private Map<String, String> companyMap;
    private List<ProductPojo> productList;
    private int listIndex;
    private JFrame showFrame;

    public OrderFoodFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\database\\Happy Tummy\\src\\com\\icons\\download.png"));
        this.lblName.setText("Hi, " + UserProfile.getUserName());
        loadCompanyNames();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        pnlOrderHistory = new javax.swing.JPanel();
        lblViewStaff1 = new javax.swing.JLabel();
        pnlBack = new javax.swing.JPanel();
        lblOrderList = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlCancelOrder = new javax.swing.JPanel();
        lblViewFood1 = new javax.swing.JLabel();
        pnlMyCart = new javax.swing.JPanel();
        lblAddStaff3 = new javax.swing.JLabel();
        pnlMyAccount = new javax.swing.JPanel();
        lblAddStaff2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblImg1 = new javax.swing.JLabel();
        lblImg2 = new javax.swing.JLabel();
        lblImg3 = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        lblName2 = new javax.swing.JLabel();
        lblName3 = new javax.swing.JLabel();
        lblImg4 = new javax.swing.JLabel();
        lblImg5 = new javax.swing.JLabel();
        lblImg6 = new javax.swing.JLabel();
        lblName4 = new javax.swing.JLabel();
        lblName5 = new javax.swing.JLabel();
        lblName6 = new javax.swing.JLabel();
        pnlBackArrow = new javax.swing.JPanel();
        lblPrv = new javax.swing.JLabel();
        pnlForwordArrow = new javax.swing.JPanel();
        lblNext = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jcCompanyNames = new combo_suggestion.ComboBoxSuggestion();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

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

        lblViewStaff1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblViewStaff1.setForeground(new java.awt.Color(255, 255, 255));
        lblViewStaff1.setIcon(new javax.swing.ImageIcon("D:\\database\\Happy Tummy\\src\\com\\icons\\order list.png")); // NOI18N
        lblViewStaff1.setText("Order History");

        javax.swing.GroupLayout pnlOrderHistoryLayout = new javax.swing.GroupLayout(pnlOrderHistory);
        pnlOrderHistory.setLayout(pnlOrderHistoryLayout);
        pnlOrderHistoryLayout.setHorizontalGroup(
            pnlOrderHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrderHistoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblViewStaff1)
                .addContainerGap(183, Short.MAX_VALUE))
        );
        pnlOrderHistoryLayout.setVerticalGroup(
            pnlOrderHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrderHistoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblViewStaff1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        lblOrderList.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblOrderList.setForeground(new java.awt.Color(255, 255, 255));
        lblOrderList.setIcon(new javax.swing.ImageIcon("D:\\database\\Happy Tummy\\src\\com\\icons\\back.png")); // NOI18N
        lblOrderList.setText("Back");

        javax.swing.GroupLayout pnlBackLayout = new javax.swing.GroupLayout(pnlBack);
        pnlBack.setLayout(pnlBackLayout);
        pnlBackLayout.setHorizontalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOrderList)
                .addContainerGap(196, Short.MAX_VALUE))
        );
        pnlBackLayout.setVerticalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblOrderList, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Order Food");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

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

        lblViewFood1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblViewFood1.setForeground(new java.awt.Color(255, 255, 255));
        lblViewFood1.setIcon(new javax.swing.ImageIcon("D:\\database\\Happy Tummy\\src\\com\\icons\\cancel-48.png")); // NOI18N
        lblViewFood1.setText("Cancel Order");

        javax.swing.GroupLayout pnlCancelOrderLayout = new javax.swing.GroupLayout(pnlCancelOrder);
        pnlCancelOrder.setLayout(pnlCancelOrderLayout);
        pnlCancelOrderLayout.setHorizontalGroup(
            pnlCancelOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCancelOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblViewFood1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCancelOrderLayout.setVerticalGroup(
            pnlCancelOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCancelOrderLayout.createSequentialGroup()
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
                .addComponent(lblAddStaff3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlMyCartLayout.setVerticalGroup(
            pnlMyCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMyCartLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAddStaff3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(131, Short.MAX_VALUE))
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
                    .addComponent(pnlMyAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlCancelOrder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(pnlOrderHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlMyCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addComponent(pnlCancelOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlOrderHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(219, 219, 219))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, -1));

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
                .addGap(0, 691, Short.MAX_VALUE)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));

        lblImg1.setText("jLabel2");
        lblImg1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderProductMouseClicked(evt);
            }
        });
        jPanel1.add(lblImg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 125, 200, 200));

        lblImg2.setText("jLabel3");
        lblImg2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderProductMouseClicked(evt);
            }
        });
        jPanel1.add(lblImg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 125, 200, 200));

        lblImg3.setText("jLabel4");
        lblImg3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderProductMouseClicked(evt);
            }
        });
        jPanel1.add(lblImg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(932, 125, 200, 200));

        lblName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName1.setText("jLabel5");
        lblName1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 331, 200, -1));

        lblName2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName2.setText("jLabel6");
        jPanel1.add(lblName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 331, 200, -1));

        lblName3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName3.setText("jLabel7");
        jPanel1.add(lblName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(932, 331, 200, -1));

        lblImg4.setText("jLabel8");
        lblImg4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderProductMouseClicked(evt);
            }
        });
        jPanel1.add(lblImg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 393, 200, 200));

        lblImg5.setText("jLabel9");
        lblImg5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderProductMouseClicked(evt);
            }
        });
        jPanel1.add(lblImg5, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 393, 200, 200));

        lblImg6.setText("jLabel10");
        lblImg6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderProductMouseClicked(evt);
            }
        });
        jPanel1.add(lblImg6, new org.netbeans.lib.awtextra.AbsoluteConstraints(932, 393, 200, 200));

        lblName4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName4.setText("jLabel11");
        jPanel1.add(lblName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 599, 200, -1));

        lblName5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName5.setText("jLabel12");
        jPanel1.add(lblName5, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 599, 200, -1));

        lblName6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName6.setText("jLabel13");
        jPanel1.add(lblName6, new org.netbeans.lib.awtextra.AbsoluteConstraints(932, 599, 200, -1));

        pnlBackArrow.setBackground(new java.awt.Color(255, 255, 255));

        lblPrv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrv.setIcon(new javax.swing.ImageIcon("D:\\database\\Happy Tummy\\src\\com\\icons\\back_arrow.png")); // NOI18N
        lblPrv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPrvMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlBackArrowLayout = new javax.swing.GroupLayout(pnlBackArrow);
        pnlBackArrow.setLayout(pnlBackArrowLayout);
        pnlBackArrowLayout.setHorizontalGroup(
            pnlBackArrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackArrowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPrv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlBackArrowLayout.setVerticalGroup(
            pnlBackArrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackArrowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPrv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(pnlBackArrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 360, -1, -1));

        pnlForwordArrow.setBackground(new java.awt.Color(255, 255, 255));

        lblNext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNext.setIcon(new javax.swing.ImageIcon("D:\\database\\Happy Tummy\\src\\com\\icons\\forword_arrow.png")); // NOI18N
        lblNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlForwordArrowLayout = new javax.swing.GroupLayout(pnlForwordArrow);
        pnlForwordArrow.setLayout(pnlForwordArrowLayout);
        pnlForwordArrowLayout.setHorizontalGroup(
            pnlForwordArrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlForwordArrowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlForwordArrowLayout.setVerticalGroup(
            pnlForwordArrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(pnlForwordArrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(1174, 360, -1, -1));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 255));
        jLabel14.setText("Filter");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 78, 57, -1));

        jcCompanyNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCompanyNamesActionPerformed(evt);
            }
        });
        jPanel1.add(jcCompanyNames, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 78, 344, 35));

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

    private void pnlOrderHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlOrderHistoryMouseClicked
        new OrderHistoryFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlOrderHistoryMouseClicked

    private void pnlOrderHistoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlOrderHistoryMouseEntered
        this.pnlOrderHistory.setBackground(new Color(0, 140, 255));
    }//GEN-LAST:event_pnlOrderHistoryMouseEntered

    private void pnlOrderHistoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlOrderHistoryMouseExited
        this.pnlOrderHistory.setBackground(new Color(51, 51, 255));
    }//GEN-LAST:event_pnlOrderHistoryMouseExited

    private void pnlBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBackMouseEntered
        this.pnlBack.setBackground(new Color(0, 140, 255));
    }//GEN-LAST:event_pnlBackMouseEntered

    private void pnlBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBackMouseExited
        this.pnlBack.setBackground(new Color(51, 51, 255));
    }//GEN-LAST:event_pnlBackMouseExited

    private void pnlCancelOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCancelOrderMouseClicked
        new CancelOrderFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlCancelOrderMouseClicked

    private void pnlCancelOrderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCancelOrderMouseEntered
        this.pnlCancelOrder.setBackground(new Color(0, 140, 255));
    }//GEN-LAST:event_pnlCancelOrderMouseEntered

    private void pnlCancelOrderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCancelOrderMouseExited
        this.pnlCancelOrder.setBackground(new Color(51, 51, 255));
    }//GEN-LAST:event_pnlCancelOrderMouseExited

    private void pnlMyCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMyCartMouseClicked
        new CustomerCartFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlMyCartMouseClicked

    private void pnlMyCartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMyCartMouseEntered
        this.pnlMyCart.setBackground(new Color(0, 140, 255));
    }//GEN-LAST:event_pnlMyCartMouseEntered

    private void pnlMyCartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMyCartMouseExited
        this.pnlMyCart.setBackground(new Color(51, 51, 255));
    }//GEN-LAST:event_pnlMyCartMouseExited

    private void pnlMyAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMyAccountMouseClicked
        new CustomerAccountFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlMyAccountMouseClicked

    private void pnlMyAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMyAccountMouseEntered
        this.pnlMyAccount.setBackground(new Color(0, 140, 255));
    }//GEN-LAST:event_pnlMyAccountMouseEntered

    private void pnlMyAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMyAccountMouseExited
        this.pnlMyAccount.setBackground(new Color(51, 51, 255));
    }//GEN-LAST:event_pnlMyAccountMouseExited

    private void lblPrvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPrvMouseClicked
        listIndex -= 12;
        if(listIndex < 0){
            JOptionPane.showMessageDialog(null, "Already at 1st item ");
            listIndex = 0;
            return;
        }
        showDetails();
    }//GEN-LAST:event_lblPrvMouseClicked

    private void lblNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNextMouseClicked
        if(listIndex > productList.size()){
            JOptionPane.showMessageDialog(null, "No more products to display");
            return;
        }
        showDetails();
    }//GEN-LAST:event_lblNextMouseClicked

    private void jcCompanyNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCompanyNamesActionPerformed
        listIndex = 0;
        String compName = this.jcCompanyNames.getSelectedItem().toString();
        String compId = companyMap.get(compName); 
        if (compId == null) {
            compId = "All";
        }
        try {
            productList = ProductDao.getAllProductsByCompanyId(compId);
            showDetails();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DB Error in : Order Food");
            ex.printStackTrace();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Image Error in Order Food");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jcCompanyNamesActionPerformed

    private void lblOrderProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOrderProductMouseClicked
        JLabel lbl = (JLabel) evt.getSource();
        int index = Integer.parseInt(lbl.getName());
        System.out.println("you clicked on:" + index);
        if (index >= productList.size()) {
            JOptionPane.showMessageDialog(null, "invalid item clicked");
            return;
        } 
        String [] options = {"Add to cart","Buy now"};
        int choice = JOptionPane.showOptionDialog(null,"What do you want to do ?","Select",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
        if(choice == 0){
            ProductPojo p = productList.get(index);
            PlaceOrderPojo ord = new PlaceOrderPojo();
            ord.setProductId(p.getProductId());
            ord.setCustomerId(UserProfile.getUserId().trim());
            ord.setCompanyId(p.getCompanyId());
            try{
                boolean result = OrderDao.addToCart(ord);
                if(result){
                    JOptionPane.showMessageDialog(null, "Product added to cart!!");
                    return;
                }else{
                    JOptionPane.showMessageDialog(null, "Cannot add the product to cart");
                    return;
                }
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "DB Error while adding to cart");
                ex.printStackTrace();
            }
        }
        else{
            ProductPojo p = productList.get(index);
            new OrderProductFrame(p).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_lblOrderProductMouseClicked

    private void pnlBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBackMouseClicked
        new CustomerOptionsFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlBackMouseClicked

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
            java.util.logging.Logger.getLogger(OrderFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderFoodFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private combo_suggestion.ComboBoxSuggestion jcCompanyNames;
    private javax.swing.JLabel lblAddStaff2;
    private javax.swing.JLabel lblAddStaff3;
    private javax.swing.JLabel lblImg1;
    private javax.swing.JLabel lblImg2;
    private javax.swing.JLabel lblImg3;
    private javax.swing.JLabel lblImg4;
    private javax.swing.JLabel lblImg5;
    private javax.swing.JLabel lblImg6;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblName2;
    private javax.swing.JLabel lblName3;
    private javax.swing.JLabel lblName4;
    private javax.swing.JLabel lblName5;
    private javax.swing.JLabel lblName6;
    private javax.swing.JLabel lblNext;
    private javax.swing.JLabel lblOrderList;
    private javax.swing.JLabel lblPrv;
    private javax.swing.JLabel lblViewFood1;
    private javax.swing.JLabel lblViewStaff1;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JPanel pnlBackArrow;
    private javax.swing.JPanel pnlCancelOrder;
    private javax.swing.JPanel pnlForwordArrow;
    private javax.swing.JPanel pnlMyAccount;
    private javax.swing.JPanel pnlMyCart;
    private javax.swing.JPanel pnlOrderHistory;
    // End of variables declaration//GEN-END:variables

    private void loadCompanyNames() {
        try {
            companyMap = CompanyDao.getAllCompanyIdAndName();
            Set<String> companyNames = companyMap.keySet();
            this.jcCompanyNames.addItem("All");
            for (String cname : companyNames) {
                this.jcCompanyNames.addItem(cname);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DB Error in : Order Food");
            ex.printStackTrace();
        }
    }

    private void showDetails() {
        if (listIndex < productList.size()) {
            ProductPojo p = productList.get(listIndex);
            Image img = p.getProductImage();
            img = img.getScaledInstance(this.lblImg1.getWidth(), this.lblImg1.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            this.lblImg1.setIcon(icon);
            this.lblName1.setText(p.getProductName());
            this.lblImg1.setName(listIndex + "");
            this.lblName1.setName(listIndex + "");
            listIndex++;
        } else {
            this.lblImg1.setIcon(null);
            this.lblImg1.setText("N/A");
            this.lblName1.setText("N/A");
            this.lblImg1.setName(listIndex + "");
            this.lblName1.setName(listIndex + "");
            listIndex++;
        }

        if (listIndex < productList.size()) {
            ProductPojo p = productList.get(listIndex);
            Image img = p.getProductImage();
            img = img.getScaledInstance(this.lblImg2.getWidth(), this.lblImg2.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            this.lblImg2.setIcon(icon);
            this.lblName2.setText(p.getProductName());
            this.lblImg2.setName(listIndex + "");
            this.lblName2.setName(listIndex + "");
            listIndex++;
        } else {
            this.lblImg2.setIcon(null);
            this.lblImg2.setText("N/A");
            this.lblName2.setText("N/A");
            this.lblImg2.setName(listIndex + "");
            this.lblName2.setName(listIndex + "");
            listIndex++;
        }

        if (listIndex < productList.size()) {
            ProductPojo p = productList.get(listIndex);
            Image img = p.getProductImage();
            img = img.getScaledInstance(this.lblImg3.getWidth(), this.lblImg3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            this.lblImg3.setIcon(icon);
            this.lblName3.setText(p.getProductName());
            this.lblImg3.setName(listIndex + "");
            this.lblName3.setName(listIndex + "");
            listIndex++;
        } else {
            this.lblImg3.setIcon(null);
            this.lblImg3.setText("N/A");
            this.lblName3.setText("N/A");
            this.lblImg3.setName(listIndex + "");
            this.lblName3.setName(listIndex + "");
            listIndex++;
        }

        if (listIndex < productList.size()) {
            ProductPojo p = productList.get(listIndex);
            Image img = p.getProductImage();
            img = img.getScaledInstance(this.lblImg4.getWidth(), this.lblImg4.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            this.lblImg4.setIcon(icon);
            this.lblName4.setText(p.getProductName());
            this.lblImg4.setName(listIndex + "");
            this.lblName4.setName(listIndex + "");
            listIndex++;
        } else {
            this.lblImg4.setIcon(null);
            this.lblImg4.setText("N/A");
            this.lblName4.setText("N/A");
            this.lblImg4.setName(listIndex + "");
            this.lblName4.setName(listIndex + "");
            listIndex++;
        }

        if (listIndex < productList.size()) {
            ProductPojo p = productList.get(listIndex);
            Image img = p.getProductImage();
            img = img.getScaledInstance(this.lblImg5.getWidth(), this.lblImg5.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            this.lblImg5.setIcon(icon);
            this.lblName5.setText(p.getProductName());
            this.lblImg5.setName(listIndex + "");
            this.lblName5.setName(listIndex + "");
            listIndex++;
        } else {
            this.lblImg5.setIcon(null);
            this.lblImg5.setText("N/A");
            this.lblName5.setText("N/A");
            this.lblImg5.setName(listIndex + "");
            this.lblName5.setName(listIndex + "");
            listIndex++;
        }

        if (listIndex < productList.size()) {
            ProductPojo p = productList.get(listIndex);
            Image img = p.getProductImage();
            img = img.getScaledInstance(this.lblImg6.getWidth(), this.lblImg6.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            this.lblImg6.setIcon(icon);
            this.lblName6.setText(p.getProductName());
            this.lblImg6.setName(listIndex + "");
            this.lblName6.setName(listIndex + "");
            listIndex++;
        } else {
            this.lblImg6.setIcon(null);
            this.lblImg6.setText("N/A");
            this.lblName6.setText("N/A");
            this.lblImg6.setName(listIndex + "");
            this.lblName6.setName(listIndex + "");
            listIndex++;
        }
    }
}
