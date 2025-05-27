class MyThread extends Thread {
    String msg;
    MyThread(String msg) { this.msg = msg; }
    public void run() {
        for(int i=0; i<5; i++) System.out.println(msg);
    }
}
public class ThreadCreation {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");
        t1.start();
        t2.start();
    }
}

