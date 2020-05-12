import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    LinkedList<Integer> l=new LinkedList<Integer>();
    int n=sc.nextInt();
    while(n!=-1){
      l.add(n);
      n=sc.nextInt();
    }

    for(int i: l)
      System.out.println(i);
  }
}