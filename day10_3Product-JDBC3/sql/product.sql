-- product.sql
/*
Product adidas =
				new Product("S001", "슈퍼스타", 87200, 5);
*/
-- 1. RPODUCT 테이블 생성 구문
/* prodcode 	NUMBER(4)
 * prodname 	VARCHAR2(50)
 * price 	 	NUMBER(12)
 * quantity 	NUMBER(3)
 * regdate		DATE	DEFAULT sysdate
 * moddate 		DATE
 * pk_product :	prodcode
 */
CREATE TABLE PRODUCT(
prodcode 	NUMBER(4)               
,prodname 	VARCHAR2(50)               
,price 	 	NUMBER(12)                 
,quantity 	NUMBER(3)                  
,regdate		DATE	DEFAULT sysdate    
,moddate 		DATE      
,constraint pk_product primary key(prodcode)  
);

-- 2. isExists() : 동일 데이터가 존재하는지 선조회
SELECT p.PRODCODE
  FROM product p
  WHERE p.PRODCODE = ?
  
-- 3. add() : 신규 제품 정보 등록
INSERT INTO PRODUCT(PRODCODE, PRODNAME, PRICE, QUANTITY) VALUES(?,?,?,?);

-- 4. get() : 
select p.prodcode
     , p.prodName
     , p.price
     , p.quantity
  from product p
 where p.prodcode = ?
     ;
