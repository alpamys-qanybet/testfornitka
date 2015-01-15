package kz.essc.testnitka.test.task2;

import java.util.LinkedList;
import java.util.List;

import junit.framework.TestCase;
import kz.essc.testnitka.task2.Task2;

public class Task2Test extends TestCase {

	public Task2Test(String testName) {
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
	
		
	public void testWithSequence() {
		List<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(3);
        
        Task2 task2 = new Task2();
        task2.setList(list);
        task2.removeWithSequence(0);
        
        assertTrue(stringifyList(task2.getList()).equals("1.3.3.3."));
    }
	
	public void testWithoutSequence() {
		List<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(3);
        
        Task2 task2 = new Task2();
        task2.setList(list);
        task2.removeWithoutSequence(0);
        
        assertTrue(stringifyList(task2.getList()).equals("1."));
    }
	
	private String stringifyList(List<Integer> list) {
		StringBuilder s = new StringBuilder("");
		for (Integer i: list)
			s.append(i+".");
		
		return s.toString();
	}
}
