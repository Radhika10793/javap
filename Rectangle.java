/*2.Create a class named 'Rectangle' with two data members- length and breadth and a function to calculate the area which is 'length*breadth'. The class has three constructors which are :
1 - having no parameter - values of both length and breadth are assigned zero.
2 - having two numbers as parameters - the two numbers are assigned as length and breadth respectively.
3 - having one number as parameter - both length and breadth are assigned that number.
Now, create objects of the 'Rectangle' class having none, one and two parameters and print their areas.
*/

class Rectangle
{
int length;
int breath;


 Rectangle()
{
length=0;
breath=0;
}
 Rectangle(int l,int b)
{
 this.length=6;
this.breath=5;


}
Rectangle(int  n)
{

length=8;
breath=9;
}
void  area()
{
System.out.println( length*breath);

}
}

public static void main(String args[])
{
Rectangle r2=new Rectangle();
r2.area();
Rectangle r1=new Rectangle(10);
r1.area();
Rectangle r=new Rectangle(10,20);
r.area();
}
}

