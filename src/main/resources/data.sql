DELETE FROM PERSON;

INSERT INTO PERSON(name,message) values("Varun","Hey this is Varun");
INSERT INTO PERSON(name,message) values("Joe","Hey this is Joe");

DELETE FROM BOOK;
DELETE FROM AUTHOR;

INSERT INTO AUTHOR(aFName,aLName,bio,a_Publisher) values ("Jane","Doe","Lorem Ipsum Verbatum","Bogus Inc.");
INSERT INTO AUTHOR(aFName,aLName,bio,a_Publisher) values ("John","Doe","If Life was just a Dream", "Chex LLC");
	   
INSERT INTO BOOK(isbn,b_Name,b_Desc,b_Price,authorID,genre,publisher,pub_Year,s_Copies) values ("1234567890123","When I Dream Of Cheese","A book about a cheese-loving man.",19.99,2,"Fiction","Chex LLC","3034",46000);
INSERT INTO BOOK(isbn,b_Name,b_Desc,b_Price,authorID,genre,publisher,pub_Year,s_Copies) values ("0000000000000","The Realm of Placeholders","The world told through the eyes of the mundane",34.49,1,"Memoir","PartyHard LLC", "2022",500000);

