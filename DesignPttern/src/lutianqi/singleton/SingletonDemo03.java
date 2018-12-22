package lutianqi.singleton;

/**
 * 静态内部类
 * 兼顾了懒汉模式的内存优化（使用时才初始化-------------静态内部类）以及饿汉模式的安全性（不会被反射入侵---静态常量）。
 */
public class SingletonDemo03 {

    public SingletonDemo03() {
        System.out.println("初始化..");
    }

    private static class SingletonInstance {
        private static final SingletonDemo03 singletonDemo03 = new SingletonDemo03();
    }

    public static SingletonDemo03 getInstance() {
        System.out.println("getInstance");
        return SingletonInstance.singletonDemo03;
    }

    public static void main(String[] args) {
        SingletonDemo03 s1 = SingletonDemo03.getInstance();
        SingletonDemo03 s2 = SingletonDemo03.getInstance();
        System.out.println(s1 == s2);
    }

}
