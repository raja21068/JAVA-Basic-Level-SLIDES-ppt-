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

class Array2D1{

	public static void main(String ar[]){
		Student hassan = new Student(101, "Hassan", "Java");
		Student imran = new Student(102, "Imran", "Asp");
		Student hassam = new Student(103, "Hassam", "Android") ;
		Student zaheer = new Student(104, "Zaheer", "Linux");
		Student zuhaib = new Student(105, "Zuhaib", "J2ee");
	// Student[] stds = new Student[500] stds[0] = hassan;

	Student[] stds = { hassan, imran, hassam, zaheer, zuhaib };
	//delete(stds, 103);
	update(stds, 103, "Bakhat", "PHP");
	traverse(stds);

		
	}

	public static void delete( Student[] stds , int id){
		
		for(int i=0; i<stds.length; i++){
			if(stds[i].rollNo == id){
				stds[i] = null;
				break;
				}
			       }
		
	}

	public static void update( Student[] stds , int id , String n, String c){
		
		for(int i=0; i<stds.length; i++){
			
			if(stds[i].rollNo == id){
				stds[i].name = n;
				stds[i].course = c;
				break;
				}
			       }
		
	}

	public static void traverse( Student[] stds ){
		
		for(int i=0; i<stds.length; i++){
			if(stds[i] == null){
				continue;
				}
			System.out.println(stds[i].name+"\t"+stds[i].course);
			       }
		
	}
}