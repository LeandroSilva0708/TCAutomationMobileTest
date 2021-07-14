package screens.Base;


import capabilities.DriverFactoryManager;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;


public abstract class BaseScreen extends MobileElement {

    public BaseScreen() {
        PageFactory.initElements(new AppiumFieldDecorator(DriverFactoryManager.getDriver()), this);
    }
}
