package concurrency.ThreadPoolExecutor;

public class CustomThreadPoolExample {
  public static void main(String[] args) {
    //
    CustomThreadPool customThreadPool = new CustomThreadPool(2);

    for (int i = 1; i <= 5; i++) {
      Task2 task = new Task2("Task" + i);
      System.out.println("Created:" + task.getName());
      customThreadPool.execute(task);
    }
  }
}
