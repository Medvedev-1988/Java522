import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

class Counter{
    private int count = 0 ;
    //    private ReentrantLock lock = new ReentrantLock();
    private Object lock = new Object();
//    private AtomicInteger value = new AtomicInteger();

    public synchronized void increment(){
        count++;
//        synchronized (lock){
//            count++;
//        }


//        lock.lock();
//        count++;
//        lock.unlock();

//        value.incrementAndGet();
    }

    public synchronized void decrement(){
        count--;

//        synchronized (lock){
//            count--;
//        }



//        lock.lock();
//        count--;
//        lock.unlock();


//        value.decrementAndGet();
    }

    public void clear(){
        count = 0;
    }

    public int getCount() {
        return count;
//        return  value.get();
    }
}


class IncrementTask extends Thread{
    private Counter counter;

    public IncrementTask(Counter counter) {
        this.counter = counter;
    }

    public Counter getCounter() {
        return counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            counter.increment();
        }
    }
}


class DecrementTask extends Thread{
    private Counter counter;

    public DecrementTask(Counter counter) {
        this.counter = counter;
    }

    public Counter getCounter() {
        return counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            counter.decrement();
        }
    }
}


public class Main {

    public static void test(){
        Counter counter = new Counter();
    }

    public static void main(String[] args) throws InterruptedException {

//        21:25

        test();;
        test();;


        System.out.println("Start");

        Counter counter = new Counter();

        IncrementTask incrementTask = new IncrementTask(counter);
        DecrementTask decrementTask = new DecrementTask(counter);


        incrementTask.start();
        decrementTask.start();


        incrementTask.join();
        decrementTask.join();

//        Counter counter1 = incrementTask.getCounter();
        Counter counter2 = decrementTask.getCounter();
//        System.out.println("Counter : " + counter1.getCount());
        System.out.println("Counter : " + counter2.getCount());


        System.out.println("End");

        //count

        //3+  // 3
        //2-  // 1
        //10+ // 11
        //3-  // 8


        //////////////////////////////////////////////////////////////

//        System.out.println("Start");
//
//        IncrementTask incrementTask = new IncrementTask(new Counter());
//        DecrementTask decrementTask = new DecrementTask(new Counter());
//
//
//        incrementTask.start();
//        decrementTask.start();
//
//
//        incrementTask.join();
//        decrementTask.join();
//
//        Counter counter1 = incrementTask.getCounter();
//        Counter counter2 = decrementTask.getCounter();
//        System.out.println("Counter : " + counter1.getCount());
//        System.out.println("Counter : " + counter2.getCount());
//
//
//        System.out.println("End");


        //////////////////////////////////////////////////////


//        int count = 0;
//
//
//        for (int i = 0; i < 1_000_000; i++) {
//            count++;
//        }
//
//        for (int i = 0; i < 1_000_000; i++) {
//            count--;
//        }
//
//        System.out.println(count);
    }
}