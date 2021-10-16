package week3.day1.assignment;

public class Students {
	public void getStudentInfo() {
System.out.println("get student info no argument");
	}
	
	public void getStudentInfo(int id) {
		System.out.println("get student info with id argument " +id);
			}
	public void getStudentInfo(int id, String name) {
		System.out.println("get student info with id & name argument " +id +" " +name);
			}
	public void getStudentInfo(String email, long phone) {
		System.out.println("get student info with id & name argument " +email +" " +phone);
			}

	public static void main(String[] args) {
		Students stud = new Students();
		stud.getStudentInfo();
		stud.getStudentInfo(12);
		stud.getStudentInfo(12,"prabu");
		stud.getStudentInfo("test@mgail.com",1987654321);

	}

}
