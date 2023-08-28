package com.alzir.step_definitions;

import com.alzir.pages.library.BooksPage;
import com.alzir.pages.library.DashboardPage;
import com.alzir.pages.library.LoginPage;
import com.alzir.utilities.BrowserUtils;
import com.alzir.utilities.DB_Util;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class BookInfo_StepDefinition {
    BooksPage bookPage = new BooksPage();
    LoginPage loginPage=new LoginPage();
    DashboardPage dashBoardPage=new DashboardPage();

    @Given("the {string} on the home page")
    public void the_on_the_home_page(String user) {

        loginPage.login(user);
        BrowserUtils.sleep(3);

    }

    @When("the user searches for {string} book")
    public void the_user_searches_for_book(String bookName) {
        bookPage.search.sendKeys(bookName);
    }

    @Given("the user navigates to {string} page")
    public void the_user_navigates_to_page(String booksModule) {
        loginPage.navigateModule(booksModule);
    }


    @When("the user clicks edit book button")
    public void the_user_clicks_edit_book_button() {
        BrowserUtils.sleep(3);
        String bookName = "ABCDEF";
        bookPage.editBook(bookName).click();

    }

    @Then("book information must match the Database")
    public void book_information_must_match_the_database() {
        BrowserUtils.sleep(3);
        String actualBookName = bookPage.bookNameInput.getAttribute("value");
        String actualAuthor = bookPage.authorInput.getAttribute("value");
        String actualIsbn = bookPage.isbnInput.getAttribute("value");
        String actualYear = bookPage.yearInput.getAttribute("value");

        String query = "select name,author,isbn,year from books\n" +
                "where name ='ABCDEF'";
        DB_Util.runQuery(query);
        Map<String, String> bookInfo = DB_Util.getRowMap(1);
        String expectedBookName = bookInfo.get("name");
        String expectedAuthor  = bookInfo.get("author");
        String expectedIsbn = bookInfo.get("isbn");
        String expectedYear = bookInfo.get("year");

        Assert.assertEquals(expectedBookName,actualBookName);
        Assert.assertEquals(expectedAuthor, actualAuthor);
        Assert.assertEquals(expectedIsbn, actualIsbn);
        Assert.assertEquals(expectedYear,actualYear);

    }
}
