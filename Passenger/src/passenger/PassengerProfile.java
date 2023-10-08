/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passenger;

import BorderServices.BorderServiceInterface;
import Tables.BorderTable;
import Tables.EmployeeExploreBorder;
import Tables.EmployeeTable;
import Tables.Feedback;
import Tables.Passengerdb;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.encoder.QRCode;
import java.awt.Color;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.IOException;
import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 *
 * @author Eng Michael
 */
public class PassengerProfile extends javax.swing.JFrame {
String path="";
    public PassengerProfile() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel21 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        Sidebarnavigation = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        Accsidebarnav = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        passengerTab = new javax.swing.JTabbedPane();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        loginpopupnotification = new javax.swing.JPanel();
        loInpopummessage = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        pdestination = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        preason = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        passengerusername = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        passengerpassword = new javax.swing.JPasswordField();
        EntranceCode = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        entranceExit = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        popupmessagepane = new javax.swing.JPanel();
        popupmessage = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator30 = new javax.swing.JSeparator();
        cpnid = new javax.swing.JFormattedTextField();
        jLabel22 = new javax.swing.JLabel();
        cpcp = new javax.swing.JPasswordField();
        jLabel25 = new javax.swing.JLabel();
        cprcp = new javax.swing.JPasswordField();
        jSeparator28 = new javax.swing.JSeparator();
        jLabel26 = new javax.swing.JLabel();
        cptel = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jSeparator27 = new javax.swing.JSeparator();
        Forgetpswdbtn = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        cpusername = new javax.swing.JTextField();
        jSeparator25 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        Identity = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jSeparator26 = new javax.swing.JSeparator();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        writemessage = new javax.swing.JTextArea();
        feedbackNames = new javax.swing.JTextField();
        telphonenumber = new javax.swing.JFormattedTextField();
        FeedbackAbout = new javax.swing.JComboBox<>();
        jPanel20 = new javax.swing.JPanel();
        Feed = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jSeparator31 = new javax.swing.JSeparator();
        jSeparator32 = new javax.swing.JSeparator();
        jSeparator33 = new javax.swing.JSeparator();
        jSeparator34 = new javax.swing.JSeparator();
        changepusername = new javax.swing.JTextField();
        changepOldpass = new javax.swing.JPasswordField();
        changepOldpNewp = new javax.swing.JPasswordField();
        jPasswordField4 = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        ncountry = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel18 = new javax.swing.JLabel();
        retypepasswd = new javax.swing.JPasswordField();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        pcode = new javax.swing.JComboBox<>();
        nid = new javax.swing.JFormattedTextField();
        uploadphoto = new javax.swing.JLabel();
        jSeparator19 = new javax.swing.JSeparator();
        fname = new javax.swing.JTextField();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        jSeparator22 = new javax.swing.JSeparator();
        jSeparator23 = new javax.swing.JSeparator();
        jSeparator24 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        gender = new javax.swing.JComboBox<>();
        UploadedImage = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        pnumber = new javax.swing.JFormattedTextField();
        jSeparator37 = new javax.swing.JSeparator();
        jSeparator38 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        sidebar = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 793, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel16MouseExited(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/passenger/Account2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel21.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 110, 78));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel17MouseClicked(evt);
            }
        });

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/passenger/feedback.png"))); // NOI18N

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
        );

        jPanel21.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 110, 80));

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel18MouseClicked(evt);
            }
        });

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/passenger/logout.png"))); // NOI18N
        jLabel45.setText("jLabel45");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 69, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        jPanel21.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 110, 80));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/passenger/8-Types-of-navigation-menus_Blog_1.png"))); // NOI18N
        jLabel27.setOpaque(true);
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        jPanel21.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel28MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel28MouseEntered(evt);
            }
        });

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/passenger/Home.png"))); // NOI18N

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addComponent(jLabel39)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel21.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 110, 80));

        getContentPane().add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 120, -1));

        jPanel15.setBackground(new java.awt.Color(115, 52, 52));
        jPanel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel15MouseExited(evt);
            }
        });
        jPanel15.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));

        Sidebarnavigation.setBackground(new java.awt.Color(5, 55, 84));

        jPanel32.setBackground(new java.awt.Color(5, 55, 84));
        jPanel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel32MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel32MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel32MouseExited(evt);
            }
        });

        jLabel66.setBackground(new java.awt.Color(255, 255, 255));
        jLabel66.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("Feedback");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel66)
                .addGap(28, 28, 28))
        );

        jPanel29.setBackground(new java.awt.Color(5, 55, 84));
        jPanel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel29MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel29MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel29MouseExited(evt);
            }
        });

        jLabel64.setBackground(new java.awt.Color(255, 255, 255));
        jLabel64.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("Home");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel64)
                .addGap(18, 18, 18))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel64)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel33.setBackground(new java.awt.Color(5, 55, 84));
        jPanel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel33MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel33MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel33MouseExited(evt);
            }
        });

        jLabel44.setBackground(new java.awt.Color(255, 255, 255));
        jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("LogOut");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel44)
                .addGap(22, 22, 22))
        );

        jLabel67.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("X");
        jLabel67.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel67MouseClicked(evt);
            }
        });

        jPanel31.setBackground(new java.awt.Color(5, 55, 84));
        jPanel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel31MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel31MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel31MouseExited(evt);
            }
        });

        jLabel65.setBackground(new java.awt.Color(255, 255, 255));
        jLabel65.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("Account");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel65)
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout SidebarnavigationLayout = new javax.swing.GroupLayout(Sidebarnavigation);
        Sidebarnavigation.setLayout(SidebarnavigationLayout);
        SidebarnavigationLayout.setHorizontalGroup(
            SidebarnavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidebarnavigationLayout.createSequentialGroup()
                .addGap(0, 107, Short.MAX_VALUE)
                .addGroup(SidebarnavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SidebarnavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jPanel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        SidebarnavigationLayout.setVerticalGroup(
            SidebarnavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidebarnavigationLayout.createSequentialGroup()
                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(Sidebarnavigation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 520));

        Accsidebarnav.setBackground(new java.awt.Color(73, 57, 25));
        Accsidebarnav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel24.setBackground(new java.awt.Color(73, 57, 25));
        jPanel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel24MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel24MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel24MouseExited(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("SignUp?");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel47)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel47)
                .addGap(53, 53, 53))
        );

        Accsidebarnav.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 130, 100));

        jPanel23.setBackground(new java.awt.Color(73, 57, 25));
        jPanel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel23MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel23MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel23MouseExited(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("LogIn");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel46)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel46)
                .addGap(43, 43, 43))
        );

        Accsidebarnav.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 130, 100));

        jPanel25.setBackground(new java.awt.Color(73, 57, 25));
        jPanel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel25MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel25MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel25MouseExited(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Change Password");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel48)
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel48)
                .addGap(51, 51, 51))
        );

        Accsidebarnav.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, 110));

        jPanel26.setBackground(new java.awt.Color(73, 57, 25));
        jPanel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel26MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel26MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel26MouseExited(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Forget Password");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel49)
                .addGap(20, 20, 20))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jLabel49)
                .addGap(25, 25, 25))
        );

        Accsidebarnav.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 425, -1, 90));

        getContentPane().add(Accsidebarnav, new org.netbeans.lib.awtextra.AbsoluteConstraints(793, 0, 130, 520));

        passengerTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passengerTabMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passengerTabMouseEntered(evt);
            }
        });

        kGradientPanel1.setkEndColor(new java.awt.Color(51, 0, 51));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 204, 204));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginpopupnotification.setBackground(new java.awt.Color(240, 146, 96));
        loginpopupnotification.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204), 2));

        loInpopummessage.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        loInpopummessage.setForeground(new java.awt.Color(255, 255, 255));
        loInpopummessage.setText("jLabel35");

        jPanel13.setBackground(new java.awt.Color(255, 51, 51));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/passenger/fail.png"))); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout loginpopupnotificationLayout = new javax.swing.GroupLayout(loginpopupnotification);
        loginpopupnotification.setLayout(loginpopupnotificationLayout);
        loginpopupnotificationLayout.setHorizontalGroup(
            loginpopupnotificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginpopupnotificationLayout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loInpopummessage, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE))
        );
        loginpopupnotificationLayout.setVerticalGroup(
            loginpopupnotificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginpopupnotificationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loInpopummessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
            .addGroup(loginpopupnotificationLayout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        kGradientPanel1.add(loginpopupnotification, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 360, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("LogIn Form");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 88, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("User Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 53, 88, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Password:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 70, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Destination");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 88, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Reason");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 88, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 153));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 142, 260, 10));
        jPanel1.add(pdestination, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 260, -1));

        jSeparator5.setBackground(new java.awt.Color(51, 0, 153));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 192, 260, 10));
        jPanel1.add(preason, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 260, -1));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 204));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 252, 270, 0));

        jSeparator7.setBackground(new java.awt.Color(51, 0, 153));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 260, 10));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 204));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 260, 10));
        jPanel1.add(passengerusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 260, -1));

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 270, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("SignUp?");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Forget Password?");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));
        jPanel1.add(passengerpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 260, -1));

        EntranceCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntranceCodeActionPerformed(evt);
            }
        });
        jPanel1.add(EntranceCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 260, 30));

        jLabel63.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel63.setText("Entrance Code");
        jPanel1.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        entranceExit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entrance", "Exit" }));
        jPanel1.add(entranceExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 260, -1));

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 304, 410));
        kGradientPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 72, 800, 10));

        passengerTab.addTab("LogIn", kGradientPanel1);

        jPanel6.setBackground(new java.awt.Color(240, 238, 197));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setText("Now You can Get back your Lost Account");

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel32.setText("By Filling The provided form");

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/passenger/Michael jack_transcpr.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addGap(46, 46, 46)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(240, 118, 186));

        popupmessagepane.setBackground(new java.awt.Color(153, 53, 27));

        popupmessage.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        popupmessage.setForeground(new java.awt.Color(255, 255, 255));
        popupmessage.setText("jLabel34");

        jPanel12.setBackground(new java.awt.Color(153, 0, 0));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/passenger/fail.png"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout popupmessagepaneLayout = new javax.swing.GroupLayout(popupmessagepane);
        popupmessagepane.setLayout(popupmessagepaneLayout);
        popupmessagepaneLayout.setHorizontalGroup(
            popupmessagepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, popupmessagepaneLayout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(popupmessage, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        popupmessagepaneLayout.setVerticalGroup(
            popupmessagepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popupmessagepaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(popupmessage)
                .addGap(23, 23, 23))
            .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        cpnid.setBackground(new java.awt.Color(240, 118, 186));
        cpnid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 118, 186)));
        try {
            cpnid.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#### #### #### ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel22.setText("User Name");

        cpcp.setBackground(new java.awt.Color(240, 118, 186));
        cpcp.setBorder(null);
        cpcp.setOpaque(false);

        jLabel25.setText("Retype Password");

        cprcp.setBackground(new java.awt.Color(240, 118, 186));
        cprcp.setBorder(null);
        cprcp.setOpaque(false);

        jLabel26.setText("Create Password");

        cptel.setBackground(new java.awt.Color(240, 118, 186));
        cptel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cptel.setBorder(null);
        cptel.setOpaque(false);

        jLabel23.setText("Telephone Number");

        Forgetpswdbtn.setText("Save");
        Forgetpswdbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ForgetpswdbtnMouseClicked(evt);
            }
        });
        Forgetpswdbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ForgetpswdbtnActionPerformed(evt);
            }
        });

        jLabel24.setText("National Id");

        cpusername.setBackground(new java.awt.Color(240, 118, 186));
        cpusername.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cpusername.setBorder(null);
        cpusername.setOpaque(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(Forgetpswdbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jSeparator27, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator25, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpusername, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel26)
                    .addComponent(jSeparator28, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cprcp, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(cpcp, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(cpnid, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator30, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cptel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(popupmessagepane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpusername, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpnid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cptel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator28, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpcp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel25)
                .addGap(2, 2, 2)
                .addComponent(cprcp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(Forgetpswdbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(popupmessagepane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        passengerTab.addTab("Forget  Passwd*", jPanel3);

        Identity.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N

        jLabel69.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel69.setText("Use Id For Entrance");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(Identity, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(254, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(208, 208, 208)
                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(244, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(Identity, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(307, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(396, Short.MAX_VALUE)))
        );

        passengerTab.addTab("Barcode", jPanel4);

        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        kGradientPanel2.add(jSeparator26, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 160, 348, 14));

        jLabel51.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel51.setText(" Welcome To BMS");
        kGradientPanel2.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 218, 48));

        jLabel52.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Developed By");
        kGradientPanel2.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 127, -1, -1));

        jLabel53.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Igiraneza");
        kGradientPanel2.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, -1, -1));

        jLabel54.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Michel");
        kGradientPanel2.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, -1, -1));

        jLabel55.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Ndayishimye");
        kGradientPanel2.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, -1, -1));

        jLabel60.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("Asher");
        kGradientPanel2.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, -1, -1));

        jLabel61.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("Niragire");
        kGradientPanel2.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 260, -1, -1));

        jLabel62.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("Solange");
        kGradientPanel2.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, -1, -1));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 855, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
        );

        passengerTab.addTab("Home", jPanel11);

        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel36.setText("Feedback ");
        jPanel19.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel38.setText("Names:");
        jPanel19.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel41.setText("Telephone Number:");
        jPanel19.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel42.setText("Message:");
        jPanel19.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        jButton4.setText("Send");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel19.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 150, 70));

        writemessage.setColumns(20);
        writemessage.setRows(5);
        jScrollPane1.setViewportView(writemessage);

        jPanel19.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 280, 100));
        jPanel19.add(feedbackNames, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 280, 30));
        jPanel19.add(telphonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 280, 30));

        FeedbackAbout.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Border Services", "System Improvement", "Others" }));
        jPanel19.add(FeedbackAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 280, 30));

        jPanel20.setBackground(new java.awt.Color(16, 118, 12));

        Feed.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Feed.setForeground(new java.awt.Color(255, 255, 255));
        Feed.setText("jLabel44");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addComponent(Feed, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(Feed, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jPanel19.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, -1, -1));

        jLabel50.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel50.setText("Feedback About");
        jPanel19.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/passenger/feedbackpanel.jpg"))); // NOI18N
        jLabel43.setText("jLabel43");
        jPanel19.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 490));

        passengerTab.addTab("Feedback**", jPanel19);

        jPanel30.setBackground(new java.awt.Color(240, 189, 128));

        jLabel56.setText("UserName:");

        jLabel57.setText("Old Passwd:");

        jLabel58.setText("New Passwd");

        jLabel59.setText("Retype New Passwd");

        jButton6.setText("Save Changes");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jSeparator31.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator32.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator33.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator34.setForeground(new java.awt.Color(255, 255, 255));

        changepusername.setBackground(new java.awt.Color(240, 189, 128));
        changepusername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 189, 128)));

        changepOldpass.setBackground(new java.awt.Color(240, 189, 128));
        changepOldpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 189, 128)));

        changepOldpNewp.setBackground(new java.awt.Color(240, 189, 128));
        changepOldpNewp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 189, 128)));
        changepOldpNewp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepOldpNewpActionPerformed(evt);
            }
        });

        jPasswordField4.setBackground(new java.awt.Color(240, 189, 128));
        jPasswordField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 189, 128)));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel56)
                    .addComponent(jLabel57)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(changepusername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                        .addComponent(jSeparator31, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(changepOldpass, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(changepOldpNewp, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPasswordField4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel56)
                .addGap(18, 18, 18)
                .addComponent(changepusername, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator31, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel57)
                .addGap(26, 26, 26)
                .addComponent(changepOldpass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator32, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel58)
                .addGap(18, 18, 18)
                .addComponent(changepOldpNewp, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator33, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel59)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPasswordField4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator34, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(294, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        passengerTab.addTab("Change Passwd*", jPanel27);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Gender");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("National Id");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Native Country");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Upload Profile");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Last Name");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Telephone Number");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, -1, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("First Name");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        lname.setBackground(new java.awt.Color(0, 0, 0));
        lname.setForeground(new java.awt.Color(255, 255, 255));
        lname.setBorder(null);
        lname.setOpaque(false);
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        jPanel2.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 150, 20));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 150, 0));

        ncountry.setBackground(new java.awt.Color(0, 0, 0));
        ncountry.setForeground(new java.awt.Color(255, 255, 255));
        ncountry.setBorder(null);
        ncountry.setOpaque(false);
        jPanel2.add(ncountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 200, 20));

        username.setBackground(new java.awt.Color(0, 0, 0));
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setBorder(null);
        username.setOpaque(false);
        jPanel2.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 170, 20));

        jSeparator10.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 212, 220, 0));

        jSeparator11.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 200, 20));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("User name");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, -1));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Password");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, -1, -1));

        password.setBackground(new java.awt.Color(0, 0, 0));
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setBorder(null);
        password.setOpaque(false);
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 140, 20));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Retype Paswd");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, -1, -1));

        retypepasswd.setBackground(new java.awt.Color(0, 0, 0));
        retypepasswd.setForeground(new java.awt.Color(255, 255, 255));
        retypepasswd.setBorder(null);
        retypepasswd.setOpaque(false);
        jPanel2.add(retypepasswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 100, 20));

        jSeparator12.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 292, 230, 0));

        jSeparator13.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 180, 0));

        jSeparator14.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 140, -1));

        jSeparator15.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 130, 20));

        jSeparator16.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 188, 200, -1));

        jSeparator17.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, 110, 0));

        jSeparator18.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 170, 10));

        pcode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+243", "+250", "+254", "+255", "+256", "+257", " " }));
        jPanel2.add(pcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, -1, -1));

        nid.setBackground(new java.awt.Color(0, 0, 0));
        nid.setBorder(null);
        nid.setForeground(new java.awt.Color(255, 255, 255));
        try {
            nid.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#### #### #### ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        nid.setOpaque(false);
        jPanel2.add(nid, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 200, 20));

        uploadphoto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        uploadphoto.setForeground(new java.awt.Color(255, 255, 255));
        uploadphoto.setText("Upload");
        uploadphoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        uploadphoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uploadphotoMouseClicked(evt);
            }
        });
        jPanel2.add(uploadphoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));

        jSeparator19.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 150, 30));

        fname.setBackground(new java.awt.Color(0, 0, 0));
        fname.setForeground(new java.awt.Color(255, 255, 255));
        fname.setBorder(null);
        fname.setOpaque(false);
        jPanel2.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 130, 20));
        jPanel2.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, -1, -1));
        jPanel2.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, -1, -1));
        jPanel2.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 370, -1, -1));

        jSeparator23.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, 100, 0));

        jSeparator24.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 90, 10));

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, 120, -1));

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel2.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 160, -1));

        UploadedImage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.add(UploadedImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 300, 400));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Upload Your Image");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, 20));

        pnumber.setBackground(new java.awt.Color(0, 0, 0));
        pnumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnumber.setForeground(new java.awt.Color(255, 255, 255));
        try {
            pnumber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("### ### ###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(pnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 110, -1));

        jSeparator37.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator37, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 170, 10));

        jSeparator38.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator38, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 110, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/passenger/read.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 630, 480));

        passengerTab.addTab("SignUp**", jPanel2);

        getContentPane().add(passengerTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, -30, 860, 550));

        sidebar.setBackground(new java.awt.Color(51, 0, 51));

        jPanel9.setBackground(new java.awt.Color(51, 0, 51));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel9MouseExited(evt);
            }
        });
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(204, 255, 255));
        jLabel35.setText("Account");
        jPanel9.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanel10.setBackground(new java.awt.Color(51, 0, 51));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel10MouseExited(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("LogOut");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel30)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel30)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(51, 0, 51));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel8MouseExited(evt);
            }
        });
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Home");
        jPanel8.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 25, -1, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("X");
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });

        jPanel14.setBackground(new java.awt.Color(51, 0, 51));
        jPanel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel14MouseExited(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 255, 255));
        jLabel31.setText("FeedBack");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel31)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel31)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-320, 0, 320, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed
