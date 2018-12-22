package lutianqi.singleton;

/**
 * 饿汉
 * 1、类初始化的时候就会创建对象，调用效率比较高  ，缺点  ：如果不使用对象，会浪费内存
 * 2、静态方法存在永久区，垃圾回收的时候不会进行垃圾回收
 */
public class SingletonDemo01 {

    private static final SingletonDemo01 singletonDemo01 = new SingletonDemo01();

    /**
     * 不能  new
     */
    private SingletonDemo01() {
    }

    public static SingletonDemo01 getInstance() {
        return singletonDemo01;
    }




}
