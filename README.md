# JDBC 라이브러리 구현하기

## 1. JDBC 라이브러리 구현하기
- [x] SQL 쿼리 작성, 쿼리에 전달할 인자, 조회 결과를 추출하는 것에만 집중할 수 있도록 라이브러리 만들기
  - [x] 중복제거를 위해 JdbcTemplate을 구현한다.
  - [x] 기존 Dao에서 활용하던 DataSource 대신 JdbcTemplate을 사용하도록 변경한다.


## 2. 리팩토링
- [x] 라이브러리를 클린코드로 작성한다.
- [x] 요구사항 중 없는 기능을 구현한다.
  - [x] 예외 처리
- [x] JdbcTemplate 테스트를 작성한다.


## 3. Transaction 적용하기
- [x] 트랜잭션 경계 설정을 할 수 있다.
  - [x] 서비스에서 커넥션을 가져온다.
  - [x] dao의 메소드를 호출할 때 커넥션을 전달한다.

## 4.Transaction synchronization 적용하기
- [x] Transaction synchronization 적용
  - [x] DataSourceUtils를 사용해 connection 객체를 가져온다.
  - [x] TransactionSynchronizationManager가 잘 동작하도록 구현한다.
- [x] 트랜잭션 서비스 추상화
  - [x] 비즈니스 로직과 데이터 액세스 로직 분리
