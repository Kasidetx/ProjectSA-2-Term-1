/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package method;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kasidet
 */
public class ReadAccess {

    public ArrayList<ArrayList<String[]>> retrieveAllData() {
        String sql = "SELECT * From Equipment";
        ArrayList<String[]> equipmentListReady = new ArrayList<>();
        ArrayList<String[]> equipmentListNotReady = new ArrayList<>();

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql); ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                String equipmentID = rs.getString("equipmentID");
                String type = rs.getString("type");
                String brand = rs.getString("brand");
                String model = rs.getString("model");
                String rentalFee = rs.getString("rentalFee");
                Boolean status = rs.getBoolean("status");
                String note = rs.getString("note");
                String lateFee = rs.getString("lateFee");
                String[] equipmentData = {equipmentID, type, brand, model, rentalFee, String.valueOf(status), note, lateFee};
                if (status) {
                    equipmentListReady.add(equipmentData);
                } else {
                    equipmentListNotReady.add(equipmentData);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "SqlException: " + e.getMessage(), "Equipment rental store", JOptionPane.ERROR_MESSAGE);
        }
        ArrayList<ArrayList<String[]>> result = new ArrayList<>();
        result.add(equipmentListReady);
        result.add(equipmentListNotReady);
        return result;
    }

    public String[] retrieveCustomerID(String phonenumber) {
        String sql = "SELECT * From Customer WHERE phoneNumber = ?";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, phonenumber);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    String Customerid = rs.getString("customerID");
                    String fn = rs.getString("firstName");
                    String ln = rs.getString("lastName");
                    String ar = rs.getString("address");
                    String email = rs.getString("email");
                    String[] data = {Customerid, fn, ln, ar, email, phonenumber};
                    return data;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "SqlException: " + e.getMessage(), "Equipment rental store", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public void retrieveCustomer(JTable jt) {
        String sql = "SELECT * From Customer";
        DefaultTableModel model = (DefaultTableModel) jt.getModel();
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql); ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                String Customerid = rs.getString("customerID");
                String fn = rs.getString("firstName");
                String ln = rs.getString("lastName");
                String ar = rs.getString("address");
                String email = rs.getString("email");
                String phonenumber = rs.getString("phoneNumber");
                String[] data = {Customerid, fn, ln, ar, email, phonenumber};
                model.addRow(data);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "SqlException: " + e.getMessage(), "Equipment rental store", JOptionPane.ERROR_MESSAGE);
        }
    }

    public boolean retrieveRentItem(JTable jt, int customerID) {
        DefaultTableModel model = (DefaultTableModel) jt.getModel();
        String sql = "SELECT * FROM Rental WHERE customerID = ?";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, customerID);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (!rs.next()) {
                    JOptionPane.showMessageDialog(null, "No any item rent", "Equipment rental store", JOptionPane.ERROR_MESSAGE);
                    return false;
                } else {
                    do {
                        String equipmentId = rs.getString("equipmentID");

                        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                        SimpleDateFormat outputFormat = new SimpleDateFormat("dd/MM/yyyy");
                        Date parsedRentalDate = inputFormat.parse(rs.getString("rentalDate"));
                        String rentalDate = outputFormat.format(parsedRentalDate);

                        Date parsedReturnDate = inputFormat.parse(rs.getString("returnDate"));
                        String returnDate = outputFormat.format(parsedReturnDate);

                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        LocalDate returnDateLD = LocalDate.parse(returnDate, formatter);
                        LocalDate currentDate = LocalDate.now();
                        long daysOverdue = ChronoUnit.DAYS.between(returnDateLD, currentDate);

                        double lateFeePerDay = Double.parseDouble(rs.getString("lateFee"));

                        double totalLateFee = 0.0;

                        if (daysOverdue > 0) {
                            double calculatedLateFee = daysOverdue * lateFeePerDay;
                            double originalLateFee = Double.parseDouble(rs.getString("lateFee"));
                            totalLateFee = originalLateFee + calculatedLateFee;
                        }

                        String[] data = {equipmentId, rentalDate, returnDate, String.valueOf(totalLateFee)};

                        model.addRow(data);
                    } while (rs.next());
                    return true;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Equipment rental store", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean retrieveRentItem(int customerID) {
        String sql = "SELECT * FROM Rental WHERE customerID = ?";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, customerID);

            try (ResultSet rs = pstmt.executeQuery()) {
                return rs.next();
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Equipment rental store", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
