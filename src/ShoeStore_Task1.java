import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;


public class ShoeStore_Task1
{
    WebDriver driver;

    @BeforeSuite
    public void setup()
    {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Jason\\IdeaProjects\\ShoeStoreTestNG\\lib\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://shoestore-manheim.rhcloud.com/");
    }

    @Test
    public void January()
    {
        driver.findElement(By.linkText("January")).click();

        try
        {
            Thread.sleep(5000);
        }
        catch(Exception e)
        {

        }

        List<WebElement> shoes = driver.findElements(By.className("shoe_result"));

        System.out.println("shoes: "+shoes);

        for(WebElement element : shoes)
        {
            System.out.println("description: "+element.findElement(By.className("shoe_description")).toString());
            System.out.println("description: "+element.findElement(By.className("shoe_image")).toString());
            System.out.println("description: "+element.findElement(By.className("shoe_price")).toString());

            Assert.assertEquals(element.findElement(By.className("shoe_description")).isDisplayed(), true, "Shoe Description");
            Assert.assertEquals(element.findElement(By.className("shoe_image")).isDisplayed(), true, "Shoe Image");
            Assert.assertEquals(element.findElement(By.className("shoe_price")).isDisplayed(), true, "Shoe Price");

        }
    }

    @Test(dependsOnMethods = "January")
    public void February()
    {
        driver.findElement(By.linkText("February")).click();

        try
        {
            Thread.sleep(5000);
        }
        catch(Exception e)
        {

        }

        List<WebElement> shoes = driver.findElements(By.className("shoe_result"));

        System.out.println("shoes: "+shoes);

        for(WebElement element : shoes)
        {
            System.out.println("description: "+element.findElement(By.className("shoe_description")).toString());
            System.out.println("description: "+element.findElement(By.className("shoe_image")).toString());
            System.out.println("description: "+element.findElement(By.className("shoe_price")).toString());

            Assert.assertEquals(element.findElement(By.className("shoe_description")).isDisplayed(), true, "Shoe Description");
            Assert.assertEquals(element.findElement(By.className("shoe_image")).isDisplayed(), true, "Shoe Image");
            Assert.assertEquals(element.findElement(By.className("shoe_price")).isDisplayed(), true, "Shoe Price");

        }
    }

    @Test(dependsOnMethods = "February")
    public void March()
    {
        driver.findElement(By.linkText("March")).click();

        try
        {
            Thread.sleep(5000);
        }
        catch(Exception e)
        {

        }

        List<WebElement> shoes = driver.findElements(By.className("shoe_result"));

        System.out.println("shoes: "+shoes);

        for(WebElement element : shoes)
        {
            System.out.println("description: "+element.findElement(By.className("shoe_description")).toString());
            System.out.println("description: "+element.findElement(By.className("shoe_image")).toString());
            System.out.println("description: "+element.findElement(By.className("shoe_price")).toString());

            Assert.assertEquals(element.findElement(By.className("shoe_description")).isDisplayed(), true, "Shoe Description");
            Assert.assertEquals(element.findElement(By.className("shoe_image")).isDisplayed(), true, "Shoe Image");
            Assert.assertEquals(element.findElement(By.className("shoe_price")).isDisplayed(), true, "Shoe Price");

        }
    }

    @Test(dependsOnMethods = "March")
    public void April()
    {
        driver.findElement(By.linkText("April")).click();

        try
        {
            Thread.sleep(5000);
        }
        catch(Exception e)
        {

        }

        List<WebElement> shoes = driver.findElements(By.className("shoe_result"));

        System.out.println("shoes: "+shoes);

        for(WebElement element : shoes)
        {
            System.out.println("description: "+element.findElement(By.className("shoe_description")).toString());
            System.out.println("description: "+element.findElement(By.className("shoe_image")).toString());
            System.out.println("description: "+element.findElement(By.className("shoe_price")).toString());

            Assert.assertEquals(element.findElement(By.className("shoe_description")).isDisplayed(), true, "Shoe Description");
            Assert.assertEquals(element.findElement(By.className("shoe_image")).isDisplayed(), true, "Shoe Image");
            Assert.assertEquals(element.findElement(By.className("shoe_price")).isDisplayed(), true, "Shoe Price");

        }
    }

