package csb.progap3.mybean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean
public class EmployeeBeanFive {
	private String firstName;
	private String lastName;
	private int age;
	private String postalCode;
	private String mobileNo;
	private String email;
	private String productCode;
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	
	public void validateProductCode(FacesContext context,  
									UIComponent component, 
									Object value) throws ValidatorException
	{
		if(value == null)
		{
			return;
		}
		
		String data = value.toString();
		
		if((!data.startsWith("csb")))
		{
			FacesMessage message = new FacesMessage("Product code must start with CSB");
			throw new ValidatorException(message);
		}
		
	}
			

}
