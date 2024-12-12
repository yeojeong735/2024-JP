### 이것이 자바다(3판) ch07 확인문제 6번
##### - 밑줄에 들어갈 코드 작성

##### 1. 부모 클래스
```java
public class Activity{
	public void onCreate() {
		System.out.println("기본적인 실행 내용");
	}
}
```

##### 2. 자식 클래스
```java
 public class MainActivity extends Activity{
	 @Override
	 public void onCreate() {
		 _______.onCreate();
		 System.out.println("추가적인 실행 내용");
	 }
}
```

##### 정답과 이유
###### 정답은 super, super는 부모 클래스의 멤버(필드, 메서드)를 참조하거나 부모 클래스의 생성자를 호출할 때 사용하기 때문
