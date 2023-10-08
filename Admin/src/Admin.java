/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import BorderServices.BorderServiceInterface;
import Tables.BorderTable;
import Tables.EmployeeExploreBorder;
import Tables.EmployeeTable;
import Tables.Feedback;
import Tables.Passengerdb;
import Tables.penalities;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.hibernate.jpa.criteria.expression.function.LocateFunction;

/**
 *
 * @author Eng Michael
 */
public class Admin extends javax.swing.JFrame {
    public Admin() {
        initComponents();
    }
    int ValidateborderInuse=0;
    String bordername,borderIdent;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel24 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        SidebarNAvigation = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        SuperviseBA = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        EmpNav = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        Passengernav = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        Feedbacknav = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        Admintab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jLabel23 = new javax.swing.JLabel();
        Admindisplay = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        AdminUsername = new javax.swing.JTextField();
        AdminPass = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        Passenger = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        Employee = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        Borders = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        EmployeeNames = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        empncountry = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        empgender = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        emptel = new javax.swing.JFormattedTextField();
        empnid = new javax.swing.JFormattedTextField();
        pcode = new javax.swing.JComboBox<>();
        bcode = new javax.swing.JFormattedTextField();
        jLabel69 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        Empnamess = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        EmployeeTelNumber = new javax.swing.JFormattedTextField();
        employeenid = new javax.swing.JFormattedTextField();
        pcode1 = new javax.swing.JComboBox<>();
        BorderIds = new javax.swing.JFormattedTextField();
        jPanel20 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        SearchEngine = new javax.swing.JLabel();
        SearchEmployee = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        superviseEmployeetab = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        PenalitiesDate = new javax.swing.JTable();
        jButton11 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jSeparator25 = new javax.swing.JSeparator();
        borderLocation = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jSeparator26 = new javax.swing.JSeparator();
        borderId = new javax.swing.JFormattedTextField();
        jPanel28 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        bordertab = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        borderViewtab = new javax.swing.JTable();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        BOrdercIdentity = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        FeedbackTab = new javax.swing.JTable();
        jPanel25 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        Searchpassenger = new javax.swing.JTextField();
        jPanel32 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        ncountry = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        jSeparator27 = new javax.swing.JSeparator();
        jSeparator28 = new javax.swing.JSeparator();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel18 = new javax.swing.JLabel();
        retypepasswd = new javax.swing.JPasswordField();
        jSeparator29 = new javax.swing.JSeparator();
        jSeparator30 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator31 = new javax.swing.JSeparator();
        jSeparator32 = new javax.swing.JSeparator();
        jSeparator33 = new javax.swing.JSeparator();
        jSeparator34 = new javax.swing.JSeparator();
        pcode3 = new javax.swing.JComboBox<>();
        pnumber = new javax.swing.JFormattedTextField();
        nid = new javax.swing.JFormattedTextField();
        uploadphoto = new javax.swing.JLabel();
        jSeparator19 = new javax.swing.JSeparator();
        fname = new javax.swing.JTextField();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        jSeparator22 = new javax.swing.JSeparator();
        jSeparator23 = new javax.swing.JSeparator();
        jSeparator24 = new javax.swing.JSeparator();
        UploadedImage = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        jLabel58 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        passengertab = new javax.swing.JTable();
        jLabel70 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                WindowEvent(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel24.setOpaque(false);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/Account2.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Admin");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(0, 0, 0))
        );

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 59, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 404, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 130, 520));

        SidebarNAvigation.setBackground(new java.awt.Color(121, 71, 29));
        SidebarNAvigation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SidebarNAvigationMouseClicked(evt);
            }
        });

        jPanel29.setBackground(new java.awt.Color(121, 71, 29));
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

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("LogIn");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        SuperviseBA.setBackground(new java.awt.Color(121, 71, 29));
        SuperviseBA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SuperviseBAMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SuperviseBAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SuperviseBAMouseExited(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Supervise Border Activity");

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        javax.swing.GroupLayout SuperviseBALayout = new javax.swing.GroupLayout(SuperviseBA);
        SuperviseBA.setLayout(SuperviseBALayout);
        SuperviseBALayout.setHorizontalGroup(
            SuperviseBALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SuperviseBALayout.createSequentialGroup()
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SuperviseBALayout.setVerticalGroup(
            SuperviseBALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SuperviseBALayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(SuperviseBALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel40))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EmpNav.setBackground(new java.awt.Color(121, 71, 29));
        EmpNav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmpNavMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EmpNavMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EmpNavMouseExited(evt);
            }
        });

        jLabel59.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Employee");

        javax.swing.GroupLayout EmpNavLayout = new javax.swing.GroupLayout(EmpNav);
        EmpNav.setLayout(EmpNavLayout);
        EmpNavLayout.setHorizontalGroup(
            EmpNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmpNavLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel59)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EmpNavLayout.setVerticalGroup(
            EmpNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmpNavLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/logout.png"))); // NOI18N

        Passengernav.setBackground(new java.awt.Color(121, 71, 29));
        Passengernav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PassengernavMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PassengernavMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PassengernavMouseExited(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Passenger");

        javax.swing.GroupLayout PassengernavLayout = new javax.swing.GroupLayout(Passengernav);
        Passengernav.setLayout(PassengernavLayout);
        PassengernavLayout.setHorizontalGroup(
            PassengernavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PassengernavLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel46)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PassengernavLayout.setVerticalGroup(
            PassengernavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PassengernavLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        Feedbacknav.setBackground(new java.awt.Color(121, 71, 29));
        Feedbacknav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FeedbacknavMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FeedbacknavMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FeedbacknavMouseExited(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Feedback");

        javax.swing.GroupLayout FeedbacknavLayout = new javax.swing.GroupLayout(Feedbacknav);
        Feedbacknav.setLayout(FeedbacknavLayout);
        FeedbacknavLayout.setHorizontalGroup(
            FeedbacknavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FeedbacknavLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel30)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FeedbacknavLayout.setVerticalGroup(
            FeedbacknavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FeedbacknavLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("X");
        jLabel65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel65MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SidebarNAvigationLayout = new javax.swing.GroupLayout(SidebarNAvigation);
        SidebarNAvigation.setLayout(SidebarNAvigationLayout);
        SidebarNAvigationLayout.setHorizontalGroup(
            SidebarNAvigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(EmpNav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Passengernav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Feedbacknav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(SidebarNAvigationLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(SidebarNAvigationLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(SidebarNAvigationLayout.createSequentialGroup()
                .addComponent(SuperviseBA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        SidebarNAvigationLayout.setVerticalGroup(
            SidebarNAvigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidebarNAvigationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SuperviseBA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmpNav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Passengernav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Feedbacknav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(SidebarNAvigation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 520));

        Admintab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdmintabMouseClicked(evt);
            }
        });

        kGradientPanel3.setkStartColor(new java.awt.Color(153, 255, 255));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/Michael jack_transcpr.png"))); // NOI18N

        Admindisplay.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        Admindisplay.setForeground(new java.awt.Color(255, 255, 255));
        Admindisplay.setText(" System Administrator");

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel3Layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel3Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(Admindisplay)))
                .addContainerGap(379, Short.MAX_VALUE))
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(Admindisplay)
                .addGap(51, 51, 51)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 82, Short.MAX_VALUE)
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Admintab.addTab("Home", jPanel1);

        jPanel7.setBackground(new java.awt.Color(204, 141, 90));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Password");

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));

        AdminUsername.setBackground(new java.awt.Color(204, 141, 90));
        AdminUsername.setBorder(null);
        AdminUsername.setOpaque(false);

        AdminPass.setBackground(new java.awt.Color(204, 141, 90));
        AdminPass.setBorder(null);
        AdminPass.setOpaque(false);

        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AdminUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdminPass, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addComponent(jLabel3))
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(26, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(AdminUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel8)
                .addGap(27, 27, 27)
                .addComponent(AdminPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(jLabel3)
                    .addGap(243, 243, 243)
                    .addComponent(jButton3)
                    .addContainerGap(28, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(343, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        Admintab.addTab("LogIn", jPanel2);

        kGradientPanel1.setkGradientFocus(1600);
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 102, 0));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Passenger.setOpaque(false);
        Passenger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PassengerMouseClicked(evt);
            }
        });

        jLabel66.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel66.setText("Penalities");
        jLabel66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel66MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel66)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel31MouseClicked(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel63.setText("Passenger Profile Change");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel63)
                .addGap(36, 36, 36))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel63)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel67.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("Welcome To Passenger Profile Control");

        javax.swing.GroupLayout PassengerLayout = new javax.swing.GroupLayout(Passenger);
        Passenger.setLayout(PassengerLayout);
        PassengerLayout.setHorizontalGroup(
            PassengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PassengerLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(PassengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PassengerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        PassengerLayout.setVerticalGroup(
            PassengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PassengerLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
        );

        kGradientPanel1.add(Passenger, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 450, 450));

        Employee.setOpaque(false);

        jPanel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel42MouseClicked(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel64.setText("Supervise Employees");

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel64)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel62.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel62.setText("Print Employees");

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel62)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel68.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("Empoyee Management");

        jPanel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel41MouseClicked(evt);
            }
        });

        jLabel60.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel60.setText("Add New Employee");

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel60)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout EmployeeLayout = new javax.swing.GroupLayout(Employee);
        Employee.setLayout(EmployeeLayout);
        EmployeeLayout.setHorizontalGroup(
            EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeeLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(EmployeeLayout.createSequentialGroup()
                        .addComponent(jLabel68)
                        .addGap(99, 99, 99)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EmployeeLayout.createSequentialGroup()
                .addGap(0, 39, Short.MAX_VALUE)
                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(EmployeeLayout.createSequentialGroup()
                .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        EmployeeLayout.setVerticalGroup(
            EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeeLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel68)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );

        kGradientPanel1.add(Employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, -10, 450, 440));

        Borders.setOpaque(false);

        jPanel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel37MouseClicked(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel61.setText("Add/Remove Border");

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel61)
                .addGap(17, 17, 17))
        );

        jPanel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel38MouseClicked(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel27.setText("Close/Open Border");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel27)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BordersLayout = new javax.swing.GroupLayout(Borders);
        Borders.setLayout(BordersLayout);
        BordersLayout.setHorizontalGroup(
            BordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BordersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BordersLayout.setVerticalGroup(
            BordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BordersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel1.add(Borders, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 21, -1, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 995, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Admintab.addTab("ChangePassword", jPanel3);

        jPanel14.setBackground(new java.awt.Color(204, 141, 90));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Native Country");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("National Id");

        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator10.setForeground(new java.awt.Color(255, 255, 255));

        EmployeeNames.setBackground(new java.awt.Color(204, 141, 90));
        EmployeeNames.setBorder(null);
        EmployeeNames.setOpaque(false);

        jSeparator11.setForeground(new java.awt.Color(255, 255, 255));

        jButton4.setText("Save");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Names");

        empncountry.setBackground(new java.awt.Color(204, 141, 90));
        empncountry.setBorder(null);
        empncountry.setOpaque(false);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Telephone Number");

        jSeparator12.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator13.setForeground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Gender");

        empgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Border Id");

        emptel.setBackground(new java.awt.Color(204, 141, 90));
        emptel.setBorder(null);
        try {
            emptel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("### ### ###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        emptel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emptelActionPerformed(evt);
            }
        });

        empnid.setBackground(new java.awt.Color(204, 141, 90));
        empnid.setBorder(null);
        try {
            empnid.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#### #### #### ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        pcode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+243", "+250", "+254", "+255", "+256", "+257", " " }));
        pcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcodeActionPerformed(evt);
            }
        });

        bcode.setBackground(new java.awt.Color(204, 141, 90));
        bcode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 141, 90)));
        try {
            bcode.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("EAC ##### UU")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        bcode.setToolTipText("");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bcode, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(jSeparator13))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator9)
                                .addComponent(EmployeeNames)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(empncountry)
                                .addComponent(empgender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                    .addComponent(pcode, 0, 79, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(emptel, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSeparator11)
                                .addComponent(empnid)
                                .addComponent(jSeparator12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28))))
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel14Layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(26, Short.MAX_VALUE)))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addComponent(EmployeeNames, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empncountry, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empnid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(emptel)
                    .addComponent(pcode, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empgender, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE))
                    .addComponent(bcode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel14Layout.createSequentialGroup()
                    .addGap(82, 82, 82)
                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(370, Short.MAX_VALUE)))
        );

        jLabel69.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("Record New Employee");

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(328, 328, 328))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Admintab.addTab("RecordNewEmp||", jPanel5);

        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel18.setBackground(new java.awt.Color(105, 146, 99));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee");

        jButton18.setText("Display");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton18)
                .addGap(0, 72, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 0, 400, 70));

        jPanel17.setBackground(new java.awt.Color(240, 193, 122));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Supervise");

        jPanel19.setBackground(new java.awt.Color(204, 141, 90));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("National Id");

        jSeparator15.setForeground(new java.awt.Color(255, 255, 255));

        Empnamess.setBackground(new java.awt.Color(204, 141, 90));
        Empnamess.setBorder(null);
        Empnamess.setOpaque(false);

        jSeparator16.setForeground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Names");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Telephone Number");

        jSeparator17.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator18.setForeground(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Border Id");

        EmployeeTelNumber.setBackground(new java.awt.Color(204, 141, 90));
        EmployeeTelNumber.setBorder(null);
        try {
            EmployeeTelNumber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("### ### ###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        EmployeeTelNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeTelNumberActionPerformed(evt);
            }
        });

        employeenid.setBackground(new java.awt.Color(204, 141, 90));
        employeenid.setBorder(null);
        try {
            employeenid.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#### #### #### ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        pcode1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+243", "+250", "+254", "+255", "+256", "+257", " " }));
        pcode1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcode1ActionPerformed(evt);
            }
        });

        BorderIds.setBackground(new java.awt.Color(204, 141, 90));
        BorderIds.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 141, 90)));
        try {
            BorderIds.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("EAC ##### UU")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        BorderIds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorderIdsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel15)
                        .addComponent(jLabel16)
                        .addGroup(jPanel19Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Empnamess)
                            .addComponent(jSeparator16)
                            .addComponent(employeenid)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                                .addComponent(pcode1, 0, 79, Short.MAX_VALUE)
                                .addGap(3, 3, 3)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(EmployeeTelNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                    .addComponent(jSeparator17))))
                        .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BorderIds, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(0, 0, 0)
                .addComponent(Empnamess, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(employeenid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EmployeeTelNumber)
                    .addComponent(pcode1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BorderIds, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Chase");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setText("Shift Emp To Other Border*");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        SearchEngine.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        SearchEngine.setText("Search Emp:");
        SearchEngine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchEngineMouseClicked(evt);
            }
        });

        SearchEmployee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SearchEmployeeKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addComponent(SearchEngine, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SearchEmployee))
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SearchEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SearchEngine)
                .addGap(23, 23, 23))
        );

        superviseEmployeetab.setBackground(new java.awt.Color(57, 37, 117));
        superviseEmployeetab.setForeground(new java.awt.Color(255, 255, 255));
        superviseEmployeetab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee Id", "Employee Names", "Gender", "Border Name", "TelephoneNumber", "Border Id", "BorderName"
            }
        ));
        superviseEmployeetab.setGridColor(new java.awt.Color(229, 176, 166));
        superviseEmployeetab.setOpaque(false);
        superviseEmployeetab.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                superviseEmployeetabAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        superviseEmployeetab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                superviseEmployeetabMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(superviseEmployeetab);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56))
        );

        jPanel16.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Admintab.addTab("Supervise Employee||", jPanel8);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 995, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 532, Short.MAX_VALUE)
        );

        Admintab.addTab("ChatToEmp", jPanel9);

        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel22.setBackground(java.awt.Color.lightGray);
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PenalitiesDate.setBackground(new java.awt.Color(57, 37, 117));
        PenalitiesDate.setForeground(new java.awt.Color(255, 255, 255));
        PenalitiesDate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Passenger Id", "Passenger Names", "Gender", "Date Of Penalities", "Amount of Penalities"
            }
        ));
        PenalitiesDate.setGridColor(new java.awt.Color(229, 176, 166));
        PenalitiesDate.setOpaque(false);
        PenalitiesDate.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                PenalitiesDateAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane3.setViewportView(PenalitiesDate);

        jPanel22.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 950, 410));

        jButton11.setText("Remove Penaly");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, -1, -1));

        jButton10.setText("Print Payed Amount");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, -1, -1));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 102, 102));
        jLabel21.setText("Penalities");
        jPanel22.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, 30));

        jPanel10.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 490));

        Admintab.addTab("PasssengerPenalyties", jPanel10);

        jPanel13.setBackground(new java.awt.Color(0, 51, 51));

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Border Management");

        jButton13.setText("Add **");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("Remove  **");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("Update **");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("Print ");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton7.setText("Download File");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jButton13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton14)
                    .addComponent(jButton15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton16)
                    .addComponent(jButton7)))
        );

        jPanel4.setBackground(new java.awt.Color(51, 51, 0));

        jSeparator25.setForeground(new java.awt.Color(255, 255, 255));

        borderLocation.setBackground(new java.awt.Color(51, 51, 0));
        borderLocation.setForeground(new java.awt.Color(255, 255, 255));
        borderLocation.setBorder(null);
        borderLocation.setOpaque(false);
        borderLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borderLocationActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Border Location Name");

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Border Id");

        jSeparator26.setForeground(new java.awt.Color(255, 255, 255));

        borderId.setBackground(new java.awt.Color(51, 51, 0));
        borderId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0)));
        borderId.setForeground(new java.awt.Color(255, 255, 255));
        try {
            borderId.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("EAC ##### UU")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        borderId.setToolTipText("");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel33)
                        .addGap(0, 127, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(21, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator25, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                            .addComponent(borderId)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator26, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(borderLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addComponent(jLabel34)
                    .addContainerGap(198, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(borderId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator25, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(borderLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator26, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel34)
                    .addContainerGap(209, Short.MAX_VALUE)))
        );

        bordertab.setBackground(new java.awt.Color(57, 37, 117));
        bordertab.setForeground(new java.awt.Color(255, 255, 255));
        bordertab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Border Id", "Border Location Name", "Open Or Close"
            }
        ));
        bordertab.setGridColor(new java.awt.Color(229, 176, 166));
        bordertab.setOpaque(false);
        bordertab.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                bordertabAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        bordertab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bordertabMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(bordertab);

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel32)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(293, 293, 293))
        );

        Admintab.addTab("Border||", jPanel13);

        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel35.setText("Close All Border");
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
        });
        jPanel15.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel36.setText("Border Id");
        jPanel15.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        borderViewtab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Border Id", "Border Name", "Open/close"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        borderViewtab.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                borderViewtabAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        borderViewtab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borderViewtabMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(borderViewtab);

        jPanel15.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 600, 460));

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel37.setText("Close Aborder  **");
        jLabel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel37MouseClicked(evt);
            }
        });
        jPanel15.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 180, 40));

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel38.setText("Open All Border");
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel38MouseClicked(evt);
            }
        });
        jPanel15.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 187, 150, 30));

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel39.setText("Open Aborder    **");
        jLabel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jLabel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel39MouseClicked(evt);
            }
        });
        jPanel15.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 180, 40));

        BOrdercIdentity.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BOrdercIdentity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel15.add(BOrdercIdentity, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 290, 30));

        Admintab.addTab("BorderOperation**", jPanel15);

        FeedbackTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Contact", "PAssenger Names", "FeedBackAbout", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        FeedbackTab.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                FeedbackTabAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(FeedbackTab);
        if (FeedbackTab.getColumnModel().getColumnCount() > 0) {
            FeedbackTab.getColumnModel().getColumn(0).setMinWidth(120);
            FeedbackTab.getColumnModel().getColumn(0).setPreferredWidth(180);
            FeedbackTab.getColumnModel().getColumn(0).setMaxWidth(180);
        }

        jPanel25.setBackground(new java.awt.Color(0, 102, 102));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Feedback From Passenger");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(jLabel31)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
        );

        jPanel26.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 83, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        Admintab.addTab("PassengerFeedback||", jPanel12);

        jPanel11.setBackground(new java.awt.Color(197, 135, 135));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton9.setText("Searching");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 130, 30));
        jPanel11.add(Searchpassenger, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 370, 30));

        jPanel32.setBackground(new java.awt.Color(0, 102, 102));
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel49.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Gender");
        jPanel32.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        jLabel50.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("National Id");
        jPanel32.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        jLabel51.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Native Country");
        jPanel32.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));

        jLabel52.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Upload Profile");
        jPanel32.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        jLabel53.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Last Name");
        jPanel32.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel54.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Telephone Number");
        jPanel32.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));

        jLabel55.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("First Name");
        jPanel32.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        lname.setBackground(new java.awt.Color(0, 0, 0));
        lname.setForeground(new java.awt.Color(255, 255, 255));
        lname.setBorder(null);
        lname.setOpaque(false);
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        jPanel32.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 150, 20));
        jPanel32.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 150, 0));

        ncountry.setBackground(new java.awt.Color(0, 0, 0));
        ncountry.setForeground(new java.awt.Color(255, 255, 255));
        ncountry.setBorder(null);
        ncountry.setOpaque(false);
        jPanel32.add(ncountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 200, 20));

        username.setBackground(new java.awt.Color(0, 0, 0));
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setBorder(null);
        username.setOpaque(false);
        jPanel32.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 200, 20));

        jSeparator27.setForeground(new java.awt.Color(255, 255, 255));
        jPanel32.add(jSeparator27, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 212, 220, 0));

        jSeparator28.setForeground(new java.awt.Color(255, 255, 255));
        jPanel32.add(jSeparator28, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 200, -1));

        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("User name");
        jPanel32.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, -1, -1));

        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Password");
        jPanel32.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, -1, -1));

        password.setBackground(new java.awt.Color(0, 0, 0));
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setBorder(null);
        password.setOpaque(false);
        jPanel32.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 200, 20));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Retype Paswd");
        jPanel32.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, -1));

        retypepasswd.setBackground(new java.awt.Color(0, 0, 0));
        retypepasswd.setForeground(new java.awt.Color(255, 255, 255));
        retypepasswd.setBorder(null);
        retypepasswd.setOpaque(false);
        jPanel32.add(retypepasswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 200, 20));

        jSeparator29.setForeground(new java.awt.Color(255, 255, 255));
        jPanel32.add(jSeparator29, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 292, 230, 0));

        jSeparator30.setForeground(new java.awt.Color(255, 255, 255));
        jPanel32.add(jSeparator30, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 180, 0));

        jSeparator14.setForeground(new java.awt.Color(255, 255, 255));
        jPanel32.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 200, 30));

        jSeparator31.setForeground(new java.awt.Color(255, 255, 255));
        jPanel32.add(jSeparator31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 130, 10));

        jSeparator32.setForeground(new java.awt.Color(255, 255, 255));
        jPanel32.add(jSeparator32, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 118, 200, -1));

        jSeparator33.setForeground(new java.awt.Color(255, 255, 255));
        jPanel32.add(jSeparator33, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, 110, 0));

        jSeparator34.setForeground(new java.awt.Color(255, 255, 255));
        jPanel32.add(jSeparator34, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 200, 10));

        pcode3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+243", "+250", "+254", "+255", "+256", "+257", " " }));
        jPanel32.add(pcode3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, -1));
        jPanel32.add(pnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 100, -1));

        nid.setBackground(new java.awt.Color(0, 0, 0));
        nid.setBorder(null);
        nid.setForeground(new java.awt.Color(255, 255, 255));
        try {
            nid.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#### #### #### ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        nid.setOpaque(false);
        jPanel32.add(nid, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 200, 30));

        uploadphoto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        uploadphoto.setForeground(new java.awt.Color(255, 255, 255));
        uploadphoto.setText("Upload");
        uploadphoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        uploadphoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uploadphotoMouseClicked(evt);
            }
        });
        jPanel32.add(uploadphoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, -1, -1));

        jSeparator19.setForeground(new java.awt.Color(255, 255, 255));
        jPanel32.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 150, 10));

        fname.setBackground(new java.awt.Color(0, 0, 0));
        fname.setForeground(new java.awt.Color(255, 255, 255));
        fname.setBorder(null);
        fname.setOpaque(false);
        jPanel32.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 130, 20));
        jPanel32.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, -1, -1));
        jPanel32.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, -1, -1));
        jPanel32.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 370, -1, -1));

        jSeparator23.setForeground(new java.awt.Color(255, 255, 255));
        jPanel32.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, 100, 0));

        jSeparator24.setForeground(new java.awt.Color(255, 255, 255));
        jPanel32.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 200, 10));

        UploadedImage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel32.add(UploadedImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 240, 300));

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel32.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 160, -1));

        jLabel58.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Upload Your Image");
        jPanel32.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, 20));

        jPanel11.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 0, 530, 490));

        jButton17.setText("Update Information");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 500, 40));

        passengertab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "National Id", "Names", "Native Country", "TelephoneNumber"
            }
        ));
        jScrollPane6.setViewportView(passengertab);

        jPanel11.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 510, 310));

        jLabel70.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("Passenger  Profile Change");
        jPanel11.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 280, 50));

        jButton2.setText("DownloadProfile");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));

        Admintab.addTab("PassengerProfileChange||", jPanel11);

        getContentPane().add(Admintab, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, -40, 1000, 560));

        jPanel23.setBackground(new java.awt.Color(51, 5, 24));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("N");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("B");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("O");

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("R");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("D");

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("A");

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("A");

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("E");

        jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("G");

        jLabel45.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("ER");

        jLabel47.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("M");

        jLabel48.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("ent");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42)
                            .addComponent(jLabel25)
                            .addComponent(jLabel14)
                            .addComponent(jLabel7)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel44)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel45)))
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(jLabel47)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel48))
                            .addComponent(jLabel43))
                        .addGap(0, 15, Short.MAX_VALUE))))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void WindowEvent(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_WindowEvent
          
    }//GEN-LAST:event_WindowEvent

    private void pcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcodeActionPerformed

    }//GEN-LAST:event_pcodeActionPerformed

    private void emptelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emptelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emptelActionPerformed

    private void pcode1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcode1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pcode1ActionPerformed

    private void EmployeeTelNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeTelNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmployeeTelNumberActionPerformed
     
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        try {
            Registry registry=LocateRegistry.getRegistry(5000);
            BorderServiceInterface bi=(BorderServiceInterface)registry.lookup("deleteBorder");
           BorderTable tb=new BorderTable();
           tb.setBorderId(borderId.getText());
           tb.setBorderLocationName(borderLocation.getText());
           String result=bi.RemoveBorder(tb);
           JOptionPane.showMessageDialog(null, result);
            displayBorderTables(1);
        } catch (RemoteException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jButton14ActionPerformed
void OpenCloseOperation(String Borderid,String bordername,int bd)
{
    try {
            Registry registry=LocateRegistry.getRegistry(5000);
            BorderServiceInterface bi=(BorderServiceInterface)registry.lookup("updateSingleborder");
           BorderTable tb=new BorderTable();
           tb.setBorderId(Borderid);
           tb.setBorderLocationName(bordername);
           tb.setOpenClosed(bd);
           String result=bi.UpdateBorder(tb);
           JOptionPane.showMessageDialog(null, result);
           
        } catch (RemoteException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } 
}
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
    Registry client;
        try {
            client = LocateRegistry.getRegistry("localhost",5000);
             BorderServiceInterface  bsi=(BorderServiceInterface) client.lookup("updateSingleborder");
             BorderTable bt=new BorderTable();
             bt.setBorderId(borderId.getText());
             bt.setBorderLocationName(borderLocation.getText());
             String result=bsi.UpdateBorder(bt);
             JOptionPane.showMessageDialog(null, result);
              displayBorderTables(1);
        } catch (RemoteException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } 
           
        //borderId.getText(),borderLocation.getText(),0);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        try {
            Registry client=LocateRegistry.getRegistry("localhost",5000);
            BorderServiceInterface  bsi=(BorderServiceInterface) client.lookup("insertborder");
            BorderTable bt=new BorderTable();
            bt.setBorderId(borderId.getText());
            bt.setBorderLocationName(borderLocation.getText());
            bt.setOpenClosed(0);
           String result= bsi.InsertNewBorder(bt);
            JOptionPane.showMessageDialog(null, result);
             displayBorderTables(1);
        } catch (RemoteException ex) {
           JOptionPane.showMessageDialog(null, ex);
        } catch (NotBoundException ex) {
             JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed
 String path;
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

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
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
                                    { try {
                                           Registry rmi=LocateRegistry.getRegistry("localhost",5000);
                                           BorderServiceInterface bi=(BorderServiceInterface)rmi.lookup("UpdatePassenger");
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
                                           String resurt=bi.UpdatePassengerProfile(ps);
                                           JOptionPane.showMessageDialog(null, resurt);
                                       } catch (RemoteException | NotBoundException ex) {
                                           JOptionPane.showMessageDialog(null,ex);
                                       }   catch (IOException ex) { 
                                             JOptionPane.showMessageDialog(null,ex);
                                           } 

                                    }else{
                                        JOptionPane.showMessageDialog(null,"Pls your password has to match to a tretyped password");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void borderLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borderLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_borderLocationActionPerformed

    private void bordertabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bordertabMouseClicked
       DefaultTableModel model=(DefaultTableModel)bordertab.getModel();
       int index=bordertab.getSelectedRow();
       borderId.setText(model.getValueAt(index,0).toString());
       borderLocation.setText(model.getValueAt(index, 1).toString());          
    }//GEN-LAST:event_bordertabMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(EmployeeNames.getText().isEmpty()|| empncountry.getText().isEmpty()||empnid.getText().isEmpty()||emptel.getText().isEmpty()||bcode.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Fill All Empty Text field");
        }
        else{
            try {
                Registry rmi=LocateRegistry.getRegistry(5000);
                BorderServiceInterface bi=(BorderServiceInterface)rmi.lookup("AddNewEmployee");
                BorderTable bd=new BorderTable();
                bd.setBorderId(bcode.getText());
                EmployeeTable emp=new EmployeeTable();
                emp.setEmployeeNationalIdentity(empnid.getText());
                emp.setEmployeeNames(EmployeeNames.getText());
                emp.setEmpNativeCountry(empncountry.getText());
                emp.setTelephoneNumber(emptel.getText());
                emp.setEmpBorderId(bd);
                emp.setEmployeeGender(empgender.getSelectedItem().toString());
                emp.setEmpTelephoneCountryCode(pcode.getSelectedItem().toString());
                emp.setActiveOrDeactive(0);
                emp.setEmployeeuserName("border");
                emp.setEmployeePasswd("border");
                emp.setDateAtWork("New Emp");
                emp.setPresenceValidation("0");
               String retur= bi.AddNewEmployee(emp);
                JOptionPane.showMessageDialog(null, retur);
            } catch (RemoteException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NotBoundException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
try {
            Registry rmi=LocateRegistry.getRegistry(5000);
            BorderServiceInterface bi=(BorderServiceInterface)rmi.lookup("Displayborder");
              List<BorderTable>ls=bi.DisplayborderTable();
              DefaultTableModel model=(DefaultTableModel)bordertab.getModel();
           for(BorderTable i:ls)
           {
               String[] data={i.getBorderId(),i.getBorderLocationName()};
               model.addRow(data);
           }
           
        } catch (RemoteException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton16ActionPerformed
void EmmployeeRecord()
{
     try {
            Registry rmi=LocateRegistry.getRegistry(5000);
            BorderServiceInterface bi=(BorderServiceInterface)rmi.lookup("DisplayAllEmployee");
              List<EmployeeTable>ls=bi.DisplayEmployeeTable();
              DefaultTableModel model=(DefaultTableModel)superviseEmployeetab.getModel();
              model.setRowCount(0);
           for(EmployeeTable i:ls)
           {
               String[] data={i.getEmployeeNationalIdentity(),i.getEmployeeNames(),i.getEmployeeGender(),i.getEmpBorderId().getBorderLocationName(),i.getEmpTelephoneCountryCode()+" "+i.getTelephoneNumber(),i.getEmpBorderId().getBorderId(),i.getEmpBorderId().getBorderLocationName()};
               model.addRow(data);
           }
           
        } catch (RemoteException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
  EmmployeeRecord();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void superviseEmployeetabAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_superviseEmployeetabAncestorAdded
   EmmployeeRecord();
    }//GEN-LAST:event_superviseEmployeetabAncestorAdded

    private void superviseEmployeetabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_superviseEmployeetabMouseClicked
 DefaultTableModel model=(DefaultTableModel)superviseEmployeetab.getModel();
 int index=superviseEmployeetab.getSelectedRow();
 Empnamess.setText(model.getValueAt(index, 1).toString());
 String[] splittel=model.getValueAt(index, 4).toString().split(" ");
 employeenid.setText(model.getValueAt(index, 0).toString());
 EmployeeTelNumber.setText(splittel[1]+splittel[2]+splittel[3]);
 pcode1.setSelectedItem(splittel[0]);
 BorderIds.setText(model.getValueAt(index, 6).toString());
    }//GEN-LAST:event_superviseEmployeetabMouseClicked

    private void BorderIdsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorderIdsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BorderIdsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try {
            Registry rmi=LocateRegistry.getRegistry(5000);
            BorderServiceInterface bi=(BorderServiceInterface)rmi.lookup("ChaseEmployee");            
           String result=bi.ChaseEmployee(employeenid.getText());
           JOptionPane.showMessageDialog(null, result);
             EmmployeeRecord();
        } catch (RemoteException ex) {
           JOptionPane.showMessageDialog(null, ex);
        } catch (NotBoundException ex) {
              JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SearchEmployeeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchEmployeeKeyPressed
       
    }//GEN-LAST:event_SearchEmployeeKeyPressed

    private void SearchEngineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchEngineMouseClicked
      try {int m=0;
            Registry rmi=LocateRegistry.getRegistry(5000);
            DefaultTableModel model=(DefaultTableModel)superviseEmployeetab.getModel();
           model.setRowCount(0);
            BorderServiceInterface bi=(BorderServiceInterface)rmi.lookup("SearchEmployee");            
           List<EmployeeTable> result=bi.SearchEmployee(SearchEmployee.getText());
           for(EmployeeTable i:result)
           {
              String[] data={i.getEmployeeNationalIdentity(),i.getEmployeeNames(),i.getEmployeeGender(),i.getEmpBorderId().getBorderLocationName(),i.getEmpTelephoneCountryCode()+" "+i.getTelephoneNumber(),i.getEmpBorderId().getBorderId(),i.getEmpBorderId().getBorderLocationName()};
               model.addRow(data);
               m=1;
           }
           if(m==0)
           {
               JOptionPane.showMessageDialog(null,"None of These Information Found in database");
           }
      } catch (RemoteException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SearchEngineMouseClicked
void displayBorderTables(int d)
{
    try {   String action=null;
            Registry rmi=LocateRegistry.getRegistry(5000);
            BorderServiceInterface b=(BorderServiceInterface)rmi.lookup("viewborderInformation");
            List<BorderTable>bt=b.ViewOnBorder();
            if(d==0){
            DefaultTableModel model=(DefaultTableModel)borderViewtab.getModel();
            model.setRowCount(0);
            for(BorderTable i:bt)
            {  if(i.getOpenClosed()==0)
                  action="Closed";
               else
                action="Open";
                String[] data={i.getBorderId(),i.getBorderLocationName(),action};
                model.addRow(data);
            }}
            else{
               DefaultTableModel md=(DefaultTableModel)bordertab.getModel();
               md.setRowCount(0);
               for(BorderTable i:bt){
                   if(i.getOpenClosed()==0)
                  action="Closed";
               else
                action="Open";
                   String[] data={i.getBorderId(),i.getBorderLocationName(),action};
                   md.addRow(data);
               }
            }
}catch(Exception ex)
{
    
}
}
    private void borderViewtabAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_borderViewtabAncestorAdded
 displayBorderTables(0);
    }//GEN-LAST:event_borderViewtabAncestorAdded

    private void jLabel39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseClicked
     OpenCloseOperation(borderIdent,bordername,1);
   displayBorderTables(0);
    }//GEN-LAST:event_jLabel39MouseClicked

    private void jLabel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseClicked
      OpenCloseOperation(borderIdent,bordername,0);
       displayBorderTables(0);
    }//GEN-LAST:event_jLabel37MouseClicked

    private void borderViewtabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borderViewtabMouseClicked
    DefaultTableModel md=(DefaultTableModel) borderViewtab.getModel();
    int index=borderViewtab.getSelectedRow();
    bordername=md.getValueAt(index, 1).toString();
    borderIdent=md.getValueAt(index, 0).toString();
    BOrdercIdentity.setText(md.getValueAt(index, 0).toString());
    }//GEN-LAST:event_borderViewtabMouseClicked
