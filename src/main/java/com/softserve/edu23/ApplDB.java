package com.softserve.edu23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ApplDB {
	private static Connection con = null;
	//private static String username = "lv673";
	//private static String password = "Lv-673.DevOps";
	//private static String URL = "jdbc:mysql://192.168.153.138:3306";
	//private static String URL = "jdbc:mysql://192.168.153.138:3306/lv651";
	//private static String URL = "jdbc:mysql://192.168.153.134:3306/teach";
	//
	private static String username = "postgres";
    private static String password = "root";
    //private static String URL = "jdbc:postgresql://localhost:5432/";
    private static String URL = "jdbc:postgresql://localhost:5432/lv651";

	public static void main(String[] args) throws SQLException {
		System.out.println("Start...");
		//DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		con = DriverManager.getConnection(URL, username, password);
		if (con != null) {
			System.out.println("Connection Successful! \n");
		} else {
			System.out.println("Connection ERROR \n");
			System.exit(1);
		}
		Statement st = con.createStatement();
		/*-
		//st.execute("CREATE DATABASE lv651;");
		//st.execute("USE lv651;");
		String query = "CREATE TABLE temp "
		    //+ "( id int unsigned not null auto_increment primary key, " // for mysql
			+ "( id int not null primary key, " // for postgre
			+ "name varchar(20), "
			+ "login varchar(20), "
			+ "password varchar(30), "
			+ "age int );";
		st.execute(query);
		*/
		/*
		//String query = "INSERT INTO temp (name,login,password,age) VALUES ('Ivan','iva','qwerty',21);";
		String query = "INSERT INTO temp (name,login,password,age) VALUES ('Petro','pet','123456',22);";
        // String query = "INSERT INTO temp (id,name,login,password,age) VALUES (2,'Petro2','pet2','123456',22);"; // for postgre
        //String query = "INSERT INTO temp (id,name,login,password,age) VALUES (3,'Ivan','iv','123456',22);"; // for postgre
		//
		st.execute(query);
		*/
		//st.execute("INSERT INTO temp (name,login,password,age) VALUES ('Ira','ira','asdfgh',23);");
		//st.executeUpdate("UPDATE temp SET name='Tolik' WHERE login LIKE 'p%';");
		//st.executeUpdate("UPDATE temp SET name='Petro' WHERE id=2;");
		//st.execute("DELETE FROM temp WHERE name='Tolik';");
		//
		/*
		con.setAutoCommit(false);
		try {
    		st.executeUpdate("UPDATE temp SET name='Tolik' WHERE login LIKE 'p%';");
    		st.executeUpdate("UPDATE temp SET name='Petro' WHERE id=2;");
    		con.commit();
    		System.out.println("con.commit();");
		} catch(Exception e) {
		    System.out.println("con.rollback();");
		    con.rollback();
		}
		con.setAutoCommit(true);
		*/
		/*-
		//st.execute("USE lv651;");
		ResultSet rs = st.executeQuery("select * from temp;");
		//st.execute("select * from temp;");
		//ResultSet rs = st.getResultSet(); // for 1 only
		*/
		// /*-
		//String queryStr = "SELECT * FROM temp WHERE name LIKE 'Pet%';";
		//String queryStr = "SELECT * FROM temp WHERE name = ?;";
		//String queryStr = "SELECT * FROM temp WHERE name LIKE ?;";
		String queryStr = "SELECT * FROM temp WHERE name LIKE ?||'%';";
		PreparedStatement pstmt = con.prepareStatement(queryStr);
		//pstmt.setString(1, "Petr%");
		pstmt.setString(1, "Petr");
		ResultSet rs = pstmt.executeQuery();
		//ResultSet rs = st.executeQuery(queryStr);
		// */
		/*
		String queryStr = "SELECT * FROM temp WHERE name LIKE '%s%%';";
		//System.out.println(String.format(queryStr, "Petr"));
		ResultSet rs = st.executeQuery(String.format(queryStr, "Petr"));
		*/
		//
		//ResultSet rs = st.executeQuery("select * from users;");
		int columnCount = rs.getMetaData().getColumnCount();
		// Resultset.getMetaData () get the information
		for (int i = 1; i <= columnCount; i++) {
			//System.out.print(rs.getMetaData().getColumnName(i) + "\t");
		    System.out.print(rs.getMetaData().getColumnLabel(i) + "\t");
		}
		System.out.println();
		// output file
		while (rs.next()) {
			for (int i = 1; i <= columnCount; i++) {
			    if (i == columnCount) {
			        System.out.print("\t");
			    }
				System.out.print(rs.getString(i) + "\t");
				if (i == columnCount) {
                    System.out.print("\t Column type = " + rs.getMetaData().getColumnType(i));
                }
			}
			System.out.println();
		}
		System.out.println("before close");
//        if (pstmt != null) {
//            pstmt.close();
//        }
		if (rs != null) {
			rs.close();
		}
		// */
		if (st != null) {
			st.close();
		}
		if (con != null) {
			con.close();
		}
		System.out.println("DONE");
	}
}
