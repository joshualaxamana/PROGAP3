package csb.progap3.mybean;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class SessionBean {

	private int value = 0;
	
	public String increment()
	{
		value++;
		return "counter_scoped";
	}

	public int getValue() {
		return value;
	}
	
	
}
