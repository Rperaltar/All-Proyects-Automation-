package Framework.SeparationTestWithAPIServices;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import jdk.nashorn.internal.parser.Token;

import java.awt.print.Book;

public class steps {

/*
        private static final String USER_ID = "9b5f49ab-eea9-45f4-9d66-bcf56a531b85";
        private static Response response;
        private static Token tokenResponse;
        private static Book book;


        @Given("I am an authorized user")
        public void iAmAnAuthorizedUser() {
            AuthorizationRequest authRequest = new AuthorizationRequest("TOOLSQA-Test", "Test@@123");
            response = Endpoints.authenticateUser(authRequest);
            tokenResponse = response.getBody().as(Token.class);
        }

        @Given("A list of books are available")
        public void listOfBooksAreAvailable() {
            response = Endpoints.getBooks();
            Books books = response.getBody().as(Books.class);
            book = books.books.get(0);
        }

        @When("I add a book to my reading list")
        public void addBookInList() {
            ISBN isbn = new ISBN(book.isbn);
            AddBooksRequest addBooksRequest = new AddBooksRequest(USER_ID, isbn);
            response = Endpoints.addBook(addBooksRequest, tokenResponse.token);
        }

        @Then("The book is added")
        public void bookIsAdded() {
            Assert.assertEquals(201, response.getStatusCode());

            UserAccount userAccount = response.getBody().as(UserAccount.class);

            Assert.assertEquals(USER_ID, userAccount.userID);
            Assert.assertEquals(book.isbn, userAccount.books.get(0).isbn);
        }

        @When("I remove a book from my reading list")
        public void removeBookFromList() {
            RemoveBookRequest removeBookRequest = new RemoveBookRequest(USER_ID, book.isbn);
            response = Endpoints.removeBook(removeBookRequest, tokenResponse.token);
        }

        @Then("The book is removed")
        public void bookIsRemoved() {
            Assert.assertEquals(204, response.getStatusCode());

            response = Endpoints.getUserAccount(USER_ID, tokenResponse.token);
            Assert.assertEquals(200, response.getStatusCode());

            UserAccount userAccount = response.getBody().as(UserAccount.class);
            Assert.assertEquals(0, userAccount.books.size());
        }
    }

 */
}
