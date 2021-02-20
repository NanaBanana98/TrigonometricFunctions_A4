package general;

public abstract class IAngleMeasurement {

	
	
	public abstract double getRadianMeasurement();
	
	public abstract double getDegreeMeasurement();
	
	public Quadrant getQuadrant() {
		double temp=this.getRadianMeasurement()%(2*Maths.PI);
		//transform negative to positive
		if(temp<0) {
			temp=temp+2*Maths.PI;
		}
		//quadrant 1
		if(temp<=(Maths.PI/2)) {
			return Quadrant.Q1;
		}
		//quadrant 2
		else if(temp<=Maths.PI && temp>(Maths.PI/2)) {
			return Quadrant.Q2;
		}
		//quadrant 3
		else if(temp>Maths.PI&&temp<=3*Maths.PI/2) {
			return Quadrant.Q3;
		}
		//quadrant 4
		else {
			return Quadrant.Q4;
		}    	    	    	
	}
	
	
    //Shift input to a radian in quadrant 1
	public double quadrantShift() 
	{
	
		Quadrant quadrant = this.getQuadrant();	//the quadrant where this angle lies
		
    	double temp = this.getRadianMeasurement()%(2*Maths.PI);
    	//transform negative to positive
    	if(temp<0) {
    		temp=temp+2*Maths.PI;
    	}
		
		switch(quadrant) 
		{
		case Q1:
			return temp;
		case Q2:
			temp=Maths.PI-temp;
			return temp;
		case Q3:
    		temp=temp-Maths.PI;
			return temp;
		case Q4:
    		temp=2*Maths.PI-temp;
			return temp;
		default:
			return temp;
		}

	}	
}
