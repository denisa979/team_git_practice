package com.team.git.practice.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    private By email = By.id("inputEmail");
	private By passwordInput = By.id("inputPassword");
	private By submitBtn= By.xpath("//button[@type='submit']");

	public void login(String username, String password) {
		type(email, username);
		type(passwordInput, password);
		click(submitBtn);
	}


}
