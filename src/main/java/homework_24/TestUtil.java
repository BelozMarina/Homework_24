package homework_24;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestUtil extends BaseTest {

    public static void captureScreenshot() throws IOException {
        Date dateNew = new Date();
        SimpleDateFormat format = new SimpleDateFormat("day_hh_mm_ss");
        String fileName = format.format(dateNew) + ".jpg";

        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            FileUtils.copyFile(screenshot, new File(System.getProperty("user.dir") + "\\screenshot\\_" + fileName));
    }
}
