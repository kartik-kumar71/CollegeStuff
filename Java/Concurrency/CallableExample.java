import java.util.concurrent.*;
class CallableDemo implements Callable {

  private final String name;
  private final int len;
  private int sum = 0;

  public CallableDemo(String name, int len) {
    this.name = name;
    this.len = len;
  }

  @Override
  public String call() throws Exception {
    for (int i = 0; i < len; i++) {
      System.out.println(name + ":" + i);
      sum += i;
    }
    return "sum: " + sum;
  }
}
class CallableExample
{
	public static void main(String[] args) {
	ExecutorService es = Executors.newFixedThreadPool(4);
	Future<String> f1 = es.submit(new CallableDemo("one",10));
	Future<String> f2 = es.submit(new CallableDemo("two",20));
	try {
		es.shutdown();
		es.awaitTermination(5, TimeUnit.SECONDS);
		String result1 = f1.get();
		System.out.println("Result of one: " + result1);
		String result2 = f2.get();
		System.out.println("Result of two: " + result2);
	} catch (ExecutionException | InterruptedException ex) {
		System.out.println("Exception: " + ex);
	}
	}
}