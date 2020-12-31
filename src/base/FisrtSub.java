package base;

/**
 * @Author Y.Z.Y
 * @Date 2020/12/2 9:12
 * @Description 类的继承：子类。
 *
 */
public class FisrtSub extends First {

    @Override
    public void add() {
        i += 2;
    }

    public static void main(String[] args) {

//        First park = new First("park");
//
//        park.talk();
//
//        park.speak();
//
//        park.add();
//
//        run();

        System.out.println("I'm sub from First.");

        i += 1;

        System.out.println("static var i is: " + i);

        FisrtSub fisrtSub = new FisrtSub();

        fisrtSub.add();

        run();

    }
}
