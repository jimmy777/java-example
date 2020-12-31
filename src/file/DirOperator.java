package file;


import java.io.IOException;

/**
 * @Author Y.Z.Y
 * @Date 2020/12/15 8:37
 * @Description 目录操作。
 *
 * ref: https://www.jb51.net/article/43912.htm
 */
public class DirOperator {

    public static String getInputMessage() {
        System.out.println("请输入您的命令： ");
        byte[] buffer = new byte[1024];
        int count;
        char[] ch = new char[0];
        try {
            count = System.in.read(buffer);

            ch = new char[count - 2];
            for (int i=0; i<count-2;i++) {
                ch[i] = (char)buffer[i];
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return new java.lang.String(ch);
    }
}
