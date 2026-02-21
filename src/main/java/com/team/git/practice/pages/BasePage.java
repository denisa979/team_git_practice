package com.team.git.practice.pages;

import com.team.git.practice.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;


public abstract class BasePage {

	protected WebDriver driver;
	protected WebDriverWait wait;

	public BasePage() {
		this.driver = Driver.getDriver();
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	/* ===================== BASIC ACTIONS ===================== */

	protected void click(By locator) {
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}

	protected void type(By locator, String text) {
		WebElement element = wait.until(
				ExpectedConditions.visibilityOfElementLocated(locator)
		);
		element.clear();
		element.sendKeys(text);
	}

	protected String getText(By locator) {
		return wait.until(
				ExpectedConditions.visibilityOfElementLocated(locator)
		).getText();
	}

	/* ===================== LIST ACTIONS ===================== */

	protected List<String> getElementsText(By locator) {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		return driver.findElements(locator)
				.stream()
				.map(WebElement::getText)
				.collect(Collectors.toList());
	}

	/* ===================== VISIBILITY / STATE ===================== */

	protected boolean isDisplayed(By locator) {
		return wait.until(
				ExpectedConditions.visibilityOfElementLocated(locator)
		).isDisplayed();
	}

	protected boolean isEnabled(By locator) {
		return driver.findElement(locator).isEnabled();
	}

	/* ===================== UTILITIES ===================== */

	protected void waitForVisibility(By locator) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	protected void waitForClickability(By locator) {
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
}

