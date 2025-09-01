package lk.apiit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.PropertyFileReader;
import utils.TestApp;

import java.time.Duration;
import java.util.List;

public class HomePage {
    WebDriver driver = TestApp.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();
    String lawbtnelement= prop.getProperty("homepage","law.button.element");
    String cloudbtnelement= prop.getProperty("homepage","cloud.technologies.button.element");

    public CoursesPage clickLawBtn(){
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath(lawbtnelement),Duration.ofSeconds(10));
        List<WebElement> lawBtn = driver.findElements(By.xpath(lawbtnelement));
        lawBtn.get(4).click();
        TestApp.getInstance().naviagateBack();
        return new CoursesPage();
    }
}
