import java.util.Scanner;

public class reverse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("enter how many numbers you want to enter: ");
    int num = sc.nextInt();
    int[] numbers = new int[num];
    for(int i = 0; i < num; i++) {
      numbers[i] = sc.nextInt();
    }
    int start = 0 ;
    int end = num-1;
    
      
      
      while (start < end) {
        int temp = numbers[start];
        numbers[start] = numbers[end];
        numbers[end] = temp;
        start++;
        end--;
      }
    
    for(int nums : numbers){
    System.out.print(nums + " ");
    }
  }
}