## 1. RestController 테스트하기

처음 프로젝트를 만들고 RestController를 생성했었다.
그때 나왔던 내용은 Hi Dear? Who are You? 이런 문장이였고 ,
정상적으로 출력이 되는것을 확인했었다.

그렇다면 이것을 테스트 코드로 한번 작성해보도록 하겠다.
![img.png](img.png)

테스트가 통과했고 동일한 내용이 출력된다는 것을 알 수 있다.

***

## 2. User 테스트하기 

![img_1.png](img_1.png)

User 테스트 역시 통과하였고 , 다음과 같은 쿼리가 실행되는 것을 알 수 있다.

    Hibernate:
    insert
    into
    User
    (createTimestamp, email, password, role, username)
    values
    (?, ?, ?, ?, ?)
***
DB에 데이터가 들어간것 역시 확인할 수 있다.
***
![img_2.png](img_2.png)
