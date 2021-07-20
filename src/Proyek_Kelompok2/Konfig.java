/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyek_Kelompok2;

/**
 *
 * @author ASUS
 */
import java.sql.*;

public class Konfig {
    private static Connection MySQLConfig;
    public static Connection configDB() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost:3306/proyek_ppbo"; //url database
            String user = "root";//user database
            String pass = ""; //password database

            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConfig = DriverManager.getConnection(url, user, pass);

        } catch (SQLException e) {
            System.err.println("koneksi gagal" + e.getMessage()); //perintah menampilkan error pada koneksi
        }

        return MySQLConfig;
    }
}
