
public class StudentManager {

	public void goster(Student student) {
		System.out.println
		(
				student.getHomeworkDone()+" "+
		        student.getAssessment()+" "+
			    student.getCompletionRate()+" "
		      
				
				
	    );
	
	
	}
	public void ekle (Student student) {
		System.out.println("�devler tamamland�");
		System.out.println("De�erlendirme yap�ld�");
		System.out.println("Yoklama al�nd�");
		System.out.println("Tamamlama oran� de�erlendirildi");
		
		goster(student);
	}
}
