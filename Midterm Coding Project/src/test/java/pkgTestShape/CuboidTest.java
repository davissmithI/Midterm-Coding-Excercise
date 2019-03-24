package pkgTestShape;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import pkgShape.Cuboid;
import pkgShape.Cuboid.SortByArea;

public class CuboidTest {
	
	@Test
	public void testCuboid() throws Exception {
		Cuboid c1 = new Cuboid(1,2,3);
		
		assertEquals(c1.getiWidth(), 1);
		assertEquals(c1.getiLength(), 2);
		assertEquals(c1.getiDepth(), 3);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void teste1Cuboid() throws Exception {
		Cuboid c1 = new Cuboid(-1,2,3);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void teste2Cuboid() throws Exception {
		Cuboid c1 = new Cuboid(1,-2,3);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void teste3Cuboid() throws Exception {
		Cuboid c1 = new Cuboid(1,2,-3);
	}
	
	@Test
	public void testgetiDepth() throws Exception{
		Cuboid c1 = new Cuboid(1,2,3);
		
		assertEquals(c1.getiDepth(),3);
	}
	
	@Test
	public void testsetiDepth() throws Exception{
		Cuboid c1 = new Cuboid(1,2,3);
		c1.setiDepth(4);
		
		assertEquals(c1.getiDepth(),4);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testesetiDepth() throws Exception{
		Cuboid c1 = new Cuboid(1,2,3);
		c1.setiDepth(-1);
	}
	
	@Test
	public void testarea() throws Exception{
		Cuboid c1 = new Cuboid(1,1,1);
		
		assertTrue(c1.area() == 6);
	}
	
	@Test
	public void testvolume() throws Exception{
		Cuboid c1 = new Cuboid(1,1,1);
		
		assertTrue(c1.volume() == 1);
	}
	
	@Test(expected = Exception.class)
	public void testeperimter() throws Exception{
		Cuboid c1 = new Cuboid(1,1,1);
		
		c1.perimiter();
	}
}
