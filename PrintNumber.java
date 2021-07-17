/*5.Create a class named 'PrintNumber' to print various numbers of different datatypes by creating 
different functions with the same name 'printn' having a parameter for each datatype.*/

class PrintNumber
{
void printn(int a)
{
System.out.println(a);
}
void printn(float f)
{
System.out.println(f);
}
void printn(double d)
{
System.out.println(d);
}
void printn(char c)
{
System.out.println(c);
}
void printn(String s)
{
System.out.println(s);
}
public static void main(String args[])
{
PrintNumber p=new PrintNumber();
p.printn(2);
p.printn(3.55);
p.printn('v');
p.printn("Radhika");
}
}
