package com.finalProj.FinalProj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.finalProj.FinalProj.Model.CreateAccount;
import com.finalProj.FinalProj.Model.Login;

//import org.springframework.web.bind.annotation.RestController;

//@RestController //for restful api
@Controller // for MVC projects.
public class LoginfController {

	@Autowired
	SessionFactory sf;
	Login login;
//	CreateAccount c;

	@RequestMapping("/") // this is what we see on the website
	public String loginpage() { // JSP page ka name as a return type
		return "userlogin";// this is the jsp file that we made earlier
	}

//	@RequestMapping("adminloginpage") // this is what we see on the website
//	public String adminloginpage() { // JSP page ka name as a return type
//		return "adminlogin";// this is the jsp file that we made earlier
//	}

	// Admin ka Access cos for temporary data checking
//	@RequestMapping("adminlogin") // this is what we see on the website
//	public String adminLogin(Login login) { // JSP page ka name as a return type in the form of string
//		if (login.username.equals("mayu") && login.password.equals("1234")) {
//			return "homepage";// this is the jsp file that we made earlier
//
//		} else {
//			return "userlogin";
//		}
//		
//	}


	// User login with databases.
	@RequestMapping("userlogin") // this is what we see on the website
	public String userLogin(Login login, Model model) { // JSP page ka name as a return type in the form of string
		Session s = sf.openSession();
		Login dblogin = s.get(Login.class, login.getPassword());

		String page = "userlogin";

		String message = null;
		// why null?
		if (dblogin != null) {
			if (login.getUsername().equals(dblogin.getUsername())) {
				page = "homepage";// this is the jsp file that we made earlier
			} else {
				message = "invalid username";
			}

		} else {
			message = "invalid password";
		}
		model.addAttribute("msg", message);
		System.out.println(message);
		return page;
	}

	//I think its of no use, but not sure, edit: It is usefull, but how?
	@RequestMapping("createaccountpage") // this is what we see on the website
	public String createaccount() { // JSP page ka name as a return type
		return "createaccount";// this is the jsp file that we made earlier
	}

	// JARURI METHOD
//	@PostMapping("/createaccount")
//	public String createaccountDatabase(Login login, Model model) {
//		Session s = sf.openSession();
//		Login dblogin = s.get(Login.class, login.getUsername());
//		String page ="createaccount";
//		String message = null;
//		
//		if(dblogin==null) {
//			Transaction t = s.beginTransaction();
//			s.save(login);
//			t.commit();
//		}else {
//			message = "Already";
//		}
//		
//		model.addAttribute("msg",message);
//		System.out.println(message);
//		return page;
//	}

//	A create account method that saves data into database.
	@RequestMapping("/createaccount")
	public String createaccountDatabase(Login login) {
	    Session s = sf.openSession();
	    Transaction t = s.beginTransaction();

	    // Check if the username already exists
	    Login dblogin = s.get(Login.class, login.getUsername());

	    if (dblogin == null) {
	        // Username does not exist, create a new account
	        s.save(login);
	        t.commit();
	    } else {
	        // Username already exists, handle accordingly
	        String message = "Username already exists";
	        // Set the message attribute or handle it as needed
	    }
	   

	    s.close(); // Close the session

	    return "userlogin";
	}
	
	@RequestMapping("employee")
	public String getEmployee() {
		return "Employees";
	}
	
	
	

	
	@RequestMapping("homepage")
	public String homepage() {
		return "homepage";
	}

	@RequestMapping("aboutpage")
	public String aboutpage() {
		return "about";
	}

	@RequestMapping("servicespage")
	public String servicepage() {
		return "services";
	}

	@RequestMapping("contactpage")
	public String contactpage() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		return "contact";
	}

	@RequestMapping("logout")
	public String logoutpage() {
		return "userlogin";
	}

}
