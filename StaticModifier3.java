public class StaticModifier3
{
  static int x=10;
  int y=20;

  public void m1()
  {
    System.out.println(x); //10
    System.out.println(y); //20
  }

  public static void m2()
  {
    System.out.println(x); //10
    //System.out.println(y); -> CE: non-static variable y cannot be referenced from a static context
  }

  public static void main(String[] args)
  { 
    StaticModifier3 s=new StaticModifier3();
    s.m1();
    StaticModifier3.m2();
  }
}