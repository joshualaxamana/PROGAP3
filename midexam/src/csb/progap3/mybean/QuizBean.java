package csb.progap3.mybean;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class QuizBean {

	private String userName;
	private String password;
	private String userNameLogin;
	private String passwordLogin;
	private String name;
	private String question1;
	private String question2;
	private String question3;
	private String question4;
	private String question5;
	private int value = 0;
	private int attempts = 3;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserNameLogin() {
		return userNameLogin;
	}

	public void setUserNameLogin(String userNameLogin) {
		this.userNameLogin = userNameLogin;
	}

	public String getPasswordLogin() {
		return passwordLogin;
	}

	public void setPasswordLogin(String passwordLogin) {
		this.passwordLogin = passwordLogin;
	}

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
		return "page2";
	}

	public String answer2() {

		if (question2.equals("b")) {
			value++;
		}
		return "page3";
	}

	public String answer3() {

		if (question3.equals("b")) {
			value++;
		}
		return "page4";
	}

	public String answer4() {

		if (question4.equals("b")) {
			value++;
		}
		return "page5";
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

	public String compute() {
		if (userName.equals(userNameLogin) && password.equals(passwordLogin)) {
			return "page1";
		} else if (userNameLogin.equals("Admin") && passwordLogin.equals("password")) {
			return "page1";
		} else {
			attempts--;
			if (attempts == 0) {
				return "userlockout";
			}
		}
		return "login";
	}

	public void retry() throws IOException {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		FacesContext.getCurrentInstance().getExternalContext().redirect("/page1.xhtml");
	}
}
