
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
		System.out.println("Ödevler tamamlandý");
		System.out.println("Deðerlendirme yapýldý");
		System.out.println("Yoklama alýndý");
		System.out.println("Tamamlama oraný deðerlendirildi");
		
		goster(student);
	}
}
