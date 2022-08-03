package 原子性与并发工具_5.原子性_1.AtomicInteger_1.原子性_1;

import java.util.concurrent.atomic.AtomicInteger;

public class Demo {
    public static void main(String[] args) {

        /*AtomicInteger ac1 = new AtomicInteger(10);
        System.out.println(ac1.get());*/

        /*AtomicInteger ac2 = new AtomicInteger(10);
        int andIncrement = ac2.getAndIncrement();
        System.out.println(andIncrement);
        System.out.println(ac2.get());*/

        /*AtomicInteger ac3 = new AtomicInteger(10);
        int i = ac3.incrementAndGet();
        System.out.println(i);
        System.out.println(ac3.get());*/

        /*AtomicInteger ac4 = new AtomicInteger(10);
        int i = ac4.addAndGet(2);
        System.out.println(i);
        System.out.println(ac4.get());*/

        AtomicInteger ac5 = new AtomicInteger(10);
        int andAdd = ac5.getAndAdd(3);
        System.out.println(andAdd);
        System.out.println(ac5.get());
    }
}
/*public AtomicInteger()： 初始化一个默认值为0的原子型Integer
public AtomicInteger(int initialValue)： 初始化一个指定值的原子型Integer
int get(): 获取值
int getAndIncrement(): 以原子方式将当前值加1，注意，这里返回的是自增前的值。
int incrementAndGet(): 以原子方式将当前值加1，注意，这里返回的是自增后的值。
int addAndGet(int data): 以原子方式将输入的数值与实例中的值（AtomicInteger里的
value）相加，并返回结果。
int getAndSet(int value): 以原子方式设置为newValue的值，并返回旧值。*/