package csb.progap3.mybean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class EmployeeDataUtil {
	
	private List<Employee> employees;
	
	public EmployeeDataUtil() {
		loadSampleData();
	}
	
	public void loadSampleData() {
		employees = new ArrayList<>();
		
		employees.add(new Employee("Joshua", "Laxamana", "joshua.laxamana@benilde.edu.ph"));
		employees.add(new Employee("Eric", "Carandang", "eric.carandang@outlook.com"));
		employees.add(new Employee("Nicole", "Santos", "nicole.santos@outlook.com"));
	}

	public List<Employee> getEmployees() {
		return employees;
	}
	
	
}
