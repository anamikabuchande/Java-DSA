import java.util.Scanner;

public class leader {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("enter how many numbers you want to enter: ");
    int num = sc.nextInt();
    int[] numbers = new int[num];
    for(int i = 0; i < num; i++) {
      numbers[i] = sc.nextInt();
    }

    int maxRight = numbers[num-1];
    System.out.print(numbers[num-1] + " ");
    for(int i = num-2; i >= 0 ; i--) {
      if(numbers[i] > maxRight) {
       maxRight = numbers[i]; 
        

        System.out.print( maxRight + " " );
      }
    }

   
  }
}