void closebar()
{
    Thread td=new Thread(){
        @Override
        public void run()
        {
            try {
                for(int q=320;q>=0;q--)
                {
                    sidebar.setBounds(0,0,q,520);
                     Thread.sleep(4);
                }
               
            } catch (InterruptedException ex) {
                Logger.getLogger(PassengerProfile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    };
    td.start();
}
    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
    closebar();
    }//GEN-LAST:event_jLabel28MouseClicked


    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
       Sidebarnavigation.setVisible(true);
        Thread th=new Thread(){
        @Override
        public void run()
        {
          for(int i=0;i<210;i++)
          {
              try {
                  Sidebarnavigation.setBounds(15,0,i,520);
                  Thread.sleep(2);
              } catch (InterruptedException ex) {
                  Logger.getLogger(PassengerProfile.class.getName()).log(Level.SEVERE, null, ex);
              }
          }
        }
    };
    th.start();
    }//GEN-LAST:event_jLabel27MouseClicked
    public void passwdpopupMessage()
    {
        Thread th=new Thread(){
        @Override
        public void run()
        {
          for(int i=0;i<50;i++)
          {
              try {
                  popupmessagepane.setLocation(i, 400);
                  Thread.sleep(62);
                  if(i==48)
                  {
                     popupmessagepane.setVisible(false);
                  }
              } catch (InterruptedException ex) {
                  Logger.getLogger(PassengerProfile.class.getName()).log(Level.SEVERE, null, ex);
              }
          }
        }
    };
    th.start();
    }
    private void ForgetpswdbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgetpswdbtnMouseClicked
    if(cpusername.getText().isEmpty())
    { 
       popupmessagepane.setVisible(true);
        popupmessage.setText("User name has not to be not Empty");
        passwdpopupMessage();
    }
    else{
        if(cpnid.getText().isEmpty())
        {
            popupmessagepane.setVisible(true);
            popupmessage.setText("National Id has not to be not Empty");
        passwdpopupMessage();
        }
        else{
            if(cptel.getText().isEmpty())
            {
            popupmessagepane.setVisible(true);
            popupmessage.setText("Telephone number has not to be not Empty");
        passwdpopupMessage();
            }
            else{
                if(cpcp.getText().isEmpty())
                {
                    popupmessagepane.setVisible(true);
                   popupmessage.setText(" You have to type Your password");
                  passwdpopupMessage();
                }
                else{
                    if(cprcp.getText().isEmpty())
                    {
                        popupmessagepane.setVisible(true);
                         popupmessage.setText("Retyped Password has not to be not Empty");
                         passwdpopupMessage();
                    }
                    else{
                        if(cpcp.getText().equals(cprcp.getText()))
                        {
                           
                        }
                        else{
                            
                             popupmessagepane.setVisible(true);
                             popupmessage.setText("Password has to be The same");
                             passwdpopupMessage();
                            
                        }
                    }
                }
            }
        }
    }
    }//GEN-LAST:event_ForgetpswdbtnMouseClicked
