public class Program3_TheTwelveDaysOfChristmas {
  public static void main(String[] args) {

    String verseOne = "A partridge in a pear tree.";
    String verseTwo = "Two turtle doves, and";
    String verseThree = "Three french hens,";
    String verseFour = "Four calling birds,";
    String verseFive = "Five golden rings,";
    String verseSix = "Six geese a-laying,";
    String verseSeven = "Seven swans a-swimming,";
    String verseEight = "Eight maids a-milking,";
    String verseNine = "Nine ladies dancing,";
    String verseTen = "Ten lords a-leaping,";
    String verseEleven = "Eleven pipers piping,";
    String verseTwelve = "Twelve drummers drumming,";

    int verseCount = 0;
    for(verseCount = 0; verseCount <= 12; verseCount++){
      switch (verseCount){
        case 12:
          System.out.println("On the twelfth day of Christmas, my true love gave to me:");
          break;
        case 11:
          System.out.println("On the eleventh day of Christmas, my true love gave to me:");
          break;
        case 10:
          System.out.println("On the tenth day of Christmas, my true love gave to me:");
          break;
        case 9:
          System.out.println("On the ninth day of Christmas, my true love gave to me:");
          break;
        case 8:
          System.out.println("On the eighth day of Christmas, my true love gave to me:");
          break;
        case 7:
          System.out.println("On the seventh day of Christmas, my true love gave to me:");
          break;
        case 6:
          System.out.println("On the sixth day of Christmas, my true love gave to me:");
          break;
        case 5:
          System.out.println("On the fifth day of Christmas, my true love gave to me:");
          break;
        case 4:
          System.out.println("On the fourth day of Christmas, my true love gave to me:");
          break;
        case 3:
          System.out.println("On the third day of Christmas, my true love gave to me:");
          break;
        case 2:
          System.out.println("On the second day of Christmas, my true love gave to me:");
          break;
        case 1:
          System.out.println("On the first day of Christmas, my true love gave to me:");
          break;
      }
      switch(verseCount){
        case 12:
          System.out.println(""+verseTwelve);
        case 11:
          System.out.println(""+verseEleven);
        case 10:
          System.out.println(""+verseTen);
        case 9:
          System.out.println(""+verseNine);
        case 8:
          System.out.println(""+verseEight);
        case 7:
          System.out.println(""+verseSeven);
        case 6:
          System.out.println(""+verseSix);
        case 5:
          System.out.println(""+verseFive);
        case 4:
          System.out.println(""+verseFour);
        case 3:
          System.out.println(""+verseThree);
        case 2:
          System.out.println(""+verseTwo);
        case 1:
          System.out.println(""+verseOne);
      }
    }
  }
}
