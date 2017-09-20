package pack4;
public class ProtectedModifier1
{
  protected void m1()
  {
    System.out.println("protected method") ;
  }
}
class C extends ProtectedModifier1
{
  public static void main(String[] args)
  {
    C c=new C();
    c.m1();
    B b=new B();
    b.m1();
  }
}