void logInnotification() 
{
    Thread thread=new Thread()
    {
         @Override
        public void run()
        {
        for(int m=0;m<=793;m++)
        {
            try {
                if(m<100){
                  loginpopupnotification.setLocation(500,80);
                loginpopupnotification.setVisible(true);
                Thread.sleep(10);
                }
                else
                    loginpopupnotification.setLocation(500+m,80);
                if(m==790)
                {
                    loginpopupnotification.setVisible(false);
                    break;
                }
                Thread.sleep(5);
            } catch (InterruptedException ex) {
                Logger.getLogger(PassengerProfile.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        }
    };
    thread.start();
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     //verify That All field option are filled
//        if(passengerusername.getText().isEmpty())
//     {
//         loInpopummessage.setText("Username is Required");
//         logInnotification();
//     }
//     else{
//         if(passengerpassword.getText().isEmpty())
//         {
//             loginpopupnotification.setVisible(true);
//         loInpopummessage.setText("Password Is required");
//         logInnotification();
//         }
//         else{
//             if(pdestination.getText().isEmpty())
//             {
//                 loginpopupnotification.setVisible(true);
//         loInpopummessage.setText("Specify your Dastination");
//         logInnotification();
//             }
//             else{
//                 if(preason.getText().isEmpty())
//                 {
//         loInpopummessage.setText("Mention Your Reason pls");
//         logInnotification();
//                 }
//                 else{
//                     try {
//                         
//        String nationalId="",employeenationalId="",borderId="";
//        int n=0;
//        Registry rmi=LocateRegistry.getRegistry(5000);
//        int available=0;
//        // public PassengerOnExplore(String NationalId) throws RemoteException;
//        //check that A passenger  credential Is stored in db
//       
//        int found=5,penishment=0;
//        String ent="";       
//        //if passenger Credential are valid
//        if(available==1){
//            //check Entrance Code for passenger
//            BorderServiceInterface bm=(BorderServiceInterface)rmi.lookup("GetEmployeeDetailtoPassenger");
//         List<EmployeeTable>gm=bm.GetEntrancecode(EntranceCode.getText());
//         for(EmployeeTable p:gm)
//         {
//            n=2;
//            employeenationalId=p.getEmployeeNationalIdentity();
//            borderId=p.getEmpBorderId().getBorderId();
//         }
//  //check Entrance Code  if yes ==2 The Entrance Will     
// if(n==2){
//     BorderServiceInterface bif=(BorderServiceInterface)rmi.lookup("SearchExploreBorder");
//        List<EmployeeExploreBorder>passbfr=bif.PassengerOnExplore(nationalId);
//        for(EmployeeExploreBorder i:passbfr)
//        {
//             ent=i.getEntranceOrExit()+"";
//             penishment=i.getPunishment();
//             found=1;
//        }  
// }
// else{
//     loInpopummessage.setText("Entrance Code Is Invalid");
//         logInnotification();
// }       
//                    
//                    
//         
//         EmployeeExploreBorder eb=new EmployeeExploreBorder();
//          BorderTable bt=new BorderTable();
//         bt.setBorderId(borderId);
//         Passengerdb psm=new Passengerdb();
//         psm.setPassengerId(nationalId);
//          EmployeeTable empl=new EmployeeTable();
//         empl.setEmployeeNationalIdentity(employeenationalId);
//   //At the time A Passenger Is found In database       
// if(found==1)
//{JOptionPane
//    //if he choose Entrance this pop up message Will Get raised
//   if(entranceExit.getSelectedItem().toString().equals("Entrance")&&ent.equals("1"))
//        {
//         loInpopummessage.setText("Bad Option Choose Exit");
//         logInnotification();
//        }
//   //if the passenger found with penalities
//    else if(penishment==1)
//        {
//            loInpopummessage.setText("Contact Admin To pay Fines");
//         logInnotification(); 
//        }
//        else if(entranceExit.getSelectedItem().toString().equals("Exit")&&ent.equals("1"))
//        {
//            //We shall update ta entrance table and set this person to 0
//             BorderServiceInterface biuf=(BorderServiceInterface)rmi.lookup("UpdatePassengerEntranceOrExit");
//             String res=biuf.ValidateIntranceExitChanges(nationalId);
//        JOptionPane.showMessageDialog(null,res);
//        }
//}
//       
////        else{
////            if(entranceExit.getSelectedItem().toString().equals("Entrance")){
////        
////        // public String ValidateIntranceExitChanges(String Destination,String GoingDate,String Reason,int EntranceOrExit,String BorderLocationId,String EmployeeOnServiceId) throws RemoteException;
////       //String res= biuf.ValidateIntranceExitChanges(pdestination.getText(),"Not_Yet",preason.getText(),1,borderId,employeenationalId);
////         
////            }
////        }  
////} 
//        
//        
// else if(found==5)
// {  BorderServiceInterface bmt=(BorderServiceInterface)rmi.lookup("InsertPassenger");
//         if(n==2){
//         eb.setPassengerId(psm);
//         eb.setDestination(pdestination.getText());
//         if(entranceExit.getSelectedItem().toString().equals("Entrance"))
//             eb.setEntranceOrExit(1);
//         else
//             eb.setEntranceOrExit(0);
//         eb.setGoingDateandTime("Not_yet");
//         eb.setReason(preason.getText());
//         eb.setPunishment(0);
//         eb.setBorderLocationId(bt);
//         eb.setEmployeeOnServiceId(empl);
//         String res=bmt.InsertPassenger(eb);
//         JOptionPane.showMessageDialog(null, res);
//         passengerTab.setSelectedIndex(3);
//           
//         }
// }
// }
//        else{
//             loInpopummessage.setText("Wrong Username or Passwda");
//         logInnotification();
//        }
//    }       catch (RemoteException ex) {
//                         Logger.getLogger(PassengerProfile.class.getName()).log(Level.SEVERE, null, ex);
//                     } catch (NotBoundException ex) {
//                         Logger.getLogger(PassengerProfile.class.getName()).log(Level.SEVERE, null, ex);   
//                     }
//                 }
//             }
//         }
//        }


 if(passengerusername.getText().isEmpty())
     {
         loInpopummessage.setText("Username is Required");
         logInnotification();
     }
     else{
         if(passengerpassword.getText().isEmpty())
         {
             loginpopupnotification.setVisible(true);
         loInpopummessage.setText("Password Is required");
         logInnotification();
         }
         else{
             if(pdestination.getText().isEmpty())
             {
                 loginpopupnotification.setVisible(true);
         loInpopummessage.setText("Specify your Dastination");
         logInnotification();
             }
             else{
                 if(preason.getText().isEmpty())
                 {
         loInpopummessage.setText("Mention Your Reason pls");
         logInnotification();
                 }
                 else{
       String nationalId = "",borderId="",employeenationalId="";
                     //First We need to verify Username And password
       int found=0,notfound=0;
       Registry rmi;
                     try {
                         rmi = LocateRegistry.getRegistry(5000);
                           BorderServiceInterface bi=(BorderServiceInterface)rmi.lookup("PassengerLogIn");
        List<Passengerdb> ps=bi.PassengerLogIn(passengerusername.getText(),passengerpassword.getText());
        for(Passengerdb i:ps)
        {
            nationalId=i.getPassengerId();
            Identity.setText(i.getPassengerId());
         found=1;
        }
        //ifgihe credential Xihari
        if(found==1)
        {
            //tura verifying Entrance Code
            BorderServiceInterface bm=(BorderServiceInterface)rmi.lookup("GetEmployeeDetailtoPassenger");
         List<EmployeeTable>gm=bm.GetEntrancecode(EntranceCode.getText());
         for(EmployeeTable p:gm)
         {borderId=p.getEmpBorderId().getBorderId();
         employeenationalId=p.getEmployeeNationalIdentity();
          found=2;
         }
         //igihe Entrance Code Iraba Ihari
         String Time ="";
         int penality=5;
            DateTimeFormatter fm=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
         if(found==2)
         {
             BorderServiceInterface bif=(BorderServiceInterface)rmi.lookup("SearchExploreBorder");
        List<EmployeeExploreBorder>passbfr=bif.PassengerOnExplore(nationalId);
        for(EmployeeExploreBorder i:passbfr)
        {
           Time=i.getGoingDateandTime();
           penality=i.getPunishment();
            found=3;
            notfound=1;
        } 
      //igihe azaba Yinjiye 
        if(found==3)
        {
            if(entranceExit.getSelectedItem().toString().equals("Entrance"))
            {
                loInpopummessage.setText("Bad Option Exit");
                logInnotification(); 
            }
            else{
                 hasalreadyEnter(Time,nationalId,penality);
            }        
        }
        else{
                   if(notfound==0){
               if(entranceExit.getSelectedItem().equals("Exit"))
               {
            loInpopummessage.setText("Bad Option Choose Entrance");
            logInnotification(); 
               }
               else{
                   //Igihe Araza Kuba Mubari Kwinjira
          EmployeeExploreBorder eb=new EmployeeExploreBorder();
          BorderTable bt=new BorderTable();
         bt.setBorderId(borderId);
         Passengerdb psm=new Passengerdb();
         psm.setPassengerId(nationalId);
          EmployeeTable empl=new EmployeeTable();
         empl.setEmployeeNationalIdentity(employeenationalId);
         BorderServiceInterface bmt=(BorderServiceInterface)rmi.lookup("InsertPassenger");
         eb.setPassengerId(psm);
         eb.setDestination(pdestination.getText());
             eb.setEntranceOrExit(1);
         eb.setGoingDateandTime("Not_yet");
         eb.setReason(preason.getText());
         eb.setPunishment(0);
         eb.setBorderLocationId(bt);
         eb.setEmployeeOnServiceId(empl);
         String res=bmt.InsertPassenger(eb);
         JOptionPane.showMessageDialog(null, res);
         passengerTab.setSelectedIndex(2);
         //Identity.setText(nationalId);
               }
            }
        }
       
         }
         //igihe Entrance Code Iraba Iri wrong
         if(found==1)
         {
           loInpopummessage.setText("Wrong Entrance Code");
            logInnotification(); 
         }
        }
        else if(found==0)
        {
            loInpopummessage.setText("Wrong Username or password");
            logInnotification();
        }
                     } catch (RemoteException ex) {
                         Logger.getLogger(PassengerProfile.class.getName()).log(Level.SEVERE, null, ex);
                     } catch (NotBoundException ex) {
                         Logger.getLogger(PassengerProfile.class.getName()).log(Level.SEVERE, null, ex);
                     } 
                 }
             }
         }
 }
    }//GEN-LAST:event_jButton1ActionPerformed
void hasalreadyEnter(String Time,String nationalId,int penality) throws RemoteException, NotBoundException
        {
            // Igihe Araza Kuba Ari mubantu binjiye mugihugu
            if(Time.equals("Not_yet"))
            {
                JOptionPane.showMessageDialog(null,"you have not Yet Started Explore Foreign Country");
            }
            else{
//                DateTimeFormatter fm=DateTimeFormatter.ofPattern("HH:mm");
//             LocalDateTime tm=LocalDateTime.parse(Time);
//            LocalDateTime today=LocalDateTime.now();
//            String tmm=fm.format(tm);
//            String todays=fm.format(today);
//                long d=Duration.between(today, tm).toHours();
//            int diff=LocalDateTime.parse(todays).getMinute()-LocalDateTime.parse(tmm).getMinute();
           Registry rmi=LocateRegistry.getRegistry(5000);
//            if(diff<10)
//            {
//                int pay=diff/10;
//            BorderServiceInterface bme=(BorderServiceInterface)rmi.lookup("Addpenality");
//            bme.Penalitise(pay,nationalId);
//            loInpopummessage.setText("Pay penality"+pay+"Frw"+" Of Before LogIn");
//            logInnotification(); 
//            }
            if(penality>=1)
            {
            loInpopummessage.setText("You've Fall Into penality");
            logInnotification();
            }
            else if(entranceExit.getSelectedItem().equals("Entrance")){
            loInpopummessage.setText("Bad Option Choose Exit");
            logInnotification();
            }
            else{
         //       We shall update ta entrance table and set this person to 0 For Exit
             BorderServiceInterface biuf=(BorderServiceInterface)rmi.lookup("UpdatePassengerEntranceOrExit");
             String res=biuf.ValidateIntranceExitChanges(nationalId);
             JOptionPane.showMessageDialog(null,res);
             passengerTab.setSelectedIndex(2);
            }
            
        }
        }
    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
      passengerTab.setSelectedIndex(6);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
     passengerTab.setSelectedIndex(1);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       if(fname.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(null,"First Name is Required");
       }
       else{
           if(lname.getText().isEmpty())
           {
               JOptionPane.showMessageDialog(null,"Last Name Is Required");
           }
           else{
               if(nid.getText().isEmpty())
               {
                   JOptionPane.showMessageDialog(null,"National Id is Required");
               }
               else{
                   if(ncountry.getText().isEmpty())
                   {
                       JOptionPane.showMessageDialog(null,"Please Specify your Native Country");
                   }
                   else{
                       if(username.getText().isEmpty())
                       {
                           JOptionPane.showMessageDialog(null,"Provide UserName");
                       }
                       else{
                           if(password.getText().isEmpty())
                           {
                               JOptionPane.showMessageDialog(null,"Pls Fill the password field");
                           }
                           else{
                               if(retypepasswd.getText().isEmpty())
                               {
                                   JOptionPane.showMessageDialog(null,"Retype your password Field has not to be empty");
                               }
                               else{
                                   if(password.getText().equals(retypepasswd.getText()))
                                   {
                                       if(path.equals(""))
                                       {
                                            JOptionPane.showMessageDialog(null,"Please Upload Your Profile Picture");
                                       }
                                       else{
                                       try {
                                           Registry rmi=LocateRegistry.getRegistry("localhost",5000);
                                           BorderServiceInterface bi=(BorderServiceInterface)rmi.lookup("InsertNewPassenger");
                                           Passengerdb ps=new Passengerdb();
                                          ps.setPassengerId(nid.getText());
                                          ps.setPassengerNames(fname.getText()+" "+lname.getText());
                                          ps.setPassengerGender(gender.getSelectedItem().toString());
                                          ps.setPassengerCountryOfBirth(ncountry.getText());
                                          ps.setTelephoneCountryCode(pcode.getSelectedItem().toString());
                                          ps.setTelephoneNumber(pnumber.getText());
                                          ps.setPassengeruserName(username.getText());
                                          ps.setPassword(retypepasswd.getText());
                                           FileInputStream imputfile=new FileInputStream(path);
                                           byte[] img=new byte[imputfile.available()];
                                           imputfile.read(img);
                                          ps.setProfilePicture(img);                                         
                                           String reuslt=bi.InsertNewPassenger(ps);
                                           JOptionPane.showMessageDialog(null, reuslt);
                                           
                                       } catch (RemoteException | NotBoundException ex) {
                                       }   catch (IOException ex) { 
                                             JOptionPane.showMessageDialog(null, "Your Profile Picture Should not exceed 1MB");
                                           } 
                                   }
                               }
                           }
                       }
                   }
               }
           }
       }
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPanel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseEntered
jPanel8.setBackground(new Color(123,89,21));
    }//GEN-LAST:event_jPanel8MouseEntered

    private void jPanel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseEntered
     jPanel9.setBackground(new Color(150,96,255));   // TODO add your handling code here:
    }//GEN-LAST:event_jPanel9MouseEntered

    private void jPanel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseEntered
      jPanel10.setBackground(new Color(160,255,120));
    }//GEN-LAST:event_jPanel10MouseEntered

    private void jPanel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseExited
    jPanel8.setBackground(new Color(51,0,51));
    }//GEN-LAST:event_jPanel8MouseExited

    private void jPanel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseExited
        jPanel9.setBackground(new Color(51,0,51));
    }//GEN-LAST:event_jPanel9MouseExited

    private void jPanel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseExited
         jPanel10.setBackground(new Color(51,0,51));
    }//GEN-LAST:event_jPanel10MouseExited

    private void jPanel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseClicked
    passengerTab.setSelectedIndex(5);
    }//GEN-LAST:event_jPanel14MouseClicked

    private void jPanel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseExited
        jPanel15.setVisible(false);
    }//GEN-LAST:event_jPanel15MouseExited

    private void jPanel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseEntered
         jPanel15.setVisible(false);
    }//GEN-LAST:event_jPanel15MouseEntered
