/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newsensimulator.view.dialogwindows;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import newsensimulator.control.Controller;
import newsensimulator.model.networkelements.Vertex;
import newsensimulator.view.MainInterface;

/**
 *
 * @author Jose Muñoz Parra
 */
public class TFLocationNodeProperties extends javax.swing.JDialog {

    private Vertex vertex;
    
    private boolean creando = false;
    
    private final ImageIcon busIn = new ImageIcon(getClass().getResource("/newsensimulator/view/icons/posteMadera2.png"));
    //private final ImageIcon busOut = new ImageIcon(getClass().getResource("/newsensimulator/view/icons/posteMadera2Gris.png"));
    private final ImageIcon busSB = new ImageIcon(getClass().getResource("/newsensimulator/view/icons/posteMaderaSlack2.png"));
    
    public TFLocationNodeProperties(Vertex vertex) {
        initComponents();
        this.setTitle("Properties TFLocationNode " + vertex.getVertexAsTFLocationNode().getName());
        creando = false;
        setLocationRelativeTo(null);
        this.vertex = vertex;
        setIconLabel();
        
        this.TFNodeNameLabel.setText("  "+vertex.getVertexAsTFLocationNode().getName());
        
        this.vA_Text.setText(String.valueOf(vertex.getVertexAsTFLocationNode().getVoltagePhase_A()));
        this.vB_Text.setText(String.valueOf(vertex.getVertexAsTFLocationNode().getVoltagePhase_B()));
        this.vC_Text.setText(String.valueOf(vertex.getVertexAsTFLocationNode().getVoltagePhase_C()));
        
        this.angleA_Text.setText(String.valueOf(vertex.getVertexAsTFLocationNode().getAnglePhase_A()));
        this.angleB_Text.setText(String.valueOf(vertex.getVertexAsTFLocationNode().getAnglePhase_B()));
        this.angleC_Text.setText(String.valueOf(vertex.getVertexAsTFLocationNode().getAnglePhase_C()));
        
        this.pA_Text.setText(String.valueOf(vertex.getVertexAsTFLocationNode().getActivePowerPhase_A()));
        this.pB_Text.setText(String.valueOf(vertex.getVertexAsTFLocationNode().getActivePowerPhase_B()));
        this.pC_Text.setText(String.valueOf(vertex.getVertexAsTFLocationNode().getActivePowerPhase_C()));
        
        this.qA_Text.setText(String.valueOf(vertex.getVertexAsTFLocationNode().getReactivePowerPhase_A()));
        this.qB_Text.setText(String.valueOf(vertex.getVertexAsTFLocationNode().getReactivePowerPhase_B()));
        this.qC_Text.setText(String.valueOf(vertex.getVertexAsTFLocationNode().getReactivePowerPhase_C()));
        
        this.MTNodeCheckBox.setSelected(vertex.getVertexAsTFLocationNode().getMTNodeStatus());
        
    }

    
    public TFLocationNodeProperties(Vertex vertex, boolean creando) {
        initComponents();
        this.setTitle("Properties TFLocationNode " + vertex.getVertexAsTFLocationNode().getName());
        this.creando = creando;
        setLocationRelativeTo(null);
        this.vertex = vertex;
        setIconLabel();
        
        this.TFNodeNameLabel.setText("  "+vertex.getVertexAsTFLocationNode().getName());
        
        this.vA_Text.setText(String.valueOf(vertex.getVertexAsTFLocationNode().getVoltagePhase_A()));
        this.vB_Text.setText(String.valueOf(vertex.getVertexAsTFLocationNode().getVoltagePhase_B()));
        this.vC_Text.setText(String.valueOf(vertex.getVertexAsTFLocationNode().getVoltagePhase_C()));
        
        this.angleA_Text.setText(String.valueOf(vertex.getVertexAsTFLocationNode().getAnglePhase_A()));
        this.angleB_Text.setText(String.valueOf(vertex.getVertexAsTFLocationNode().getAnglePhase_B()));
        this.angleC_Text.setText(String.valueOf(vertex.getVertexAsTFLocationNode().getAnglePhase_C()));
        
        this.pA_Text.setText(String.valueOf(vertex.getVertexAsTFLocationNode().getActivePowerPhase_A()));
        this.pB_Text.setText(String.valueOf(vertex.getVertexAsTFLocationNode().getActivePowerPhase_B()));
        this.pC_Text.setText(String.valueOf(vertex.getVertexAsTFLocationNode().getActivePowerPhase_C()));
        
        this.qA_Text.setText(String.valueOf(vertex.getVertexAsTFLocationNode().getReactivePowerPhase_A()));
        this.qB_Text.setText(String.valueOf(vertex.getVertexAsTFLocationNode().getReactivePowerPhase_B()));
        this.qC_Text.setText(String.valueOf(vertex.getVertexAsTFLocationNode().getReactivePowerPhase_C()));
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        MTNodeCheckBox = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TFNodeNameLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        busIconPanel = new javax.swing.JPanel();
        iconLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        vA_Text = new javax.swing.JTextField();
        vB_Text = new javax.swing.JTextField();
        vC_Text = new javax.swing.JTextField();
        angleA_Text = new javax.swing.JTextField();
        angleB_Text = new javax.swing.JTextField();
        angleC_Text = new javax.swing.JTextField();
        pA_Text = new javax.swing.JTextField();
        pB_Text = new javax.swing.JTextField();
        pC_Text = new javax.swing.JTextField();
        qA_Text = new javax.swing.JTextField();
        qB_Text = new javax.swing.JTextField();
        qC_Text = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setModal(true);
        setResizable(false);
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        getContentPane().setLayout(layout);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(MTNodeCheckBox, gridBagConstraints);

        jLabel1.setText("Phase C");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 20);
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel3.setText("Phase B");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        getContentPane().add(jLabel3, gridBagConstraints);

