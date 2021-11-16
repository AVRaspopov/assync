package ru.proektbg.assync;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Test testThread = new Test();
        CompletableFuture<Long> result = CompletableFuture.supplyAsync(() -> testThread.calc());
        while (result.isDone() != true){
            System.out.println("Жду, пока выполнится таск...");
            Thread.sleep(1000);
        }
        System.out.println("Таск выполнился, ответ "+result.get());
    }

}
