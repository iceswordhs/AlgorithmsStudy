package shieryue12;

import shieryue12.Dec_21.offer2_38;

/**
 * @author Hs
 * @Date 2021/12/21 22:24
 */
public class DecTest {
    public static void main(String[] args) {
        long millis1 = System.currentTimeMillis();
        System.out.println(millis1);
        for (int i=0;i<10000000;i++){
            // 重写前
            //new MyException();// 5106

            // 重写后
            new MyException();// 106

            //new offer2_38();//30
        }
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis()-millis1);
    }
}
