class Degree
{
Degree()
{
System.out.println("I got a degree");

}
class undergraduate extends Degree
{
 undergraduate ()
{
System.out.println("I am an Undergraduate");

}}
class postgraduate extends Degree
{
 postgraduate ()
{
System.out.println("I am a Postgraduate");

}
}
public static void main(String args[])
{

Degree d=new Degree();
undergraduate  u=new undergraduate ();
postgraduate  p=new postgraduate ();


}}

