
package document;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import org.testng.annotations.BeforeClass;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import base.testBase;
import global.globalActions.actionsMiddlePane;
import global.globalActions.actionsMultipleSelect;
import global.globalActions.actionsRightSide;
import global.globalElements.middlePane;
import pages.documents.documentsMiddlePane;
import pages.documents.documentsMultipleSelect;
import pages.documents.documentsRightSideOnScreen;;

public class documentsTest extends testBase {
	
	documentsMultipleSelect documentsmultipleselect;
	documentsMiddlePane documentsmiddlepane;
	documentsRightSideOnScreen documentsrhigtsideonscreen;
	actionsMiddlePane actionsmiddlepane;
	actionsRightSide actionsrightside;
	actionsMultipleSelect actionsmultipleselect;
	
	@BeforeClass
	public void SetUp() throws InterruptedException, IOException{	
	initialization(); 
	Login();
	this.actionsmultipleselect = new actionsMultipleSelect();
	this.documentsmultipleselect = new documentsMultipleSelect();
	this.documentsmiddlepane = new documentsMiddlePane();
	this.documentsrhigtsideonscreen = new documentsRightSideOnScreen();
	this.actionsmiddlepane = new actionsMiddlePane();
	this.actionsrightside = new actionsRightSide();
	}
	
	@Test(priority = 1)
	public void openDoc() throws InterruptedException {
		logger = extent.createTest("multiple select");
		logger.log(Status.PASS , "delete document using mulitiple choice arbes123456");
		// press document tab
		//documentsmultipleselect.pressDocument();
		System.out.println("its work3");

		//open doc  enter title and description
		//actionsmiddlepane.openEntity("doc1" , "importenet");
	}
	
		@Test(priority = 2)
		public void documentsMultipleSelect() throws InterruptedException {
		
		logger = extent.createTest("multiple select");
		
		//actionsmultipleselect.deleteEntityMultipleChoice();
//	
//		actionsmultipleselect.addTagsMultipleChoice("mission");
//
//		actionsmultipleselect.addDateMultipleChoice();
//	
//		actionsmultipleselect.addAssigneeMultipleChoice();
//		
//		actionsmultipleselect.addWatchersMultipleChoice();
//		
//		actionsmultipleselect.addStatusMultipleChoice();
//		
	}
//	
//	@Test(priority = 3)
//	public void documentsMiddlePane() throws InterruptedException {
//		
//		logger = extent.createTest("document middle pane");
//		
//		// change the status of list entities
//		documentsmiddlepane.changeStatusOfList();
//		
//		// choose entity and press on favorite 
//		//actionsmiddlepane.sortByFavorite();
//		
//		// sort the list by title
//		actionsmiddlepane.sortByTitle();
//		
//		// press on sort by status and unread
//		actionsmiddlepane.sordByStatusAndUnread();
//		
//		// press on arrow to reverse the order of the list
//		//actionsmiddlepane.pressOnArrow();
//	}
//	
//	@Test(priority = 4)
//	public void documentsRightSideOfScreen() throws InterruptedException {
//		
//		logger = extent.createTest("document the right side on the screen");
//		
//		actionsrightside.deleteEntity();
//		
//		actionsrightside.addAssignee();
//		
//		actionsrightside.setDate();
//		
//		documentsrhigtsideonscreen.addStatus();
//		
//		documentsrhigtsideonscreen.SelectFolderOnScreen();
//		
//		actionsrightside.addTags("www");
//		
//		actionsrightside.addActivities("hyyyyyy" , "this is superman");
//		
//		actionsrightside.addWatcher();
//		
//		actionsrightside.changePermission();
//	}
//	
	
	@AfterClass
	public void after() {
		
		extent.flush();
		
	}
		
}
	
		
	