void openCloseallborders(int n)
{
     Registry rmi;
        try {
            rmi = LocateRegistry.getRegistry(5000);
            BorderServiceInterface b=(BorderServiceInterface)rmi.lookup("OpenAllborder");
            String rs=b.OpeneAllborder(n);
            JOptionPane.showMessageDialog(null,rs);
        } catch (RemoteException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    private void jLabel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseClicked
openCloseallborders(1);
displayBorderTables(0);
    }//GEN-LAST:event_jLabel38MouseClicked

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
openCloseallborders(0);
        displayBorderTables(0);
    }//GEN-LAST:event_jLabel35MouseClicked

    private void bordertabAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_bordertabAncestorAdded
     displayBorderTables(1);
    }//GEN-LAST:event_bordertabAncestorAdded
Image img;
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
Registry rmi;
        try {
            int count=0;
            rmi = LocateRegistry.getRegistry(5000);
             BorderServiceInterface bi=(BorderServiceInterface)rmi.lookup("SearchPassenger");
            List<Passengerdb>ls= bi.SearchPassenger(Searchpassenger.getText());
            DefaultTableModel md=(DefaultTableModel)passengertab.getModel();
            md.setRowCount(0);
             for(Passengerdb ps:ls)
             {
              if(count==0){   String[] names=ps.getPassengerNames().split(" ");
               fname.setText(names[0]);
               lname.setText(names[1]);
               nid.setText(ps.getPassengerId());
               ncountry.setText(ps.getPassengerCountryOfBirth());
               pnumber.setText(ps.getTelephoneNumber());
               pcode3.setSelectedItem(ps.getTelephoneCountryCode());
               username.setText(ps.getPassengeruserName());
               byte[] img=ps.getProfilePicture();
                 ByteArrayInputStream input=new ByteArrayInputStream(img);
                 BufferedImage bim=ImageIO.read(input);
                 ImageIcon ingicn=new ImageIcon(bim);
                 Image imageSize=ingicn.getImage().getScaledInstance(UploadedImage.getWidth(),UploadedImage.getHeight(),Image.SCALE_SMOOTH);
                 UploadedImage.setIcon(new ImageIcon(imageSize));
              }
              String[] data={ps.getPassengerId(),ps.getPassengerNames(),ps.getPassengerCountryOfBirth(),ps.getTelephoneCountryCode()+" "+ps.getTelephoneNumber()};
             md.addRow(data);
              count=2;
             }
             if(count==0)
             {
                 JOptionPane.showMessageDialog(null,"No Such data In the System");
             }
        } catch (RemoteException ex) {
           JOptionPane.showMessageDialog(null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
               
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void PenalitiesDateAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_PenalitiesDateAncestorAdded
        Registry rmi;
        try {int found=0;
            rmi = LocateRegistry.getRegistry(5000);
             BorderServiceInterface bi=(BorderServiceInterface)rmi.lookup("PassengerPenarities");
             List<EmployeeExploreBorder>ps=bi.PassengerPenaliries(1);
             DefaultTableModel md=(DefaultTableModel)PenalitiesDate.getModel();
             md.setRowCount(0);
             for(EmployeeExploreBorder i:ps)
             {

//                 LocalDate today=LocalDate.now();
//                 int difference=today.getDayOfYear()-dbdate.getDayOfYear();
                 
                 String[] data={i.getPassengerId().getPassengerId(),i.getPassengerId().getPassengerNames(),i.getPassengerId().getPassengerGender(),i.getGoingDateandTime(),};
                 md.addRow(data);
                 found=1;
             }
             if(found==0)
             {
                 JOptionPane.showMessageDialog(null,"no Penalities has Yet Provided");
             }
        } catch (RemoteException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }//GEN-LAST:event_PenalitiesDateAncestorAdded

    private void jPanel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel29MouseClicked
ClosesidebarNv();
        Admintab.setSelectedIndex(1);        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel29MouseClicked

    private void SuperviseBAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SuperviseBAMouseClicked
 ClosesidebarNv();
        Admintab.setSelectedIndex(2);
 //SuperviseBA.setVisible(true);
 Employee.setVisible(false);
 Borders.setVisible(true);
  Passenger.setVisible(false);
    }//GEN-LAST:event_SuperviseBAMouseClicked

    private void EmpNavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmpNavMouseClicked
       //EmpNav.setVisible(true);
       ClosesidebarNv();
       Admintab.setSelectedIndex(2);
      Employee.setVisible(true);
 Borders.setVisible(false);
  Passenger.setVisible(false);
    }//GEN-LAST:event_EmpNavMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        Thread td=new Thread(){
            @Override
            public void run()
            {
                for(int i=0;i<390;i++)
                {
                    try {
                        Thread.sleep(5);
                        Admindisplay.setBounds(262, 78,i , 30);
                        jLabel23.setBounds(355, 191, 0, 0);
                        if(i==389)
                        {

                            for(int n=0;n<200;n++){
                                Thread.sleep(6);
                                jLabel23.setBounds(355, 191, n, 150);
                            }
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };td.start();

    }//GEN-LAST:event_formWindowOpened

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
//employeenid
 Registry rmi;
        try {
            rmi = LocateRegistry.getRegistry(5000);
             BorderServiceInterface bi=(BorderServiceInterface)rmi.lookup("ShiftEmployeeOnotherborder");
             String ps=bi.ChangeEmployeeWorkLocation(employeenid.getText(),BorderIds.getText());
             JOptionPane.showMessageDialog(null,ps);
             EmmployeeRecord();
        } catch (RemoteException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } 
            
    }//GEN-LAST:event_jButton5ActionPerformed

    private void FeedbackTabAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_FeedbackTabAncestorAdded
Registry rmi;
        try {
            rmi = LocateRegistry.getRegistry(5000);
              BorderServiceInterface bi=(BorderServiceInterface)rmi.lookup("Feedback");
              List<Feedback>fb=bi.DisplayFeedback();
              DefaultTableModel md=(DefaultTableModel)FeedbackTab.getModel();
              md.setRowCount(0);
              for(Feedback f:fb)
              {String[] feed=f.getFeedback().split("&");
                  String[] data={f.getTelephoneNumber(),f.getName(),feed[0],feed[1]};
                  md.addRow(data);
              }
        } catch (RemoteException ex) {
          JOptionPane.showMessageDialog(null, ex);
        } catch (NotBoundException ex) {
           JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_FeedbackTabAncestorAdded
void DisableBorderMenu()
{
    SuperviseBA.setEnabled(false);
    EmpNav.setEnabled(false);
    Passengernav.setEnabled(false);
    Feedbacknav.setEnabled(false);
}
void EnableBorderMenu()
{
    SuperviseBA.setEnabled(true);
    EmpNav.setEnabled(true);
    Passengernav.setEnabled(true);
    Feedbacknav.setEnabled(true);
}
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
if(AdminUsername.getText().isEmpty()||AdminPass.getText().isEmpty())
{
    JOptionPane.showMessageDialog(null, "Fill Empty Spaces");
}else{
    if(AdminUsername.getText().equals("admin")&&AdminPass.getText().equals("admin"))
    {
        EnableBorderMenu();
        Admintab.setSelectedIndex(2);
    }
    else{
        JOptionPane.showMessageDialog(null,"Wrong Username or PAssword");
    }
}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void PassengernavMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassengernavMouseEntered
      Passengernav.setBackground(new Color(121,71,209));  // TODO add your handling code here:
    }//GEN-LAST:event_PassengernavMouseEntered

    private void PassengernavMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassengernavMouseExited
    Passengernav.setBackground(new Color(121,71,29)); 
    }//GEN-LAST:event_PassengernavMouseExited

    private void EmpNavMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmpNavMouseEntered
      EmpNav.setBackground(new Color(121,71,209));
    }//GEN-LAST:event_EmpNavMouseEntered

    private void EmpNavMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmpNavMouseExited
      EmpNav.setBackground(new Color(121,71,29));
    }//GEN-LAST:event_EmpNavMouseExited

    private void FeedbacknavMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeedbacknavMouseEntered
        Feedbacknav.setBackground(new Color(121,71,209)); // TODO add your handling code here:
    }//GEN-LAST:event_FeedbacknavMouseEntered

    private void FeedbacknavMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeedbacknavMouseExited
