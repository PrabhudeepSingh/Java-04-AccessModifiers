package pack4;
public class A1
{
  protected void m1()
  {
    System.out.println("protected method") ;
  }
}
class B  extends A1
{
  public static void main(String[] args)
  {
    A1 a=new A1();
    a.m1();
    B b=new B();
    b.m1();
  }
}
