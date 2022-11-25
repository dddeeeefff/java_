class Aa{
	public String toString(){return "class Aa"};
}	

class Bb{
	public String toString(){return "class Bb"};
}	

class InstanceTypeShow {
	int showCnt = 0;
	public <T> void showInstType(T inst){
		System.out.println(inst);
		showCnt++;
	}
	void showPrintCnt(){System.out.println("show count" + showCnt);}
}

class GenericMethod {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
