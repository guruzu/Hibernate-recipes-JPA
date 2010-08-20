CREATE TABLE  "BOOK" 
   (	"ISBN" VARCHAR2(50) NOT NULL ENABLE, 
	"BOOK_NAME" VARCHAR2(100) NOT NULL ENABLE, 
	"PUBLISHER_CODE" VARCHAR2(4), 
	"PUBLISH_DATE" DATE, 
	"PRICE" NUMBER(*,0), 
	 PRIMARY KEY ("ISBN") ENABLE, 
	 FOREIGN KEY ("PUBLISHER_CODE")
	  REFERENCES  "PUBLISHER" ("CODE") ENABLE
   )

CREATE TABLE  CHAPTER 
   (BOOK_ISBN VARCHAR2(50) NOT NULL, 
	IDX NUMBER(*,0) NOT NULL, 
	"TITLE" VARCHAR2(100) NOT NULL ENABLE, 
	"NUM_OF_PAGES" NUMBER(*,0), 
	 PRIMARY KEY ("BOOK_ISBN", "IDX") ENABLE, 
	 FOREIGN KEY ("BOOK_ISBN")
	  REFERENCES  "BOOK" ("ISBN") ENABLE
   )
CREATE TABLE  PUBLISHER (CODE VARCHAR(4) NOT NULL ,PUBLISHER_NAME VARCHAR(100) NOT NULL, ADDRESS VARCHAR(200),  PRIMARY KEY (CODE) );

insert into PUBLISHER(code, publisher_name, address) values ('001', 'Apress', 'New York ,New York');
insert into PUBLISHER(code, publisher_name, address) values ('002', 'Manning', 'San Francisco', 'CA')

insert into book(isbn, book_name, publisher_code, publish_date, price) values ('PBN123', 'Spring Recipes', '001', to_date('02-02-2008','mm-dd-yyyy'), 30)

insert into book(isbn, book_name, publisher_code, publish_date, price) values ('PBN456', 'Hibernate Recipes', '002', to_date('11-02-2009','mm-dd-yyyy'), 40)