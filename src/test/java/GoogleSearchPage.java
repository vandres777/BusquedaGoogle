import net.serenitybdd.screenplay.targets.Target;

class GoogleSearchPage {
    //static Target SEARCH_BOX = Target.the("Google search box").locatedBy("//input[@name='q']");
    static Target SEARCH_BOX = Target.the("Google search box").locatedBy("//textarea[@id='APjFqb']");

    static Target FIRST_RESULT = Target.the("First search result").locatedBy("(//div[@class='g']//a)[1]");
}
