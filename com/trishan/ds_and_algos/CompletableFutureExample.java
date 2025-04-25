import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
  public static void main(String[] args) {
    int[] a = { 100, 200, 300, 400, 500 };
    CompletableFuture<Integer> sum = CompletableFuture.supplyAsync(
        () -> sumFun(a));
    CompletableFuture<Integer> square = sum.thenApplyAsync(result -> result * result);
    CompletableFuture<Void> printResult = square.thenAcceptAsync(result -> System.out.println(result));

    System.out.println("ttttttttt");

    printResult.join();
  }

  static int sumFun(int[] a) {
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i];
    }

    try {
      Thread.sleep(5000);
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }

    return sum;
  }
}
