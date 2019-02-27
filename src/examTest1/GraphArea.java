package examTest1;

interface GraphArea {
	public abstract double getArea();
}

class Circle implements GraphArea{
	//°ë¾¶
	double r;
	Circle(){}
	Circle(double r){
		this.r = r;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*r*r;
	}
	
}

class Rectangle implements GraphArea{
	double w;
	double h;
	Rectangle(){}
	Rectangle(double w,double h){
		this.w = w;
		this.h = h;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return w*h;
	}
	
}

class Triangle implements GraphArea{
	double di;
	double h;
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return di*h/2;
	}
	
}