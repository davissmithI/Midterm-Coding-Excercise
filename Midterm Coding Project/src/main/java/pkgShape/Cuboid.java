package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle implements Comparable<Object>{
	
	private int iDepth;
	
	public Cuboid(int w, int l, int d) throws Exception{
		
		super(w, l);
		
		if (d < 1) {
			throw new IllegalArgumentException();
		}
		
		this.iDepth = d;
	}

	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		
		if (iDepth < 1) {
			throw new IllegalArgumentException();
		}
		
		this.iDepth = iDepth;
	}
	
	public double volume() {
		return this.getiWidth() * this.getiLength() * this.getiDepth();
	}
	
	@Override
	public double area() {
		double wl = (2 * (getiWidth() * getiLength()));
		double ld = (2 * (getiLength() * getiDepth()));
		double dw = (2 * (getiDepth() * getiWidth()));
		return wl + ld + dw;
	}
	
	public double perimiter() throws Exception{
		throw new Exception("UnsupportedOperationException");
	}
	
	@Override
	public int compareTo(Object obj) {
		return 0;
	}
	
	public static class SortByArea implements Comparator<Cuboid>{
		
		SortByArea(){
			
		}
		
		public int compare(Cuboid a, Cuboid b) {
			if (a.area() < b.area()) {
				return -1;
			}
			if (a.area() > b.area()) {
				return 1;
			}
			else return 0;
			
		}
	}
	
	public static class SortByVolume implements Comparator<Cuboid>{
		
		SortByVolume(){
			
		}
		
		public int compare(Cuboid a, Cuboid b) {
			if (a.volume() < b.volume()) {
				return -1;
			}
			if (a.volume() > b.volume()) {
				return 1;
			}
			else return 0;
			
		}
	}

}
