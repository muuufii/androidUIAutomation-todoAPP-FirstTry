package allPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MainTaskListPage extends PageBase{
    public MainTaskListPage(AppiumDriver appiumDriver){
        super(appiumDriver);
    }

    @AndroidFindBy(id = "rz")
    MobileElement addTaskBTN;

    @AndroidFindBy(id = "a5s")
    MobileElement formInputTaskName;

    @AndroidFindBy(id = "a5p")
    MobileElement selectDateBTN;

    @AndroidFindBy(id = "en")
    MobileElement tomorrowBTN;

    @AndroidFindBy(id = "a_6")
    MobileElement doneBTN;

    @AndroidFindBy(id = "a5n")
    MobileElement addTaskDoneBTN;

    @AndroidFindBy(id = "a16")
    MobileElement clickToDoneBTN;



    public void clickAddTaskBTN() {clickElement(addTaskBTN);}
    public void clickSelectDateBTN() {clickElement(selectDateBTN);}
    public void clickTomorrowBTN() {clickElement(tomorrowBTN);}
    public void clickDoneBTN() {clickElement(doneBTN);}
    public void clickAddTaskDoneBTN() {clickElement(addTaskDoneBTN);}
    public void clickToDone() {clickElement(clickToDoneBTN);}

    public void sendTextToFormInputTaskName(String taskName){
        clearTextField(formInputTaskName);
        sendText(formInputTaskName, taskName);
    }

}
