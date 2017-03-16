public interface Location
{
	//variables
	int ID = (int) (Math.random() * 1000000) + 1;
	
	//methods 
	int getID();
	
	void move(double x, double y);
	
	double[] getLoc();
}