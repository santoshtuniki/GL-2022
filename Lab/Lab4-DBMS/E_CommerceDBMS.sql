CREATE DATABASE IF NOT EXISTS e_commerce;
USE e_commerce;

/* 1. CREATE TABLES */
CREATE TABLE IF NOT EXISTS SUPPLIER(
SUPP_ID INT PRIMARY KEY,
SUPP_NAME VARCHAR(50) NOT NULL,
SUPP_CITY VARCHAR(50) NOT NULL,
SUPP_PHONE VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS CUSTOMER(
CUS_ID	INT PRIMARY KEY,
CUS_NAME VARCHAR(20) NOT NULL,
CUS_PHONE VARCHAR(10) NOT NULL,
CUS_CITY VARCHAR(30) NOT NULL,
CUS_GENDER CHAR(1) NOT NULL
);

CREATE TABLE IF NOT EXISTS CATEGORY(
CAT_ID INT PRIMARY KEY,
CAT_NAME VARCHAR(20) NOT NULL
);

CREATE TABLE IF NOT EXISTS PRODUCT(
PRO_ID INT,
PRO_NAME VARCHAR(20) NOT NULL DEFAULT "Dummy",
PRO_DESC VARCHAR(60),
CAT_ID INT,
PRIMARY KEY(PRO_ID),
FOREIGN KEY(CAT_ID) REFERENCES CATEGORY(CAT_ID)
);

CREATE TABLE IF NOT EXISTS SUPPLIER_PRICING(
PRICING_ID INT PRIMARY KEY,
PRO_ID	INT,
SUPP_ID	INT,
SUPP_PRICE INT DEFAULT 0,
FOREIGN KEY(PRO_ID) REFERENCES PRODUCT(PRO_ID),
FOREIGN KEY(SUPP_ID) REFERENCES SUPPLIER(SUPP_ID)
);

CREATE TABLE IF NOT EXISTS `ORDER`(
ORD_ID INT PRIMARY KEY,
ORD_AMOUNT INT NOT NULL,
ORD_DATE DATE NOT NULL,
CUS_ID INT,
PRICING_ID INT,
FOREIGN KEY(CUS_ID) REFERENCES CUSTOMER(CUS_ID),
FOREIGN KEY(PRICING_ID) REFERENCES SUPPLIER_PRICING(PRICING_ID)
);

CREATE TABLE IF NOT EXISTS RATING(
RAT_ID INT PRIMARY KEY,
ORD_ID INT,
RAT_RATSTARS INT NOT NULL,
FOREIGN KEY(ORD_ID) REFERENCES `ORDER`(ORD_ID)
);

/* 2. INSERT DATA INTO THE TABLES */
INSERT INTO SUPPLIER VALUES(1,"Rajesh Retails","Delhi",'1234567890');
INSERT INTO SUPPLIER VALUES(2,"Appario Ltd.","Mumbai",'2589631470');
INSERT INTO SUPPLIER VALUES(3,"Knome products","Banglore",'9785462315');
INSERT INTO SUPPLIER VALUES(4,"Bansal Retails","Kochi",'8975463285');
INSERT INTO SUPPLIER VALUES(5,"Mittal Ltd.","Lucknow",'7898456532');

INSERT INTO CUSTOMER VALUES(1,"AAKASH",'9999999999',"DELHI",'M');
INSERT INTO CUSTOMER VALUES(2,"AMAN",'9785463215',"NOIDA",'M');
INSERT INTO CUSTOMER VALUES(3,"NEHA",'9999999999',"MUMBAI",'F');
INSERT INTO CUSTOMER VALUES(4,"MEGHA",'9994562399',"KOLKATA",'F');
INSERT INTO CUSTOMER VALUES(5,"PULKIT",'7895999999',"LUCKNOW",'M');

INSERT INTO CATEGORY VALUES( 1,"BOOKS");
INSERT INTO CATEGORY VALUES(2,"GAMES");
INSERT INTO CATEGORY VALUES(3,"GROCERIES");
INSERT INTO CATEGORY VALUES (4,"ELECTRONICS");
INSERT INTO CATEGORY VALUES(5,"CLOTHES");

INSERT INTO PRODUCT VALUES(1,"GTA V","Windows 7 and above with i5 processor and 8GB RAM",2);
INSERT INTO PRODUCT VALUES(2,"TSHIRT","SIZE-L with Black, Blue and White variations",5);
INSERT INTO PRODUCT VALUES(3,"ROG LAPTOP","Windows 10 with 15inch screen, i7 processor, 1TB SSD",4);
INSERT INTO PRODUCT VALUES(4,"OATS","Highly Nutritious from Nestle",3);
INSERT INTO PRODUCT VALUES(5,"HARRY POTTER","Best Collection of all time by J.K Rowling",1);
INSERT INTO PRODUCT VALUES(6,"MILK","1L Toned MIlk",3);
INSERT INTO PRODUCT VALUES(7,"Boat EarPhones","1.5Meter long Dolby Atmos",4);
INSERT INTO PRODUCT VALUES(8,"Jeans","Stretchable Denim Jeans with various sizes and color",5);
INSERT INTO PRODUCT VALUES(9,"Project IGI","compatible with windows 7 and above",2);
INSERT INTO PRODUCT VALUES(10,"Hoodie","Black GUCCI for 13 yrs and above",5);
INSERT INTO PRODUCT VALUES(11,"Rich Dad Poor Dad","Written by RObert Kiyosaki",1);
INSERT INTO PRODUCT VALUES(12,"Train Your Brain","By Shireen Stephen",1);

INSERT INTO SUPPLIER_PRICING VALUES(1,1,2,1500);
INSERT INTO SUPPLIER_PRICING VALUES(2,3,5,30000);
INSERT INTO SUPPLIER_PRICING VALUES(3,5,1,3000);
INSERT INTO SUPPLIER_PRICING VALUES(4,2,3,2500);
INSERT INTO SUPPLIER_PRICING VALUES(5,4,1,1000);
INSERT INTO SUPPLIER_PRICING VALUES(6,12,2,780);
INSERT INTO SUPPLIER_PRICING VALUES(7,12,4,789);
INSERT INTO SUPPLIER_PRICING VALUES(8,3,1,31000);
INSERT INTO SUPPLIER_PRICING VALUES(9,1,5,1450);
INSERT INTO SUPPLIER_PRICING VALUES(10,4,2,999);
INSERT INTO SUPPLIER_PRICING VALUES(11,7,3,549);
INSERT INTO SUPPLIER_PRICING VALUES(12,7,4,529);
INSERT INTO SUPPLIER_PRICING VALUES(13,6,2,105);
INSERT INTO SUPPLIER_PRICING VALUES(14,6,1,99);
INSERT INTO SUPPLIER_PRICING VALUES(15,2,5,2999);
INSERT INTO SUPPLIER_PRICING VALUES(16,5,2,2999);

INSERT INTO `ORDER` VALUES (101,1500,"2021-10-06",2,1);
INSERT INTO `ORDER` VALUES(102,1000,"2021-10-12",3,5);
INSERT INTO `ORDER` VALUES(103,30000,"2021-09-16",5,2);
INSERT INTO `ORDER` VALUES(104,1500,"2021-10-05",1,1);
INSERT INTO `ORDER` VALUES(105,3000,"2021-08-16",4,3);
INSERT INTO `ORDER` VALUES(106,1450,"2021-08-18",1,9);
INSERT INTO `ORDER` VALUES(107,789,"2021-09-01",3,7);
INSERT INTO `ORDER` VALUES(108,780,"2021-09-07",5,6);
INSERT INTO `ORDER` VALUES(109,3000,"2021-09-10",5,3);
INSERT INTO `ORDER` VALUES(110,2500,"2021-09-10",2,4);
INSERT INTO `ORDER` VALUES(111,1000,"2021-09-15",4,5);
INSERT INTO `ORDER` VALUES(112,789,"2021-09-16",4,7);
INSERT INTO `ORDER` VALUES(113,31000,"2021-09-16",1,8);
INSERT INTO `ORDER` VALUES(114,1000,"2021-09-16",3,5);
INSERT INTO `ORDER` VALUES(115,3000,"2021-09-16",5,3);
INSERT INTO `ORDER` VALUES(116,99,"2021-09-17",2,14);

INSERT INTO RATING VALUES(1,101,4);
INSERT INTO RATING VALUES(2,102,3);
INSERT INTO RATING VALUES(3,103,1);
INSERT INTO RATING VALUES(4,104,2);
INSERT INTO RATING VALUES(5,105,4);
INSERT INTO RATING VALUES(6,106,3);
INSERT INTO RATING VALUES(7,107,4);
INSERT INTO RATING VALUES(8,108,4);
INSERT INTO RATING VALUES(9,109,3);
INSERT INTO RATING VALUES(10,110,5);
INSERT INTO RATING VALUES(11,111,3);
INSERT INTO RATING VALUES(12,112,4);
INSERT INTO RATING VALUES(13,113,2);
INSERT INTO RATING VALUES(14,114,1);
INSERT INTO RATING VALUES(15,115,1);
INSERT INTO RATING VALUES(16,116,0);

/* Query - 3 */
SELECT T2.CUS_GENDER,COUNT(CUS_ID) AS CUSTOMER_COUNT FROM
	(SELECT T1.CUS_ID,T1.CUS_GENDER,T1.ORD_AMOUNT FROM 
		(SELECT CUSTOMER.CUS_NAME, CUSTOMER.CUS_GENDER,`ORDER`.* FROM CUSTOMER 
		INNER JOIN 
		`ORDER` ON CUSTOMER.CUS_ID = `ORDER`.CUS_ID
		WHERE 
		ORD_AMOUNT>=3000) AS T1
	GROUP BY T1.CUS_ID) AS T2
GROUP BY T2.CUS_GENDER;

/* Query - 4 */
SELECT PRODUCT.PRO_NAME,`ORDER`.* FROM PRODUCT
INNER JOIN 
SUPPLIER_PRICING ON PRODUCT.PRO_ID = SUPPLIER_PRICING.PRO_ID
INNER JOIN 
`ORDER` ON `ORDER`.PRICING_ID = SUPPLIER_PRICING.PRICING_ID
WHERE
`ORDER`.CUS_ID=2;

/* Query - 5 */
SELECT SUPPLIER.* FROM SUPPLIER
INNER JOIN
(SELECT SUPP_ID,COUNT(PRO_ID) FROM SUPPLIER_PRICING 
GROUP BY SUPP_ID
HAVING COUNT(PRO_ID)>1) AS T1
ON SUPPLIER.SUPP_ID = T1.SUPP_ID;

/* Query - 6 */
SELECT T3.CAT_ID,T3.CAT_NAME,T3.PRO_NAME,MIN(MIN_PRICE) AS MIN_PRICE FROM
	(SELECT CATEGORY.*,T2.PRO_NAME,T2.MIN_PRICE FROM CATEGORY
	INNER JOIN
		(SELECT PRODUCT.*,T1.MIN_PRICE FROM PRODUCT
		INNER JOIN
			(SELECT PRO_ID,MIN(SUPP_PRICE) AS MIN_PRICE FROM SUPPLIER_PRICING GROUP BY PRO_ID) AS T1
		ON PRODUCT.PRO_ID = T1.PRO_ID) AS T2
	ON CATEGORY.CAT_ID = T2.CAT_ID) AS T3
GROUP BY T3.CAT_ID;

/* Query - 7 */
SELECT PRODUCT.PRO_ID,PRODUCT.PRO_NAME FROM PRODUCT
INNER JOIN 
SUPPLIER_PRICING ON PRODUCT.PRO_ID = SUPPLIER_PRICING.PRO_ID
INNER JOIN
`ORDER` ON SUPPLIER_PRICING.PRICING_ID = `ORDER`.PRICING_ID
WHERE `ORDER`.ORD_DATE>"2021-10-05";

/* Query - 8 */
SELECT CUS_NAME,CUS_GENDER FROM CUSTOMER 
WHERE 
CUS_NAME LIKE "A%" OR CUS_NAME LIKE "%A";

/* Query - 9 */
DELIMITER &&
CREATE PROCEDURE proc()
BEGIN
SELECT REPORT.SUPP_ID,REPORT.SUPP_NAME,REPORT.AVERAGE,
CASE
WHEN REPORT.AVERAGE = 5 THEN "Excellent Service"
WHEN REPORT.AVERAGE > 4 THEN "Good Service"
WHEN REPORT.AVERAGE > 2 THEN "Average Service"
ELSE "Poor service"
END AS Type_of_Service FROM
	(SELECT SUPPLIER.SUPP_ID,SUPPLIER.SUPP_NAME,T3.AVERAGE FROM
		(SELECT T2.SUPP_ID, SUM(T2.RAT_RATSTARS)/COUNT(T2.RAT_RATSTARS) AS AVERAGE FROM
			(SELECT SUPPLIER_PRICING.SUPP_ID,T1.ORD_ID,T1.RAT_RATSTARS FROM SUPPLIER_PRICING
			INNER JOIN
					(SELECT `ORDER`.PRICING_ID,RATING.ORD_ID,RATING.RAT_RATSTARS FROM `ORDER`
					INNER JOIN
					RATING ON RATING.ORD_ID =`ORDER`.ORD_ID) AS T1 
			ON SUPPLIER_PRICING.PRICING_ID = T1.PRICING_ID) AS T2 
		GROUP BY T2.SUPP_ID) AS T3 
	INNER JOIN
	SUPPLIER ON T3.SUPP_ID = SUPPLIER.SUPP_ID) 
AS REPORT;
END &&
DELIMITER ;
CALL proc();