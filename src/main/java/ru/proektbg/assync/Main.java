package ru.proektbg.assync;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Test testThread = new Test();
        CompletableFuture<Long> result = CompletableFuture.supplyAsync(() -> testThread.calc());
        while (!result.isDone()){
            Thread.sleep(1000);
            try {
                System.out.println("Проверяю, выполнился ли таск");
                System.out.println(result.get(0, TimeUnit.SECONDS));
            } catch (TimeoutException e){
                System.out.println("Таск еще не выполнился. Жду 1 секунду");
            }
        }
    }

}
