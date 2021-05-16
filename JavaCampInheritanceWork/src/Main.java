
public class Main {

	public static void main(String[] args) {
		User user1 = new User();
		user1.setId(1);
		user1.setUserName("Merve");
		user1.setEmail("merve@gmail.com");

		
		
		
		User user2 = new User(2,"Esra","esra@gmail.com");
		User [] users = {user1,user2};
		
		UserManager userManager = new UserManager();
		userManager.add(users);
		
		
		Instructor instructor1 = new Instructor();
		instructor1.setSchedule("Inheritance");
		instructor1.setRecords("Birbirlerinin alternatifi olan kodlar i�in for kullan�lmaz");
		instructor1.setHomework("Kodlama.io �zerinden inheritance olu�turabilece�iniz �al��ma yap�n�z");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.ekle(instructor1);
		
		
		Student student1 = new Student();
		student1.setHomeworkDone("�nheritance uyguland�");
		student1.setAssessment("Anlat�m �ekliniz kaliteli ve anla��l�r, eme�inize sa�l�k");
		student1.setInspection(true);
		student1.setCompletionRate(30);
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.ekle(student1);
	}
	

}
