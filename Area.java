//2.Create a class named 'Rectangle' with two data members- length and breadth and a function to
calculate the area which is 'length*breadth'. The class has three constructors which are :
1 - having no parameter - values of both length and breadth are assigned zero.
2 - having two numbers as parameters - the two numbers are assigned as length and breadth respectively.
3 - having one number as parameter - both length and breadth are assigned that number.
Now, create objects of the 'Rectangle' class having none, one and two parameters and print their areas.




class Area
{
void  display(int a)
{
System.out.println("Area of square" +a*a);
}
void display(int l,int b)
{
System.out.println("Area of rectangle" +l*b);
}

public static void main(String args[])
{
Area a=new Area();
a.display(4);
a.display(5,6);
}
}