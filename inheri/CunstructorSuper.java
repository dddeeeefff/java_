class Car{
	int gasolineGauge;
	Car(int g){
		gasolineGauge = g;
	}
}

class HybridCar extends Car{
	int electiricGauge;
	HybridCar(int g, int e){
		super(g);
		electiricGauge = e;
	}
}

class HybridWaterCar extends HybridCar{
	int whterGauge;
	HybridWaterCar(int g, int e, int w){
		super(g, e);
		whterGauge = w;
	}



	public void showCurrentGauge(){
		System.out.println("잔여 가솔린 : " + gasolineGauge);
		System.out.println("잔여 전기량 : " + electiricGauge);
		System.out.println("잔여 워터량 : " + whterGauge);
	}
}


class CunstructorSuper {
	public static void main(String[] args) {
		HybridWaterCar hwc = new HybridWaterCar(5, 7, 3);
		hwc.showCurrentGauge();
	}
}


// 하위에서 위로 올려야됨(맨아래 생성자에서 부모한테 변수, super 넣기)