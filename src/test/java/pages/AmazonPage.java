package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    // ilk yapman gereken sey hemen bir constructor olusturmak.
    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
      @FindBy(id="twotabsearchtextbox")
      public WebElement aramaKutusu;

    @FindBy(xpath="//div[@class='a-section a-spacing-small a-spacing-top-small'] ")
    public WebElement aramaSonucElementi;
}
