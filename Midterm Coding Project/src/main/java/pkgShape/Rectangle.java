package pkgShape;

public class Rectangle extends Shape {
	
	private int iWidth;
	private int iLength;
	
	public Rectangle(int w, int l) throws Exception{
		
		if (w < 1 || l < 1) {
			throw new IllegalArgumentException();
		}
		
		this.iWidth = w;
		this.iLength = l;
	}

	public int getiWidth() {
		return iWidth;
	}

	public void setiWidth(int iWidth) {
		
		if (iWidth < 1) {
			throw new IllegalArgumentException();
		}
		
		this.iWidth = iWidth;
	}

	public int getiLength() {
		return iLength;
	}

	public void setiLength(int iLength) {
		
		if (iLength < 1) {
			throw new IllegalArgumentException();
		}
		
		this.iLength = iLength;
	}
	
	public double area(){
		return this.getiWidth() * this.getiLength();
	}
	
	public double perimiter() throws Exception {
		return ((this.getiWidth() * 2) + (this.getiLength() * 2));
	}
	
	public int compareTo(Object obj) {
		if(obj == this) {
			return 0;
		}
		
		if(!(obj instanceof Rectangle)) {
			throw new IllegalArgumentException();
		}
		
		Rectangle rec = (Rectangle) obj;
		if (this.area() > rec.area()) {
			return 1;
		}
		else return -1;
	}

}
