#### 이것이 자바다(3판) ch07 확인문제 7번
##### - 출력 결과 작성

##### 1. 부모 클래스 - Parent.java
```java
public class Parent{
	public String nation;
	
	public Parent() {
		this("대한민국");
		System.out.println("Parent() call");
	}	
  public Parent(String nation) {
			this.nation = nation;
			System.out.println(nation + "Parent(String nation) call");
   }
  }
```

##### 2. 자식 클래스 - Child.java
public class Child extends Parent{
	public String name;
	
	public Child() {
		this("홍길동");
		System.out.println("child() call");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("child(String name) call");
	}
}

##### 3. 메인 클래스 - ChildExample.java
```java
public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();

	}

}
```
##### 출력 결과
```
Parent(String nation) call
Parent() call
child(String name) call
child() call
```

##### 이유
###### - 자식 클래스의 생성자가 호출되면, 항상 부모 클래스 생성자를 먼저 호출해야하므로 Parent.java 먼저 출력되고 Child.java가 출력된다.
