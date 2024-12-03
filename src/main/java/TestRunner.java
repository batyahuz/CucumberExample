import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features", // נתיב לקבצי ה-Feature
        glue = {"stepdefinitions", "utils"},    // נתיב למחלקות המימוש
        plugin = {"pretty", "summary"}           // הדפסות ותקצירים
)
public class TestRunner {
}
