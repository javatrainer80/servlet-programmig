#topics
* Integrate JDBC with Servlet
* Create customer HTML form with id,name,address,age
* Read form data & insert into customer table.
* Init & context parameters.

# Add mysql-connector-java dependency
```xml
<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>8.0.33</version>
</dependency>
```
# SQL queries

```sql
create database cis;
use cis;
CREATE TABLE `customer` (
  `CUSTOMER_ID` int NOT NULL,
  `CUSTOMER_NAME` varchar(45) NOT NULL,
  `CUSTOMER_AGE` int NOT NULL,
  `CUSTOMER_ADDRESS` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`CUSTOMER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Customer table';

```
# send request to save the customer data
- http://localhost:8080/session-03/save-customer

# Verify the database customer table
- SELECT * FROM cis.customer;

		 


