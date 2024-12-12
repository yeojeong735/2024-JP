#### 이것이 자바다(3판) ch07 확인문제 8번
##### - 출력 결과 작성

##### 1. 부모 클래스 - Tire.java
```java
public class Tire {
	public void run() {
		System.out.println("일반 타이어가 굴러갑니다.");
	}
}
```

##### 2. 자식 클래스 - SnowTire.java
```java
public class SnowTire extends Tire{
	@Override
	public void run() {
		System.out.println("스노우 타이어가 굴러갑니다.");
	}
}
```

##### 3. 실행 클래스 - SnowTireExample.java
```java
public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		snowTire.run();
		tire.run();

	}
}
```

