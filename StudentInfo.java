8. Create a class 'Student' with three data members which are name, age and address. 
The constructor of the class assigns default values to name as "unknown", age as '0' 
and address as "not available". It has two functions with the same name 'setInfo'. 
First function has two parameters for name and age and assigns the same whereas the 
second function takes has three parameters which are assigned to name, age and address
 respectively. Print the name, age and address of 10 students.
Hint - Use array of objects

class StudentInfo{
String name[10],add;
int age;
StudentInfo()
{
name="unknown";
age=0;
add="not available";
}

void setInfo(String n,int a)
{
name=n;
age=a;

}

void setInfo(String n,int a,String s)
{
name=n;
age=a;
add=s;
}
void display()
{
System.out.println(name);
System.out.println(age);
System.out.println(add);
}
}
public static void main(String args[])
{
StudentInfo  s[]=new StudentInfo[10];
for(int i=1;i<10;i++)

s[1].display();
}
}
