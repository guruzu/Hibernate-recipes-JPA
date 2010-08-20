/**
 * 
 */
package com.hibernaterecipes.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;

import com.hibernaterecipes.annotations.dao.BookDAO;
import com.hibernaterecipes.annotations.dao.SessionManager;
import com.hibernaterecipes.annotations.domain.Book;

/**
 * @author Guruzu  
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In Test");
	
		try {
			//Class.forName("org.hsqldb.jdbcDriver");
			//Connection con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/BookShopDB","sa","");
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/BookShopDB","book","book");
			System.out.println("Connection -- " +con);
			Statement stat = con.createStatement();
			/*stat.execute("CREATE TABLE PUBLISHER (CODE VARCHAR(4) NOT NULL,PUBLISHER_NAME VARCHAR(100) NOT NULL,ADDRESS VARCHAR(200),PRIMARY KEY (CODE))");
			stat.execute("CREATE TABLE BOOK (ISBN VARCHAR(50) NOT NULL,BOOK_NAME VARCHAR(100) NOT NULL," +
					"PUBLISHER_CODE VARCHAR(4), PUBLISH_DATE DATE,PRICE INT, " +
					"PRIMARY KEY (ISBN),FOREIGN KEY (PUBLISHER_CODE) REFERENCES PUBLISHER)");
			stat.execute("CREATE TABLE CHAPTER ( " +
					"BOOK_ISBN VARCHAR(50) NOT NULL, "+
					"IDX INT NOT NULL,"+
					"TITLE VARCHAR(100) NOT NULL,"+
					"NUM_OF_PAGES INT,"+
					"PRIMARY KEY (BOOK_ISBN, IDX), "+
					"FOREIGN KEY (BOOK_ISBN) REFERENCES BOOK "+
					")");*/
			stat.execute("insert into PUBLISHER(code, publisher_name, address) values ('001', 'Apress', 'New York, New York')");
			stat.execute("insert into PUBLISHER(code, publisher_name, address) values ('002', 'Manning', 'San Francisco, CA')");
			
			stat.execute("insert into book(isbn, book_name, publisher_code, publish_date, price) values ('PBN123', 'Spring Recipes', '001', '02-02-2008', 30)");
			stat.execute("insert into book(isbn, book_name, publisher_code, publish_date, price) values ('PBN456', 'Hibernate Recipes', '002', '11-02-2009', 40)");
			
			ResultSet rs = stat.executeQuery("select * from BOOK");
			System.out.println("Book details - ");
			while(rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
			}
			
			/*BookDAO bookDAO = new BookDAO();
			for(int i=1;i<100;i++)
			{
				Book newBook = new Book();
				int isbn = 512+i;
				newBook.setBookName("Book"+(i));
				newBook.setIsbn(new Integer(isbn).toString());
				newBook.setPublishDate(new Date());
				//newBook.setPublisherCode("002");
				newBook.setPrice(50l);
				//bookDAO.create(newBook);
			}*/
			
		
			
			
			
			//System.out.println("Session Factory - " +bookDAO.readAll().size());
			
			/*List<Book> list = bookDAO.readFromManager();
			System.out.println("List of Books - " + list.size());*/
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
