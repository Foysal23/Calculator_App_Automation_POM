import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalcScreen {

    @FindBy(id = "com.google.android.calculator:id/op_add")
    WebElement btnPlus;

    @FindBy(id = "com.google.android.calculator:id/op_sub")
    WebElement btnMinus;

    @FindBy(id ="com.google.android.calculator:id/op_mul")
    WebElement btnMultiply;

    @FindBy(id = "com.google.android.calculator:id/op_div")
    WebElement btnDiv;

    @FindBy(id = "com.google.android.calculator:id/eq")
    WebElement btnEql;

    @FindBy(id = "com.google.android.calculator:id/clr")
    WebElement btnClr;

    @FindBy(id = "com.google.android.calculator:id/result_final")
    WebElement txtResult;

    AndroidDriver driver;

    public CalcScreen(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public String doSum(int num1, int num2){
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num1)).click(); //made the button dynamic
        btnPlus.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num2)).click();
        btnEql.click();
        String sum = txtResult.getText();
        return sum;
    }

    public String doSub(int num1, int num2){
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num1)).click();
        btnMinus.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num2)).click();
        btnEql.click();
        String sub = txtResult.getText();
        return sub;
    }

    public String doMultiply(int num1, int num2){
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num1)).click();
        btnMultiply.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num2)).click();
        btnEql.click();
        String mul = txtResult.getText();
        return mul;
    }

    public String doDiv(int num1, int num2){
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num1)).click(); 
        btnDiv.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num2)).click();
        btnEql.click();
        String div = txtResult.getText();
        return div;
    }

}