Feedbacknav.setBackground(new Color(121,71,29));        // TODO add your handling code here:
    }//GEN-LAST:event_FeedbacknavMouseExited

    private void jPanel29MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel29MouseEntered
      jPanel29.setBackground(new Color(121,71,209));  // TODO add your handling code here:
    }//GEN-LAST:event_jPanel29MouseEntered

    private void jPanel29MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel29MouseExited
      jPanel29.setBackground(new Color(121,71,29));  // TODO add your handling code here:
    }//GEN-LAST:event_jPanel29MouseExited

    private void SuperviseBAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SuperviseBAMouseEntered
       SuperviseBA.setBackground(new Color(121,71,209));   // TODO add your handling code here:
    }//GEN-LAST:event_SuperviseBAMouseEntered

    private void SuperviseBAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SuperviseBAMouseExited
SuperviseBA.setBackground(new Color(121,71,29));        // TODO add your handling code here:
    }//GEN-LAST:event_SuperviseBAMouseExited

    private void FeedbacknavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeedbacknavMouseClicked
ClosesidebarNv();
        Admintab.setSelectedIndex(9);        // TODO add your handling code here:
    }//GEN-LAST:event_FeedbacknavMouseClicked

    private void PassengernavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassengernavMouseClicked
ClosesidebarNv();
        Admintab.setSelectedIndex(2);
      Employee.setVisible(false);
 Borders.setVisible(false);
  Passenger.setVisible(true);      
    }//GEN-LAST:event_PassengernavMouseClicked

    private void jPanel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel41MouseClicked
        Admintab.setSelectedIndex(3);
    }//GEN-LAST:event_jPanel41MouseClicked

    private void jPanel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel42MouseClicked
       Admintab.setSelectedIndex(4);
    }//GEN-LAST:event_jPanel42MouseClicked

    private void jPanel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel31MouseClicked
      Admintab.setSelectedIndex(10);    // TODO add your handling code here:
    }//GEN-LAST:event_jPanel31MouseClicked

    private void jLabel66MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel66MouseClicked
  Admintab.setSelectedIndex(6);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel66MouseClicked

    private void jPanel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel38MouseClicked
       Admintab.setSelectedIndex(8); // TODO add your handling code here:
    }//GEN-LAST:event_jPanel38MouseClicked

    private void jPanel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel37MouseClicked
