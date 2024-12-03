package ch07.sec02;
import java.util.Scanner;

// < 클래스 구조 >
			      //|addition(+)
//operation <-상속-//|subtraction(-)
			      //|multiplication(*)
			      //|division(/)
//calculator (메인 실행 부분)

//기본 클래스
class Operation {
 protected double num1;
 protected double num2;

 public Operation(double num1, double num2) {
     this.num1 = num1;
     this.num2 = num2;
 }

 public double calculate() {
     return 0; // 기본 연산 없음
 }
}

//더하기 클래스
class Addition extends Operation {
 public Addition(double num1, double num2) {
     super(num1, num2);
 }

 @Override
 public double calculate() {
     return num1 + num2;
 }
}

//빼기 클래스
class Subtraction extends Operation {
 public Subtraction(double num1, double num2) {
     super(num1, num2);
 }

 @Override
 public double calculate() {
     return num1 - num2;
 }
}

//곱하기 클래스
class Multiplication extends Operation {
 public Multiplication(double num1, double num2) {
     super(num1, num2);
 }

 @Override
 public double calculate() {
     return num1 * num2;
 }
}

//나누기 클래스
class Division extends Operation {
 public Division(double num1, double num2) {
     super(num1, num2);
 }

 @Override
 public double calculate() {
     return num1 / num2;
 }
}

//메인 클래스
public class calculator {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("첫 번째 숫자를 입력하세요: ");
     double num1 = scanner.nextDouble();

     System.out.print("두 번째 숫자를 입력하세요: ");
     double num2 = scanner.nextDouble();

     System.out.print("연산자를 입력하세요 (+, -, *, /): ");
     char operator = scanner.next().charAt(0);

     Operation operation; // 부모 클래스 타입의 참조 변수 선언

     switch (operator) {
         case '+':
             operation = new Addition(num1, num2); // Addition 객체를 참조
             break;
         case '-':
             operation = new Subtraction(num1, num2); // Substraction 객체를 참조
             break;
         case '*':
             operation = new Multiplication(num1, num2); // Multiplication 객체를 참조
             break;
         case '/':
             operation = new Division(num1, num2); // Division 객체를 참조
             break;
         default: 
             System.out.println("잘못된 연산자입니다.");
             return;
     }
 }
}

