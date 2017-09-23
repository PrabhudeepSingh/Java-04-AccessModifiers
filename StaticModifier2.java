public class StaticModifier2
{
  static int x=10;
  int y=20;

  public static void main(String[] args)
  {
    StaticModifier2 s=new StaticModifier2();
    s.x=888;
    s.y=999;
    System.out.println(s.x+"..."+s.y);    //888...999

    Staticmodifier1 s1=new Staticmodifier1();
    System.out.println(s1.x+"..."+s1.y);  //888...20
  }
}