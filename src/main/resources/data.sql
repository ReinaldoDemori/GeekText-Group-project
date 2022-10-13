

CREATE TABLE person (
  username VARCHAR(255) NOT NULL,
   password VARCHAR(255) NULL,
   name VARCHAR(255) NULL,
   address VARCHAR(255) NULL,
   CONSTRAINT pk_person PRIMARY KEY (username)
);

INSERT INTO PERSON(username,password,name,address) values("fiu@fiu.edu", "12345", "Reinaldo Demori", "1054 NW 56th ave");

);
