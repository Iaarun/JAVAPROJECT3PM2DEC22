package testngPackages;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider
    public Object[][] loginData(){
        Object[][] data = new Object[1][2];
        data[0][0]="cbatest7@gmail.com";
        data[0][1]="cba@test";
        return data;
    }
}
