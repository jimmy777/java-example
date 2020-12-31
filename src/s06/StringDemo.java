package s06;

/**
 * @Author Y.Z.Y
 * @Date 2020/12/8 9:13
 * @Description
 */
public class StringDemo {

    public static void main(String[] args) {


        String str1 = "Hello, java.";
        String str2 = new String("Hello, python.");
        String str3 = new java.lang.String();

        byte[] bytes = "Hello, nodejs".getBytes();
        String str4 = new String(bytes);

        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        String str5 = new String(chars);


        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer("Hello, javascript.");



    }
}
