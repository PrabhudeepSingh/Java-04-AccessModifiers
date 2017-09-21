package pack5;
import pack4.Protectedex;
class D extends Protectedex
{
  public static void main(String[] args)
  {
    //Protectedex p =new Protectedex();     //CE:m1() has protected access in Protectedex
    //p.m1();

    D d=new D();
    d.m1();                                 //only child class reference is used to access protected member from outside package

    //Protectedex p =new D();               //CE:m1() has protected access in Protectedex
    //p.m1();
  }
}
