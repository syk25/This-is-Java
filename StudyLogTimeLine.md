# 2023.08.24(목)
## 학습내용 요약
- [5.11 main 메서드](src/ch05/sec11/5.11_main_method.md)</br>
- [5.12 열거타입](src/ch05/sec12/5.12_Enum.md)</br>
- 5장 연습문제 풀이 및 오답노트
- [6.1 객체지향프로그래밍](src/ch06/sec01/6.1_OOP.md)</br>
## 고찰
### 객체지향의 정의
객체지향의 사실과 오해에서 설명하는 객체지향과 '이것이 자바다'에서 정의하는 객체지향프로그래밍은 사뭇 다르다.
특히, 현실의 객체와 소프트웨어 상의 객체의 취급이 다르다.
### 객체지향프로그래밍의 특징 중 다형성
다형성의 정의를 책에 기재된 대로 정리하긴 했지만 그 내용이 아직 확실하게 공감되지는 않는다.
공부를 좀 더 하면서 해당 부분을 수정해야겠다.
### boolean 배열의 선언시 기본값
null 인 줄 알았는데 false 였다.

# 2023.08.25(금)
## 학습내용 요약
- [6.1 객체지향프로그래밍](src/ch06/sec01/6.1_OOP.md)</br>
- [6.2 객체와 클래스](src/ch06/sec02/6.2_ObjectsAndClasses.md)</br>
- [6.3 클래스 선언](src/ch06/sec03/6.3_Class_Declaration.md)</br>
- [6.4 객체생성과 클래스변수](src/ch06/sec04/6.4_Object.md)</br>
- [6.5 클래스의 구성멤버](src/ch06/sec05/6.5_ClassMember.md)</br>
- [6.6 필드의 선언과 사용](src/ch06/sec06/6.6_Field.md)</br>
- [6.7 생성자의 선언과 호출](src/ch06/sec07/6.7_constructor.md)</br>
- [6.8 메서드 선언과 호출](src/ch06/sec08/6.8_method.md)</br>

## 고찰
이제서야 객체지향 프로그래밍에 입문을 한 것 같다. 
연산자, 제어문까지만 해도 수학의 산수를 하는 느낌이었다.
클래스, 객체, 메서드에 대해 다루고나서부터는 현재 나가는 스프링 진도를 더 잘 이해하기 시작했다.
강사님들이 하는 말도 이해의 수준으로 내려왔다.

# 2023.08.26(토)
## 학습내용
[6.9 인스턴스 멤버](src/ch06/sec09/6.9_InstanceMember.md)</br>
[6.10 정적 멤버](src/ch06/sec10/6.10_StaticMember.md)</br>
[6.11 final, 상수](src/ch06/sec11/6.11_FinalAndConstant.md)</br>
[6.12 패키지](src/ch06/sec12/6.12_package.md)</br>
[6.13 접근제한자](src/ch06/sec13/6.13_Restrictor.md)</br>

# 2023.08.27(일)
## 학습내용
[6.14 Getter, Setter](src/ch06/sec14/6.14_GetterAndSetter.md)</br>
[6.15 Singleton 패턴](src/ch06/sec15/6.15_Singleton.md)</br>
[7.1 상속개념](src/ch07/sec01/7.1_Inheritance.md)</br>
[7.2 클래스 상속](src/ch07/sec02/7.2_ClassInheritance.md)</br>
[7.3 부모생성자 호출](src/ch07/sec03/7.3_ParentContstructorCall.md)</br>
[7.4 메서드 재정의](src/ch07/sec04/7.4_MethodOverriding.md)</br>
[7.5 final 클래스와 final 메서드](src/ch07/sec05/7.5_FinalClassAndFinalMethod.md)</br>

## 고찰
> 클래스 취급 시 전체 이름으로 '**인지**'할 것</br>

코드 상에 객체를 생성할 때 쓰이는 클래스의 이름이 다른 디렉토리랑 겹칠 때가 있다.
그리고 겹쳐질 때 서로 다른 클래스랑 혼돈이 일어날 수 있다.
이를 방지하기 위해 디렉토리를 포함한 클래스의 전체이름으로 클래스를 인지하고 다른 클래스와 혼동되지 않도록 하자.
이를 위해 생성자 호출 시 어느 디렉토리의 클래스인지 인지를 하자.

# 2023.08.28(월)
## 학습내용
[7.6 protected access modifier](src/ch07/sec06/7.6_protected.md)</br>
[7.7 클래스타입변환](src/ch07/sec07/7.7_TypeTransition.md)</br>
[7.8 다형성](src/ch07/sec08/7.8_Polymorphism.md)</br>
[7.9 instanceof](src/ch07/sec09/7.9_instanceof.md)</br>
[7.10 추상클래스](src/ch07/sec10/7.10_AbstractClassAndMethod.md)</br>
[7.11 봉인된 클래스](src/ch07/sec11/7.11_SealedClass.md)</br>
[8.1 인터페이스의 역할](src/ch08/sec01/8.1_Interface.md)</br>
[8.2 인터페이스와 구현클래스의 선언](src/ch08/sec02/8.2_InterfaceDeclaration.md)</br>
[8.3 상수필드](src/ch08/sec03/8.3_ConstantField.md)</br>

## 고찰
> 다형성이란 방법은 동일하나 결과가 다른 성질이다.</br>

다형성을 활용하게 된다면 코드의 수를 줄일 수 있다. 별도의 객체를 생성할 필요없이 클래스 간에 상속관계를 만들어놓고 메서드들을 적절히 재정의한다면 중복코드를 쓸 필요없이 코드를 작성할 수 있기 때문이다.
다만, 상속관계를 별도로 설정을 해야하는데 이를 추적하는 게 번거로울 것 같다 .

> 메서드를 재정의할 때 부모클래스의 메서드보다 접근제한을 강화해서는 안된다.</br>

> 자식클래스가 부모클래스로 자동타입변환 한 뒤 다시 자식클래스로 돌아가려고할 때만 수동타입변환이 허용된다.</br>

> A instanceof B b 를 이용해서 A 가 B와 동일한 클래스인지 여부를 확이할 수 있다. 