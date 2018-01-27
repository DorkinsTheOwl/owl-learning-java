package com.company;

import java.sql.*;

public class Main {
    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:D:\\programming\\java\\TestDB\\" + DB_NAME;

    public static final String TABLE_CONTACTS = "contacts";

    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {
//        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\programming\\java\\TestDB\\testjava.db");
//             Statement statement = conn.createStatement()) { // no need to close manually, connection will be closed automatically

        try {
            Connection conn = DriverManager.getConnection(CONNECTION_STRING);
            Statement statement = conn.createStatement();

            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);

            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS + " ("
                    + COLUMN_NAME + " TEXT, "
                    + COLUMN_PHONE + " INTEGER, "
                    + COLUMN_EMAIL + " TEXT" + ")");

            insertContact(statement, "Tony", 13454554, "tony@baloney.com");
            insertContact(statement, "Bruce", 33221111, "bruce@bat.man");
            insertContact(statement, "Michael", 5554468, "michael@dunder.com");
            insertContact(statement, "Jim", 999666555, "jim@dunder.com");

            statement.execute("UPDATE " + TABLE_CONTACTS + " SET "
                    + COLUMN_PHONE + "=222211111330000" + " WHERE "
                    + COLUMN_NAME + " = 'Bruce'");

            statement.execute("DELETE FROM " + TABLE_CONTACTS + " WHERE "
                    + COLUMN_NAME + "='Jim'");


//            statement.execute("SELECT * FROM contacts");
//            ResultSet results = statement.getResultSet();
            ResultSet results = statement.executeQuery("SELECT * FROM contacts"); // this line replaces 2 above
            while (results.next()) {
                System.out.println(results.getString("name") + " " +
                        results.getInt("phone") + " " +
                        results.getString("email"));
            }
            results.close();

            // close DB unless we are using try with resources
            statement.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }

    private static void insertContact(Statement statement, String name, int phone, String email) throws SQLException {
        statement.execute("INSERT INTO " + TABLE_CONTACTS + " ("
                + COLUMN_NAME + ", "
                + COLUMN_PHONE + ", "
                + COLUMN_EMAIL + " ) " + "VALUES('" + name + "', " + phone + ", '" + email + "')");
    }
}
