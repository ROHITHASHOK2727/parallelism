package Rohith;



public class RunnableExample {

    public static void main(String[] args) {

        FirstThread thread1 = new FirstThread("Thread 1");

        SecondThread thread2 = new SecondThread("Thread 2");

        ThirdThread thread3 = new ThirdThread("Thread 3");

       



        thread1.start();

        thread2.start();

        thread3.start();



        try {

            thread1.join();

            thread2.join();

            thread3.join();

            thread3.setPriority(Thread.MIN_PRIORITY);

            thread2.setPriority(Thread.MAX_PRIORITY);

           

        } catch (InterruptedException e) {

            e.printStackTrace();

        }



        System.out.println("all threads have finished their work.");

    }

}