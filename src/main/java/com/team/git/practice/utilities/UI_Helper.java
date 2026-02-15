package com.team.git.practice.utilities;

import java.util.ArrayList;
import java.util.List;

public class UI_Helper {



	static String email, password;

	private static List<String> credential = new ArrayList<>();




	public static List<String> fetchCredentials(){

		email = System.getenv("EMAIL");
		password = System.getenv("PASSWORD");

		email = (email == null)  ? email= ConfigurationReader.properties.getProperty("email"): email;
		password = (password == null)  ? password= ConfigurationReader.properties.getProperty(password): password;

		credential.add(email);
		credential.add(password);

		return credential;
	}
}
