
public class Student extends User{

	private String homeworkDone; //ödev 
	private String assessment; //deðerlendirme
	private boolean inspection; //yoklama
	private int completionRate; //tamamlanma oraný
	
	
	public String getHomeworkDone() {
		return homeworkDone;
	}
	public void setHomeworkDone(String homeworkDone) {
		this.homeworkDone = homeworkDone;
	}
	public String getAssessment() {
		return assessment;
	}
	public void setAssessment(String assessment) {
		this.assessment = assessment;
	}
	public boolean isInspection() {
		return inspection;
	}
	public void setInspection(boolean inspection) {
		this.inspection = inspection;
	}
	public int getCompletionRate() {
		return completionRate;
	}
	public void setCompletionRate(int completionRate) {
		this.completionRate = completionRate;
	}
	
	
}
