public class FinalModifier3
{
  int x;
  //final int y;
  final int y1=10;

  public static void main(String []args)
  {
    FinalModifier3 f=new FinalModifier3();
    System.out.println(f.x);
    //System.out.println(f.y); -> CE: variable y not initialized
    System.out.println(f.y1);
  }
}