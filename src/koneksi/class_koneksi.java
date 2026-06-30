package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;

public class class_koneksi {

    public static Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/db_lab_peminjaman";
            String user = "root";
            String pass = "";

            Connection conn = DriverManager.getConnection(url, user, pass);

            System.out.println("Koneksi Berhasil");
            return conn;

        } catch (Exception e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
            return null;
        }
    }
}