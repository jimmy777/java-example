package jvm;

import java.util.ArrayList;

/**
 * @Author Y.Z.Y
 * @Date 2020/12/7 13:32
 * @Description
 */
public class First {

    public static void main(String[] args) {


        ArrayList<Person> al = new ArrayList<>();
        Person a = new Person();
        Person b = new Person();
        Person c = new Person();

        al.add(a);
        al.add(b);
        al.add(c);

        System.out.println(al);

//
//        while (true) {
//            al.add(1);
//        }


    }
}
