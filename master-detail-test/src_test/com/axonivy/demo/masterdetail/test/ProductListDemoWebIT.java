package com.axonivy.demo.masterdetail.test;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import com.axonivy.ivy.webtest.IvyWebTest;
import com.axonivy.ivy.webtest.engine.EngineUrl;
import com.codeborne.selenide.Selenide;

@IvyWebTest
public class ProductListDemoWebIT {
	private static final String TESTER_USER_NAME = "tester";
	private static final String TESTER_PASSWORD = "tester";

	@BeforeEach
	public void createTestData() {
		// valid links can be copied from the start page of the internal web-browser
		open(EngineUrl.createProcessUrl("master-detail-demo/1887B5D187E6060D/createTestData.ivp"));
	}

	@Test
	public void showDatatableRepo() {
		loginWithTesterUser();

		openProductList();
		var sizeOfTable = $(By.id("form:productTable_data")).$$(By.cssSelector("tr")).size();
		assertTrue(sizeOfTable > 0);
		
		addNewProduct();
		// Wait 1 second to save data
		Selenide.sleep(1000);

		openProductList();
		var sizeOfTableAfterAddedNewProduct = $(By.id("form:productTable_data")).$$(By.cssSelector("tr")).size();
		assertTrue(sizeOfTableAfterAddedNewProduct == sizeOfTable + 1);
	}
	
	private void loginWithTesterUser() {
		open(EngineUrl.base() + "/dev-workflow-ui/faces/login.xhtml");
		$(By.id("loginForm:userName")).shouldBe(visible).sendKeys(TESTER_USER_NAME);
		$(By.id("loginForm:password")).shouldBe(visible).sendKeys(TESTER_PASSWORD);
		$(By.id("loginForm:login")).shouldBe(visible).click();
		var sessionUserName = $(By.id("sessionUserName"));
		sessionUserName.shouldBe(visible);
		assertTrue(TESTER_USER_NAME.equals(sessionUserName.getText()));
	}

	private void openProductList() {
		// valid links can be copied from the start page of the internal web-browser
		open(EngineUrl.createProcessUrl("master-detail-demo/188341B154DAFDDD/showProductList.ivp"));
		$(By.id("form:productTable_data")).shouldBe(visible);
	}

	private void addNewProduct() {
		// valid links can be copied from the start page of the internal web-browser
		open(EngineUrl.createProcessUrl("master-detail-demo/188341B154DAFDDD/showProductList.ivp"));

		$(By.id("form:productTable:addProduct")).shouldBe(enabled).click();
		// fill new customer form
		$(By.id("addProductDialogForm:productName")).sendKeys("New test product");

		$(By.id("addProductDialogForm:status")).shouldBe(enabled).click();
		$(By.id("addProductDialogForm:status_1")).shouldBe(enabled).click();

		$(By.id("addProductDialogForm:validThrough_input")).shouldBe(enabled).click();
		$(By.id("addProductDialogForm:validThrough_panel")).$(By.linkText("24")).shouldBe(enabled).click();

		$(By.id("addProductDialogForm:orderDate_input")).shouldBe(enabled).click();
		$(By.id("addProductDialogForm:orderDate_panel")).$(By.linkText("25")).shouldBe(enabled).click();

		$(By.id("addProductDialogForm:deliveryDate_input")).shouldBe(enabled).click();
		$(By.id("addProductDialogForm:deliveryDate_panel")).$(By.linkText("26")).shouldBe(enabled).click();

		$(By.id("addProductDialogForm:quantity_input")).sendKeys("10");

		$(By.id("addProductDialogForm:quality")).shouldBe(enabled).click();
		$(By.id("addProductDialogForm:quality_1")).shouldBe(enabled).click();

		$(By.id("addProductDialogForm:onSale")).shouldBe(enabled).click();

		$(By.id("addProductDialogForm:addProduct")).shouldBe(enabled).click();

		// verify that the registration was successful.
		$(By.id("form:productTable")).shouldBe(visible, text("List of products"));
	}
}