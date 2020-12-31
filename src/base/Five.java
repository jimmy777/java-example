package base;

/**
 * @Author Y.Z.Y
 * @Date 2020/12/3 9:06
 * @Description 引用。
 */
public class Five {

    public static void main(String[] args) {


        // null 为空指针，没有指向任何内存空间。
        Student p = null;
        System.out.println("[class p] " + p);
        System.out.println("---------------\n");


        // 对象等号赋值，两个引用都指向同一个对象，即引用的地址相同。
        Student q = new Student("0001", "jack");
        Student r = q; // 等号赋值操作。
        System.out.println("[class q] " + q);
        System.out.println("[class r] " + r);
        System.out.println(q == r);
        System.out.println("---------------\n");


        // Student 类重写了 equals() 方法，确保两个 Student 对象的属性相同，两个对象就是相同的。
        // 但是两个 Student 对象的引用是不同的值。
        Student t1 = new Student("0002", "tom");
        System.out.println("[class t1] " + t1);
        Student t2 = new Student("0002", "tom");
        System.out.println("[class t2] " + t2);
        System.out.println(t1.equals(t2));
        System.out.println("---------------\n");


        // Student 类重新了 clone() 方法，确保生产一个新 Student 对象。
        Student t3 = t1.clone();
        System.out.println("[class t1] " + t1);
        System.out.println("[class t3] " + t3);
        System.out.println(t1 == t3);
        System.out.println("---------------\n");

    }
}
