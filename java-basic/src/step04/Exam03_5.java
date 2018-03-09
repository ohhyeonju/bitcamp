package step04;
// 논리 연산자 : 비트 연산
public class Exam03_5 {
    public static void main(String[] args) {
        int a = 0b0110_1100;
        int b = 0b0101_0101;

        // 정수 값에 대해서는 &&와 ||를 사용할 수 없다
        //System.out.println(a && b); // 컴파일 오류
        //System.out.println(a || b); // 컴파일 오류
        //System.out.println(!a); // 컴파일 오류

        // 그러나 &, |, ^, ! 는 사용할 수 있다
        // 1은 true, 0은 false라고 간주하고 계산
        System.out.println(a & b);
        // a = 0000 0000 0000 0000 0000 0000 0110 1100
        // b = 0000 0000 0000 0000 0000 0000 0101 0101

        
        System.out.println(a | b);
        // a = 0000 0000 0000 0000 0000 0000 0110 1100
        // b = 0000 0000 0000 0000 0000 0000 0101 0101
        //---------------------------------------------
        //     0000 0000 0000 0000 0000 0000 0111 1101 = 125

        System.out.println(a ^ b);
        // a = 0000 0000 0000 0000 0000 0000 0110 1100
        // b = 0000 0000 0000 0000 0000 0000 0101 0101
        //---------------------------------------------
        //     0000 0000 0000 0000 0000 0000 0011 1001 = 57

        // 비트 연산에서 not은 ! 연산가자 아니라 ~ 연산자이다
        System.out.println(~a);
        // a = 0000 0000 0000 0000 0000 0000 0110 1100
        //---------------------------------------------
        //     1111 1111 1111 1111 1111 1111 1001 0011 = -109

    }
}

// 비트 연산자는 이미지 및 영상 처리에 사용된다 
//   예) 마스킹, 오버레이 기법에 사용
//   예) 색조 변경에 사용된다.
// 사진을 컴퓨터에 저장하려면 2진수화 시켜야 한다
// 일단 사진을 점(픽셀)으로 바꾼다 
// 각 픽셀은 RGB의 값으로 표현한다.

// 빨강 색의 한 픽셀 : 1111 1111 0000 0000 0000 0000 = 0xFF0000
// 노랑 색의 한 픽셀 : 1111 1111 1111 1111 0000 0000 = 0xFFFF00

// 비트 연산 활용 예1
// 화면을 좀 더 엔틱하게 표현하고 싶다. (누리끼리하게)
// -> 노란색 계통을 강화하는 것, 즉 빨강 초록빛을 강화하면 된다
//   1000 1100 1001 0010 1010 1100 (변경전 색)
// | 1001 0010 0100 1001 0000 0000
// ----------------------------------
//   1001 1110 1101 1011 1010 1100 (변경한 색)

// 비트 연산 활용 예2
// 화면을 좀 더 시원하게, 즉 푸르스름하게 
// -> 파란색 계통을 강화하거나 빵강이나 초록을 약화시킴
//   1000 1100 1001 0010 1010 1100 (변경전 색)
// & 1101 1011 1111 1101 1111 1111
// ----------------------------------
//   1000 1000 1001 0000 1010 1100 (변경한 색)