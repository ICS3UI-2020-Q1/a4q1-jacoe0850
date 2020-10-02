import java.util.Scanner;
/**
 *
 * @jacoe0850 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter an integer to count down to");
    int downTo = input.nextInt();
    int count = 100;
    while(count >= downTo){
      System.out.println(count);
      count = count - 5;
    }
    
  }
}
