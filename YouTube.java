package com.itbulls.mazhurna;

public class YouTube {
	public static void main(String[] args) {
		
	
}
	interface personInterface{
		double[] getInfo();
		String[] getStatus();
		String[] getFio();
	}
	class info{
		String fio;
		String dol;
		double year;
		String spec;
		double phone;
		String adress;
		
		info(){
			fio = fio;
			dol = dol;
			year = 2020;
			spec = spec;
			phone = 35690;
		
		}
	}
	
class supervisers extends info implements personInterface{
	
	public double[] getInfo() {
	return new double[] year;
	}
	public String[] getStatus() {
	return new String[] dol;
	}
	public String[] getFio() {
		return new String[] fio;
	}
}

class jobs extends info implements personInterface{
	
}

class clients extends info implements personInterface{
	
}

}
