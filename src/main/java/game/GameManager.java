package game;

import java.util.Scanner;

public class GameManager {

    public void execute(Game game){
        do{
            game.play();
        }while(replay());
        System.out.println("게임을 종료합니다...");
    }

    public boolean replay(){
        Scanner sc = new Scanner(System.in);
        System.out.println("다시 하시겠습니까?(Y/y)");
        String res = sc.next();
        return "Y".compareToIgnoreCase(res) == 0;
    }
}
