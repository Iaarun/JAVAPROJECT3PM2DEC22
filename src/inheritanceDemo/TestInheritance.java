package inheritanceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestInheritance {

    public static void main(String[] args) {
        MountainBike mb = new MountainBike();
        mb.start();
        mb.stop();

        RacingBike rb = new RacingBike();
        rb.start();
        rb.stop();
        WebDriver driver = new ChromeDriver();
    }
}
