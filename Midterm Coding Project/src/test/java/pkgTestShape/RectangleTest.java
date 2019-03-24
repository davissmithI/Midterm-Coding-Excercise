package pkgTestShape;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import pkgShape.Rectangle;

public class RectangleTest {
	
	@Test
	public void testRectangle() throws Exception {
		Rectangle r1 = new Rectangle(5,6);
	    Rectangle r2 = new Rectangle(5,6);

	    assertEquals(r1.getiLength(), r2.getiLength());
	    assertEquals(r1.getiWidth(), r2.getiWidth());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testeRectangle() throws Exception {
		Rectangle r1 = new Rectangle(5,-5);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void teste2Rectangle() throws Exception {
		Rectangle r1 = new Rectangle(-5,5);
	}
	
	@Test
	public void testgetiLength() throws Exception {
		Rectangle r1 = new Rectangle(5,6);
		
		assertEquals(r1.getiLength(), 6);
	}
	
	@Test
	public void testgetiWidth() throws Exception {
		Rectangle r1 = new Rectangle(5,6);
		
		assertEquals(r1.getiWidth(), 5);
	}
	
	@Test
	public void testsetiLength() throws Exception {
		Rectangle r1 = new Rectangle(5,6);
		r1.setiLength(8);
		
		assertEquals(r1.getiLength(), 8);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testesetiLength() throws Exception {
		Rectangle r1 = new Rectangle(5,6);
		r1.setiLength(-1);
	}
	
	@Test
	public void testsetiWidth() throws Exception {
		Rectangle r1 = new Rectangle(5,6);
		r1.setiWidth(7);
		
		assertEquals(r1.getiWidth(), 7);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testesetiWidth() throws Exception {
		Rectangle r1 = new Rectangle(5,6);
		r1.setiWidth(-1);
	}
	
	@Test
	public void testarea() throws Exception {
		Rectangle r1 = new Rectangle(5,6);
		
		assertTrue(r1.area() == 30);
	}
	
	@Test
	public void testperimiter() throws Exception {
		Rectangle r1 = new Rectangle(5,6);
		
		assertTrue(r1.perimiter() == 22);
	}
}
