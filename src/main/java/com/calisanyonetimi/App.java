package com.calisanyonetimi;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

    public static void main(String[] args) {
        
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement()) {

            String createTableSQL = "CREATE TABLE IF NOT EXISTS employees ("
                                  + "id SERIAL PRIMARY KEY, "
                                  + "name VARCHAR(100) NOT NULL, "
                                  + "position VARCHAR(100) NOT NULL, "
                                  + "salary DECIMAL(10, 2) NOT NULL"
                                  + ");";
            stmt.executeUpdate(createTableSQL);
            System.out.println("Employees tablosu başarıyla oluşturuldu.");

            String truncateTableSQL = "TRUNCATE TABLE employees RESTART IDENTITY;";
            stmt.executeUpdate(truncateTableSQL);
            System.out.println("Employees tablosu temizlendi.");

            String insertSQL1 = "INSERT INTO employees (name, position, salary) VALUES ('Ali Veli', 'Yazılımcı', 60000.00);";
            stmt.executeUpdate(insertSQL1);
            System.out.println("Ali Veli başarıyla eklendi.");

            String insertSQL2 = "INSERT INTO employees (name, position, salary) VALUES ('Ayşe Fatma', 'Proje Yöneticisi', 75000.00);";
            stmt.executeUpdate(insertSQL2);
            System.out.println("Ayşe Fatma başarıyla eklendi.");

            System.out.println("\n--- Mevcut Çalışan Listesi ---");
            String selectAllSQL = "SELECT * FROM employees;";
            ResultSet rs = stmt.executeQuery(selectAllSQL);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String position = rs.getString("position");
                double salary = rs.getDouble("salary");

                System.out.println("ID: " + id + ", Adı: " + name + ", Pozisyon: " + position + ", Maaş: " + salary);
            }
            
            System.out.println("\n--- Maaş Güncelleme İşlemi ---");
            String updateSQL = "UPDATE employees SET salary = 65000.00 WHERE id = 1;";
            int affectedRows = stmt.executeUpdate(updateSQL);
            System.out.println(affectedRows + " satır güncellendi.");

            System.out.println("\n--- Güncellenmiş Çalışan Listesi ---");
            ResultSet rsUpdated = stmt.executeQuery(selectAllSQL);

            while (rsUpdated.next()) {
                int id = rsUpdated.getInt("id");
                String name = rsUpdated.getString("name");
                String position = rsUpdated.getString("position");
                double salary = rsUpdated.getDouble("salary");

                System.out.println("ID: " + id + ", Adı: " + name + ", Pozisyon: " + position + ", Maaş: " + salary);
            }
            
            System.out.println("\n--- Silme İşlemi ---");
            String deleteSQL = "DELETE FROM employees WHERE id = 1;";
            int affectedRowsDelete = stmt.executeUpdate(deleteSQL);
            System.out.println(affectedRowsDelete + " satır silindi.");

            System.out.println("\n--- Son Çalışan Listesi ---");
            ResultSet rsFinal = stmt.executeQuery(selectAllSQL);

            while (rsFinal.next()) {
                int id = rsFinal.getInt("id");
                String name = rsFinal.getString("name");
                String position = rsFinal.getString("position");
                double salary = rsFinal.getDouble("salary");

                System.out.println("ID: " + id + ", Adı: " + name + ", Pozisyon: " + position + ", Maaş: " + salary);
            }

        } catch (SQLException e) {
            System.err.println("Veritabanı işlemi sırasında bir hata oluştu: " + e.getMessage());
        }
    }
}