void locationOfFeedback()
{
    Thread ts=new Thread()
    {
        public  void run()
        {
            try {
                for(int w=0;w<=300;w++)
                {
                    if(w<100)
                        Thread.sleep(50);
                    else
                         Thread.sleep(3);
                    jPanel20.setLocation(540+w, 400);
                if(w==300)
                {
                    jPanel20.setVisible(false);
                }
                }
               
            } catch (InterruptedException ex) {
                Logger.getLogger(PassengerProfile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    };
    ts.start();
}
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      if(feedbackNames.getText().isEmpty())
      {
          JOptionPane.showMessageDialog(null,"Please Enter your name");
      }else{
          if(telphonenumber.getText().isEmpty())
          {
              JOptionPane.showMessageDialog(null,"Please Enter your Telephone Number");
          }
          else{
              if(writemessage.getText().isEmpty())
              {
                  JOptionPane.showMessageDialog(null,"Please You have to write Amessage");
              }
              else{
                  
                   Registry rmi;
                  try {
                      rmi = LocateRegistry.getRegistry("localhost",5000);
                       BorderServiceInterface bi=(BorderServiceInterface)rmi.lookup("Feedbacks");
                       Feedback fb=new Feedback();
                       fb.setName(feedbackNames.getText());
                       fb.setTelephoneNumber(telphonenumber.getText());
                       fb.setFeedback(FeedbackAbout.getSelectedItem().toString()+"&"+writemessage.getText());
                      String res= bi.Feedback(fb);
                    jPanel20.setVisible(true);
                    Feed.setText(res);
                  locationOfFeedback();
                  } catch (RemoteException ex) {
                      Logger.getLogger(PassengerProfile.class.getName()).log(Level.SEVERE, null, ex);
                  } catch (NotBoundException ex) {
                      Logger.getLogger(PassengerProfile.class.getName()).log(Level.SEVERE, null, ex);
                  }
                                          
              }
          }
      }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void uploadphotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadphotoMouseClicked
       
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "JPG & GIF Images", "jpg", "gif");
    chooser.setFileFilter(filter);
    int returnVal = chooser.showOpenDialog(uploadphoto);
    if(returnVal == JFileChooser.APPROVE_OPTION) {
         path= chooser.getSelectedFile().getPath();
          ImageIcon imgIcon=new ImageIcon(path);
          Image image=(imgIcon).getImage().getScaledInstance(UploadedImage.getWidth(), UploadedImage.getHeight(), Image.SCALE_SMOOTH);
          ImageIcon nimgicon=new ImageIcon(image);
          UploadedImage.setIcon(nimgicon);
          
    }
    }//GEN-LAST:event_uploadphotoMouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
passengerTab.setSelectedIndex(4);      
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel23MouseClicked
     passengerTab.setSelectedIndex(0);
     AccSideClose();
    }//GEN-LAST:event_jPanel23MouseClicked

    private void jPanel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel24MouseClicked
       passengerTab.setSelectedIndex(6);
       AccSideClose();
    }//GEN-LAST:event_jPanel24MouseClicked

    private void jPanel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel25MouseClicked
        passengerTab.setSelectedIndex(5);
        AccSideClose();
    }//GEN-LAST:event_jPanel25MouseClicked

    private void jPanel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel26MouseClicked
       passengerTab.setSelectedIndex(1);
       AccSideClose();
    }//GEN-LAST:event_jPanel26MouseClicked

    private void changepOldpNewpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepOldpNewpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changepOldpNewpActionPerformed
     void logout()
     {
         passengerusername.setText("");
passengerpassword.setText("");
pdestination.setText("");
preason.setText("");
        passengerTab.setSelectedIndex(4);
     }
    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
