package com.softtek.medicine.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) {

		// 127.6.44.130:3306 / medicineweb

		String s = "jdbc:mysql://localhost:3306/medicineweb";
		String username = "medicine";
		String password = "Stk1234!";

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			Connection con = DriverManager.getConnection(s, username, password);

			System.out.println(con.getClientInfo());

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
