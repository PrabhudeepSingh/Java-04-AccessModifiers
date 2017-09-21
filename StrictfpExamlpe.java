public class StrictfpExamlpe
{
  //abstract strictfp public void m2()    //CE: illegal combination for method

  strictfp public void m1()
  {  
    //strictfp f;                        // strictfp can't use for variable
    System.out.println(10.5/3);
  }

  public static void main(String[] args)
  {
    StrictfpExamlpe s=new StrictfpExamlpe();
    s.m1();
  }
}

abstract strictfp class Example        //abstract strictfb combination valid for classes
{
}