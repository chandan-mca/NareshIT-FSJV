class Bike{
	private int gear;

	public void setGear(int gear) throws IllegalArgumentException{
		if(gear<0  || gear >5)
			throw   new IllegalArgumentException(
					"Invalid gear. Its value must be in between(0,5)");
		
		this.gear = gear;
	}

	public int getGear(){
		return gear;
	}

	public void currentGear(){
		if(gear == 0){
			System.out.println("Bike is in Neutral");
		}else{
			System.out.println("Bike is running on gear "+ gear);
		}
	}
}