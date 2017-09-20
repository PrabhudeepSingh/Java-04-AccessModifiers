package pack5;
import pack4.A1;
public class ProtectedModifier2 extends A1
{
  public static void main(String[] args)
  {
    A1 a=new A1();
    a.m1();
    ProtectedModifier2 p=new ProtectedModifier2();
    p.m1();
    A1 a=new ProtectedModifier2();
    a.m1();
  }
}