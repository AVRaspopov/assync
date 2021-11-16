package ru.proektbg.assync;


public class Test {

    public Long calc() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Жду 1 секунду");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return 100500L;
    }
}
