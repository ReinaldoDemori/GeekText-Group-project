DELETE FROM PERSON;
DELETE FROM SHOPPING_CART;
DELETE FROM SHOPPING_CART_ITEMS;


INSERT INTO person(username,password,name,address) values("fiu@fiu.edu", "12345", "Reinaldo Demori", "1054 NW 56th ave");
INSERT INTO person(username,password,name,address) values("dim@gmail.com", "65432", "Jeremy Elbertson", "1054 NW 56th ave");

INSERT INTO credit_card(credit_number, username, exp_date, sec_code) values ("123456789", "fiu@fiu.edu", "12/30", 123)

INSERT INTO SHOPPING_CART(shopping_cart_id, user_id) values(1, 1);
INSERT INTO SHOPPING_CART(shopping_cart_id, user_id) values(2, 2);

INSERT INTO SHOPPING_CART_ITEMS(shopping_cart_item_id, shopping_cart_id, bookisbn) values(1, 1, 1234);
INSERT INTO SHOPPING_CART_ITEMS(shopping_cart_item_id, shopping_cart_id, bookisbn) values(2, 1, 4567);
INSERT INTO SHOPPING_CART_ITEMS(shopping_cart_item_id, shopping_cart_id, bookisbn) values(3, 2, 1000);
DELETE FROM BOOK;
DELETE FROM AUTHOR;

INSERT INTO AUTHOR(aFName,aLName,bio,a_Publisher) values ("Jane","Doe","Lorem Ipsum Verbatum","Bogus Inc.");
INSERT INTO AUTHOR(aFName,aLName,bio,a_Publisher) values ("John","Doe","If Life was just a Dream", "Chex LLC");

INSERT INTO BOOK(isbn,b_Name,b_Desc,b_Price,authorID,genre,publisher,pub_Year,s_Copies) values ("1234567890123","When I Dream Of Cheese","A book about a cheese-loving man.",19.99,2,"Fiction","Chex LLC","3034",46000);
INSERT INTO BOOK(isbn,b_Name,b_Desc,b_Price,authorID,genre,publisher,pub_Year,s_Copies) values ("0000000000000","The Realm of Placeholders","The world told through the eyes of the mundane",34.49,1,"Memoir","PartyHard LLC", "2022",500000);

