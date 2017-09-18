interface Interf1
{
  void m1();
  
  void m2();
 
  void m3();

  void m4();

  void m5();

  void m6();
}

abstract class Test implements Interf1
{
  public void m1(){}
 
  public  void m2(){}
 
  public void m3(){}
  
  public void m4(){}
 
  public void m5(){}
  
  public void m6(){}      //abstract class imlements an interface with only empty implementation
}

public class AbstractExample3 extends Test
{
  public void m2()
  {
    System.out.println("we have to provide implementation only for required methods");
  } 
  public static void main(String [] args)
  { 
    AbstractExample3 a=new  AbstractExample3();
    a.m2();
  }
}
