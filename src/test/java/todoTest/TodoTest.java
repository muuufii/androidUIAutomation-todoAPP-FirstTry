package todoTest;

import allPage.MainTaskListPage;
import allPage.PageBase;
import baseTest.BaseTest;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;

public class TodoTest extends BaseTest {
    MainTaskListPage mainTaskListPage;

    @Test
    public void test_add_task() throws MalformedURLException {
        setUP();
        mainTaskListPage = new MainTaskListPage(driver);
        mainTaskListPage.clickAddTaskBTN();
        mainTaskListPage.sendTextToFormInputTaskName("test");
        mainTaskListPage.clickSelectDateBTN();
        mainTaskListPage.clickTomorrowBTN();
        mainTaskListPage.clickDoneBTN();
        mainTaskListPage.clickAddTaskDoneBTN();
        //mainTaskListPage.clickToDone();


    }
}