    @Test(dependsOnMethods = "April")
    public void May()
    {
        driver.findElement(By.linkText("May")).click();

        try
        {
            Thread.sleep(5000);
        }
        catch(Exception e)
        {

        }

        List<WebElement> shoes = driver.findElements(By.className("shoe_result"));

        System.out.println("shoes: "+shoes);

        for(WebElement element : shoes)
        {
            System.out.println("description: "+element.findElement(By.className("shoe_description")).toString());
            System.out.println("description: "+element.findElement(By.className("shoe_image")).toString());
            System.out.println("description: "+element.findElement(By.className("shoe_price")).toString());

            Assert.assertEquals(element.findElement(By.className("shoe_description")).isDisplayed(), true, "Shoe Description");
            Assert.assertEquals(element.findElement(By.className("shoe_image")).isDisplayed(), true, "Shoe Image");
            Assert.assertEquals(element.findElement(By.className("shoe_price")).isDisplayed(), true, "Shoe Price");

        }
    }

    @Test(dependsOnMethods = "May")
    public void June()
    {
        driver.findElement(By.linkText("June")).click();

        try
        {
            Thread.sleep(5000);
        }
        catch(Exception e)
        {

        }

        List<WebElement> shoes = driver.findElements(By.className("shoe_result"));

        System.out.println("shoes: "+shoes);

        for(WebElement element : shoes)
        {
            System.out.println("description: "+element.findElement(By.className("shoe_description")).toString());
            System.out.println("description: "+element.findElement(By.className("shoe_image")).toString());
            System.out.println("description: "+element.findElement(By.className("shoe_price")).toString());

            Assert.assertEquals(element.findElement(By.className("shoe_description")).isDisplayed(), true, "Shoe Description");
            Assert.assertEquals(element.findElement(By.className("shoe_image")).isDisplayed(), true, "Shoe Image");
            Assert.assertEquals(element.findElement(By.className("shoe_price")).isDisplayed(), true, "Shoe Price");

        }
    }

    @Test(dependsOnMethods = "June")
    public void July()
    {
        driver.findElement(By.linkText("July")).click();

        try
        {
            Thread.sleep(5000);
        }
        catch(Exception e)
        {

        }

        List<WebElement> shoes = driver.findElements(By.className("shoe_result"));

        System.out.println("shoes: "+shoes);

        for(WebElement element : shoes)
        {
            System.out.println("description: "+element.findElement(By.className("shoe_description")).toString());
            System.out.println("description: "+element.findElement(By.className("shoe_image")).toString());
            System.out.println("description: "+element.findElement(By.className("shoe_price")).toString());

            Assert.assertEquals(element.findElement(By.className("shoe_description")).isDisplayed(), true, "Shoe Description");
            Assert.assertEquals(element.findElement(By.className("shoe_image")).isDisplayed(), true, "Shoe Image");
            Assert.assertEquals(element.findElement(By.className("shoe_price")).isDisplayed(), true, "Shoe Price");

        }
    }

    @Test(dependsOnMethods = "July")
    public void August()
    {
        driver.findElement(By.linkText("August")).click();

        try
        {
            Thread.sleep(5000);
        }
        catch(Exception e)
        {

        }

        List<WebElement> shoes = driver.findElements(By.className("shoe_result"));

        System.out.println("shoes: "+shoes);

        for(WebElement element : shoes)
        {
            System.out.println("description: "+element.findElement(By.className("shoe_description")).toString());
            System.out.println("description: "+element.findElement(By.className("shoe_image")).toString());
            System.out.println("description: "+element.findElement(By.className("shoe_price")).toString());

            Assert.assertEquals(element.findElement(By.className("shoe_description")).isDisplayed(), true, "Shoe Description");
            Assert.assertEquals(element.findElement(By.className("shoe_image")).isDisplayed(), true, "Shoe Image");
            Assert.assertEquals(element.findElement(By.className("shoe_price")).isDisplayed(), true, "Shoe Price");

        }
    }

