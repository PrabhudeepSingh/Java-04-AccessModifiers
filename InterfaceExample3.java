interface Interf1
{
  void m1();
  void m2();

}
interface Interf2
{
  void m1();
  void m2(int i);
}
 
public class InterfaceExample3
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
    InterfaceExample3 e=new InterfaceExample3();
    e.m1();
    e.m2();
    e.m2(10);
  }
}
  