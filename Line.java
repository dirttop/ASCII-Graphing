public class Line {
  double m, b;
  
  public Line(double _m, double _b){
    m = -1 * _m;
    b = _b;
  }
  public String toString(){
    return(-m + "x + " + b);
  }
  public String intersect(Line l){
    double x = (m*l.b-l.m*b)/(l.m-l.b);
    double y = (b - l.b) / (l.m - m);
    return("(" + x + ", " + y + ")");
    //m b
    //  l.m  l.b
  }
}