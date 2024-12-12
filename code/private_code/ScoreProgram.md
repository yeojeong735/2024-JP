##### 문제 : 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.

##### 1. 부모 클래스 - Score.java
```java
public class Score{
	public int score;
	public void score(int score){
		if(score >= 90 && score <= 100) {
			System.out.println("A");
		}else if(score >= 80 && score <=89){
			System.out.println("B");
		}else if(score >= 70 && score <= 79) {
			System.out.println("C");
		}else if(score >= 60 && score <= 69) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
}
```

##### 2. 자식 클래스 - scorePrint.java
```java
import java.util.Scanner;
public class scorePrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("자신의 시험점수를 적으시오. : ");
		int score = sc.nextInt();
		
		Score s = new Score();
		s.score(score);
	}
}
```
