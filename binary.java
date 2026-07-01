import java.util.Scanner;

public class binary {
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
    

    int low = 0;
    int high = num-1;
    int index = -1;
    

    while(low <= high) {
      int mid = (low+high)/2;

      if(numbers[mid] == key) {
        index = mid;
        break;
        
        
      }

      else if (numbers[mid] > key) {
        high = mid - 1;
      }

      else {
        low = mid + 1;
      }
    }

    if(index != -1) {
      System.out.println("key found at index " + index );
    }

    else {
      System.out.println("key not found");
    }
    
  }
}