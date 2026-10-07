import java.util.Scanner;

public class Program4_OneHundredBottlesOfBeer {
  public static void main(String[] args) {
    System.out.println("How many verses from '100 bottles of beer' to be displayed?");
    Scanner scan = new Scanner(System.in);
    int bottleNumber=100;
    int versesNumber = scan.nextInt();
    scan.close();
    if (versesNumber > 100 || versesNumber <0 ) {
      System.out.println("Number of verses not compatible. Restart program and retry.");
      System.exit(0);
    }
    for(; versesNumber > 0; versesNumber-- ){
      System.out.println( ""+ bottleNumber+ " Bottles of beer on the wall");
      System.out.println( ""+ bottleNumber+ " Bottles of beer");
      bottleNumber--;
      System.out.println("If one of those bottles should happen to fall");
      System.out.println(""+ bottleNumber +" Bottles of beer on the wall");
      System.out.println();
    }
  }
}
