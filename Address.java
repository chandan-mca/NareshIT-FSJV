class Address {
	private String strNum;
	private String city;

	Address(String strNum, String city){
		this.strNum	= strNum;
		this.city			= city;
	}

	void display(){
		System.out.println("    strnum\t: "	+ strNum);
		System.out.println("    city\t: "	+ city);
	}

}
