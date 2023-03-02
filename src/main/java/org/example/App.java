package org.example;

import java.util.Scanner;

public class App {
    private final Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("== 명언 앱 ==");

        long lastWiseSayingId = 1;

        while (true){


            System.out.print("명령) ");
            //trim() : 혹시 있을지 모를 좌우공백제거된 버전으로 주세요
            String command = sc.nextLine().trim();

            if (command.equals("종료")) {
                break;
            }
            else if (command.equals("등록")) {
                System.out.print("명언 : ");
                String content = sc.nextLine().trim();
                System.out.print("작가 : ");
                String authorName = sc.nextLine().trim();

                System.out.printf("%d번 명령이 등록되었습니다.\n", lastWiseSayingId);
                lastWiseSayingId++; //증₩

            }
        }

    }
}
