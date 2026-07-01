import java.util.Scanner;

public class zero {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("enter how many numbers you want to enter: ");
    int num = sc.nextInt();
    int[] numbers = new int[num];
    for(int i = 0; i < num; i++) {
      numbers[i] = sc.nextInt();
    }
    int j = 0;
    
     for(int i = 0; i < num; i++) {
      if(numbers[i] != 0) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
        j++;
      }
     }
    
    for(int nums : numbers){
    System.out.print(nums + " ");
    }
  }
}