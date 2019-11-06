package csb.progap3.mybean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class EmployeeDataUtil {

	private String firstName;
	private String lastName;
	private String email;
	
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
	
	
	public EmployeeDataUtil() {
		//loadSampleData();
		addData();
		
	}
	
	private List<Employee> employees;
	
	/*public void loadSampleData() {
		employees = new ArrayList<>();
		
		employees.add(new Employee("Joshua", "Laxamana", "joshua.laxamana@benilde.edu.ph"));
		employees.add(new Employee("Eric", "Carandang", "eric.carandang@outlook.com"));
		employees.add(new Employee("Nicole", "Santos", "nicole.santos@outlook.com"));
			
	}*/
	
	public String addData() {
		employees = new ArrayList<>();
		employees.add(new Employee(firstName, lastName, email));
		return "employee_datatable";
	}
	
	public List<Employee> getEmployees() {
		return employees;
	}
	
}