Admintab.setSelectedIndex(7);        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel37MouseClicked
void ClosesidebarNv()
{
    Thread td=new Thread(){
        @Override
        public void run()
        {
            for(int n=210;n>=0;n--)
            {
                try {
                    Thread.sleep(5);
                    SidebarNAvigation.setBounds(0, 0,n,520);
                    if(n==0)
                    {
                        SidebarNAvigation.setVisible(false);
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
      };td.start();
}
    private void jLabel65MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel65MouseClicked
    //  SidebarNAvigation.action(evt, evt);
      ClosesidebarNv();
    }//GEN-LAST:event_jLabel65MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
     SidebarNAvigation.setVisible(true);
        Thread td=new Thread(){
        @Override
        public void run()
        {
            for(int n=0;n<=210;n++)
            {
                try {
                    Thread.sleep(5);
                    SidebarNAvigation.setBounds(0, 0,n,520);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
      };td.start();   // TODO add your handling code here:
    }//GEN-LAST:event_jPanel6MouseClicked

    private void AdmintabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdmintabMouseClicked
ClosesidebarNv();        // TODO add your handling code here:
    }//GEN-LAST:event_AdmintabMouseClicked

    private void SidebarNAvigationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SidebarNAvigationMouseClicked
ClosesidebarNv();        // TODO add your handling code here:
    }//GEN-LAST:event_SidebarNAvigationMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JTextArea p=new JTextArea();
        UploadedImage.setLocation(25,25);
        p.setText("\t\tPassenger Profile\nt\t=================\n"+"\n\tFirst Name\t"+fname.getText()+"\n\tLast Name:\t"+lname.getText()+"\n\tTelephone Number\t"+pcode3.getSelectedItem().toString()+pnumber.getText()+"\n\tNational Id\t"+nid.getText());
        //p.SetImage(UploadedImage);
        try{
            p.print();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, Passenger);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void PassengerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassengerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PassengerMouseClicked

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        Admin a=new Admin();
        a.setVisible(true);
        a.Employee.setVisible(false);
        a.Borders.setVisible(false);
        a.Passenger.setVisible(false);
        a.DisableBorderMenu();
        a.SidebarNAvigation.setVisible(false);
        a.setTitle("Administrator Border management System");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdminPass;
    private javax.swing.JTextField AdminUsername;
    private javax.swing.JLabel Admindisplay;
    private javax.swing.JTabbedPane Admintab;
    private javax.swing.JLabel BOrdercIdentity;
    private javax.swing.JFormattedTextField BorderIds;
    private javax.swing.JPanel Borders;
    private javax.swing.JPanel EmpNav;
    private javax.swing.JPanel Employee;
    private javax.swing.JTextField EmployeeNames;
    private javax.swing.JFormattedTextField EmployeeTelNumber;
    private javax.swing.JTextField Empnamess;
    private javax.swing.JTable FeedbackTab;
    private javax.swing.JPanel Feedbacknav;
    private javax.swing.JPanel Passenger;
    private javax.swing.JPanel Passengernav;
    private javax.swing.JTable PenalitiesDate;
    private javax.swing.JTextField SearchEmployee;
    private javax.swing.JLabel SearchEngine;
    private javax.swing.JTextField Searchpassenger;
    private javax.swing.JPanel SidebarNAvigation;
    private javax.swing.JPanel SuperviseBA;
    private javax.swing.JLabel UploadedImage;
    private javax.swing.JFormattedTextField bcode;
    private javax.swing.JFormattedTextField borderId;
    private javax.swing.JTextField borderLocation;
    private javax.swing.JTable borderViewtab;
    private javax.swing.JTable bordertab;
    private javax.swing.JComboBox<String> empgender;
    private javax.swing.JFormattedTextField employeenid;
    private javax.swing.JTextField empncountry;
    private javax.swing.JFormattedTextField empnid;
    private javax.swing.JFormattedTextField emptel;
    private javax.swing.JTextField fname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
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
    private javax.swing.JPanel jPanel22;
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
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
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
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator32;
    private javax.swing.JSeparator jSeparator33;
    private javax.swing.JSeparator jSeparator34;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField ncountry;
    private javax.swing.JFormattedTextField nid;
    private javax.swing.JTable passengertab;
    private javax.swing.JPasswordField password;
    private javax.swing.JComboBox<String> pcode;
    private javax.swing.JComboBox<String> pcode1;
    private javax.swing.JComboBox<String> pcode3;
    private javax.swing.JFormattedTextField pnumber;
    private javax.swing.JPasswordField retypepasswd;
    private javax.swing.JTable superviseEmployeetab;
    private javax.swing.JLabel uploadphoto;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
