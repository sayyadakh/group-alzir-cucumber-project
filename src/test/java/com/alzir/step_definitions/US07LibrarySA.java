package com.alzir.step_definitions;

import com.alzir.pages.library.BooksPage;
import com.alzir.pages.library.LoginPage;
import com.alzir.utilities.DB_Util;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class US07LibrarySA {
    LoginPage loginPage = new LoginPage();
    BooksPage bookPage = new BooksPage();
    String actualBorrowedBookName;



    @And("the user searches book name called {string}")
    public void theUserSearchesBookNameCalled(String bookName) {
        bookPage.search.sendKeys(bookName);
    }

    @When("the user clicks Borrow book")
    public void theUserClicksBorrowBook() {
        bookPage.borrowBookButton.click();
    }

    @Then("verify that {string} is shown in Borrowing Books page")
    public void verifyThatIsShownInBorrowingBooksPage(String bookName) {
        bookPage.navigateModule("Borrowing Books");
        actualBorrowedBookName = bookPage.borrowedBookName.getText();
        Assert.assertEquals(bookName,actualBorrowedBookName);
    }


    @And("verify logged student has same book in database")
    public void verifyLoggedStudentHasSameBookInDatabase() {
        String query = "select full_name,b.name,bb.borrowed_date, bb.returned_date from users u inner join book_borrow bb on u.id = bb.user_id\n" +
                "                                                      inner join books b on bb.book_id = b.id\n" +
                "where name= 'Baku Nights' order by 3 desc";

        DB_Util.runQuery(query);
        Map<String, String> firstRawMap = DB_Util.getRowMap(1);
        System.out.println("firstRawMap.get(\"returned_date\") = " + firstRawMap.get("returned_date"));
        String expectedBookName =  firstRawMap.get("name");

        Assert.assertEquals(expectedBookName,actualBorrowedBookName);

    }


}