logout();
    }//GEN-LAST:event_jPanel10MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        RecoverPasswd(changepusername.getText(), changepOldpass.getText(), "none", changepOldpNewp.getText());
    }//GEN-LAST:event_jButton6ActionPerformed
void RecoverPasswd(String username,String nationalId,String tel,String newpswd)
{
    Registry rmi;
    try {
        rmi = LocateRegistry.getRegistry("localhost",5000);
        BorderServiceInterface bi=(BorderServiceInterface)rmi.lookup("RecoverPasswd"); 
        String result=bi.RecoverPassword(username,nationalId,tel,newpswd);
        JOptionPane.showMessageDialog(null,result);
    } catch (RemoteException ex) {
        JOptionPane.showMessageDialog(null,ex);
    } catch (NotBoundException ex) {
        Logger.getLogger(PassengerProfile.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    private void ForgetpswdbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ForgetpswdbtnActionPerformed
 RecoverPasswd(cpusername.getText(), cpnid.getText(), cptel.getText(),cpcp.getText());
 //String username, String nationalId, String telephone, String newpasswd
    }//GEN-LAST:event_ForgetpswdbtnActionPerformed

    private void passengerTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passengerTabMouseClicked
 sidebar.setBounds(0,0,0,520);
 AccSideClose();
    }//GEN-LAST:event_passengerTabMouseClicked

    private void jPanel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseClicked
       logout();
    }//GEN-LAST:event_jPanel18MouseClicked

    private void jPanel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseClicked
