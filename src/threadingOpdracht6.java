public class threadingOpdracht6 {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(() -> print('#', 100));
        Thread thread2 = new Thread(() -> print('*', 1000));

        for(int i = 3; i >=0; i--) {
            System.out.println("Waiting: " + i + " seconds left");
            Thread.sleep(1000);}


        thread1.start();
        thread2.start();

        try{

            thread1.join(3000);
            if(thread1.isAlive()){
                thread1.interrupt();
                thread1.join();

            }
            thread2.join(3000);
            if(thread2.isAlive()){
                thread2.interrupt();
                thread2.join();
            }

        } catch (Exception e) {

        }
        System.out.println("END");


    }

    private static void print(char d, int count) {

        for (int i = 0; (i < count)&&(!Thread.interrupted()); i++) {
            System.out.print(d);
            try {
                Thread.sleep(100);


            } catch (Exception e) {

            }


        }

    }

}
