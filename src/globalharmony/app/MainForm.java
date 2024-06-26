/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package globalharmony.app;

import globalharmony.util.GlobalData;
import java.beans.PropertyVetoException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JInternalFrame;


/**
 *
 * @author ozumc
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    
    
    LoginForm loginForm = new LoginForm();
    AddSongsForm addSongsForm = new AddSongsForm();
    ViewSongsForm viewSongsForm = new ViewSongsForm();
    
    Map <String, JInternalFrame> forms = new HashMap<>();
    Map <String, Boolean> userAuthentication = new HashMap<>();
    
    public MainForm() {
        initComponents();
        forms.put("loginForm", loginForm);
        forms.put("addSongsForm", addSongsForm);
        forms.put("viewSongsForm", viewSongsForm);
        userAuthentication.put("addSongsForm", Boolean.TRUE);
        userAuthentication.put("viewSongsForm", Boolean.TRUE);
        
        
        forms.keySet().forEach(key->{
            jDesktopPane1.add(forms.get(key));
        });
    }
    

    
    private void showForm(String name, boolean checkLogin){
        if (checkLogin && GlobalData.user == null) {
            //Check for authorization here
            showForm("loginForm", false);
        } else {
            try {
                if (forms.get(name).isClosed()) {
                    forms.put(name,forms.get(name).getClass().newInstance());
                    jDesktopPane1.add(forms.get(name));
                }
                forms.get(name).show();
                forms.get(name).setSelected(true);
            } catch (PropertyVetoException | IllegalAccessException | InstantiationException ex) {
            }
        }
    }
    
    private void showForm(String frmName) {
        showForm(frmName, true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jFileMenu = new javax.swing.JMenu();
        jMenuItemLogin = new javax.swing.JMenuItem();
        jMenuItemLogout = new javax.swing.JMenuItem();
        jMenuItemExit = new javax.swing.JMenuItem();
        jManageMenu = new javax.swing.JMenu();
        jSongMenu = new javax.swing.JMenu();
        jMenuItemSongsView = new javax.swing.JMenuItem();
        jMenuItemSongsAdd = new javax.swing.JMenuItem();
        jMenuItemSongsDelete = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ozumc\\Downloads\\Untitled.png")); // NOI18N
        jLabel1.setText("jLabel1");

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1001, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        getContentPane().add(jDesktopPane1, java.awt.BorderLayout.CENTER);

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jMenuBar1.setMinimumSize(new java.awt.Dimension(93, 80));

        jFileMenu.setText("Profile");
        jFileMenu.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jFileMenu.setHideActionText(true);

        jMenuItemLogin.setText("Login");
        jMenuItemLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLoginActionPerformed(evt);
            }
        });
        jFileMenu.add(jMenuItemLogin);

        jMenuItemLogout.setText("Logout");
        jMenuItemLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLogoutActionPerformed(evt);
            }
        });
        jFileMenu.add(jMenuItemLogout);

        jMenuItemExit.setText("Exit");
        jFileMenu.add(jMenuItemExit);

        jMenuBar1.add(jFileMenu);

        jManageMenu.setText("Library");
        jManageMenu.setAutoscrolls(true);
        jManageMenu.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jManageMenu.setMargin(new java.awt.Insets(15, 6, 15, 6));

        jSongMenu.setText("My Songs");

        jMenuItemSongsView.setText("View");
        jMenuItemSongsView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSongsViewActionPerformed(evt);
            }
        });
        jSongMenu.add(jMenuItemSongsView);

        jMenuItemSongsAdd.setText("Add");
        jMenuItemSongsAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSongsAddActionPerformed(evt);
            }
        });
        jSongMenu.add(jMenuItemSongsAdd);

        jMenuItemSongsDelete.setText("Delete");
        jMenuItemSongsDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSongsDeleteActionPerformed(evt);
            }
        });
        jSongMenu.add(jMenuItemSongsDelete);

        jManageMenu.add(jSongMenu);

        jMenuBar1.add(jManageMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLogoutActionPerformed
        //showForm("addSongsForm");
    }//GEN-LAST:event_jMenuItemLogoutActionPerformed

    private void jMenuItemSongsAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSongsAddActionPerformed
        showForm("addSongsForm");
    }//GEN-LAST:event_jMenuItemSongsAddActionPerformed

    private void jMenuItemSongsDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSongsDeleteActionPerformed
        showForm("viewSongsForm");
    }//GEN-LAST:event_jMenuItemSongsDeleteActionPerformed

    private void jMenuItemLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLoginActionPerformed
        showForm("loginForm");
    }//GEN-LAST:event_jMenuItemLoginActionPerformed

    private void jMenuItemSongsViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSongsViewActionPerformed
        showForm("viewSongsForm");
    }//GEN-LAST:event_jMenuItemSongsViewActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jFileMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jManageMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenuItem jMenuItemLogin;
    private javax.swing.JMenuItem jMenuItemLogout;
    private javax.swing.JMenuItem jMenuItemSongsAdd;
    private javax.swing.JMenuItem jMenuItemSongsDelete;
    private javax.swing.JMenuItem jMenuItemSongsView;
    private javax.swing.JMenu jSongMenu;
    // End of variables declaration//GEN-END:variables



}
