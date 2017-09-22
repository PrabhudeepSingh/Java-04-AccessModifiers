class P
{
 P()
 {
   System.out.println(this.hashCode());//366712642     ->parent class obj won't be created just parent class constructor will be executed for child class purpose only
 }
}
class ObjectCreation extends P
{
  Example()
  {
    System.out.println(this.hashCode());//366712642
  }
  public static void main(String[] args)
  {
    Example e=new Example();
  }
}