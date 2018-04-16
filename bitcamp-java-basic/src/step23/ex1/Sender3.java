// 클라이언트 + 키보드 + 무한반복
package step23.ex1;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Sender3 {
    public static void main(String[] args) throws Exception {
        Scanner keyScan = new Scanner(System.in);
        
        Socket socket = new Socket("192.168.0.7", 8888);
        
        PrintStream out = new PrintStream(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream());
        
        while (true) {
            // 키보드 입력을 받아서 서버에 전송한다.
            System.out.print("입력>");
            String input = keyScan.nextLine();
            
            out.println(input);
            
            // 서버가 보낸 데이터를 수신한다.
            String str = in.nextLine();
            System.out.println(str);

            if (input.equals("quit"))
                break;
        }
        
        
        // 항상 입출력 도구는 사용 후 닫아야 한다.
        in.close();
        out.close();
        
        // 네트워크 연결도 닫는다.
        socket.close();
        keyScan.close();
    }
}