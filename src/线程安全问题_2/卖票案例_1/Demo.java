package 线程安全问题_2.卖票案例_1;
//某电影院目前正在上映国产大片，共有100张票，而它有3个窗口卖票，请设计一个程序模拟该电影院卖票
public class Demo {
    public static void main(String[] args) {

        //Ticket对象只能创建一个，一个对象对应100张票，如果创建多个就有多个100张票，就不是同一个系统了
        Ticket ticket = new Ticket();

        Thread t1 = new Thread(ticket);
        Thread t2 = new Thread(ticket);
        Thread t3 = new Thread(ticket);

        //给线程命名
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        //启动线程
        t1.start();
        t2.start();
        t3.start();
    }
}
/*定义一个类SellTicket实现Runnable接口，里面定义一个成员变量：private int tickets = 100;
在SellTicket类中重写run()方法实现卖票，代码步骤如下
判断票数大于0，就卖票，并告知是哪个窗口卖的
卖了票之后，总票数要减1
票卖没了，线程停止
定义一个测试类SellTicketDemo，里面有main方法，代码步骤如下
创建SellTicket类的对象
创建三个Thread类的对象，把SellTicket对象作为构造方法的参数，并给出对应的窗口名称
启动线程*/