        jLabel4.setText("Phase A");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        getContentPane().add(jLabel4, gridBagConstraints);

        jLabel5.setText("Bus name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        getContentPane().add(jLabel5, gridBagConstraints);

        TFNodeNameLabel.setToolTipText("");
        TFNodeNameLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TFNodeNameLabel.setMaximumSize(new java.awt.Dimension(60, 18));
        TFNodeNameLabel.setMinimumSize(new java.awt.Dimension(60, 18));
        TFNodeNameLabel.setPreferredSize(new java.awt.Dimension(60, 18));
        TFNodeNameLabel.setRequestFocusEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 4, 0, 0);
        getContentPane().add(TFNodeNameLabel, gridBagConstraints);

        jLabel6.setText("Voltage:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        getContentPane().add(jLabel6, gridBagConstraints);

        jLabel7.setText("Angle:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        getContentPane().add(jLabel7, gridBagConstraints);

        jLabel8.setText("Active Power:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        getContentPane().add(jLabel8, gridBagConstraints);

        jLabel9.setText("Reactive Power:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        getContentPane().add(jLabel9, gridBagConstraints);

        busIconPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        busIconPanel.setMaximumSize(new java.awt.Dimension(65, 65));
        busIconPanel.setMinimumSize(new java.awt.Dimension(65, 65));
        busIconPanel.setName(""); // NOI18N
        busIconPanel.setPreferredSize(new java.awt.Dimension(65, 65));
        busIconPanel.add(iconLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        getContentPane().add(busIconPanel, gridBagConstraints);

        jLabel11.setText("Icon");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 20);
        getContentPane().add(jLabel11, gridBagConstraints);

        vA_Text.setMaximumSize(new java.awt.Dimension(60, 20));
        vA_Text.setMinimumSize(new java.awt.Dimension(60, 20));
        vA_Text.setName(""); // NOI18N
        vA_Text.setPreferredSize(new java.awt.Dimension(60, 20));
        vA_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vA_TextActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 12;
        getContentPane().add(vA_Text, gridBagConstraints);

        vB_Text.setMaximumSize(new java.awt.Dimension(60, 20));
        vB_Text.setMinimumSize(new java.awt.Dimension(60, 20));
        vB_Text.setName(""); // NOI18N
        vB_Text.setPreferredSize(new java.awt.Dimension(60, 20));
        vB_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vB_TextActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 12;
        getContentPane().add(vB_Text, gridBagConstraints);

        vC_Text.setMaximumSize(new java.awt.Dimension(60, 20));
        vC_Text.setMinimumSize(new java.awt.Dimension(60, 20));
        vC_Text.setName(""); // NOI18N
        vC_Text.setPreferredSize(new java.awt.Dimension(60, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        getContentPane().add(vC_Text, gridBagConstraints);

        angleA_Text.setMaximumSize(new java.awt.Dimension(60, 20));
        angleA_Text.setMinimumSize(new java.awt.Dimension(60, 20));
        angleA_Text.setName(""); // NOI18N
        angleA_Text.setPreferredSize(new java.awt.Dimension(60, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 16;
        getContentPane().add(angleA_Text, gridBagConstraints);

        angleB_Text.setMaximumSize(new java.awt.Dimension(60, 20));
        angleB_Text.setMinimumSize(new java.awt.Dimension(60, 20));
        angleB_Text.setName(""); // NOI18N
        angleB_Text.setPreferredSize(new java.awt.Dimension(60, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 16;
        getContentPane().add(angleB_Text, gridBagConstraints);

        angleC_Text.setMaximumSize(new java.awt.Dimension(60, 20));
        angleC_Text.setMinimumSize(new java.awt.Dimension(60, 20));
        angleC_Text.setName(""); // NOI18N
        angleC_Text.setPreferredSize(new java.awt.Dimension(60, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        getContentPane().add(angleC_Text, gridBagConstraints);

        pA_Text.setMaximumSize(new java.awt.Dimension(60, 20));
        pA_Text.setMinimumSize(new java.awt.Dimension(60, 20));
        pA_Text.setName(""); // NOI18N
        pA_Text.setPreferredSize(new java.awt.Dimension(60, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 20;
        getContentPane().add(pA_Text, gridBagConstraints);

        pB_Text.setMaximumSize(new java.awt.Dimension(60, 20));
        pB_Text.setMinimumSize(new java.awt.Dimension(60, 20));
        pB_Text.setName(""); // NOI18N
        pB_Text.setPreferredSize(new java.awt.Dimension(60, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 20;
        getContentPane().add(pB_Text, gridBagConstraints);

        pC_Text.setMaximumSize(new java.awt.Dimension(60, 20));
        pC_Text.setMinimumSize(new java.awt.Dimension(60, 20));
        pC_Text.setName(""); // NOI18N
        pC_Text.setPreferredSize(new java.awt.Dimension(60, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        getContentPane().add(pC_Text, gridBagConstraints);

        qA_Text.setMaximumSize(new java.awt.Dimension(60, 20));
        qA_Text.setMinimumSize(new java.awt.Dimension(60, 20));
        qA_Text.setPreferredSize(new java.awt.Dimension(60, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 24;
        getContentPane().add(qA_Text, gridBagConstraints);

        qB_Text.setMaximumSize(new java.awt.Dimension(60, 20));
        qB_Text.setMinimumSize(new java.awt.Dimension(60, 20));
        qB_Text.setPreferredSize(new java.awt.Dimension(60, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 24;
        getContentPane().add(qB_Text, gridBagConstraints);

        qC_Text.setMaximumSize(new java.awt.Dimension(60, 20));
        qC_Text.setMinimumSize(new java.awt.Dimension(60, 20));
        qC_Text.setPreferredSize(new java.awt.Dimension(60, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        getContentPane().add(qC_Text, gridBagConstraints);

        jButton2.setText("OK");
        jButton2.setMaximumSize(new java.awt.Dimension(65, 23));
        jButton2.setMinimumSize(new java.awt.Dimension(65, 23));
        jButton2.setPreferredSize(new java.awt.Dimension(65, 23));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 20);
        getContentPane().add(jButton2, gridBagConstraints);

        jButton1.setText("Cancel");
        jButton1.setPreferredSize(new java.awt.Dimension(70, 23));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        getContentPane().add(jButton1, gridBagConstraints);

        jLabel2.setText("MT Node:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vA_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vA_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vA_TextActionPerformed

    private void vB_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vB_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vB_TextActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        vertex.getVertexAsTFLocationNode().setVoltagePhase_A(Double.valueOf(vA_Text.getText()));
        vertex.getVertexAsTFLocationNode().setVoltagePhase_B(Double.valueOf(vB_Text.getText()));
        vertex.getVertexAsTFLocationNode().setVoltagePhase_C(Double.valueOf(vC_Text.getText()));

        vertex.getVertexAsTFLocationNode().setAnglePhase_A(Double.valueOf(angleA_Text.getText()));
        vertex.getVertexAsTFLocationNode().setAnglePhase_B(Double.valueOf(angleB_Text.getText()));
        vertex.getVertexAsTFLocationNode().setAnglePhase_C(Double.valueOf(angleC_Text.getText()));

        vertex.getVertexAsTFLocationNode().setActivePowerPhase_A(Double.valueOf(pA_Text.getText()));
        vertex.getVertexAsTFLocationNode().setActivePowerPhase_B(Double.valueOf(pB_Text.getText()));
        vertex.getVertexAsTFLocationNode().setActivePowerPhase_C(Double.valueOf(pC_Text.getText()));

        vertex.getVertexAsTFLocationNode().setReactivePowerPhase_A(Double.valueOf(qA_Text.getText()));
        vertex.getVertexAsTFLocationNode().setReactivePowerPhase_B(Double.valueOf(qB_Text.getText()));
        vertex.getVertexAsTFLocationNode().setReactivePowerPhase_C(Double.valueOf(qC_Text.getText()));

        vertex.getVertexAsTFLocationNode().setMTNodeStatus(MTNodeCheckBox.isSelected());
        
        MainInterface.getMainInterface().actualizar();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (creando) {
            Controller.getController().borrarNodo(vertex);
        }
        MainInterface.getMainInterface().actualizar();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void setIconLabel(){
        if(vertex.getVertexAsTFLocationNode().isTransformerNode()){
            this.iconLabel.setIcon(busSB);
        }
        else{
            this.iconLabel.setIcon(busIn);
        }
        
        this.iconLabel.setHorizontalAlignment(JLabel.CENTER);
        this.iconLabel.setVerticalAlignment(JLabel.CENTER);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox MTNodeCheckBox;
    private javax.swing.JLabel TFNodeNameLabel;
    private javax.swing.JTextField angleA_Text;
    private javax.swing.JTextField angleB_Text;
    private javax.swing.JTextField angleC_Text;
    private javax.swing.JPanel busIconPanel;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField pA_Text;
    private javax.swing.JTextField pB_Text;
    private javax.swing.JTextField pC_Text;
    private javax.swing.JTextField qA_Text;
    private javax.swing.JTextField qB_Text;
    private javax.swing.JTextField qC_Text;
    private javax.swing.JTextField vA_Text;
    private javax.swing.JTextField vB_Text;
    private javax.swing.JTextField vC_Text;
    // End of variables declaration//GEN-END:variables
}
