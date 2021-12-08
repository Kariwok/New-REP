/*Uzd.1
1.) Atvrt BTA mājas lapu - https://www.bta.lv/lv;
2.) Uzklikšķināt uz apdrošināšanas pakalpojomu: "KASKO un OCTA";
3.) Ievadīt Auto reģistrācijas nr.: KZ1392;
4.) Reģistrācijas apliecības nr.: AF2422572;
5.) Ieķekst checkbox "Esmu iepazinies un piekrītu" - Nesanāk
6.) Nospiest uz "Saņemt piedāvājumu"

 */


import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class BTA_HW {
    @SneakyThrows

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bta.lv/lv");
        driver.manage().window().maximize();

        WebElement firstPage = driver.findElement(By.xpath("//*[@id=\"module-284\"]/div[1]/div[2]/button[2]"));
        firstPage.click();
        String octaAndKasko = driver.findElement(By.xpath("//a[@href='/lv/privatpersonam/auto-apdrosinasana/numura-zime']")).getAttribute("href");
        //System.out.println(octaAndKasko);
        driver.get(octaAndKasko);
        Thread.sleep(3000);
        WebElement input = driver.findElement(By.name("plateNumber"));
        input.sendKeys("KZ1392");
        WebElement secondInput = driver.findElement(By.name("vehicleOwnerIdentification"));
        secondInput.sendKeys("AF2422572");
        Thread.sleep(4000);
        WebElement agreeButton = driver.findElement(By.className("checkbox invalid untouched"));
        agreeButton.click();

        //WebElement agreePrivacyPolicy = driver.findElement(By.xpath("//*[@id=\"module-370\"]/div/div/section/span[3]"));
        //agreePrivacyPolicy.click();
        driver.close();
        }
    }
