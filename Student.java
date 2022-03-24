
public class Student 
{
	int id;
	String name;

Student(int i,String s)
{
	id=i;
	name=s;
}
Student(Student s)
{
	id=s.id;
	name=s.name;
}
void show()
{
	System.out.println(id+" "+name);
}
public static void main(String[] args)
{
	Student s=new Student(101,"sonu");
	Student s2=new Student(s);
	s2.show();
}
}