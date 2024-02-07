package onlineQuizManagement;

	import java.util.ArrayList;
	import java.util.List;

	public class DatabaseManager {
	    private List<User> users;
	    private List<Test> tests;

	    public DatabaseManager() {
	        // Initialize users and tests (populate from the database in a real scenario)
	        users = new ArrayList<>();
	        tests = new ArrayList<>();
	    }

	    public void addUser(User user) {
	        users.add(user);
	    }

	    public User getUser(String username) {
	        for (User user : users) {
	            if (user.getUsername().equals(username)) {
	                return user;
	            }
	        }
	        return null;
	    }

	    public void addTest(Test test) {
	        tests.add(test);
	    }

	    public Test getTest(String testName) {
	        for (Test test : tests) {
	            if (test.getTestName().equals(testName)) {
	                return test;
	            }
	        }
	        return null;
	    }
	}



