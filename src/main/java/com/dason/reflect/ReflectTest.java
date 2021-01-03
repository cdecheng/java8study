package com.dason.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 反射测试类
 *
 * @author chendecheng
 * @since 2020-12-31 00:16
 */
public class ReflectTest {

    public static void main(String[] args) {

        // 获取反射对象方式-------------------------------------------

        // 方式一 : 对象.class
        Class<People> peopleClass = People.class;
        System.out.println(peopleClass);
        // 方式二 : 通过对象路径
        try {
            Class<?> classForName = Class.forName("com.dason.reflect.People");
            System.out.println(classForName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        // 方式三 : 通过对象实例.getClass();
        People people = new People();
        Class<? extends People> objectClass = people.getClass();
        System.out.println(objectClass);

        // 反射对象信息获取----------------------------------------------------

        // 获取所有的方法
        Method[] methods = peopleClass.getMethods();
        for (Method method : methods) {
            System.out.println("获取的方法为：-------" + method.getName());
        }

        // 获取所有的接口
        Class<?>[] classInterfaces = peopleClass.getInterfaces();
        for (Class<?> classInterface : classInterfaces) {
            System.out.println("所有的接口为：-------" + classInterface.getName());
        }

        // 获取类对象的父类
        Class<? super People> superclass = peopleClass.getSuperclass();
        System.out.println("对象类的父类为：-------" + superclass.getName());

        // 获取类对象的构造方法
        Constructor<?>[] constructors = peopleClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("构造方法为：-------" + constructor.getName());
        }

        // 获取所有的属性(这里的返回值是一个对象，也就是java.lang.reflect包中的对象)
        Field[] declaredFields = peopleClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("所有的属性为：-------" + declaredField);
        }

        // 获取属性的另一种方式 getFiles() - 获取的public 的属性，包含父类的，
        // getDeclaredFields() 获取的是当前对象的所有的属性
        Field[] fields = peopleClass.getFields();
        for (Field field : fields) {
            System.out.println("getFiles获取的方法：-------" + field);
        }

        // 反射的实战使用---------------------------------------------------
        // 反射创建对象
        try {
            People newInstance = peopleClass.newInstance();
            newInstance.setCareer("程序员");
            newInstance.setUserName("张震");
            newInstance.setId(666);
            System.out.println("反射创建的对象为：-------" + newInstance.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 通过反射获取对象的属性，然后赋值
        // 通过反射调用方法
        try {
            People newInstance2 = peopleClass.newInstance();
            Field id = peopleClass.getDeclaredField("id");
            // 一定要设置是可访问的，才能对private 修饰的属性对象进行操作，不管是方法还是属性值，都要
            //打破封装  实际上setAccessible是启用和禁用访问安全检查的开关,并不是为true就能访问为false就不能访问
            //由于JDK的安全检查耗时较多.所以通过setAccessible(true)的方式关闭安全检查就可以达到提升反射速度的目的
            id.setAccessible(true);
            id.set(newInstance2, 99);
            System.out.println("对象的id属性值为：-------" + newInstance2.getId());

            // 调用方法
            Method setUserName = peopleClass.getMethod("setUserName", String.class);
            setUserName.setAccessible(true);
            setUserName.invoke(newInstance2, "叫我张震");
            System.out.println("对象的userName属性值为：-------" + newInstance2.getUserName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 反射静态方法的调用
        // 获取静态属性
        try {
            Class<StringUtil> stringUtilClass = StringUtil.class;
            Field staticName = stringUtilClass.getDeclaredField("name");
            // 获取静态属性值
            String name = (String) staticName.get(staticName);
            System.out.println("对象的名称的属性值为：-------" + name);

            // 创建对象
            StringUtil stringUtil = stringUtilClass.newInstance();
            // 获取静态方法调用
            Method getTip = stringUtilClass.getMethod("getTip", String.class);
            getTip.invoke(stringUtil, "牛b");

        } catch (Exception e) {
            e.printStackTrace();
        }

        // 反射的对象入参的时候，需要区分int 跟Integer这两个对象，如果入参是int 的我们调用的时候是 int.class
        // 如果是integer 的调用的时候是 Integer.class
        try {
            Class<?> stringUtil = Class.forName("com.dason.reflect.StringUtil");
            // 运行报错
//            Method getTip = stringUtil.getMethod("getTip", Integer.class);
            // 正确
            Method getTip = stringUtil.getMethod("getTip", int.class);
            getTip.invoke(null, 5);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
