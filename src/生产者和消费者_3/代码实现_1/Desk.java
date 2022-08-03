package 生产者和消费者_3.代码实现_1;

public class Desk {

    //定义一个标记 static修饰的表示可以被类的所有成员对象共享
    //true表示桌子上有汉堡包，此时允许吃货进行
    //false表示桌子上没有汉堡包，此时允许厨师进行
    //public static boolean flag = false;
    private boolean flag;

    //定义汉堡包的总数量
    private int count;

    //定义锁对象，用final修饰，对于 引用类型 来说，不可改变的指的是变量当中的地址值不可改变
    private final Object lock = new Object();

    /*核心：
     * 有汉堡，运行消费者执行
     * 没有汉堡，允许生产者执行*/

    public Desk() {
        //在Desk无参构造方法中调用Desk带参构造，给flag,count赋值
        this(false,10);
    }

    public Desk(boolean flag, int count) {
        this.flag = flag;
        this.count = count;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Object getLock() {
        return lock;
    }
}
