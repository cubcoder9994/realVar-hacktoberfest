import java.util.*;
class single{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[15];
    for(int i=0;i<15;i++){
      arr[i]=sc.nextInt();
    }
    HashMap<Integer,Integer> hm = new HashMap<>();
    for(int i:arr){
      hm.put(i,hm.getOrDefault(i,0)+1);
    }
    for(int i:hm.keySet()){
      if(hm.get(i)==1){
        System.out.println("Single number = "+i);
        break;
      }
    }
  }
}
