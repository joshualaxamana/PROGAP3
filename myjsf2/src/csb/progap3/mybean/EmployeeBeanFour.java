package csb.progap3.mybean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class EmployeeBeanFour {
	
	private String firstName;
	private String lastName;
	
	private String[] requirements;

	public EmployeeBeanFour() {
		firstName = "Eric";
		lastName = "Carandang";
		requirements = new String[]{"SSS", "Pag-ibig", "TOR"};
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

	public String[] getRequirements() {
		return requirements;
	}

	public void setRequirements(String[] requirements) {
		this.requirements = requirements;
	}
	
	

}
