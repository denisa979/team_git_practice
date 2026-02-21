package com.team.git.practice.utilities;

import java.util.HashMap;
import java.util.Map;

public class UI_Helper {



	public static Map<String, String> fetchCredentials() {

		Map<String, String> credentials = new HashMap<>();

		String email = System.getenv("EMAIL");
		String password = System.getenv("PASSWORD");

		if (email == null) {
			email = ConfigurationReader.properties.getProperty("email");
		}

		if (password == null) {
			password = ConfigurationReader.properties.getProperty("password");
		}

		credentials.put("email", email);
		credentials.put("password", password);

		return credentials;
	}
}

