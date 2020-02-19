package Flipkart_Project.PageObjects;

public interface FlipkartHomepage {
	void enterWrongUsername(String userName);
	void enterUserName(String username);

	void enterPassword(String password);

	void clickLoginButton();

	void searchTextBox(String searchBox) throws Exception;

	void addCart() throws Exception;

}
