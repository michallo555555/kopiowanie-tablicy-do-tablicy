import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Hello world!");
    int tablica[] = {1,2,3,4,5,6,7,8,9};
    int skopiowana[] = tablica.clone();
    for(int i=0; i<tablica.length;i++){
          System.out.print(skopiowana[i]+" ");
    }

  }
}