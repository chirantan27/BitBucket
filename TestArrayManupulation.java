import static org.junit.Assert.*;

import org.junit.Test;

public class TestArrayManupulation {

	@Test
	public void IndexInTheMiddle() {
		
		assertEquals(ArrayManupulation.FindStartIndexOfSecondArray(new int[]{10,20,30,40,50}, new int[]{30,40,50}),2);
	}

	@Test
	public void IndexInTheBegining() {
		
		assertEquals(ArrayManupulation.FindStartIndexOfSecondArray(new int[]{10,20,30,40,50}, new int[]{10,20,30}),0);
	}

	@Test
	public void IndexInTheEnd() {
		
		assertEquals(ArrayManupulation.FindStartIndexOfSecondArray(new int[]{10,20,30,40,50}, new int[]{50}),4);
	}
	
	@Test
	public void IndexNotFound() {
		
		assertEquals(ArrayManupulation.FindStartIndexOfSecondArray(new int[]{10,20,30,40,50}, new int[]{1,2,3}),-1);
	}

	@Test
	public void IndexWithEmptySecondArray() {
		
		assertEquals(ArrayManupulation.FindStartIndexOfSecondArray(new int[]{10,20,30,40,50}, new int[]{}),-1);
	}
	
	@Test
	public void IndexWithEmptyFirstArray() {
		
		assertEquals(ArrayManupulation.FindStartIndexOfSecondArray(new int[]{}, new int[]{10,20,30,40,50}),-1);
	}
	
	@Test
	public void IndexWithEmptyBothArray() {
		
		assertEquals(ArrayManupulation.FindStartIndexOfSecondArray(new int[]{}, new int[]{10,20,30,40,50}),-1);
	}
	
	@Test
	public void IndexWithFirstArrayIsNotSame() {
		
		assertEquals(ArrayManupulation.FindStartIndexOfSecondArray(new int[]{10,20,30,40,50}, new int[]{40,50,60}),-1);
	}
		
}
