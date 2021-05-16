
public class User {

	int id;
	String userName;
	String email;
	
	public User() {
		
	}
	public User(int id,String userName,String email) {
		this();
		this.id = id;
		this.email = email;
		this.userName = userName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
