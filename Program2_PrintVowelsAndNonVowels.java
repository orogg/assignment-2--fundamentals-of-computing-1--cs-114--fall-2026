import java.util.Scanner;

public class Program2_PrintVowelsAndNonVowels {
  public static void main(String[] args) {
    int lowA = 0;
    int lowE = 0;
    int lowI = 0;
    int lowO = 0;
    int lowU = 0;

    int upA = 0;
    int upE = 0;
    int upI = 0;
    int upO = 0;
    int upU = 0;

    Scanner scan = new Scanner(System.in);

    System.out.println("Insert a string of characters. ");

    String inputString;
    inputString = scan.nextLine();
    scan.close();
    int stringLength = inputString.length();
    for (char ch : inputString.toCharArray()){

      if (ch == 'a')
        lowA++;

      if (ch =='A')
        upA++;

      if (ch == 'e')
        lowE++;

      if (ch =='E')
        upE++;

      if (ch == 'i')
        lowI++;

      if (ch =='I')
        upI++;

      if (ch == 'o')
        lowO++;

      if (ch == 'O')
        upO++;

      if (ch == 'u')
        lowU++;

      if (ch =='U')
        upU++;

    }
  int totalVowelCount = (lowA+upA+lowE+upE+lowI+upI+lowO+upO+lowU+upU);
  int totalNonVowelCount=(stringLength-totalVowelCount);

  // System.out.println("The number of lowercase a's are: " + lowA);
  // System.out.println("The number of uppercase a's are: " + upA);
  System.out.println("The number of a's are: " + (upA+lowA));


  //System.out.println("The number of lowercase e's are: " + lowE);
  //System.out.println("The number of uppercase e's are: " + upE);
  System.out.println("The number of e's are: " + (upE+lowE));


  //System.out.println("The number of lowercase i's are: " + lowI);
  //System.out.println("The number of uppercase i's are: " + upI);
  System.out.println("The number of i's are: " + (upI+lowI));


  //System.out.println("The number of lowercase o's are: " + lowO);
  //System.out.println("The number of uppercase o's are: " + upO);
  System.out.println("The number of o's are: " + (upO+lowO));


  //System.out.println("The number of lowercase u's are: " + lowU);
  //System.out.println("The number of uppercase u's are: " + upU);
  System.out.println("The number of u's are: " + (upU+lowU));


  System.out.println("The total number of vowels are: " + totalVowelCount);
  System.out.println("The total number of non vowel characters are:" + totalNonVowelCount);
  }
}
