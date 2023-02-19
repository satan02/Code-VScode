import java.util.Random;
// import java.util.random.RandomGenerator;

public class GenerateRandomNumberMethod {
  public static void main(String[] args) {
    // RandomGenerator randomGenerator = new Random();
    // int x = randomGenerator.nextInt(Integer.parseInt(args[0]),
    // Integer.parseInt(args[1]));
    // System.out.println(x);

    Random random = new Random();
    int a = random.nextInt(50, 100);
    System.out.println(a);
    System.out.println(random.nextDouble(20));

  }
}
