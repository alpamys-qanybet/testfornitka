package kz.essc.testnitka.test.task1;

import junit.framework.Test;
import static junit.framework.Assert.assertTrue;
import junit.framework.TestCase;
import kz.essc.testnitka.task1.Node;
import kz.essc.testnitka.task1.TreeUtils;

public class Task1Test  extends TestCase {
	
	public Task1Test(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
	
		
	public void testHeight() {
        Node root = new Node();
        
        Node element1 = new Node();
        Node element2 = new Node();
        Node element3 = new Node();
        Node element4 = new Node();
        Node element5 = new Node();
        Node element6 = new Node();
        
        // initializing tree
        element5.getChildren().add(element6);
        element2.getChildren().add(element5);
        root.getChildren().add(element2);
        
        element1.getChildren().add(element3);
        element1.getChildren().add(element4);
        root.getChildren().add(element1);
    
        TreeUtils utils = new TreeUtils();
        utils.setRoot(root);
        
        assertTrue(utils.getHeight(root) == 3);
        assertTrue(utils.getHeight(element1) == 1);
        assertTrue(utils.getHeight(element2) == 2);
    }
}
