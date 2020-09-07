package com.dason.jdk8.spliterator;

import java.util.Spliterator;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * 这个demo的地址 ：http://ifeve.com/java8-stream-%E4%B8%ADspliterator%E7%9A%84%E4%BD%BF%E7%94%A8%E4%B8%80/
 *
 */
public class NumCounterTest {
    public static void main(String[] args) {
        // 手动构建数据源字符串
        String arr = "12%3 21sdas s34d dfsdz45   R3 jo34 sjkf8 3$1P 213ikflsd fdg55 kfd";

        // 使用数据源去构建一个分割迭代器的对象
        Spliterator<Character> spliterator = new NumCounterSpliterator(0,arr,true);

        // 对分割迭代器进行一次分割，这个分割的方法是通过我们的自己定义的trySplit()方法来进行分割的
        Spliterator<Character> characterSpliterator = spliterator.trySplit();

        // 传入true表示是并行流
        // 分别用两个分割迭代器，使用流构造的工具类StreamSupport类构建一个流对象，可以指定是并行还是串型流，通过参数确定
        Stream<Character> stream1 = StreamSupport.stream(spliterator, false);
        Stream<Character> stream2 = StreamSupport.stream(characterSpliterator, false);
        // 对流数据进行终止操作进行输出，输出的过程会调用分割迭代器的迭代数据方法，读取数据来进行迭代，然后处理，这里是进行打印
        stream1.map(Function.identity()).forEach(System.out::println);
        stream2.forEach(System.out::println);
    }

}