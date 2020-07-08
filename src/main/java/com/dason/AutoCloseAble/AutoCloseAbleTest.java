package com.dason.AutoCloseAble;

/**
 * 自动关闭功能实验
 *
 * @author chendecheng
 * @since 2020-06-21 19:23
 */
public class AutoCloseAbleTest implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("调用close 方法，对IO相关的流对象关闭操作");
    }

    /**
     * 一个IO流操作
     */
    public void ioOperation() {
        System.out.println("应该是一个正常的IO业务操作方法");
    }

    public static void main(String[] args) throws Exception {
//        AutoCloseAbleTest test = new AutoCloseAbleTest();
//        // 常规的写法
//        try {
//            test.ioOperation();
//        } catch (Exception e) {
//            System.out.println(e);
//        } finally {
//          // 这里是关闭流的逻辑操作
//        }

        // 上面是java7之前的有IO操作，需要手动关闭流的写法，但是在java7之后，提供了AutoCloseAble接口，用来优化这种写法
        try(AutoCloseAbleTest test = new AutoCloseAbleTest()) {
            // 经过这里的try之后，我们进行IO操作之后，会自动关闭流的操作
            test.ioOperation();
        }

    }

}
