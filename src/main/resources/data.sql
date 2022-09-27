DELETE FROM PERSON;

INSERT INTO PERSON(name,message) values("Varun","Hey this is Varun");
INSERT INTO PERSON(name,message) values("Joe","Hey this is Joe");

DELETE FROM BOOK;
DELETE FROM AUTHOR;

INSERT INTO Author
Values (1,'Jane','Doe','Lorem Ipsum Verbatum','Bogus Inc.'),
       (2,'John','Doe','If Life was just a Dream', 'Chex LLC');
	   
INSERT INTO Book
Values ('1234567890123','When I Dream Of Cheese','A book about a cheese-loving man.',19.99,2,'Fiction','Chex LLC','3034',46000),
       ('0000000000000','The Realm of Placeholders','The world told through the eyes of the mundane',34.49,1,'Memoir','PartyHard LLC', '2022',500000);

