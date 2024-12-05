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
public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();

	}

}
```

