package step04;
// 비트 이동 연산자 : 응용 3
public class Exam04_6 {
    public static void main(String[] args) {
        // 다음 변수의 값을 조사하여 개발자가 어떤 프로그래밍 언어를 사용할 수 
        // 있는지 출력하라!
        // 각 비트의 해당하는 프로그래밍 언어는 다음 순서를 따른다
        //   c, cpp, java, js, python, php, html, css

        int lang = 0b1110_0011;
        // lang 변수에 들어 있는 각 비트 값을 조사하여
        // 1이면 그 변수에 해당하는 프로그래밍 이름을 출력한다
        //  if 조건문, &, == 연산자를 활용하라!
        // 실행결과 
        // c cpp java html css

         
        if ((lang & 0b1000_0000) == 0x80) System.out.print("c ");        
        if ((lang & 0x40) > 0) System.out.print("cpp ");
        if ((lang & 0x20) > 0) System.out.print("java ");
        if ((lang & 0b0001_0000) == 0b0001_0000) System.out.print("js ");
        if ((lang & 0b0000_1000) == 0b0000_1000) System.out.print("python ");
        if ((lang & 0b0000_0100) == 0b0000_0100) System.out.print("php ");
        if ((lang & 2) > 0) System.out.print("html ");
        if ((lang & 1) == 0b0000_0001) System.out.print("css ");
        System.out.println();  
        
        // 여기에 코드를 작성!

    }
}