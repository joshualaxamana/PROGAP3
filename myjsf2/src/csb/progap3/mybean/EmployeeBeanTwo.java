package csb.progap3.mybean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class EmployeeBeanTwo {
	
	private String firstName;
	private String lastName;
	private String workShift;
	
	//List of workshift for the drop-down list
	List<String> workShiftOptions;
		
	public EmployeeBeanTwo() {
		workShiftOptions = new ArrayList<>();
		
		workShiftOptions.add("Morning Shift");
		workShiftOptions.add("Mid Shift");
		workShiftOptions.add("Night Shift");
	}
	
	public List<String> getWorkShiftOptions() {
		return workShiftOptions;
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
	public String getWorkShift() {
		return workShift;
	}
	public void setWorkShift(String workShift) {
		this.workShift = workShift;
	}
	
}
