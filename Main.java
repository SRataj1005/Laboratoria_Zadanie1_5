import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
  Scanner nowy = new Scanner(System.in);
  for(int i = 50; i<=100;i++)
    {
      if(i%2 != 0)
      {
      System.out.println(i);
      }
    }
  System.out.println("Podaj liczbę: ");
  int a = nowy.nextInt();
  if(a%2==0)
  {
    System.out.println("Liczba jest parzysta");
  }
    else
  {
    System.out.println("Liczba nie jest parzysta");
  }
  
  }
  
}