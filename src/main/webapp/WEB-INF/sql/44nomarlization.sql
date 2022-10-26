-- normalization(정규화)
-- 1 normal form (1NF) (책 215쪽)
-- 조건1 : primary key가 있어야함
-- 조건2 : 각 행의 데이터들은 원자적 값을 가져야함

-- PRIMARY KEY (pk, 기본키, 주키, 주요키, 키) (책 217쪽)
-- null이면 안됨
-- 레코드 삽입시 값이 있어야함
-- 간결해야함 
-- 변경 불가

-- 예) 국민에 관한 테이블
-- id, 이름, 성별, 생일, 주소, 주민등록번호



-- atomic data (책 210쪽)
-- 규칙1 : 원자적 데이터로 구성된 열은 그열에 같은
--         타입의 데이터를 여러 개 가질 수 없다.
-- 규칙2 : 원자적 데이터로 구성된 테이블은 같은 타입의
--         데이터를 여러 열에 가질 수 없다.

-- 주소 column
-- 배달관련 테이블
-- 상품, 주문번호, 주소(시구동)
-- ex)			서울시 강남구 역삼동 111

-- 인구통계 테이블 
-- 이름, 성별, 주소(시), 주소(구), 주소(동)





