DROP SCHEMA IF EXISTS CUSTOMERS;
CREATE SCHEMA CUSTOMERS;

DROP TABLE IF EXISTS CUSTOMERS.CUSTOMERS;
CREATE TABLE CUSTOMERS.CUSTOMERS (
        customer_id  INTEGER PRIMARY KEY,
        family_name VARCHAR(20) NOT NULL,
        first_name VARCHAR(20) NOT NULL
);

COMMENT ON TABLE CUSTOMERS.CUSTOMERS IS '顧客';
COMMENT ON COLUMN CUSTOMERS.CUSTOMERS.customer_id IS '利用者ID';
COMMENT ON COLUMN CUSTOMERS.CUSTOMERS.family_name IS '利用者名';
COMMENT ON COLUMN CUSTOMERS.CUSTOMERS.first_name IS '電話番号';