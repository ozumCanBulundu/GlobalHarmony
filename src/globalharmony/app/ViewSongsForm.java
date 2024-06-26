/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package globalharmony.app;

import globalharmony.Bo.Song;
import globalharmony.Dao.SongHandler;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ozumc
 */
public class ViewSongsForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewStudentsForm
     */
    
    private SongHandler songHandler = new SongHandler();
    public List<Song> songs;
    
    private void refreshSongs(){
        Songs();
    }
    

    private void Songs(){
        String keyword = jSearchField.getText();
        songs = songHandler.loadSong(keyword);
        String columns[] = new String[]{"Name","Language","Year","Genre","Album","Popularity"};
        DefaultTableModel tblModel = new DefaultTableModel(columns,0){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
    };
        
        songs.forEach((song) ->{
        tblModel.addRow(song.getRow());
        });
        jTableSong.setModel(tblModel); 
        
    }  
    public ViewSongsForm() {    
        initComponents();
        Songs();
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
        jSearchField = new javax.swing.JTextField();
        jSearchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSong = new javax.swing.JTable();
        jDeleteButton = new javax.swing.JButton();

        setClosable(true);
        setTitle("Songs");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Search");

        jSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchFieldActionPerformed(evt);
            }
        });

        jSearchButton.setText("Search");
        jSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchButtonActionPerformed(evt);
            }
        });

        jTableSong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableSong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableSongMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableSong);

        jDeleteButton.setText("Delete");
        jDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteButtonActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSearchField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSearchButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jDeleteButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSearchButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jDeleteButton)))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jSearchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jDeleteButton)
                .addContainerGap())
        );

        getContentPane().add(jDesktopPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSearchFieldActionPerformed

    private void jDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteButtonActionPerformed
        int selectedRow = jTableSong.getSelectedRow();
        if (selectedRow != -1) {
            String sName = (String) jTableSong.getValueAt(selectedRow, 0);
            int ret= JOptionPane.showConfirmDialog(this, String.format("Deleting song '%s'",sName));
            if (ret == JOptionPane.OK_OPTION) {
                songHandler.deleteSong(sName);
                refreshSongs();
            }
        }else{
            JOptionPane.showMessageDialog(this, "Please select a song to delete");
        }
    }//GEN-LAST:event_jDeleteButtonActionPerformed

    private void jSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchButtonActionPerformed
        Songs();
    }//GEN-LAST:event_jSearchButtonActionPerformed

    private void jTableSongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSongMouseClicked
        // TODO add your handling code here:
         if (evt.getClickCount() == 2) {
             Song song = songs.get(jTableSong.getSelectedRow());
             UpdateForm updateForm = new UpdateForm(null,true);
             updateForm.setSong(song);
             updateForm.setVisible(true);
             if (updateForm.check == true) {
                 refreshSongs();
             }
        }
    }//GEN-LAST:event_jTableSongMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jDeleteButton;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jSearchButton;
    private javax.swing.JTextField jSearchField;
    private javax.swing.JTable jTableSong;
    // End of variables declaration//GEN-END:variables
}
