import io.qameta.allure.Allure;
import org.checkerframework.checker.units.qual.C;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CalcTestRunner extends Setup{

    @Test(priority = 1, description = "Sum of two numbers")
    public void doSum(){
        CalcScreen calcScreen = new CalcScreen(driver);
        String Sum = calcScreen.doSum(9,5);
        System.out.println(Sum);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(Sum,"14");
        softAssert.assertAll();
        Allure.description("Summation of 2 number is successful");
    }

    @Test(priority = 2, description = "Substraction of two numbers")
    public void doSub(){
        CalcScreen calcScreen = new CalcScreen(driver);
        String Sub = calcScreen.doSub(9,5);
        System.out.println(Sub);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(Sub,"4");
        softAssert.assertAll();
        Allure.description("Substraction of 2 number is successful");
    }

    @Test(priority = 3, description = "Multiplication of two numbers")
    public void doMultiply(){
        CalcScreen calcScreen = new CalcScreen(driver);
        String Mul = calcScreen.doMultiply(9,5);
        System.out.println(Mul);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(Mul,"45");
        softAssert.assertAll();
        Allure.description("Multiplication of 2 number is successful");
    }

    @Test(priority = 4, description = "Division of two numbers")
    public void doDiv(){
        CalcScreen calcScreen = new CalcScreen(driver);
        String Div = calcScreen.doDiv(9,3);
        System.out.println(Div);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(Div,"3");
        softAssert.assertAll();
        Allure.description("Division of 2 number is successful");
    }

    @AfterMethod
    public void clearScreen(){
        CalcScreen calcScreen = new CalcScreen(driver);
        calcScreen.btnClr.click();
    }

}
