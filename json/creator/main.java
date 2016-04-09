package json.creator;

import java.util.HashMap;
import java.util.Map.Entry;

public class main extends javax.swing.JFrame {

    public main() {
        initComponents();
        json = new JSONManager();
        modelList = new HashMap<String, String>();
        modelList.put("Simple Item", "The default Minecraft item model. Like most of the items in game.");
        modelList.put("Stick Item", "This model renders like the item \"Stick\" or anything else like tools and swords.");
        modelList.put("Simple Block", "The default Minecraft block model. The six faces are the same, like stone, cobblestone and ores. ");
        for (Entry<String, String> entry : modelList.entrySet()) {
            renderTypeList.addItem(entry.getKey());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        renderDescription = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        modID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        genericName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        renderTypeList = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("JSON Model Generator");
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 50));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        renderDescription.setEditable(false);
        renderDescription.setColumns(20);
        renderDescription.setLineWrap(true);
        renderDescription.setRows(5);
        renderDescription.setWrapStyleWord(true);
        renderDescription.setFocusable(false);
        renderDescription.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(renderDescription);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 280, 180));

        jLabel2.setText("ModID :");
        jLabel2.setToolTipText("");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        modID.setToolTipText("Without colon !");
        jPanel2.add(modID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 180, -1));

        jLabel3.setText("Generic Name :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));
        jPanel2.add(genericName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 180, -1));

        jLabel4.setText("Render Type : ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        renderTypeList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renderTypeListActionPerformed(evt);
            }
        });
        jPanel2.add(renderTypeList, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 180, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 600, 200));

        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton1.setText("Create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 600, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void renderTypeListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renderTypeListActionPerformed
        renderDescription.setText("");
        renderDescription.setText(modelList.get(renderTypeList.getSelectedItem()));
    }//GEN-LAST:event_renderTypeListActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        json.JSONCreate(renderTypeList.getSelectedItem().toString(), genericName.getText(), modID.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    private HashMap<String, String> modelList;
private JSONManager json;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField genericName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField modID;
    private javax.swing.JTextArea renderDescription;
    private javax.swing.JComboBox<String> renderTypeList;
    // End of variables declaration//GEN-END:variables
}
