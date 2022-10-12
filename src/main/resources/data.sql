INSERT INTO PERSON(name,message) values("Varun","Hey this is Varun");
INSERT INTO PERSON(name,message) values("Joe","Hey this is Joe");

INSERT INTO SHOPPING_CART(shopping_cart_id, user_id) values(1, 1);
INSERT INTO SHOPPING_CART(shopping_cart_id, user_id) values(2, 2);

INSERT INTO SHOPPING_CART_ITEMS(shopping_cart_item_id, shopping_cart_id, bookisbn) values(1, 1, 1234);
INSERT INTO SHOPPING_CART_ITEMS(shopping_cart_item_id, shopping_cart_id, bookisbn) values(2, 1, 4567);
INSERT INTO SHOPPING_CART_ITEMS(shopping_cart_item_id, shopping_cart_id, bookisbn) values(3, 2, 1000);
