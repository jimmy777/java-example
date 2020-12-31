package base;

/**
 * @Author Y.Z.Y
 * @Date 2020/12/2 10:38
 * @Description 接口。
 *
 */
public class Three extends Zero implements Talking {

    public int getZ() {
        return z;
    }


    public static void main(String[] args) {
        System.out.println("["+ Thread.currentThread() + "]" + " main." );

        Three three = new Three();
        System.out.println(three.getZ());

        three.talkZ();

        String word = three.talk("Tom");
        System.out.println(word);

    }

    @Override
    public void talkZ() {
        System.out.println("["+ Thread.currentThread() + "]" + " talk z: " + z);
    }


    @Override
    public String talk(String name) {
        return "["+ Thread.currentThread() + "] " + name + " talk: ";
    }

}
