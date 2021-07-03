package test.ashishjaintechg.jpa.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
    public User(String string, String string2) {
		// TODO Auto-generated constructor stub
	this.msg=string;
	this.name=string2;
    }
	private String msg;
    private String name;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

    
    // standard getters, setters and constructor
}
