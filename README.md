# 공부하면서 만드는 스프링


## 만들어볼 내용 - 스프링 게시판

> 1. 사용기술 : 프론트엔드(부트스트랩) , 백엔드(SpringBoot,Spring-Sequrity,RestAPI) , DB(MySQL),Insomnia(API테스트툴)
> 2. 해야될 일 :
>   - [1. 스프링부트 프로젝트 설정하기 (.yml 야믈파일 설정)](https://github.com/LeeJongAnn/SpringBoot-Study/tree/master/memory/1%EB%B2%88)
>   - [2. MySQL 서버와 관련된 yml파일 설정완료 및  Hello World 찍어보기](https://github.com/LeeJongAnn/SpringBoot-Study/tree/master/memory/2%EB%B2%88)
>   - [3. DB에 집어넣을 엔티티 클래스 작성하기](https://github.com/LeeJongAnn/SpringBoot-Study/tree/master/memory/3%EB%B2%88)
>   - [4. MySQL 테이블 생성하기](https://github.com/LeeJongAnn/SpringBoot-Study/blob/master/memory/4%EB%B2%88/README.md)
>   - [5. CRUD 생성 및 테스트](https://github.com/LeeJongAnn/SpringBoot-Study/blob/master/memory/5%EB%B2%88/README.md)
>   - [6. 프론트 화면(메인,로그인,회원가입) 만들기(부트스트랩으로)](https://github.com/LeeJongAnn/SpringBoot-Study/tree/master/memory/6%EB%B2%88)
>   - [7. 로그인,회원가입 기능 만들기](https://github.com/LeeJongAnn/SpringBoot-Study/tree/master/memory/7%EB%B2%88)
>   - [8. Spring Security 적용하기]()
>   - [9. 글쓰기,수정,삭제,조회 만들기]()

|작성내용|비고|
|------|---|
|1. 기본 프로젝트 구성 - 9월 9일 | 메이븐으로 구성 |
|2. yml파일 설정 및 설명 작성 - 9월 10일 | 포트 번호 및 컨텍스트 패스 작성 |
|3. yml파일 작성 완료 , Controller 작성 및 테스트 - 9월 11일 | 설명은 추후에 추가 예정 |
|4. 메인화면 , 로그인 , 회원가입 화면 뼈대 만듬 , 2번에 관한 설명 일부 작성 - 9월 12일 | 엔티티클래스 작성하고 테이블 작성하는건 건너뛰고 UI부터 만듬 |
|5. User 엔티티 클래스 추가 및 User Repository 추가  - 9월 12일 | maven에 jpa 레포지토리가 작성이 안돼있어서 처음에 계속 jpa가 안불러와져서 당황했음 메이븐에 의존성 추가
|*|AutoWired userRepository DI 주입이 안돼서 당황함 , 이것도 해결|
|6. MySQL과 스프링부트 연동해서 테이블 생성되는지 확인,그리고 3번에 해당하는 설명 일부 작성  - 9월 13일 | 설명은 계속 작성 예정 |
|중간에 DB 테이블이 작성이 안되는 오류가 생겨서 다 밀고 다시 시작함|*|
|7. testController에서 jpa 테스트용 API 일부 작성 - 9월 14일 | 조회용 API 작성,DB 유저에 CreationTimestamp 어노테이션 추가해서 시간 표시 |
|8. testController API테스트 및 작성 - 9월 15일 | save테스트 및 id로 select 테스트, 전체 조회 및 페이지 조회 테스트, update 테스트|
|9. board,Role 엔티티 추가 - 9월 16일 | enum 타입에 대해서 복습하기,그리고 연관관계 맵핑에 대해서 공부하기|
|10. User 클래스에 Role 추가 - 9월 17일 | User Role이 enum타입으로 USER와 ADMIN 둘 중 하나로 정하는데 USER로 정해서 POST 날리면 새로 생기는 데이터는 Role이 항상 USER로 들어감|
|11. 로그인 , 회원가입 화면 만든것 추가 - 9월 18일 | ~~컨텍스트 패스 때문에 애먹음~~ html에서는 풀경로로 적고,요청 날릴때는 컨텍스트 패스 제거해도 된다. |
|12. 코드 리팩토링 , User 클래스의 Getter Setter 제거 및 Board에 User 연관관계 추가 - 9월 19일 | @Data와 @AllArgsConstructor를 사용하면서 Getter Setter 제거 , ManyToOne 연관 관계 추가|
|13. RestController에 대한 테스트 코드 작성 및 User 객체애 대한 테스트 코드 작성 - 9월 21일 |왜 됐는지 모르겠는데 됐음|
|14. 회원가입 화면에서 받는 정보를 넘겨줄 save함수 작성 - 9월 21일 | jquery 점점 사장되고 있는데 공부해야 되는건가..? |
|15. BoardController에 이동할 주소 맵핑함 - 9월 21일 | Controller 어노테이션을 안붙여서 페이지를 찾을 수 없는 황당한 실수를 함 |
|16. 회원가입시 수행할 ajax 요청 작성 및 Reply 엔티티 클래스 추가 - 9월 23일 | Reply엔티티 클래스 연관관계 작성|
|17. 회원가입시 실행될 Service 함수 작성 및 Dto 추가 - 9월 27일 | 회원가입 클래스는 나중에 이후에 작성 예정|
|18. Swagger-UI 추가 - 9월 29일 | API 문서화를 위한 swagger-UI 추가|
|19. Service에서 로그인 추가 - 10월 4일 | 로그인을 위한 JS파일 역시 수정 |
|20. Security 적용 하기 위해서 설정 추가 및 기존에 있는 로그인 제거 - 10월 8일 | 시험기간임..  |
|21. 대참사남 .. 분명 로그인 되는걸 확인했는데 오늘 다시 보니 프로젝트가 오류 뜨면서 수행이 안됨 - 10월 8일 | 아마 롤백해야될듯 .. 시험기간이라고!!...  |
|22. 로그인 제거하고 주소 수정 - 10월 11일 | 로그인 부분에 오류가 있는것으로 보인다  |
|23. 회원가입 되는지 확인 - 22년 1월 25일 | 회원가입으로 돌아감 |
|24. 로그인 확인완료 - 22년 1월 26일 | 로그인까지 다시 옴 |
|25. 패키지 정리 및 Test 코드로 데이터베이스 삭제 , 로그인 및 회원가입 디자인 개선 - 22년 1월 28일 | 패키지 정리가 안되어 있어서 너무 더러웠음, 로그인 회원가입 화면도 너무 대충 만들어진것 같아서 다듬음 |
|26. 시큐리티 로그인 성공 - 22년 2월 13일  | 돌고 돌아서 시큐리티 로그인까지 성공 |
|27. 글쓰기까지 했는데 문제가 있음 - 22년 2월 20일  | DB에 글이 생성이 안됨, 왜 그러는지 좀 확인해봐야 될 듯 |
|28. 오늘 다시켜서 해보니 정상 작동함 ... 글목록 모델 값 넘겨줬는데 목록이 안나오는 문제가 있음 - 22년 2월 21일  | ~~DB에 글이 생성이 안됨, 왜 그러는지 좀 확인해봐야 될 듯~~ 껐다켜서 해보니 정상 작동함... |
|29. 수정해서 글목록도 정상 작동함 - 22년 2월 21일  | jstl쓸 때 컨텐츠를 넘겨주는게 아니고 board를 통째로 써야됨 |
|30. 로그인 페이지에서 취소버튼 안먹히는 문제 수정 - 22년 2월 25일  |  |
|31. 삭제 기능 추가 중 - 22년 2월 26일  | 삭제 기능 추가 중 다음에는 HTML 수정 |
|32. 페이징 처리 추가 - 22년 3월 10일  | 페이징 처리 추가시 파라미터를 받는게 아닌 설정해주는 방식이라 URL로 조작이 불가능하다 |
