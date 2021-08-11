package DouDiZhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class Poker_Puls {
    public static void main(String[] args) {
        //hashmap集合放牌，key是数值，value是牌
        HashMap<Integer, String> Pokerdui = new HashMap<Integer, String>();

        //ArrayList里面放key，待会用key代替牌
        ArrayList<Integer> PokerKeys = new ArrayList<Integer>();
        for (int i = 0;i<54;i++){
            PokerKeys.add(i);
        }

        //制作扑克牌并且搞牌堆里头
        String[] folowers = {"♣", "♦", "♠", "♥"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "j", "Q", "K", "A", "2" };
        String[] wang = {"Big Joker", "Small Joker"};

        int i = 0;
        for (String number : numbers) {
            for (String folower:folowers) {
                String Poker = folower + number;
                Pokerdui.put(i,Poker);
                i++;
            }
        }
        Pokerdui.put(i++,wang[0]);
        Pokerdui.put(i,wang[1]);

        System.out.println(Pokerdui);

        //洗牌，洗的是ArrayList
        Collections.shuffle(PokerKeys);
        System.out.println(PokerKeys);

        //---------------------------------------------------------------------------------------------------------
        //发牌1.用sourt，发的是key
        ArrayList<Integer> player1array = new ArrayList<Integer>();
        ArrayList<Integer> player2array = new ArrayList<Integer>();
        ArrayList<Integer> player3array = new ArrayList<Integer>();
        ArrayList<Integer> dipaiarray = new ArrayList<Integer>();

        for (int x = 0; x < Pokerdui.size(); x++) {
            if (Pokerdui.size() - x <= 3) {
                dipaiarray.add(PokerKeys.get(x));
            } else if (x % 3 == 0) {
                player1array.add(PokerKeys.get(x));
            } else if (x % 3 == 1) {
                player2array.add(PokerKeys.get(x));
            } else {
                player3array.add(PokerKeys.get(x));
            }
        }

        Collections.sort(player1array);
        Collections.sort(player2array);
        Collections.sort(player3array);
        Collections.sort(dipaiarray);


        System.out.println(player1array);
        System.out.println(player2array);
        System.out.println(player3array);
        System.out.println(dipaiarray);

        lookPoker("玩家A", player1array, Pokerdui);
        lookPoker("玩家B", player2array, Pokerdui);
        lookPoker("玩家C", player3array, Pokerdui);
        lookPoker("底牌", dipaiarray, Pokerdui);
        System.out.println("---------------------------------------------------------------------------");

        //---------------------------------------------------------------------------------------------------------
        //发牌2：直接用TreeSet表示玩家的手牌的key，就不用sort了
        TreeSet<Integer> player11array = new TreeSet<Integer>();
        TreeSet<Integer> player22array = new TreeSet<Integer>();
        TreeSet<Integer> player33array = new TreeSet<Integer>();
        TreeSet<Integer> dipai = new TreeSet<Integer>();

        for (int x = 0; x < Pokerdui.size(); x++) {
            if (Pokerdui.size() - x <= 3) {
                dipai.add(PokerKeys.get(x));
            } else if (x % 3 == 0) {
                player11array.add(PokerKeys.get(x));
            } else if (x % 3 == 1) {
                player22array.add(PokerKeys.get(x));
            } else {
                player33array.add(PokerKeys.get(x));
            }
        }

        System.out.println(player11array);
        System.out.println(player22array);
        System.out.println(player33array);
        System.out.println(dipai);

        lookPoker("TreeSet玩家A", player1array, Pokerdui);
        lookPoker("TreeSet玩家B", player2array, Pokerdui);
        lookPoker("TreeSet玩家C", player3array, Pokerdui);
        lookPoker("TreeSet底牌", dipaiarray, Pokerdui);

    }




    public static void lookPoker(String name, ArrayList<Integer> player, HashMap<Integer, String> Pokerdui){
        System.out.print(name + "的牌为：");
        System.out.print("[");
        for(Integer key : player){
            String Poker = Pokerdui.get(key);
            System.out.print(Poker + ", ");
        }
        System.out.println("]");

    }
}
