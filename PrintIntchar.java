/*6. Create a class to print an integer and a character using two functions having the 
same name but different sequence of the integer and the character parameters.
For example, if the parameters of the first function are of the form (int n, char c), 
then that of the second function will be of the form (char c, int n).*/

class PrintIntchar
{
void parameter(int n,char c)
{
System.out.println(n);
System.out.println(c);

}
void parameter(char c,int n)
{
System.out.println(c);
System.out.println(n);
}
public static void main(String args[])
{
PrintIntchar p=new PrintIntchar();
p.parameter(20,'R');
p.parameter('s',40);
}
}
