//
//
//class MyThread extends Thread{
//    private  String result;
//    @Override
//    public void run() {
//        this.setName("MyThread");
//        System.out.println("Start " + this.getName());
//
//        for (int i = 0; i < 10; i++) {
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//
//            }
//            System.out.print(i + " ");
//        }
//        System.out.println("\nEnd " + this.getName());
//
//        result = "Good task";
//    }
//
//    public String getResult() {
//        return result;
//    }
//
//    public void setResult(String result) {
//        this.result = result;
//    }
//}


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyThread implements Runnable{
    private  String result;
    @Override
    public void run() {
        System.out.println("Start MyThread");

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            System.out.print(i + " ");
        }
        System.out.println("End MyThread");

        result = "Good task";
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}

public class Main {


    public static void main(String[] args) throws InterruptedException {


        ExecutorService executorService = Executors.newFixedThreadPool(5);


        Runnable runnable = ()->{
            System.out.println("Task Runnable nacil vipolnenie " + Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {

            }
            System.out.println("Task Runnable zaversil vipolnenie " + Thread.currentThread().getName());
        };

        Callable<Integer> integerCallable = ()->{
            System.out.println("Task Callable<Integer> nacil vipolnenie " + Thread.currentThread().getName());
            int result = 43;
            try {

                Thread.sleep(5000);
            } catch (InterruptedException e) {

            }
            System.out.println("Task Callable<Integer> zaversil vipolnenie " + Thread.currentThread().getName());

            return result;
        };


        Callable<String> stringCallable = ()->{
            System.out.println("Task Callable<String> nacil vipolnenie " + Thread.currentThread().getName());
            String result = "Hello world!";
            try {

                Thread.sleep(5000);
            } catch (InterruptedException e) {

            }
            System.out.println("Task Callable<String> zaversil vipolnenie " + Thread.currentThread().getName());

            return result;
        };



        try {
            Future<?> runnableFuter = executorService.submit(runnable);
            Future<String> stringFuture = executorService.submit(stringCallable);
            Future<Integer> integerFuture = executorService.submit(integerCallable);

            runnableFuter.get();
            System.out.println("Rezultat ot runnableFuter none");
            System.out.println("Rezultat ot stringFuture  " + stringFuture.get());
            System.out.println("Rezultat ot integerFuture  " + integerFuture.get());
        }catch (Exception ex){

        }finally {
            executorService.shutdown();
        }



//        ExecutorService executorService = Executors.newFixedThreadPool(5);
//
//        for (int i = 0; i < 100; i++) {
//            int taskNumber = i;
//            executorService.submit(()->{
//                System.out.println("Zadaca # " + taskNumber + " vipolnyayetsa v potoke " + Thread.currentThread().getName());
//                try {
//                    Thread.sleep(5000);
//                } catch (InterruptedException e) {
//
//                }
//            });
//        }
//
//
//        executorService.shutdown();




//        System.out.println("Start Main");
//
//        Thread thread = new Thread(()->{
//            System.out.println("Start MyThread");
//            for (int i = 0; i < 10; i++) {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                }
//                System.out.print(i + " ");
//            }
//            System.out.println("End MyThread");
//        }) ;
//        thread.start();;





//        System.out.println("Start Main");
//        Runnable runnable = ()->{
//            System.out.println("Start MyThread");
//            for (int i = 0; i < 10; i++) {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                }
//                System.out.print(i + " ");
//            }
//            System.out.println("End MyThread");
//        };
//
//        Thread thread = new Thread(runnable) ;
//        thread.start();;






//        System.out.println("End Main");




//        System.out.println("Start Main");
//
//        Thread thread = new Thread(){
//            @Override
//            public void run() {
//                System.out.println("Start MyThread");
//                for (int i = 0; i < 10; i++) {
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                    }
//                    System.out.print(i + " ");
//                }
//                System.out.println("End MyThread");
//            }
//        };
//        thread.start();;
//        System.out.println("End Main");


//        System.out.println("Start Main");
//
//        Thread thread = new Thread(()->{
//            System.out.println("Start MyThread");
//            for (int i = 0; i < 10; i++) {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                }
//                System.out.print(i + " ");
//            }
//            System.out.println("End MyThread");
//        });
//        thread.start();;
//        System.out.println("End Main");


//        System.out.println("Start Main");
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Start MyThread");
//                for (int i = 0; i < 10; i++) {
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                    }
//                    System.out.print(i + " ");
//                }
//                System.out.println("End MyThread");
//            }
//        };
//
//        Thread thread = new Thread(runnable);
//        thread.start();;
//        System.out.println("End Main");



//        System.out.println("Start Main");
//        MyThread myThread = new MyThread();
//       Thread thread = new Thread(myThread);
//        thread.start();;
//        System.out.println("End Main");


//        System.out.println("Start Main");
//
//
//        thread.start();
//
//
//        System.out.println("End Main");
//
//
//
//        thread.join();;
//        System.out.println(
//                thread.getResult()
//        );


//       Thread mainThread = Thread.currentThread();
//       mainThread.interrupt();
//       mainThread.stop();
//        mainThread.suspend();
//        mainThread.resume();
//        mainThread.
//        System.out.println("Da");
//       Thread.sleep(5000);
//        System.out.println("Net");
//       mainThread.isInterrupted();
//        Thread.interrupted() ;
//        System.out.println(mainThread.isInterrupted());
//       mainThread.join();
//        System.out.println(mainThread.isAlive());
//       mainThread.interrupt();
//       mainThread.join(5  * 1000);
        ///////////////////////
        ;//       mainThread.setName("This is Main Thread");
//        System.out.println(mainThread.getName());
//        System.out.println(mainThread.getId());
//        System.out.println(mainThread.getPriority());//1-10
//        System.out.println(mainThread.getState());//1-10
//       mainThread.start();
//       mainThread.run();
//       mainThread.run();
//       mainThread.run();
//       mainThread.run();
        //New
        //Runnable
        //Blocked
        //Waiting
        //Timed_Waithing
        //Terminated
//        mainThread

//        System.out.println("Start");
//        for (int i = 0; i < 10; i++) {
//            File file = new File("test"+i+".txt");
//            file.createNewFile();
//        }

//        Thread.sleep(20000);
//
//        System.out.println("End");

    }
}