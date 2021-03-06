package step08;

public class Exam02_1 {
    static class A {
        // 1) 클래스 메서드  = static 메서드
        
        static void m1() {
            System.out.println("m1()");
        }
        
        // 2) 인스턴스 메서드
        //  => 인스턴스 주소가 있어야만 호출할 수 있다.
        void m2() {
            System.out.println("m2()");
        }
    }
    
    public static void main(String[] args) {
        // 클래스 메서드 호출
        A.m1();
        
        // 인스턴스 메서드는 클래스 이름으로 호출할 수 없다.
        //A.m2();
        
        A obj1 = new A();
        obj1.m1(); // 이렇게 하지 말라
                   // 물론 클래스 메서드를 인스턴스 주소를 사용하여 호출할 수 있지만,
                   // 다른 개발자가 그냥 인스턴스 메서드인줄 착각할 수 있기 때문에
                   // 이렇게 호출하지 말기를 권고한다.
        obj1.m2();
        A obj2 = null;
        obj2.m2();
        
    }
}

// 인스턴스 변수를 사용할 경우 인스턴스 메서드로 선언하라!

// 실무 => 일단 인스턴스 메서드로 무조건 만들라!
// => 인스턴스 변수를 완전히 사용하지 않음을 확신하면 그때 클래스 메서드로 전환하라
