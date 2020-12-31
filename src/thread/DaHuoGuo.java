package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 *  假如现在我们要打火锅，首先我们要准备两样东西：把水烧开和准备食材。因为烧开水是一个比较漫长的过程（相当于耗时的业务逻辑），因此我们可以一边烧开水（相当于另起一个线程），一边准备火锅食材（主线程），等两者都准备好了我们就可以开始打火锅了。
 *
 *  我们使用Future主要有以下步骤：
 * 1. 新建一个Callable匿名函数实现类对象，我们的业务逻辑在Callable的call方法中实现，其中Callable的泛型是返回结果类型；
 * 2. 然后把Callable匿名函数对象作为FutureTask的构造参数传入，构建一个futureTask对象；
 * 3. 然后再把futureTask对象作为Thread构造参数传入并开启这个线程执行去执行业务逻辑；
 * 4. 最后我们调用futureTask对象的get方法得到业务逻辑执行结果。
 *
 * RunnableFuture是Future和Runnable接口的组合，即这个接口表示又可以被线程异步执行，因为实现了Runnable接口，又可以获得线程异步任务的执行结果，因为实现了Future接口。因此解决了Runnable异步任务没有返回结果的缺陷。
 *
 * 我们都知道，Callable<V>接口和Runnable接口都可以被提交给线程池执行，唯一不同的就是Callable<V>接口是有返回结果的，其中的泛型V就是返回结果，而Runnable接口是没有返回结果的。
 * 
 */
public class DaHuoGuo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FutureTask<String> futureTask = new FutureTask<>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println(Thread.currentThread().getName() + ": " + "开始烧开水...");
                // 模拟烧水处理的耗时
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + ": " + "开水已经烧好了...");

                return "开水";
            }
        });

        Thread shaoshuiThread = new Thread(futureTask);
        shaoshuiThread.start();

        // do other something
        System.out.println(Thread.currentThread().getName() + ": " + "已经开始在烧水了，等待中，我们现在同时可以准备食材...");

        // 模拟准备食材的耗时
        Thread.sleep(3000);

        // 食材处理完毕
        System.out.println(Thread.currentThread().getName() + ": " + "食材已经准备完毕...");
        String shicai = "食材";

        // 水已经烧好了，我们取得烧开的水
        String boilWater = futureTask.get();

        System.out.println(Thread.currentThread().getName() + ": " + boilWater + " 和 " + shicai + " 都已经准备好了，我们可以开始打火锅了...");

    }

}
