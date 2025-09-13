//Address.java
class Address {
	
	private int strnum;
	private String city;

	void setStrnum(int strnum){
		this.strnum = strnum;
	}

	int getStrnum(){
		return strnum;
	}

	void setCity(String city){
         this.city = city;
	}

	String getCity(){
		return city;
	}

	@Override
	public String toString(){
		return "Address("+ strnum + ", "+ city+")";
	}

}
