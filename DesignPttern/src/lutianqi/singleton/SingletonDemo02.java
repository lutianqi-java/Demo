package lutianqi.singleton;

/**
 * 懒汉式
 */
public class SingletonDemo02 {

    private static SingletonDemo02 singletonDemo02;

    public SingletonDemo02() {
    }

    /**
     * 线程安全效率低
     * @return
     */
    public static synchronized SingletonDemo02 getInstance() {
        if (singletonDemo02 == null) {
            singletonDemo02 = new SingletonDemo02();
        }
        return singletonDemo02;
    }
}
