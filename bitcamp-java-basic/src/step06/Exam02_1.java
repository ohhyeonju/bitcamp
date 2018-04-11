// 메서드 : 개념 및 기본 문법
package step06;
import java.util.Scanner;

public class Exam02_1 {
    // 문법
    // [리턴값의 타입] 함수명(파라미터선언,...) {명령어들}
    // - 리턴값의 타입 : 
    // 함수 블록에 들어있는 명령어를 수행 완료한 후 그 결과로 놓이는 값의 타입.
    // - 파라미터 선언 : 함수 블록을 실행할 때 외부로부터 받은 값을 저장할 변수 선언
    // 1) 메서드 : 리턴값(x), 파라미터(x)
    static void hello() {
        System.out.println("안녕하세요");
        System.out.println("이 메서드는 어떤 값도 리턴하지 않습니다.");
    }
    public static void main(String[] args) {
        // 메서드를 사용하는 방법
        // [리턴값을 받을 변수] = 메스드명(아규먼트);
        // 아규먼트(argument) : 
        // 메서드 블록에 들어 있는 명령을 실행하기 위해 넘겨주는 값
        // 즉 파라미터 변수에 넘겨주는 값
        // 파라미터 변수의 타입, 개수와 순서에 맞게 값을 넘겨줘야 한다

        // 리턴값을 받을 변수 :
        // 메서드 블록을 실행한 후 리턴되는 값을 받을 변수이다.
        // 메서드가 값을 리턴한다 하더라도 값을 받기 싫으면 변수를 선언하지 않아도 된다
        
        // 메서드 블록의 명령을 실행하기(메서드 실행, 메서드 호출)
        hello();
        System.out.println("hello() 실행 완료!");
        
        //hello(100); // 컴파일 오류!
        int i;
        i = hello(); // 컴파일 오류!
    }
}
// 메서드(method) = 함수(function) = 프로시저(procedure)
// 명령어를 기능 단위로 관리하기 쉽게 별도로 분리하여 묶어 놓는 것.
// - 반복적으로 자주 사용하는 명령어를 재사용하기 쉽도록 별도로 분리하여 묶어놓은 것

// 메서드 종류
// - 클래스 메서드 : 클래스에 소속, 모든 인스턴스에 대해 사용할 수 있다
//                  static이 붙는다 
// - 인스턴스 메서드 : 인스턴스에 대해 사용할 수 있다. static이 붙지 않는다
// 