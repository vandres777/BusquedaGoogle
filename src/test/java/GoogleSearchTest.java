
import net.serenitybdd.annotations.Step;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.core.Serenity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;

//@RunWith(SerenityRunner.class) ///----> si se usa este no va a generar reporte con grafico
@ExtendWith(SerenityJUnit5Extension.class) ///---->  con este va a generar el reporte con gráfico
class GoogleSearchTest {

    //@Managed(driver = "edge")
    WebDriver hisBrowser;

    Actor user = Actor.named("Andrés el mejor!!!");

    GoogleSearchPage googleSearchPage;

    @Test
    //@Step("Navigate to the home page")
    public void searchWikipediaInGoogle() {

        user.can(BrowseTheWeb.with(hisBrowser));
        Serenity.reportThat("User opens Google and searches for Wikipedia", () -> {
            user.attemptsTo(
                    Open.url("https://www.google.com.co/"),
                    Enter.theValue("Wikipedia").into(GoogleSearchPage.SEARCH_BOX).thenHit(Keys.RETURN),
                    Click.on(GoogleSearchPage.FIRST_RESULT)
            );
        });
    }

    @Test
    public void searchGitHubInGoogle() {
        user.can(BrowseTheWeb.with(hisBrowser));
        Serenity.reportThat("User opens Google and searches for GitHub", () -> {
            user.attemptsTo(
                    Open.url("https://www.google.com.co/"),
                    Enter.theValue("GitHub").into(GoogleSearchPage.SEARCH_BOX).thenHit(Keys.RETURN),
                    Click.on(GoogleSearchPage.FIRST_RESULT)
            );
        });
    }
}
