package csb.progap3.mybean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class QuizBean {

	private String name;
	private String question1;
	private String question2;
	private String question3;
	private String question4;
	private String question5;
	private int value = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuestion1() {
		return question1;
	}

	public void setQuestion1(String question1) {
		this.question1 = question1;
	}

	public String getQuestion2() {
		return question2;
	}

	public void setQuestion2(String question2) {
		this.question2 = question2;
	}

	public String getQuestion3() {
		return question3;
	}

	public void setQuestion3(String question3) {
		this.question3 = question3;
	}

	public String getQuestion4() {
		return question4;
	}

	public void setQuestion4(String question4) {
		this.question4 = question4;
	}

	public String getQuestion5() {
		return question5;
	}

	public void setQuestion5(String question5) {
		this.question5 = question5;
	}

	public String answer1() {

		if (question1.equals("a")) {
			value++;
		}
		return "question_2";
	}

	public String answer2() {

		if (question2.equals("b")) {
			value++;
		}
		return "question_3";
	}

	public String answer3() {

		if (question3.equals("b")) {
			value++;
		}
		return "question_4";
	}

	public String answer4() {

		if (question4.equals("b")) {
			value++;
		}
		return "question_5";
	}

	public String answer5() {

		if (question5.equals("a")) {
			value++;
		}
		return "result";
	}
	public int getValue() {
		return value;
	}

}