jPanel17.setBackground(new Color(20,250,200));
jPanel21.setBackground(new Color(20,250,200));
        passengerTab.setSelectedIndex(4);        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel17MouseClicked

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
    passengerTab.setSelectedIndex(6);    
    }//GEN-LAST:event_jPanel9MouseClicked

    private void jPanel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseClicked
Accsidebarnav.setVisible(true);
        AccSideOpen();     

    }//GEN-LAST:event_jPanel16MouseClicked

    private void jPanel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseEntered
   jPanel16.setBackground(new Color(255,180,200));
   jPanel21.setBackground(new Color(255,180,200));
    }//GEN-LAST:event_jPanel16MouseEntered

    private void jPanel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseExited
      jPanel16.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_jPanel16MouseExited

    private void jPanel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseEntered
     jPanel14.setBackground(new Color(255,100,106));
    }//GEN-LAST:event_jPanel14MouseEntered

    private void jPanel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseExited
      jPanel14.setBackground(new Color(51,0,51));
    }//GEN-LAST:event_jPanel14MouseExited

    private void jPanel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel28MouseClicked
        passengerTab.setSelectedIndex(3);
        if(sidebar.isVisible())
        {
 sidebar.setBounds(0,0,0,520);
 AccSideClose();
        }
    }//GEN-LAST:event_jPanel28MouseClicked

    private void EntranceCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntranceCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntranceCodeActionPerformed
