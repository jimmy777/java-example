package list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author Y.Z.Y
 * @Date 2020/12/15 8:51
 * @Description
 */
public class ListDemo {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        for (int i=1;i<=10;i++) {
            list.add(new String("CH," + i));
        }

        list.add(0, "EN,0");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
