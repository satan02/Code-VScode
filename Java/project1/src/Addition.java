public class Addition extends App {
  public static void main(String[] args) {
    App app = new App();
    app.display();
    int i = 10;
    System.out.println(Math.pow(3, 10));
    try {

      if (i / 0 > 0) {
        System.out.println("hello");
      }
    } catch (Exception e) {
      System.out.println("Exception " + e);
    }
  }
}
