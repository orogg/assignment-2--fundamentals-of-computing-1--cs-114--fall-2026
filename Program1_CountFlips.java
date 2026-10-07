public class Program1_CountFlips {
  public static void main(String[] args) {

    int maxFlips = 100;
    int flipCount = 0;
    int headCount = 0;
    int tailsCount = 0;

    Coin myCoin = new Coin();

    for(maxFlips = 100; flipCount<maxFlips; flipCount++ ){
      myCoin.flip();
      if (myCoin.isHeads()) {
        headCount++;
      }
      else {
        tailsCount++;
      }

    }
    System.out.println("Heads Count = " + headCount);
    System.out.println("Tails Count = " + tailsCount);
  }
}
