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
		System.out.println("�ܿ� ���ָ� : " + gasolineGauge);
		System.out.println("�ܿ� ���ⷮ : " + electiricGauge);
		System.out.println("�ܿ� ���ͷ� : " + whterGauge);
	}
}


class CunstructorSuper {
	public static void main(String[] args) {
		HybridWaterCar hwc = new HybridWaterCar(5, 7, 3);
		hwc.showCurrentGauge();
	}
}


// �������� ���� �÷��ߵ�(�ǾƷ� �����ڿ��� �θ����� ����, super �ֱ�)