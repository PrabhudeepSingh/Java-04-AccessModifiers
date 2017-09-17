public class FinalModifier1
{
  public void property()
  {
    System.out.println("cash+land+gold");
  }

  public final void marry()
  {
    System.out.println("luxmi");
  }

   public static void main(String[] args)
   {
     Finalmodifier f=new Finalmodifier();
     f.property();
     f.marry();
   }
}

class example extends Finalmodifier
{
   /*public void marry() -> CE: marry() in example cannot override marry() in Finalmodifier
   {
     System.out.println("luxmi rani");
   }*/
}