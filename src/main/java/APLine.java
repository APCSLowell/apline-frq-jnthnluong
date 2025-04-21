public class APLine
{
  /* your code here */
  private int myA,myB,myC;
  private double mySlope;
  public APLine(int a, int b, int c){
    myA = a;
    myB = b;
    myC = c;
    mySlope = -(double)a/(double)b;
  }
  public double getSlope(){
    return mySlope
  }
  public boolean isOnLine(int x, int y){
    return((myA*x + myB*y + myC) == 0)
  }
  
}
