class Student{
	int rollNo;
	String name;
	String course;
	Student(int r, String n, String c){
		rollNo = r;
		name = n;
		course = c;
	}
}

class Array2D{

	public static void main(String ar[]){
		Student hassan = new Student(101, "Hassan", "Java");
		Student imran = new Student(102, "Imran", "Asp");
		Student hassam = new Student(103, "Hassam", "Android") ;
		Student zaheer = new Student(104, "Zaheer", "Linux");
		Student zuhaib = new Student(105, "Zuhaib", "J2ee");

	Student[] stds = { hassan, imran, hassam, zaheer, zuhaib };
	Student s = search(stds, 103);
	System.out.println(s.name);

		
	}

	public static Student  search( Student[] stds , int id){
		Student st = null;
		for(int i=0; i<stds.length; i++){
			if(stds[i].rollNo == id){
				st = stds[i];
				break;
				}
			       }
		return st;
	}
}