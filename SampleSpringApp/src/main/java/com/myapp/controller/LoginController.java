package com.myapp.controller;

import com.myapp.form.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {

    //@Autowired
    //private LoginDao lDao;

	@RequestMapping(value = {"/login"}, method = RequestMethod.GET)
	public String showLoginForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		 return "login";
	}

    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
    public String validateLogin(@ModelAttribute("loginForm") LoginForm loginForm, HttpServletRequest request, HttpServletResponse response,
                                final Model model) throws Exception {
        String userId = loginForm.getUserId();
        String password = loginForm.getPassword();
        //Call DAO
        model.addAttribute("errorMessage", "Login Failed");
        return "redirect:/dashboard.do";
    }


}