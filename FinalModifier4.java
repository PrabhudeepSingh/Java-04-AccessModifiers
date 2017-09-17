public class FinalModifier4
{ 
  final int x=10;

  final int y;
  { 
    y=20;
  }

  final int z;

  FinalModifier4()
  { 
    z=30;
  } // various places for initialization of final variable

  public static void main(String []args)
  {
     Finalmodifier3 f=new  Finalmodifier3();
     System.out.println(f.x+"    "+f.y+"   "+f.z);

     //f.x = 89; -> CE: cannot assign a value to final variable x
  }
}
