package DouDiZhu;
/*
 * 洗牌
 * 发牌
 * 看牌
 *
 * 1.创建一个牌盒，往里面装牌
 * 2.洗牌
 * 3.
 * */

import java.util.ArrayList;
import java.util.Collections;

public class Poker1 {
    public static void main(String[] args) {
        ArrayList<String> Pokerdui = new ArrayList<String>();

        String[] folowers = {"♣", "♦", "♠", "♥"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "j", "Q", "K", "A",};
        String[] wang = {"Big Joker", "Small Joker"};

        //制作扑克牌并且放牌堆里头
        for (String folower : folowers) {
            for (String number : numbers) {
                String Poker = folower + number;
                Pokerdui.add(Poker);
            }
        }
        Pokerdui.add(wang[0]);
        Pokerdui.add(wang[1]);

        System.out.println(Pokerdui);

        //打乱顺序
        Collections.shuffle(Pokerdui);
        System.out.println(Pokerdui);

        //创建三个玩家
        ArrayList<String> player1array = new ArrayList<String>();
        ArrayList<String> player2array = new ArrayList<String>();
        ArrayList<String> player3array = new ArrayList<String>();
        ArrayList<String> dipaiarray = new ArrayList<String>();

        //发牌
        for (int i = 0; i < Pokerdui.size(); i++) {
            if (Pokerdui.size() - i <= 3) {
                dipaiarray.add(Pokerdui.get(i));
            } else if (i % 3 == 0) {
                player1array.add(Pokerdui.get(i));
            } else if (i % 3 == 1) {
                player2array.add(Pokerdui.get(i));
            } else {
                player3array.add(Pokerdui.get(i));
            }
        }

        System.out.println("Player1:" + player1array);
        System.out.println("Player2:" + player2array);
        System.out.println("Player3:" + player3array);
        System.out.println("底牌:" + dipaiarray);

    }
}