    @Test(dependsOnMethods = "August")
    public void September()
    {
        driver.findElement(By.linkText("September")).click();

        try
        {
            Thread.sleep(5000);
        }
        catch(Exception e)
        {

        }

        List<WebElement> shoes = driver.findElements(By.className("shoe_result"));

        System.out.println("shoes: "+shoes);

        for(WebElement element : shoes)
        {
            System.out.println("description: "+element.findElement(By.className("shoe_description")).toString());
            System.out.println("description: "+element.findElement(By.className("shoe_image")).toString());
            System.out.println("description: "+element.findElement(By.className("shoe_price")).toString());

            Assert.assertEquals(element.findElement(By.className("shoe_description")).isDisplayed(), true, "Shoe Description");
            Assert.assertEquals(element.findElement(By.className("shoe_image")).isDisplayed(), true, "Shoe Image");
            Assert.assertEquals(element.findElement(By.className("shoe_price")).isDisplayed(), true, "Shoe Price");

        }
    }

    @Test(dependsOnMethods = "September")
    public void October()
    {
        driver.findElement(By.linkText("October")).click();

        try
        {
            Thread.sleep(5000);
        }
        catch(Exception e)
        {

        }

        List<WebElement> shoes = driver.findElements(By.className("shoe_result"));

        System.out.println("shoes: "+shoes);

        for(WebElement element : shoes)
        {
            System.out.println("description: "+element.findElement(By.className("shoe_description")).toString());
            System.out.println("description: "+element.findElement(By.className("shoe_image")).toString());
            System.out.println("description: "+element.findElement(By.className("shoe_price")).toString());

            Assert.assertEquals(element.findElement(By.className("shoe_description")).isDisplayed(), true, "Shoe Description");
            Assert.assertEquals(element.findElement(By.className("shoe_image")).isDisplayed(), true, "Shoe Image");
            Assert.assertEquals(element.findElement(By.className("shoe_price")).isDisplayed(), true, "Shoe Price");

        }
    }

    @Test(dependsOnMethods = "October")
    public void November()
    {
        driver.findElement(By.linkText("November")).click();

        try
        {
            Thread.sleep(5000);
        }
        catch(Exception e)
        {

        }

        List<WebElement> shoes = driver.findElements(By.className("shoe_result"));

        System.out.println("shoes: "+shoes);

        for(WebElement element : shoes)
        {
            System.out.println("description: "+element.findElement(By.className("shoe_description")).toString());
            System.out.println("description: "+element.findElement(By.className("shoe_image")).toString());
            System.out.println("description: "+element.findElement(By.className("shoe_price")).toString());

            Assert.assertEquals(element.findElement(By.className("shoe_description")).isDisplayed(), true, "Shoe Description");
            Assert.assertEquals(element.findElement(By.className("shoe_image")).isDisplayed(), true, "Shoe Image");
            Assert.assertEquals(element.findElement(By.className("shoe_price")).isDisplayed(), true, "Shoe Price");

        }
    }

    @Test(dependsOnMethods = "November")
    public void December()
    {
        driver.findElement(By.linkText("December")).click();

        try
        {
            Thread.sleep(5000);
        }
        catch(Exception e)
        {

        }

        List<WebElement> shoes = driver.findElements(By.className("shoe_result"));

        System.out.println("shoes: "+shoes);

        for(WebElement element : shoes)
        {
            System.out.println("description: "+element.findElement(By.className("shoe_description")).toString());
            System.out.println("description: "+element.findElement(By.className("shoe_image")).toString());
            System.out.println("description: "+element.findElement(By.className("shoe_price")).toString());

            Assert.assertEquals(element.findElement(By.className("shoe_description")).isDisplayed(), true, "Shoe Description");
            Assert.assertEquals(element.findElement(By.className("shoe_image")).isDisplayed(), true, "Shoe Image");
            Assert.assertEquals(element.findElement(By.className("shoe_price")).isDisplayed(), true, "Shoe Price");

        }
    }

    @Test(dependsOnMethods = "December")
    public void Email()
    {
        driver.findElement(By.linkText("Home")).click();
        try
        {
            Thread.sleep(5000);
        }
        catch(Exception e)
        {

        }

        driver.findElement(By.id("remind_email_input")).sendKeys("jason@jasonyang.us");
        driver.findElement(By.xpath(".//*[@id='remind_email_form']/div/input[2]")).click();

        try
        {
            Thread.sleep(2000);
        }
        catch(Exception e)
        {

        }

        Assert.assertEquals(driver.findElement(By.id("flash")).isDisplayed(), true, "Thanks! message");



    }


}
