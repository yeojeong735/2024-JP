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

##### 4. 출력 결과
```
스노우 타이어가 굴러갑니다.
스노우 타이어가 굴러갑니다.
```

##### 이유
###### tire는 Tire 타입이지만, 참조하고 있는 실제 객체는 SnowTire입니다. 자바의 다형성에서는 참조 변수의 타입이 아닌, 실제 객체의 타입에 따라 동작이 결정됩니다. tire.run() 호출 시, 실제 객체가 SnowTire이므로 SnowTire의 run() 메서드가 호출됩니다.
