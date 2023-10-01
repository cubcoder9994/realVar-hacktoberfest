import java.util.Scanner;
class single{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int bit = 0;
        System.out.println("Enter the number of integers: ");
        int n = sc.nextInt();
        System.out.println("Enter the integers: ");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            bit ^= num;
        }

        System.out.println("Single number = " + bit);
  }
}
