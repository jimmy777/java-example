package list;

import list.bean.Apple;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * @author Y.Z.Y
 * @date 2020/9/21 10:12
 * @description list 的一些处理方法。
 *
 * 1. list.stream().collect().map().reduce() 流处理方法；
 * 2. Collectors 类的静态工厂方法。
 *
 * ref：https://mp.weixin.qq.com/s/HGI2JaZqkstB8_1DiQLrZw
 */
public class ListUtils {

    public static void main(String[] args) {

        // 存放apple对象集合
        List<Apple> apples = new ArrayList<>();

        Apple apple1 = new Apple(1, "苹果1", new BigDecimal("3.25"), 10);
        Apple apple12 = new Apple(1, "苹果2", new BigDecimal("1.35"), 20);
        Apple apple2 = new Apple(2, "香蕉", new BigDecimal("2.89"), 30);
        Apple apple3 = new Apple(3, "荔枝", new BigDecimal("9.99"), 40);

        apples.add(apple1);
        apples.add(apple12);
        apples.add(apple2);
        apples.add(apple3);


        /* 1. List 分组
            List 里面的对象元素，以某个属性来分组。例如，以id分组，将id相同的放在一起。
            List 以ID分组 Map<Integer,List<Apple>>
         */
        Map<Integer, List<Apple>> listMap = apples.stream().collect(Collectors.groupingBy(Apple::getId));
        System.out.println(listMap);
        System.out.println("--------- 1 ---------\n");


        /* 2. List 转 Map
            id 为 key，apple 对象为 value，可以这么做：
            List -> Map, 需要注意的是：
                - toMap 如果集合对象有重复的key，会报错 Duplicate key ....
                - apple1,apple12 的 id 都为 1。
                - 可以用 (k1,k2)->k1 来设置，如果有重复的key,则保留key1,舍弃key2。
         */
        Map<Integer, Apple> appleMap = apples.stream().collect(Collectors.toMap(Apple::getId, a -> a, (k1, k2) -> k1));
        System.out.println(appleMap);
        System.out.println("--------- 2 ---------\n");


        /* 3. 过滤 Filter
            从集合中过滤出来符合条件的元素：
            过滤出符合条件的数据
         */
        List<Apple> filterList = apples.stream().filter(a -> a.getName().equals("香蕉")).collect(Collectors.toList());
        System.out.println(filterList);
        System.out.println("--------- 3 ---------\n");


        /* 4. 求和
            将集合中的数据按照某个属性求和:
            计算 总金额
         */
        // Stream<BigDecimal> bigDecimalStream = apples.stream().map(Apple::getMoney);
        // System.out.println(bigDecimalStream.collect(Collectors.toList()));
        BigDecimal totalMoney = apples.stream().map(Apple::getMoney).reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println(totalMoney);
        System.out.println("--------- 4 ---------\n");


        /* 5. 查找流中最大 最小值
            Collectors.maxBy 和 Collectors.minBy 来计算流中的最大或最小值。
         */
        Optional<Apple> maxAppleOptional = apples.stream().collect(Collectors.maxBy(Comparator.comparing(Apple::getMoney)));
        maxAppleOptional.ifPresent(System.out::println);

        Optional<Apple> minAppleOptional = apples.stream().collect(Collectors.minBy(Comparator.comparing(Apple::getMoney)));
        minAppleOptional.ifPresent(System.out::println);
        System.out.println("--------- 5 ---------\n");


        /* 6. 去重

         */
        List<Apple> list = apples.stream().collect(Collectors.collectingAndThen(Collectors.toCollection(
                () -> new TreeSet<>(
                        Comparator.comparingLong(Apple::getId))), ArrayList::new
                )
        );
        System.out.println(list);
        System.out.println("--------- 6 ---------\n");
    }
}
