DROP DATABASE candyStore;
CREATE DATABASE candyStore;

USE candyStore;

CREATE TABLE Candy(
candyID int NOT NULL AUTO_INCREMENT PRIMARY KEY,
candyName varchar(255),
candyPrice float
);

CREATE TABLE CandyType(
candyTypeID int NOT NULL AUTO_INCREMENT PRIMARY KEY,
candyType varchar(255)
);

CREATE TABLE CandyProperties(
candyPropertiesID int NOT NULL AUTO_INCREMENT PRIMARY KEY,
candyTypeID int NOT NULL,
candyID int NOT NULL
);
CREATE TABLE CustomerOrder(
customerOrderID int NOT NULL AUTO_INCREMENT PRIMARY KEY,
customerID int NOT NULL,
candyID int NOT NULL
);

CREATE TABLE Customer(
customerID int NOT NULL AUTO_INCREMENT PRIMARY KEY,
customerName varchar(255) NOT NULL,
streetAddress varchar(255),
city varchar(255),
state varchar(255),
zipCode varchar(255),
customerOrderID int NOT NULL
);

INSERT INTO Candy (candyName,candyPrice) VALUES ('Twix', 2.00);
INSERT INTO Candy (candyName,candyPrice) VALUES ('Snickers', 1.50);
INSERT INTO Candy (candyName,candyPrice) VALUES ('Milky Way', 1.25);
INSERT INTO Candy (candyName,candyPrice) VALUES ('Milky Way - Midnight Dark', 2.00);
INSERT INTO Candy (candyName,candyPrice) VALUES ('PayDay', 1.50);

INSERT INTO CandyType (candyType) VALUES ('Milk Chocolate');
INSERT INTO CandyType (candyType) VALUES ('Caramel');
INSERT INTO CandyType (candyType) VALUES ('Peanuts');
INSERT INTO CandyType (candyType) VALUES ('Dark Chocolate');

INSERT INTO CandyProperties (candyTypeID, candyID) VALUES (1,1);
INSERT INTO CandyProperties (candyTypeID, candyID) VALUES (1,2);
INSERT INTO CandyProperties (candyTypeID, candyID) VALUES (1,3);
INSERT INTO CandyProperties (candyTypeID, candyID) VALUES (2,1);
INSERT INTO CandyProperties (candyTypeID, candyID) VALUES (2,2);
INSERT INTO CandyProperties (candyTypeID, candyID) VALUES (2,3);
INSERT INTO CandyProperties (candyTypeID, candyID) VALUES (2,4);
INSERT INTO CandyProperties (candyTypeID, candyID) VALUES (2,5);
INSERT INTO CandyProperties (candyTypeID, candyID) VALUES (3,2);
INSERT INTO CandyProperties (candyTypeID, candyID) VALUES (3,5);
INSERT INTO CandyProperties (candyTypeID, candyID) VALUES (4,4);

INSERT INTO Customer(customerName,streetAddress,city,state,zipCode) VALUES ('John Q. Public', '255 Main Street','Atlanta','GA', '30309');
INSERT INTO Customer(customerName,streetAddress,city,state,zipCode) VALUES ('Sally Seashore', '23 Seaside Pkwy','Savannah','GA','12345');
INSERT INTO Customer(customerName,streetAddress,city,state,zipCode) VALUES ('Stanley Stupid', '1337 Postal Road','Marietta','GA', '30064');

ALTER TABLE Customer ADD FOREIGN KEY (customerOrderID) REFERENCES CustomerOrder(customerOrderID);
ALTER TABLE CustomerOrder ADD FOREIGN KEY (customerID) REFERENCES Customer(customerID);
ALTER TABLE CustomerOrder ADD FOREIGN KEY (candyID) REFERENCES Candy(candyID);


