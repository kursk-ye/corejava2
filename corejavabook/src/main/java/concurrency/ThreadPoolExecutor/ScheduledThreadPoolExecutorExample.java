package concurrency.ThreadPoolExecutor;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExecutorExample {
  public static void main(String[] args) {
    //
    ScheduledThreadPoolExecutor executor =
        (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(2);

    Task2 task = new Task2("Repeat Task");
    System.out.println("Created:" + task.getName());
    executor.scheduleWithFixedDelay(task, 2, 2, TimeUnit.SECONDS);
  }
}

class Task2 implements Runnable {
  private String name;

  public Task2(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public void run() {
    System.out.println("Executing :" + name + ", Current Seconds :" + new Date().getSeconds());
  }
}
