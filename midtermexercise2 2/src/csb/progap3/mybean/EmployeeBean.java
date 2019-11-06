package csb.progap3.mybean;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class EmployeeBean {

	private String firstName;
	private String lastName;
	private String address;
	private String contactNo;
	private String email;
	private String password;
	private String confirmPassword;
	private int birthYear;
	private String gender;
	private String status;
	private String relocated;
	private String area;
	private int age;
	
	private String[] progLang;
	private String[] scriptLang;
	
	int year = Calendar.getInstance().get(Calendar.YEAR);
	
	public int getAge() {
		age = year - birthYear;
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	List<String> statusOptions;
	
	public EmployeeBean() {
		statusOptions = new ArrayList<>();
		
		statusOptions.add("Single");
		statusOptions.add("Married");
		statusOptions.add("Divorce");
		
		progLang = new String[]{"C#, Java, PHP, Swift, ASP.Net"};
		scriptLang = new String[]{"Javascript, jQuery, HTML 5, CSS, jSon"};
		
		
	}
	
	public List<String> getStatusOptions() {
		return statusOptions;
	}
	
	public String[] getProgLang() {
		return progLang;
	}

	public void setProgLang(String[] progLang) {
		this.progLang = progLang;
	}

	public String[] getScriptLang() {
		return scriptLang;
	}

	public void setScriptLang(String[] scriptLang) {
		this.scriptLang = scriptLang;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public int getBirthYear() {
		return birthYear;
	}
	
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRelocated() {
		return relocated;
	}

	public void setRelocated(String relocated) {
		this.relocated = relocated;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	public String compute()
	{
		if (password.equals(confirmPassword)){
			return "employee_confirmation";
		}
		else {
			return "invalid_login";
		}
	}
	
	
	
}
