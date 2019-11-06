package csb.progap3.mybean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class EmployeeBean {

	private String firstName;
	private String lastName;
	private String dept;
	private String status;
	private String taxCode;
	private int basicSalary;
	private double netPay;
	private double totalTax;
	private double salary;
	
	List<String> deptOptions;
	List<String> statusOptions;
	
	public EmployeeBean() {
		deptOptions = new ArrayList<>();
		
		deptOptions.add("IT");
		deptOptions.add("HR");
		deptOptions.add("Accounting");
		
		statusOptions = new ArrayList<>();
		
		statusOptions.add("Regular");
		statusOptions.add("Contractual");
	}
	
	public List<String> getDeptOptions() {
		return deptOptions;
	}
	
	public List<String> getStatusOptions() {
		return statusOptions;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTaxCode() {
		return taxCode;
	}
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}
	public int getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}
	public double getNetPay() {
		return netPay;
	}
	public void setNetPay(double netPay) {
		this.netPay = netPay;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String compute() {
		if (taxCode.equals("1")) {
			salary = basicSalary / 2;
			totalTax = (salary * .15);
			netPay = ((salary - totalTax) - 1000) + 4500;
			return "EmployeeNetPay";
		}
		if (taxCode.equals("3")) {
			salary = basicSalary / 2;
			totalTax = (salary * .30);
			netPay = ((salary - totalTax) - 1000) + 4500;
			return "EmployeeNetPay";
		}
		return "EmployeeNetPay";
	}
}
