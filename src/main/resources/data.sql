/* Deletion of existing data */
DELETE FROM BOOK;
DELETE FROM AUTHOR;
DELETE FROM PERSON;
DELETE FROM SHOPPING_CART;
DELETE FROM SHOPPING_CART_ITEMS;

/* Person Data :2 instances: */
INSERT INTO person(username,password,name,address) values("fiu@fiu.edu", "12345", "Reinaldo Demori", "1054 NW 56th ave");
INSERT INTO person(username,password,name,address) values("dim@gmail.com", "65432", "Jeremy Elbertson", "1054 NW 56th ave");

/* Shopping Cart Data :2 instances: */
INSERT INTO SHOPPING_CART(user_id) values(1);
INSERT INTO SHOPPING_CART(user_id) values(2);

/* Shopping Cart Items Data :3 instances: */
INSERT INTO SHOPPING_CART_ITEMS(shopping_cart_id, bookisbn) values(1, 1234);
INSERT INTO SHOPPING_CART_ITEMS(shopping_cart_id, bookisbn) values(1, 4567);
INSERT INTO SHOPPING_CART_ITEMS(shopping_cart_id, bookisbn) values(2, 1000);

/* Author Data :7 instances: */
INSERT INTO AUTHOR(aFName,aLName,bio,a_Publisher) values ("Jane","Doe","Lorem Ipsum Verbatum","Bogus Inc.");
INSERT INTO AUTHOR(aFName,aLName,bio,a_Publisher) values ("John","Doe","If Life was just a Dream", "Chex LLC");
INSERT INTO AUTHOR(aFName,aLName,bio,a_Publisher) values ("Marcus","Tully","Amateur Herbologist and Photographer.","GreenBean Inc.");
INSERT INTO AUTHOR(aFName,aLName,bio,a_Publisher) values ("Phoenix","Wrong","Professional Prosecutor", "ACA LLC");
INSERT INTO AUTHOR(aFName,aLName,bio,a_Publisher) values ("Mary","Jean","Enjoys drawing flora as a hobby.","Bogus Inc.");
INSERT INTO AUTHOR(aFName,aLName,bio,a_Publisher) values ("Mary","Clark","Manga and Comics Enthusiast.", "Chex LLC");
INSERT INTO AUTHOR(aFName,aLName,bio,a_Publisher) values ("Lauren","Clark","She's always sunny side up!","GreenBean Inc.");

/* Book Data :13 instances: */
INSERT INTO BOOK(isbn,b_Name,b_Desc,b_Price,authorID,genre,publisher,pub_Year,s_Copies) values ("1234567890123","When I Dream Of Cheese","A book about a cheese-loving man.",19.99,2,"Fiction","Chex LLC","3034",46000);
INSERT INTO BOOK(isbn,b_Name,b_Desc,b_Price,authorID,genre,publisher,pub_Year,s_Copies) values ("0000000000000","The Realm of Placeholders","The world told through the eyes of the mundane",34.49,1,"Memoir","PartyHard LLC", "2022",500000);
INSERT INTO BOOK(isbn,b_Name,b_Desc,b_Price,authorID,genre,publisher,pub_Year,s_Copies) values ("1836218362122","Badge: As Defined","The judicial life of Phoenix Wrong.",9.99,4,"Autobiography","ACA LLC","2023",1250000);
INSERT INTO BOOK(isbn,b_Name,b_Desc,b_Price,authorID,genre,publisher,pub_Year,s_Copies) values ("1898923898311","Competition in the Judicial World","Covers past techniques used by prosecutors and defense attorneys since 2002!",27.28,4,"Memoir","ACA LLC", "2022",210000);
INSERT INTO BOOK(isbn,b_Name,b_Desc,b_Price,authorID,genre,publisher,pub_Year,s_Copies) values ("0912309138823","Have A Slice of MP!","A book that sends a message of mental positivity each day.",12.49,7,"Nonficiton","GreenBean Inc.","1987",2398000);
INSERT INTO BOOK(isbn,b_Name,b_Desc,b_Price,authorID,genre,publisher,pub_Year,s_Copies) values ("1230983091829","Grothrax: The Champion Supreme","Homer Simmons, a part-time security guard, gets summoned to participate in a gladitorial arena thats out of this world!",8.49,6,"Fantasy","Chex LLC", "2012",128380);
INSERT INTO BOOK(isbn,b_Name,b_Desc,b_Price,authorID,genre,publisher,pub_Year,s_Copies) values ("7374939873843","H and W: Telling The Difference","A book that covers the many weeds and herbs that can be found growing in a North American Backyard.",23.99,5,"Nonfiction","Bogus Inc.","3004",3294000);
INSERT INTO BOOK(isbn,b_Name,b_Desc,b_Price,authorID,genre,publisher,pub_Year,s_Copies) values ("6576819748374","Macro to Micro","A photobook showcasing insects, flora, and small fauna from a microscopic perspective.",13.79,3,"Nonfiction","GreenBean Inc.", "3012",509230);
INSERT INTO BOOK(isbn,b_Name,b_Desc,b_Price,authorID,genre,publisher,pub_Year,s_Copies) values ("2364032645374","Is Everything a Yokai?!","A book on japanese folklore from an outsider's perspective.",29.99,6,"Folklore","Chex LLC","2004",1293000);
INSERT INTO BOOK(isbn,b_Name,b_Desc,b_Price,authorID,genre,publisher,pub_Year,s_Copies) values ("4504371650743","Sunny and Cloud","A children's book about staying positive.",17.49,7,"Fantasy","GreenBean Inc.", "2000",501300);
INSERT INTO BOOK(isbn,b_Name,b_Desc,b_Price,authorID,genre,publisher,pub_Year,s_Copies) values ("0194758415878","Potion Omnibus!","The Official SpellBook from the Hit Show Tweeny Magic!",4.99,5,"Fiction","Bogus Inc.","3014",413000);
INSERT INTO BOOK(isbn,b_Name,b_Desc,b_Price,authorID,genre,publisher,pub_Year,s_Copies) values ("0018934798793","Leaves N Shadows","Where did all the trees go?",6.49,3,"Horror","PartyHard LLC", "3014",7438000);
INSERT INTO BOOK(isbn,b_Name,b_Desc,b_Price,authorID,genre,publisher,pub_Year,s_Copies) values ("3141592653589","Euclid's Elements","It is a collection of definitions, postulates, propositions (theorems and constructions), and mathematical proofs of the propositions",9.99,1,"Mathematics","N/A", "300 BC",500000);

/* Rank Data */
DELETE FROM RANK;
INSERT INTO RANK(rank, isbn) values(1, "1234567890123");
INSERT INTO RANK(rank, isbn) values(2, "0000000000000");
INSERT INTO RANK(rank, isbn) values(3, "1836218362122");
INSERT INTO RANK(rank, isbn) values(4, "1898923898311");
INSERT INTO RANK(rank, isbn) values(5, "0912309138823");
INSERT INTO RANK(rank, isbn) values(6, "1230983091829");
INSERT INTO RANK(rank, isbn) values(7, "7374939873843");
INSERT INTO RANK(rank, isbn) values(8, "6576819748374");
INSERT INTO RANK(rank, isbn) values(9, "2364032645374");
INSERT INTO RANK(rank, isbn) values(10, "4504371650743");
INSERT INTO RANK(rank, isbn) values(11, "0194758415878");
INSERT INTO RANK(rank, isbn) values(12, "0018934798793");
INSERT INTO RANK(rank, isbn) values(13, "3141592653589");



/* Random Data :[BLANK] instances: */