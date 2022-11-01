DELETE FROM person;
DELETE FROM credit_card;


INSERT INTO person(username,password,name,address) values("fiu@fiu.edu", "12345", "Reinaldo Demori", "1054 NW 56th ave");
INSERT INTO person(username,password,name,address) values("dim@gmail.com", "65432", "Jeremy Elbertson", "1054 NW 56th ave");

INSERT INTO credit_card(credit_number, username, exp_date, sec_code) values ("123456789", "fiu@fiu.edu", "12/30", 123)
