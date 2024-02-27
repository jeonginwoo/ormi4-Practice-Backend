CREATE TABLE accounts
(
    name    VARCHAR(100) NOT NULL,
    balance INT          NOT NULL
);

SELECT *
FROM accounts;

-- 트랜잭션 시작
BEGIN;

INSERT INTO accounts(name, balance)
VALUES ('A', 10000);


DROP TABLE accounts;
