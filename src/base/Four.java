package base;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStream;
        import java.io.InputStreamReader;
        import java.util.Map;

/**
 * @Author Y.Z.Y
 * @Date 2020/12/2 11:26
 * @Description 类库。
 *
 */
public class Four {

    public static void main(String[] args) {


        // --- Object
        Object o1 = new Object();
        Object o2 = new Object();

        boolean equals = o1.equals(o2);
        System.out.println(equals);

        //--- String
        int i = 100;
        String s = String.valueOf(i);
        System.out.println(s);

        //--- StringBuilder 线程不安全的
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("xxx");
        stringBuilder.append("-");
        stringBuilder.append("yyy");
        System.out.println(stringBuilder.toString());

        //--- StringBuffer 线程安全的
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("aaa");
        stringBuffer.append(1);
        stringBuffer.append("bbb");
        System.out.println(stringBuffer.toString());

        //--- Integer
        Integer integer = new Integer("1000");
        System.out.println(integer);


        //--- Thread
        try {
            System.out.println("thread sleep begin.");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread sleep 1000. over!");


        //--- Class
        try {
            Class<?> aClass = Class.forName("base.Four");
            System.out.println(aClass.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        //--- Process & Runtime
        Runtime runtime = Runtime.getRuntime();
        try {
            Process notepad = runtime.exec("notepad");
            boolean alive = notepad.isAlive();
            System.out.println(alive);
        } catch (IOException e) {
            e.printStackTrace();
        }


        //--- System
        Map<String, String> getenv = System.getenv();
        System.out.println(getenv);

        //--- Throwable & Exeception & Error
        RuntimeException runtimeException = new RuntimeException();
        IOException ioException = new IOException();
        ClassNotFoundException classNotFoundException = new ClassNotFoundException();


        //--- IO stream
        // System.in
        InputStream in = System.in;
        System.out.println("[in] " + in);
        InputStreamReader inputStreamReader = new InputStreamReader(in); // 字节流 -> 字符流
        try {
            System.out.println("[reader] " + inputStreamReader.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("[buffer] " + bufferedReader);

        String ss;


        try {
            while ((ss = bufferedReader.readLine()) != null) {
                System.out.println("[result] " + ss);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
