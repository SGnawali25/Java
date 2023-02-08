class BitProblems {
  public static void main(String[] args) {
    System.out.println(5^5);

    //Swapping two values without creating third variable
    int first = 8;
    int second = 3;
    first = first ^ second;
    second = first ^ second;
    first = first ^ second;
    System.out.println("The first is " + first  + " and the second is " + second + ".");
  }
}