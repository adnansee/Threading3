public class TimeBomb extends Thread{
    private int time;
    private boolean active;

    public TimeBomb(int time) {
        this.time = time;
    }

    @Override
    public void run() {
        System.out.println("BOMB ARMED");


            while(time>=0 && active){

                try {
                    for(int i = time; i >=0; i--) {
                        System.out.println("TimeBomb ticking: " + i + " seconds left");
                    Thread.sleep(1000);

                }

                System.out.println("BOOM!!!");
            } catch (InterruptedException e) {
                    active = false;

                }

            }

    }

    public void activate() throws InterruptedException {
        start();
        active = true;

    }

    public void disarm() {
        interrupt();
        active = false;
        System.out.println("BOMB DISARMED");
    }

    public int getTime() {
        return time;
    }
}
