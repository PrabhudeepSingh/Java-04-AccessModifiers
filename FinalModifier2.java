final class FinalModifier2
{  
  static int a=10; //every variable present in final class need not be final always
  
  public void m1()
  {
    System.out.println("final method");//every method present in final class is always final
  }

  public static void main(String[] args)
  {
    System.out.println(a);
    Finalmodifier1 f=new Finalmodifier1();
    f.m1();
  }
}
    
   