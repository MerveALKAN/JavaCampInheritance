
public class UserManager  {
private void add(User user) {
	System.out.println(user.getUserName() + " " +"isimli kullan�c� eklendi");
}
        public void add(User[] users) {
        	for (User user: users) {
        		add(user);
        	}
        }
}
