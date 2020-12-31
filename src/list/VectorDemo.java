package list;

import java.util.Vector;

/**
 * @Author Y.Z.Y
 * @Date 2020/12/15 8:56
 * @Description
 */
public class VectorDemo {

    public static void main(String[] args) {
        Vector v = new Vector();

        for (int i = 0; i <=10; i++) {
            v.add(new String("CH," + i));
        }
        v.remove(0);
        for (int i =0; i< v.size();i++) {
            System.out.println(v.elementAt(i));
        }
    }
}
