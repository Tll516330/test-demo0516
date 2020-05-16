package cn.tll.demo;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        //取值1~10之间
        int num = random.nextInt(10)+1;
        System.out.println(num);
        for (int i = 1; i <= num; i++) {
            System.out.println("田亮亮最帅"+i);
            System.out.println("你可真棒");
        }

    }
}
