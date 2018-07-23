package com.onyou.memo;

import java.util.Scanner;

/**
 * 간편 메모장 메인 class
 */

public class MemoMain {
    public static void main(String[] args){
        MemoMotion motion = new MemoMotion();
        boolean runFlag = true;
        Scanner sc = new Scanner(System.in);

        while ( runFlag ) {
            motion.showMenu();
            String selected = sc.nextLine();
            switch ( selected ) {
                case "1": //쓰기
                    motion.write(sc);
                    break;
                case "2": //읽기
                    motion.read(sc);
                    break;
                case "3": //수정
                    motion.change(sc);
                    break;
                case "4": //삭제
                    motion.remove(sc);
                    break;
                case "0": //종료
                    runFlag = false;
                    break;
                default:
                    System.out.println("잘 못 입력 하셨습니다.");
            }
        }
    }
}
