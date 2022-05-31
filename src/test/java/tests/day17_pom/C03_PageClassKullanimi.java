package tests.day17_pom;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class C03_PageClassKullanimi {
    @Test
    public void test01() {
        FacebookPage facebookPage = new FacebookPage();

        // facebook anasayfaya gidin
        Driver.getDriver().get("https://www.facebook.com");
        //cikarsa cookies kabul edin
       // facebookPage.cookieButonu.click();

        // kullanici mail kutusuna rastgele bir isim yazdirin
        Faker faker=new Faker();
        facebookPage.mailKutusu.sendKeys(faker.internet().emailAddress());
        // kullanici sifre kutusuna rastgele bir password yazdirin
        facebookPage.sifreKutusu.sendKeys(faker.internet().password());
         // login butonuna basin
        facebookPage.loginTusu.click();
        // giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.girilemediYaziElementi.isDisplayed());
        Driver.closeDriver();
    }


    }

