public class Graph {
  int x, y;
  
  public Graph(int _x, int _y){
    x = _x;
    y = _y;
  } 
  public void draw(Line line1, Line line2){
    for(int i = -y; i < y; i++){
      for(int j = -x; j<x; j++){
        if (i != 0 && j != 0){
          if (line1 != null && i == line1.m*j + line1.b){
            System.out.print(".");
          }
          else if (line2 != null && i == line2.m*j + line2.b){
            System.out.print("/");
          }
          else{
            System.out.print(" ");
          }
        }
        else if (i == 0){
          if (line1 != null && i == line1.m*j + line1.b){
            System.out.print(".");
          }
          else if (line2 != null && i == line2.m*j + line2.b){
            System.out.print("/");
          }
          else {
            if (j == 0){
              System.out.print("+");
            }
            else{
              System.out.print("-");
            }
          }
        }
        else if (j == 0){
          if (line1 != null && i == line1.m*j + line1.b){
            System.out.print(".");
          }
          else if (line2 != null && i == line2.m*j + line2.b){
            System.out.print("/");
          }
          else{
            System.out.print("|");
          }
        }   
      }
    } 
  }
}
  