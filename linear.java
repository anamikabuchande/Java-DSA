import java.util.Scanner;

public class linear {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("enter how many numbers you want to enter: ");
    int num = sc.nextInt();
    int[] numbers = new int[num];
    for(int i = 0; i < num; i++) {
      numbers[i] = sc.nextInt();
    }

    System.out.print("enter a numbers to search ");
    int key = sc.nextInt();

    boolean isFound = false;
    int index = -1;
    for(int i = 0; i <num-1; i++) {
      if(numbers[i] == key) {
        isFound = true;
        index = i;
        break;
      }
    }

    if(isFound) {
      System.out.print("key is found at index " + index);
    }

    else {
      System.out.print("key not found");
    }

   
  }
}