package csb.progap3.mybean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class EmployeeBean {
	
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private String contactNo;	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	
	public String compute()
	{
		if (username.equals("csb") && password.equals("csb")){
			return "employee_form";
		}
		else {
			return "invalidlogin";
		}
	}
	
}
