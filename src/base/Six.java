package base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author Y.Z.Y
 * @Date 2020/12/3 9:59
 * @Description JDK1.5 之后的新特性。
 *
 * 1. 泛型。
 * 2. 使用增强 for 来遍历集合(Collections)或者数组(Arrays)。
 * 3. 使用 enum 枚举类型。
 * 4. import static 静态引入。
 * 5. Scanner 类，从终端读取指定类型的数据。
 * 6. System.out.printf() 格式化输出数据。
 * 7. 可变参数。
 *
 */
public class Six {

    public static void myWrite (Object ... objs) {
        for (Object o: objs) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {

        // 使用泛型指定数组的元素类型。
        ArrayList<String> list = new ArrayList<>();

        list.add("aa");
        list.add("bb");

        System.out.println(list);
        System.out.println(list.get(1));

        // 增强 for 来遍历。
        for (String s: list) {
            System.out.println(s);
        }


        // 枚举类。
        Color c = Color.Red;
        System.out.println(c);
        System.out.println(Arrays.toString(Color.values()));
        // 遍历枚举类的值。
        for (Color cc: Color.values()) {
            System.out.println(cc);
        }


        // Scanner 类
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        System.out.println(i);

        // printf() 格式化输出
        System.out.printf("This is a test: %4.2f\n", 123.125); // 四色五人了！
        System.out.printf("This is a test: %4.2f\n", 12345.123);


        // 可变参数的使用
        myWrite("s1", "s2", "s3", "s4");
    }

}
