class Student{
	int marks;
	String name;
	
	Student(){
		System.out.println("Creating a student object");
		name="Default Name";
	}
	
	Student(String m,int n){
		System.out.println("Creating a student object with name "+m+ " and marks "+n);
		name=m;
	}

}

class App{
	public static void main(String[] args){
		System.out.println("Welcome to Demo class App");
		
		Student s1=new Student();
		
		System.out.println("Name of the student s1 is "+s1.name);
		System.out.println("Marks of the student s1 is "+s1.marks);
		
		s1.marks=100;
		s1.name="Alice";
		
		System.out.println("Name of the student s1 is "+s1.name);
		System.out.println("Marks of the student s1 is "+s1.marks);
		System.out.println();
		
		Student s2=new Student("Bob",50);
		//s2.marks=50;
		//s2.name="Bob";
		
		System.out.println("Name of the student s2 is "+s2.name);
		System.out.println("Marks of the student s1 is "+s2.marks);
	}
}