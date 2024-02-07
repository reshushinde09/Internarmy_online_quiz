package onlineQuizManagement;

import java.util.List;

public class Test {
	 private String testName;
	    private List<Question> questions;
	    private int durationInMinutes;

	    public Test(String testName, List<Question> questions, int durationInMinutes) {
	        this.testName = testName;
	        this.questions = questions;
	        this.durationInMinutes = durationInMinutes;
	    }

	    public String getTestName() {
	        return testName;
	    }

	    public List<Question> getQuestions() {
	        return questions;
	    }

	    public int getDurationInMinutes() {
	        return durationInMinutes;
	    }

}
