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
>   - [7. 로그인,회원가입 기능 만들기]()
>   - [8. 테스트 코드로 메소드 테스트하기]()

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
|11. 로그인 , 회원가입 화면 만든것 추가 - 9월 18일 | 컨텍스트 패스 때문에 애먹음 |
|12. 코드 리팩토링 , User 클래스의 Getter Setter 제거 및 Board에 User 연관관계 추가 - 9월 19일 | @Data와 @AllArgsConstructor를 사용하면서 Getter Setter 제거 , ManyToOne 연관 관계 추가|
|13. RestController에 대한 테스트 코드 작성 및 User 객체애 대한 테스트 코드 작성 - 9월 21일 | RestController의 테스트 코드는 통과했지만 User모델의 테스트 코드는 NullPointerExceptions 에러 발생(AllArgsConstructor에서는 Role타입이 걸려서 따로     생성자를 주었지만 맞지않고 테스트 실패)|