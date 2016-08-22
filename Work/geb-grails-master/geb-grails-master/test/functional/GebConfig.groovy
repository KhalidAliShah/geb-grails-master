

import org.openqa.selenium.chrome.ChromeDriver

driver = {
    System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe")
    def driverInstance = new ChromeDriver()
    driverInstance
}

baseNavigatorWaiting = true
atCheckWaiting = true