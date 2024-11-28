/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectsa;

import method.ReadAccess;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.*;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kasidet
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    private ArrayList<String[]> readyEquipment;

    public Main() {
        initComponents();
        ReadAccess access = new ReadAccess();
        readyEquipment = access.retrieveAllData().get(0);

        for (String[] readyEquipmentData : readyEquipment) {
            JCEquipmentID.addItem(readyEquipmentData[0]);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        JCEquipmentID = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TypeLabel = new javax.swing.JLabel();
        BrandLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ModeLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        purchasePriceLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        StatusLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableCart = new javax.swing.JTable();
        JBAddItem = new javax.swing.JLabel();
        JBAddItem1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("EquipmentID");

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Equipment rental store");

        JCEquipmentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCEquipmentIDActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Type");

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Brand");

        TypeLabel.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        TypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        TypeLabel.setText("-");
        TypeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        BrandLabel.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        BrandLabel.setForeground(new java.awt.Color(255, 255, 255));
        BrandLabel.setText("-");
        BrandLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Model");

        ModeLabel.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        ModeLabel.setForeground(new java.awt.Color(255, 255, 255));
        ModeLabel.setText("-");
        ModeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Rent Price");

        purchasePriceLabel.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        purchasePriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        purchasePriceLabel.setText("-");
        purchasePriceLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel8.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Status");

        StatusLabel.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        StatusLabel.setForeground(new java.awt.Color(255, 255, 255));
        StatusLabel.setText("-");
        StatusLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        TableCart.setBackground(new java.awt.Color(153, 153, 153));
        TableCart.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TableCart.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TableCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "เลขสิ่งของ", "ชนิด", "แบรนด์", "รุ่น", "ค่ายืมรายวัน", "ค่าเช่าเกินกำหนด", "วันที่เช่า", "ราคารวม"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableCart.setFocusable(false);
        TableCart.setRowHeight(25);
        TableCart.setSelectionBackground(new java.awt.Color(153, 153, 153));
        TableCart.setSelectionForeground(new java.awt.Color(102, 102, 102));
        TableCart.setShowHorizontalLines(true);
        TableCart.getTableHeader().setReorderingAllowed(false);
        TableCart.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                TableCartPropertyChange(evt);
            }
        });
        jScrollPane2.setViewportView(TableCart);
        if (TableCart.getColumnModel().getColumnCount() > 0) {
            TableCart.getColumnModel().getColumn(0).setResizable(false);
            TableCart.getColumnModel().getColumn(0).setPreferredWidth(10);
            TableCart.getColumnModel().getColumn(1).setResizable(false);
            TableCart.getColumnModel().getColumn(1).setPreferredWidth(5);
            TableCart.getColumnModel().getColumn(2).setResizable(false);
            TableCart.getColumnModel().getColumn(2).setPreferredWidth(10);
            TableCart.getColumnModel().getColumn(3).setResizable(false);
            TableCart.getColumnModel().getColumn(3).setPreferredWidth(5);
            TableCart.getColumnModel().getColumn(4).setResizable(false);
            TableCart.getColumnModel().getColumn(4).setPreferredWidth(10);
            TableCart.getColumnModel().getColumn(5).setResizable(false);
            TableCart.getColumnModel().getColumn(5).setPreferredWidth(10);
            TableCart.getColumnModel().getColumn(6).setResizable(false);
            TableCart.getColumnModel().getColumn(6).setPreferredWidth(20);
            TableCart.getColumnModel().getColumn(7).setResizable(false);
        }

        JBAddItem.setBackground(new java.awt.Color(0, 0, 0));
        JBAddItem.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        JBAddItem.setForeground(new java.awt.Color(255, 255, 255));
        JBAddItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/shopping-cart.png"))); // NOI18N
        JBAddItem.setText("Add Items");
        JBAddItem.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        JBAddItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBAddItem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBAddItem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBAddItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBAddItemMouseClicked(evt);
            }
        });

        JBAddItem1.setBackground(new java.awt.Color(0, 0, 0));
        JBAddItem1.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        JBAddItem1.setForeground(new java.awt.Color(255, 255, 255));
        JBAddItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/next.png"))); // NOI18N
        JBAddItem1.setText("Next");
        JBAddItem1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        JBAddItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBAddItem1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBAddItem1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBAddItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBAddItem1MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/blockchain.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/brand.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/types.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/dollar.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/real-estate.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/check-circle.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/bin.png"))); // NOI18N
        jLabel14.setText("Delete");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel14.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(StatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(purchasePriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addGap(63, 63, 63)
                                .addComponent(JCEquipmentID, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ModeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BrandLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JBAddItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBAddItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 13, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(JCEquipmentID, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addGap(6, 6, 6)))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(TypeLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BrandLabel)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(ModeLabel))
                            .addComponent(jLabel6))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(purchasePriceLabel))
                            .addComponent(jLabel11))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(StatusLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14)
                                    .addComponent(JBAddItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JBAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(102, 102, 102));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setJMenuBar(jMenuBar1);

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

    private void JCEquipmentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCEquipmentIDActionPerformed
        String selectedEquipmentID = (String) JCEquipmentID.getSelectedItem();

        for (String[] readyEquipmentData : readyEquipment) {
            if (readyEquipmentData[0].equals(selectedEquipmentID)) {
                TypeLabel.setText(readyEquipmentData[1]);
                BrandLabel.setText(readyEquipmentData[2]);
                ModeLabel.setText(readyEquipmentData[3]);
                purchasePriceLabel.setText(readyEquipmentData[4] + " Per day");
                if (readyEquipmentData[5].equals("true")) {
                    StatusLabel.setForeground(Color.green);
                    StatusLabel.setText("Ready");
                }
                break;
            }
        }
    }//GEN-LAST:event_JCEquipmentIDActionPerformed

    private void JBAddItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBAddItemMouseClicked
        DefaultTableModel model = (DefaultTableModel) TableCart.getModel();
        int selectedIndex = JCEquipmentID.getSelectedIndex();
        if (selectedIndex != -1) {
            String[] readyEquipmentData = readyEquipment.get(selectedIndex);
            String selectedEquipmentID = readyEquipmentData[0];

            boolean found = false;
            for (int row = 0; row < model.getRowCount(); row++) {
                String equipmentID = (String) model.getValueAt(row, 0);
                if (equipmentID.equals(selectedEquipmentID)) {
                    JOptionPane.showMessageDialog(null, "EquipmentID : " + selectedIndex + "\nAlready add in cart", "Equipment Rental Store", ERROR_MESSAGE);
                    found = true;
                    break;
                }
            }

            if (!found) {
                Object[] rowData = {
                    readyEquipmentData[0],
                    readyEquipmentData[1],
                    readyEquipmentData[2],
                    readyEquipmentData[3],
                    Double.valueOf(readyEquipmentData[4]),
                    Double.valueOf(readyEquipmentData[7])
                };
                model.addRow(rowData);
            }
        }
    }//GEN-LAST:event_JBAddItemMouseClicked

    private void JBAddItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBAddItem1MouseClicked
        if (TableCart.getRowCount() > 0) {
            this.dispose();
            Cart cart = new Cart();
            cart.show();
            
        } else {
            JOptionPane.showMessageDialog(null, "Cart is empty", "Equipment Rental Store", ERROR_MESSAGE);
            System.out.println(TableCart.getRowCount());
        }
    }//GEN-LAST:event_JBAddItem1MouseClicked

    private void TableCartPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_TableCartPropertyChange
        TableCart.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 14));
        TableCart.getTableHeader().setBackground(new Color(153, 153, 153));
        TableCart.getTableHeader().setOpaque(false);
    }//GEN-LAST:event_TableCartPropertyChange

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        DefaultTableModel model = (DefaultTableModel) TableCart.getModel();
        int selectedRow = TableCart.getSelectedRow();
        if (selectedRow != -1) {
            model.removeRow(selectedRow);
            JOptionPane.showMessageDialog(null, "Delete " + selectedRow + "success", "Equipment Rental Store", ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Please select row!", "Equipment Rental Store", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabel14MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BrandLabel;
    private javax.swing.JLabel JBAddItem;
    private javax.swing.JLabel JBAddItem1;
    private javax.swing.JComboBox<String> JCEquipmentID;
    private javax.swing.JLabel ModeLabel;
    private javax.swing.JLabel StatusLabel;
    public static javax.swing.JTable TableCart;
    private javax.swing.JLabel TypeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel purchasePriceLabel;
    // End of variables declaration//GEN-END:variables
}