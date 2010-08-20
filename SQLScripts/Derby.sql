CREATE TABLE  BOOK 
   (ISBN VARCHAR(50) NOT NULL, 
	BOOK_NAME VARCHAR(100) NOT NULL, 
	PUBLISHER_CODE VARCHAR(4), 
	PUBLISH_DATE DATE, 
	PRICE integer, 
	 PRIMARY KEY (ISBN), 
	 FOREIGN KEY (PUBLISHER_CODE)
	  REFERENCES  PUBLISHER (CODE)
   )

CREATE TABLE  CHAPTER 
   (BOOK_ISBN VARCHAR(50) NOT NULL, 
	IDX integer NOT NULL, 
	TITLE VARCHAR(100) NOT NULL, 
	NUM_OF_PAGES integer, 
	 PRIMARY KEY (BOOK_ISBN, IDX), 
	 FOREIGN KEY (BOOK_ISBN)
	  REFERENCES  BOOK (ISBN)
   )
CREATE TABLE  PUBLISHER (CODE VARCHAR(4) NOT NULL ,PUBLISHER_NAME VARCHAR(100) NOT NULL, ADDRESS VARCHAR(200),  PRIMARY KEY (CODE) );

insert into PUBLISHER(code, publisher_name, address) values ('001', 'Apress', 'New York ,New York');
insert into PUBLISHER(code, publisher_name, address) values ('002', 'Manning', 'San Francisco', 'CA')

insert into book(isbn, book_name, publisher_code, publish_date, price) values ('PBN123', 'Spring Recipes', '001', DATE('2008-02-02'), 30)
insert into book(isbn, book_name, publisher_code, publish_date, price) values ('PBN456', 'Hibernate Recipes', '002', DATE('2008-11-02'), 40)