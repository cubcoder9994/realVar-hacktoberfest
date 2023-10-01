import java.util.*;
class single{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[15];
    for(int i=0;i<15;i++){
      arr[i]=sc.nextInt();
    }
    int bit=0,i=0;
    while(i<arr.length){
      bit = (bit^arr[i]);
      i++;
  }
	System.out.println("Single number = "+bit);
  }
}
