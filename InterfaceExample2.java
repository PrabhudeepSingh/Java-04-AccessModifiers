interface Interf1
{
  void m1();
  void m2();
  int x=444;
}

interface Interf2
{
  void m1();
  void m2(int i);
  int x=555;
}
 
public class InterfaceExample2
{
  public void m1()
  {
    System.out.println("we can provide implementation only for one method");
  }
  public void m2()
  {
    System.out.println("we can provide implementation only for both methods");
  }
   public void m2(int i)
  { 
    System.out.println("we can provide implementation only for both methods");
  }
  public static void main(String[] args)
  {
    InterfaceExample2 e=new InterfaceExample2();
    e.m1();
    e.m2();
    e.m2(10);
    System.out.println(Interf1.x); //444
    System.out.println(Interf2.x); //555
  }
}
  