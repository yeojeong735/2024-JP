#### 이것이 자바다(3판) ch07 확인문제 6번
##### - 틀린 것 고치고 이유 작성

```java
public class Parent{
  public String name;

  public Parent(String name) {
    this.name = name;
  }
}

public class Child extends Parent {
  public int studentNo;

  Public Child(String name, int studentNo){
    this.name = name; // -> super(name);
    this.studentNo = studentNo;
  }
}
```
##### main 개념 : 
###### - this는 같은 클래스의 인스턴스(객체) 자신 참조, 현재 클래스의 멤버 변수와 생성자의 매개변수 이름이 같을 때, 이를 구분하기 위해 사용
###### - super는 부모 클래스의 멤버(필드, 메서드)를 참조하거나 부모 클래스의 생성자를 호출할 때 사용

##### 틀린 이유 :
###### 여기서는 부모 생성자를 호출 목적이므로 this가 아니라 super를 사용 
