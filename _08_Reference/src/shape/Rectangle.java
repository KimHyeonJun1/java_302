package shape;

public class Rectangle {
	 int width;
	 int height;
	
	
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle) {
			Rectangle r = (Rectangle)obj;
		 return r.width  == this.width &&
		 r.height == this.height ||
		 r.width == this.height &&
		 r.height == this.width;
		 
	}else
		
		return false;
	}


	
	
	
}
