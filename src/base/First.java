package base;

/**
 * @Author Y.Z.Y
 * @Date 2020/12/1 17:10
 * @Description 类的继承：父类，静态变量和静态方法。、
 *
 */
public class First {

    String name = "demo";

    private int age = 20;
    protected boolean sex = true;

    public First() {
    }

    public First(String name) {
        this.name = name;
    }

    public void talk() {
        System.out.println(name + ",talk: hello.");
    }

    public void speak() {
        System.out.println("speak: " + this.name);
    }

    public void add() {
        i +=1;
    }

    public static int i = 0;

    private static int ii = 100;

    public static void run() {

        System.out.println("["+i+"] I'm running.");
    }

    public static void talk2() {
        System.out.println("static talk ii: " + ii);
    }
}
