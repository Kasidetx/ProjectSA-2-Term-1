/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package method;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author kasidet
 */
public class SaveAccess {

    public int Saverentdatacustomer(String firstname, String lastname, String address, String email, String phoneNum) {
        String sql = "INSERT INTO Customer (firstName, lastName, address,email,phoneNumber) VALUES (?,?,?,?,?)";
        String readsql = "SELECT customerID FROM Customer WHERE phoneNumber = ?";
        int fetchedCustomerID = -1;
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql); PreparedStatement selectpstmt = conn.prepareStatement(readsql)) {
            pstmt.setString(1, firstname);
            pstmt.setString(2, lastname);
            pstmt.setString(3, address);
            pstmt.setString(4, email);
            pstmt.setString(5, phoneNum);

            pstmt.executeUpdate();

            selectpstmt.setString(1, phoneNum);
            try (ResultSet rs = selectpstmt.executeQuery()) {
                if (rs.next()) {
                    fetchedCustomerID = rs.getInt("customerID");
                } else {
                    System.out.println("No customer found with phone number: " + fetchedCustomerID);
                    return -1;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return fetchedCustomerID;
    }

    public void Saverentdatarent(int equipmentID, int customerID, LocalDate rentalDate, LocalDate returnDate, double rentalPrice, double lateFee, double totalprice) {
        String sql = "INSERT INTO Rental (equipmentID, customerID, rentalDate, returnDate, rentalPrice, lateFee, totalPrice) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, equipmentID);
            pstmt.setInt(2, customerID);
            pstmt.setDate(3, java.sql.Date.valueOf(rentalDate));
            pstmt.setDate(4, java.sql.Date.valueOf(returnDate));
            pstmt.setDouble(5, rentalPrice);
            pstmt.setDouble(6, lateFee);
            pstmt.setDouble(7, totalprice);

            pstmt.executeUpdate();
            String updateSql = "UPDATE Equipment SET note = ?, status = false WHERE equipmentID = ?";
            try (PreparedStatement updatePstmt = conn.prepareStatement(updateSql)) {
                updatePstmt.setString(1, "Renting with user " + customerID);
                updatePstmt.setInt(2, equipmentID);
                updatePstmt.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void returnRental(int equipmentID, int customerID) {
        String sql = "DELETE FROM Rental WHERE equipmentID = ? AND customerID = ?";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, equipmentID);
            pstmt.setInt(2, customerID);

            pstmt.executeUpdate();
            String updateSql = "UPDATE Equipment SET note = ?, status = true WHERE equipmentID = ?";
            try (PreparedStatement updatePstmt = conn.prepareStatement(updateSql)) {
                updatePstmt.setString(1, "");
                updatePstmt.setInt(2, equipmentID);
                updatePstmt.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error : " + e.getMessage(), "Equipment rental store", JOptionPane.ERROR_MESSAGE);
        }
    }
}
