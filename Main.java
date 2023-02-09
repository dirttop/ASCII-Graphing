import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Line line1 = null, line2 = null;
    Graph graph = new Graph(30, 10);
    Scanner input = new Scanner(System.in);
    
    while(true) {
      clear();
      printTitle();
      graph.draw(line1, line2);        
  
      if (line1 != null) println("Line1: " + line1);
      if (line2 != null) println("Line2: " + line2);
      if (line1 != null && line2 != null)
          println("Intersection: " + line1.intersect(line2));
          printMenu();      
      int selection = input.nextInt();
      
      if (selection == 1) {
          System.out.print("  Enter slope: ");
          double m = input.nextDouble();
          System.out.print("  Enter intercept: ");
          double b = input.nextDouble();
          line1 = new Line(m, b);
      }
      if (selection == 2) {
          System.out.print("  Enter slope: ");
          double m = input.nextDouble();
          System.out.print("  Enter intercept: ");
          double b = input.nextDouble();
          line2 = new Line(m, b);
        }   
      }
    }  
    public static void clear() {
      print("\033[H\033[2J");
      System.out.flush();  
    }
  
    public static void printTitle() {
      println("=========================================");
      println("== ASCII Graphing/Intersection Program ==");
      println("=========================================");
      println("");
      println("");
    }
  
    public static void printMenu() {
      println("\nMenu:\n");
      println("  1) Set line #1");
      println("  2) Set line #2\n");
      print("What would you like to do? ");
    }
  
    public static void println(String s) {
      System.out.println(s);
    }
  
    public static void print(String s) {
      System.out.print(s);
    }
  }