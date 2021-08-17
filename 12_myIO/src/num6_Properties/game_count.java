package num6_Properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * 记录游戏次数
 * <p>
 * 超过免费次数，提醒用户充值
 **/
public class game_count {
    public static void main(String[] args) throws IOException {
        //文件中读取数据到Properties集合
        Properties pro = new Properties();
        FileReader fr = new FileReader("12_myIO\\src\\num6_Properties\\game.txt");
        pro.load(fr);
        fr.close();

        //通过Properties集合获取游戏次数
        String count = pro.getProperty("count");
        int number = Integer.parseInt(count);

        if (number <3) {
            NumberGame.main();
            //游戏完后次数加1 并写入文件
            number++;
            pro.setProperty("count",Integer.toString(number));
            FileWriter fw = new FileWriter("12_myIO\\src\\num6_Properties\\game.txt");
            pro.store(fw,null);
            fw.close();
        }
        else{
            //提醒充值
            System.out.println("免费次数已用完，请充值！");
        }
//        pro.setProperty("count","0");
//        fw.write(pro);
    }
}