void AccSideClose()
{
     Thread tr=new Thread()
    {
       @Override
       public void run()
       {
           for(int i=793;i<=923;i++)
           {
               Accsidebarnav.setBounds(i, 0, 130, 520);
               if(i==923)
                   Accsidebarnav.setVisible(false);
               try {
                   Thread.sleep(5);
               } catch (InterruptedException ex) {
                   Logger.getLogger(PassengerProfile.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
       }
    };tr.start();
}void AccSideOpen()
{
    Thread tr=new Thread()
    {
       @Override
       public void run()
       {
           for(int i=1000;i>=810;i--)
           {
               try {
                   Accsidebarnav.setBounds(i, 0, 130, 520);
                   Thread.sleep(5);
               } catch (InterruptedException ex) {
                   Logger.getLogger(PassengerProfile.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
       }
    };tr.start();
}
    private void passengerTabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passengerTabMouseEntered
 
    }//GEN-LAST:event_passengerTabMouseEntered

    private void jPanel23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel23MouseEntered
       jPanel23.setBackground(new Color(73,70,122));
    }//GEN-LAST:event_jPanel23MouseEntered

    private void jPanel24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel24MouseEntered
        jPanel24.setBackground(new Color(73,70,122));
    }//GEN-LAST:event_jPanel24MouseEntered

    private void jPanel25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel25MouseEntered
      jPanel25.setBackground(new Color(73,70,122));
    }//GEN-LAST:event_jPanel25MouseEntered

    private void jPanel26MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel26MouseEntered
        jPanel26.setBackground(new Color(73,70,122));
    }//GEN-LAST:event_jPanel26MouseEntered

    private void jPanel23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel23MouseExited
      jPanel23.setBackground(new Color(73,57,25));
    }//GEN-LAST:event_jPanel23MouseExited

    private void jPanel24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel24MouseExited
       jPanel24.setBackground(new Color(73,57,25));
    }//GEN-LAST:event_jPanel24MouseExited

    private void jPanel25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel25MouseExited
      jPanel25.setBackground(new Color(73,57,25));
    }//GEN-LAST:event_jPanel25MouseExited

    private void jPanel26MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel26MouseExited
        jPanel26.setBackground(new Color(73,57,25));
    }//GEN-LAST:event_jPanel26MouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      Accsidebarnav.setBounds(923,0, 130,520);
    }//GEN-LAST:event_formWindowOpened

    private void jPanel28MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel28MouseEntered
       jPanel28.setBackground(new Color(150,230,100));
    }//GEN-LAST:event_jPanel28MouseEntered

    private void jPanel29MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel29MouseEntered
      jPanel29.setBackground(new Color(0,153,153));
    }//GEN-LAST:event_jPanel29MouseEntered

    private void jPanel31MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel31MouseEntered
       jPanel31.setBackground(new Color(0,153,153));
    }//GEN-LAST:event_jPanel31MouseEntered

    private void jPanel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel32MouseClicked
