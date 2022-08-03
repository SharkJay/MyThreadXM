package 线程池_4.volatile问题_3.存款十万问题_1;

public class Demo {
    public static void main(String[] args) {


        Girl girl = new Girl("女孩");

        Boy boy = new Boy("男孩");

        girl.start();
        boy.start();

    }
}
