class Speaker{
	private int vol;
	public void showCurrnetState(){
		System.out.println("볼륨 크기 : " + vol);		
	}
	public void setVol(int vol){this.vol = vol;}
}

class BaseSpeaker extends Speaker{
	private int base;
	public void showCurrnetState(){
	// 상위클래스인 Speaker의 showCurrnetState() 메소드를 오버라이딩한 메소드
		super.showCurrnetState();
		// 오버라이딩 된 메소드에서만 상위클래스의 원본메소드를 super 키워드를 이용하여 호출할 수 있음
		System.out.println("베이스 크기 : " + base);
	}
	public void setBase(int base){this.base = base;}
}

class OverridingEx {
	public static void main(String[] args) {
		BaseSpeaker bs = new BaseSpeaker();
		bs.setVol(10);
		bs.setBase(20);
		bs.showCurrnetState();
		// 오버라이딩된 메소드를 호출할 경우 무조건 인스턴스 기준으로 최하위 클래스의 오버라이딩된 메소드가 호출됨
	}

}
