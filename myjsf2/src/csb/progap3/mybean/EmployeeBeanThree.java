package csb.progap3.mybean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class EmployeeBeanThree {

	private String firstName;
	private String lastName;
	private String employeeType;
	
	
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
	public String getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	
	
}