passengerTab.setSelectedIndex(4);    
        CloseSidebar();
    }//GEN-LAST:event_jPanel32MouseClicked

    private void jPanel32MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel32MouseEntered
      jPanel32.setBackground(new Color(0,153,153));
    }//GEN-LAST:event_jPanel32MouseEntered

    private void jPanel33MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel33MouseEntered
    jPanel33.setBackground(new Color(0,153,153));
    }//GEN-LAST:event_jPanel33MouseEntered

    private void jPanel29MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel29MouseExited
       jPanel29.setBackground(new Color(5,55,84));
    }//GEN-LAST:event_jPanel29MouseExited

    private void jPanel31MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel31MouseExited
     jPanel31.setBackground(new Color(5,55,84));
    }//GEN-LAST:event_jPanel31MouseExited

    private void jPanel32MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel32MouseExited
    jPanel32.setBackground(new Color(5,55,84));
    }//GEN-LAST:event_jPanel32MouseExited

    private void jPanel33MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel33MouseExited
 jPanel33.setBackground(new Color(5,55,84));
    }//GEN-LAST:event_jPanel33MouseExited
void  CloseSidebar()
{Sidebarnavigation.setVisible(true);
      Thread th=new Thread(){
        @Override
        public void run()
        {
          for(int i=210;i>0;i--)
          {
              try {
                  Sidebarnavigation.setBounds(15,0,i,520);
                  Thread.sleep(3);
              } catch (InterruptedException ex) {
                  Logger.getLogger(PassengerProfile.class.getName()).log(Level.SEVERE, null, ex);
              }
          }
        }
    };
    th.start();
}
    private void jLabel67MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel67MouseClicked
    CloseSidebar();
    }//GEN-LAST:event_jLabel67MouseClicked

    private void jPanel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel29MouseClicked
     passengerTab.setSelectedIndex(3);
       CloseSidebar();
    }//GEN-LAST:event_jPanel29MouseClicked

    private void jPanel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel31MouseClicked
Accsidebarnav.setVisible(true);
        AccSideOpen();     
        CloseSidebar();
    }//GEN-LAST:event_jPanel31MouseClicked

    private void jPanel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel33MouseClicked
   logout();   
        CloseSidebar();
    }//GEN-LAST:event_jPanel33MouseClicked

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
            java.util.logging.Logger.getLogger(PassengerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PassengerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PassengerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PassengerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
     PassengerProfile ps=new PassengerProfile();
     ps.setVisible(true);
     ps.setTitle("Border Management System");
     ps.popupmessagepane.setVisible(false);
     ps.loginpopupnotification.setVisible(false);
     ps.jPanel15.setVisible(false);
     ps.jPanel20.setVisible(false);
     ps.sidebar.setVisible(false);
     ps.setResizable(false);
     ps.Accsidebarnav.setVisible(false);
     ps.Accsidebarnav.setBounds(923,0,0,520);
     ps.Sidebarnavigation.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Accsidebarnav;
    private javax.swing.JTextField EntranceCode;
    private javax.swing.JLabel Feed;
    private javax.swing.JComboBox<String> FeedbackAbout;
    private javax.swing.JButton Forgetpswdbtn;
    private javax.swing.JLabel Identity;
    private javax.swing.JPanel Sidebarnavigation;
    private javax.swing.JLabel UploadedImage;
    private javax.swing.JPasswordField changepOldpNewp;
    private javax.swing.JPasswordField changepOldpass;
    private javax.swing.JTextField changepusername;
    private javax.swing.JPasswordField cpcp;
    private javax.swing.JFormattedTextField cpnid;
    private javax.swing.JPasswordField cprcp;
    private javax.swing.JTextField cptel;
    private javax.swing.JTextField cpusername;
    private javax.swing.JComboBox<String> entranceExit;
    private javax.swing.JTextField feedbackNames;
    private javax.swing.JTextField fname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator32;
    private javax.swing.JSeparator jSeparator33;
    private javax.swing.JSeparator jSeparator34;
    private javax.swing.JSeparator jSeparator37;
    private javax.swing.JSeparator jSeparator38;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JTextField lname;
    private javax.swing.JLabel loInpopummessage;
    private javax.swing.JPanel loginpopupnotification;
    private javax.swing.JTextField ncountry;
    private javax.swing.JFormattedTextField nid;
    private javax.swing.JTabbedPane passengerTab;
    private javax.swing.JPasswordField passengerpassword;
    private javax.swing.JTextField passengerusername;
    private javax.swing.JPasswordField password;
    private javax.swing.JComboBox<String> pcode;
    private javax.swing.JTextField pdestination;
    private javax.swing.JFormattedTextField pnumber;
    private javax.swing.JLabel popupmessage;
    private javax.swing.JPanel popupmessagepane;
    private javax.swing.JTextField preason;
    private javax.swing.JPasswordField retypepasswd;
    private javax.swing.JPanel sidebar;
    private javax.swing.JFormattedTextField telphonenumber;
    private javax.swing.JLabel uploadphoto;
    private javax.swing.JTextField username;
    private javax.swing.JTextArea writemessage;
    // End of variables declaration//GEN-END:variables
}
