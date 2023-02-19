class Random {
  public double random(int min, int max) {
    return Math.random() * (max - min + 1) + min;
  }

  public static void main(String[] args) {
    Random r = new Random();
    double randomNumber = r.random(10, 100);
    System.out.println(randomNumber);
  }
}
