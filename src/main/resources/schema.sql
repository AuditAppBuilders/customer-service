DROP TABLE IF EXISTS customer;
CREATE TABLE customer (customer_id bigint identity(1,1) NOT NULL PRIMARY KEY,
	full_name varchar(50) NOT NULL,
	status varchar(8) NOT NULL,
	coupons_alloted int NOT NULL,
	membership_start_date varchar(10) NOT NULL,
	membership_end_date varchar(10) NOT NULL,
	payment_status varchar(15) NOT NULL,
	payment_percentage int NOT NULL,
	sales_executive_name varchar(50) NOT NULL);