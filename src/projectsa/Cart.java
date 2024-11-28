/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectsa;

import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.*;

/**
 *
 * @author kasidet
 */
public class Cart extends javax.swing.JFrame {

    /**
     * Creates new form Cart
     */
    private double totalprice;
    private int[] selectedRows;
    private String selectedRowsString;
    private String[] customerdata;
    private int customerid;
    private final JTable cartTable = Main.TableCart;

    public Cart() {
        initComponents();
        TableModel model = cartTable.getModel();
        TableCart.setModel(model);
        TotalPriceLabel.setText(totalprice + " Baht");
    }

    public Cart(String[] customerdata) {
        initComponents();
        this.customerdata = customerdata;
        TableModel model = cartTable.getModel();
        TableCart.setModel(model);
        TotalPriceLabel.setText(totalprice + " Baht");
    }

    public Cart(int customerid) {
        initComponents();
        this.customerid = customerid;
        TableModel model = cartTable.getModel();
        TableCart.setModel(model);
        TotalPriceLabel.setText(totalprice + " Baht");
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TotalPriceLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DueDate = new org.jdesktop.swingx.JXDatePicker();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        RowLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableCart = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Equipment rental store");

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Total Price");

        TotalPriceLabel.setFont(new java.awt.Font("Segoe UI Symbol", 0, 36)); // NOI18N
        TotalPriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        TotalPriceLabel.setText("-");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/real-estate.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/verified.png"))); // NOI18N
        jLabel3.setText("Confirm");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/money.png"))); // NOI18N

        DueDate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        DueDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DueDateActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DueDate");

        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Row");

        RowLabel.setFont(new java.awt.Font("Segoe UI Symbol", 0, 36)); // NOI18N
        RowLabel.setForeground(new java.awt.Color(255, 255, 255));
        RowLabel.setText("-");

        TableCart.setBackground(new java.awt.Color(153, 153, 153));
        TableCart.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TableCart.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TableCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "เลขสิ่งของ", "ชนิด", "แบรนด์", "รุ่น", "ค่ายืมรายวัน", "ค่าเช่าเกินกำหนด", "เช่าถึงวันที่", "ราคารวม"
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
        TableCart.getTableHeader().setReorderingAllowed(false);
        TableCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TableCartMousePressed(evt);
            }
        });
        TableCart.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                TableCartPropertyChange(evt);
            }
        });
        jScrollPane3.setViewportView(TableCart);
        if (TableCart.getColumnModel().getColumnCount() > 0) {
            TableCart.getColumnModel().getColumn(0).setResizable(false);
            TableCart.getColumnModel().getColumn(1).setResizable(false);
            TableCart.getColumnModel().getColumn(2).setResizable(false);
            TableCart.getColumnModel().getColumn(3).setResizable(false);
            TableCart.getColumnModel().getColumn(4).setResizable(false);
            TableCart.getColumnModel().getColumn(5).setResizable(false);
            TableCart.getColumnModel().getColumn(6).setResizable(false);
            TableCart.getColumnModel().getColumn(7).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(118, 118, 118))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(5, 5, 5)
                                .addComponent(TotalPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addGap(462, 462, 462)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(RowLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)))))
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(268, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel1))
                .addGap(35, 35, 35)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RowLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(TotalPriceLabel)
                        .addGap(61, 61, 61)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(84, 84, 84)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(134, Short.MAX_VALUE)))
        );

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
        ExistCustomer ex = new ExistCustomer();
        ex.setVisible(true);
        ex.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void DueDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DueDateActionPerformed
        DefaultTableModel model = (DefaultTableModel) TableCart.getModel();
        SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date selectedDate = DueDate.getDate();
            LocalDate now = LocalDate.now();
            LocalDate dueDateLocal = selectedDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            if (selectedRows != null && selectedRows.length > 0) {
                if (dueDateLocal.isBefore(now) || dueDateLocal.isEqual(now)) {
                    JOptionPane.showMessageDialog(this, "Invalid duedate: Due date cannot be in the past.", "Equipment rental store", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (selectedDate != null) {
                    long daysBetween = ChronoUnit.DAYS.between(now, dueDateLocal);

                    int confirm = JOptionPane.showConfirmDialog(this,
                            "Confirm duedate at row " + selectedRowsString + "\nDuedate: " + dateformat.format(selectedDate),
                            "Equipment rental store", JOptionPane.YES_NO_OPTION);

                    if (confirm == JOptionPane.YES_OPTION) {
                        double totalprice = 0;

                        for (int selectedRow : selectedRows) {
                            model.setValueAt(dateformat.format(selectedDate), selectedRow, 6);

                            Object value = model.getValueAt(selectedRow, 4);
                            if (value != null) {
                                double price = Double.parseDouble(value.toString());
                                price = price * daysBetween;
                                model.setValueAt(price, selectedRow, 7);
                            } else {
                                JOptionPane.showMessageDialog(this, "Price is missing at row " + selectedRow, "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                        }

                        for (int i = 0; i < TableCart.getRowCount(); i++) {
                            Object value = model.getValueAt(i, 7);
                            if (value != null) {
                                totalprice += Double.parseDouble(value.toString());
                            }
                        }

                        TotalPriceLabel.setText(String.format("%.2f Baht", totalprice));
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please select row", "Equipment rental store", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error parsing date: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_DueDateActionPerformed

    private void TableCartPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_TableCartPropertyChange
        TableCart.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 14));
        TableCart.getTableHeader().setBackground(new Color(153, 153, 153));
        TableCart.getTableHeader().setOpaque(false);
    }//GEN-LAST:event_TableCartPropertyChange

    private void TableCartMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableCartMousePressed
        selectedRows = TableCart.getSelectedRows();
        if (selectedRows.length > 0) {
            selectedRowsString = "";
            for (int row : selectedRows) {
                selectedRowsString += row + 1 + " ";
            }
            RowLabel.setText(selectedRowsString);
        }
    }//GEN-LAST:event_TableCartMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXDatePicker DueDate;
    private javax.swing.JLabel RowLabel;
    public javax.swing.JTable TableCart;
    private javax.swing.JLabel TotalPriceLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
