/**
 * @Author Y.Z.Y
 * @Date 2020/12/1 9:37
 * @Description
 */
public class seqSarch {

    public static boolean seqSearch(char key) {

        char[] data = {'b','c','a','d'};

        for (int j = 0; j < 10; j++) {

            System.out.println("结果：");
            if (key == data[j]) {
                return true;
            }
        }

        return false;
    }

    public static boolean seqSearch2(char key) {
        int i=0, counter=0;
        char[] data = {'b', 'm', 'd', 'm', 'c', 'a', 'f', 'e', 'g', 'h'};

        while (i<10) {
            System.out.println("结果：");
            if (key == data[i]) {
                counter++;
                return true;
            }
            i++;
        }

        return false;
    }

    public static void main(String[] args) {
        // seqSearch('a');

        seqSearch2('c');
    }
}
