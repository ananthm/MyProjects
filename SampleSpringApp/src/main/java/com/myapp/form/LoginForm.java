/**
 * 
 */
package com.myapp.form;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author ananthm
 *
 */
@Component("loginForm")
@Scope("request")
public class LoginForm implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6387101106865462303L;
	private String userId;
    private String password;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
