package csb.progap3.mybean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class AjaxBean {

	private String productCode;
	private String password = "";
	private String passwordResult;

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
		
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordResult() {
		
		if(!password.isEmpty())
		{
			if(password.length() < 3)
				passwordResult = "Poor";
			
			else if(password.length() < 7)
				passwordResult = "Good";
			
			else if(password.length() < 15)
				passwordResult = "Superb";
			
			else
				passwordResult = "Excellent";
		}
		else
			passwordResult = "";
		return passwordResult;
	}

	public void setPasswordResult(String passwordResult) {
		this.passwordResult = passwordResult;
	}
}
