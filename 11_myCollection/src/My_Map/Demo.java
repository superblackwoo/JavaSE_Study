package My_Map;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        //创建hashmap集合对象
        HashMap<String, Student_Overwreite_eq_hash> hm = new HashMap<String, Student_Overwreite_eq_hash>();

        //创建学生类对象
        Student_Overwreite_eq_hash ssss1 = new Student_Overwreite_eq_hash("555", "a1", 4, "ad234asda");
        Student_Overwreite_eq_hash ssss2 = new Student_Overwreite_eq_hash("556", "a2", 3, "adas32da");
        Student_Overwreite_eq_hash ssss3 = new Student_Overwreite_eq_hash("557", "a3", 6, "ada24sda");
        Student_Overwreite_eq_hash ssss4 = new Student_Overwreite_eq_hash("558", "a4", 7, "ada2rt4sda");
        Student_Overwreite_eq_hash ssss5 = new Student_Overwreite_eq_hash("559", "a5", 7, "ada2rt4sda");

        //HashMap集合添加
        hm.put("1", ssss1);
        hm.put("2", ssss2);
        hm.put("3", ssss3);
        hm.put("4", ssss4);
        hm.put("5", ssss5);

        //遍历方式1：先找key再找value
        Set<String> keySet = hm.keySet();

        for (String key : keySet) {
            Student_Overwreite_eq_hash value = hm.get(key);
            System.out.println(key + ", " + value.toString());
        }
        System.out.println("-----------------------------------");

        //遍历方式2：一起找
        Set<Map.Entry<String, Student_Overwreite_eq_hash>> entrySet = hm.entrySet();
        for (Map.Entry<String, Student_Overwreite_eq_hash> my : entrySet) {
            String key = my.getKey();
            Student_Overwreite_eq_hash value = my.getValue();
            System.out.println(key + ", " + value.toString());
        }


        //---------------------------------------------------------------------------------------------------------
        // 把HashMap放进ArrayList，且进行遍历

        //创建ArrayList集合
        ArrayList<HashMap<String, String>> array = new ArrayList<HashMap<String, String>>();

        //创建HashMap并添加元素
        HashMap<String, String> hm1 = new HashMap<String, String>();
        hm1.put("001", "ok");
        hm1.put("002", "okk");

        //把HashMap放入ArrayList
        array.add(hm1);


        HashMap<String, String> hm2 = new HashMap<String, String>();
        hm2.put("003", "oho");
        hm2.put("004", "shit");
        array.add(hm2);

        HashMap<String, String> hm3 = new HashMap<String, String>();
        hm3.put("005", "fuck");
        hm3.put("006", "oao");
        array.add(hm3);

        HashMap<String, String> hm4 = new HashMap<String, String>();
        hm4.put("007", "yahu");
        hm4.put("008", "odasdk");
        array.add(hm4);

        //嵌套遍历： 剥开一层一层搞
        System.out.println("-----------------------------------");
        for (HashMap<String, String> hmm : array) {
            Set<String> keySet1 = hmm.keySet();
            for (String key : keySet1) {
                String value = hmm.get(key);
                System.out.println(key + ", " + value);
            }
        }

        //---------------------------------------------------------------------------------------------------------
        // 把ArrayList放进HashMap，且进行遍历

//        创建HashMap
        HashMap<String, ArrayList<String>> hmmm = new HashMap<String, ArrayList<String>>();

        //创建ArrayList
        ArrayList<String> sgyy = new ArrayList<String>();
        sgyy.add("赵云");
        sgyy.add("张飞");
        hmmm.put("三国演义", sgyy);

        ArrayList<String> shz = new ArrayList<String>();
        shz.add("松江");
        shz.add("吴淞");
        hmmm.put("水浒传", shz);

        ArrayList<String> xyj = new ArrayList<String>();
        xyj.add("孙悟空");
        xyj.add("沙僧");
        hmmm.put("西游记", xyj);

        System.out.println("-----------------------------------");
        Set<String> keySet1 = hmmm.keySet();
        for (String key : keySet1) {
            ArrayList<String> value = hmmm.get(key);
            System.out.println(key + ": ");
            for (String s : value) {
                System.out.println("\t" + s);
            }
        }

        //---------------------------------------------------------------------------------------------------------
        //输入字符串，统计字符出现次数    如：abccdccdcdbefdba  输出c(5)d(4)b(3)a(2)e(1)f(1)
        System.out.println("-----------------------------------");

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        //创建HashMap集合，
        HashMap<Character, Integer> hm11 = new HashMap<Character, Integer>();

        //
        for (int i = 0; i < line.length(); i++) {
            char a = line.charAt(i);

            //去集合里找key对应的value
            Integer value = hm11.get(a);
            if (value == null){
                //字符还没有在集合里出现过则加入集合
                hm11.put(a,1);
            }
            else {
                value++;
                hm11.put(a,value); //新的value值直接覆盖旧的值
            }
        }

        //拼接
        StringBuilder sb = new StringBuilder();
        Set<Character> characters = hm11.keySet();
        for (Character key:characters){
            sb.append(key);
            Integer value = hm11.get(key);
            sb.append("(");
            sb.append(value);
            sb.append(")");
        }
        System.out.println(sb);



        //---------------------------------------------------------------------------------------------------------
        //ArrarList的按排序器遍历

        //创建
        ArrayList<Student_Overwreite_eq_hash> arrayList = new ArrayList<Student_Overwreite_eq_hash>();
        Student_Overwreite_eq_hash sss1 = new Student_Overwreite_eq_hash("555", "a1", 4, "ad234asda");
        Student_Overwreite_eq_hash sss2 = new Student_Overwreite_eq_hash("556", "a2", 3, "adas32da");
        Student_Overwreite_eq_hash sss3 = new Student_Overwreite_eq_hash("557", "a3", 6, "ada24sda");
        Student_Overwreite_eq_hash sss4 = new Student_Overwreite_eq_hash("558", "a4", 7, "ada2rt4sda");
        Student_Overwreite_eq_hash sss5 = new Student_Overwreite_eq_hash("559", "a5", 7, "ada2rt4sda");

        //添加
        arrayList.add(sss1);
        arrayList.add(sss2);
        arrayList.add(sss3);
        arrayList.add(sss4);
        arrayList.add(sss5);

        Collections.sort(arrayList, new Comparator<Student_Overwreite_eq_hash>() {
            @Override
            public int compare(Student_Overwreite_eq_hash o1, Student_Overwreite_eq_hash o2) {
                int num1 = o2.getAge() - o1.getAge();
                int num2 = num1==0? o2.getName().compareTo(o1.getName()):num1;
                return num2;
            }
        });
        System.out.println(arrayList.toString());
    }
}
