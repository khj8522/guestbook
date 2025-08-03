# 간단한 방명록 웹 애플리케이션

## 프로젝트 소개  
Spring Boot, JPA, Thymeleaf를 활용해 간단한 방명록 CRUD 기능을 구현한 웹 애플리케이션입니다.  
방명록 등록, 수정, 삭제, 조회뿐 아니라 검색 쿼리와 페이징 처리도 포함되어 있어 데이터 흐름과 웹 개발 기본기를 익히는 데 중점을 뒀습니다.

## 사용 기술  
- Spring Boot  
- JPA (Java Persistence API)  
- Thymeleaf (서버 사이드 템플릿 엔진)  

## 주요 기능  
- 방명록 글 등록, 수정, 삭제, 조회  
- 검색 기능 (특정 키워드로 방명록 내용 검색)  
- 페이징 처리로 방명록 목록 나누어 보기  

## 실행 방법  
1. 프로젝트를 IntelliJ IDEA로 엽니다.  
2. 실행(run) 버튼을 눌러 서버를 시작합니다.  
3. 웹 브라우저에서 [http://localhost:8080/guestbook/list](http://localhost:8080/guestbook/list) 로 접속합니다.  

## 배운 점  
- Spring Boot와 JPA를 이용한 데이터 흐름(Controller → Service → Repository)을 이해하게 되었습니다.  
- 서버 사이드 렌더링(Thymeleaf)과 웹 요청 처리에 대한 기본적인 구조를 익혔습니다.  
- 검색 쿼리와 페이징 구현 방법을 경험했습니다.
