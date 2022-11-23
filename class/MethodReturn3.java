class MethodReturn3 {
	public static void main(String[] args) {
		char grade = getGrade(77);
		System.out.println("학점은 '" + grade + "' 학점 입니다.");
			
		int num = getNumber();
		if(num == -1){
			System.out.println("5와 7의 최소공배수가 없습니다.");
		}
		System.out.println("5와 7의 최소공배수 :" + num);
	}

	public static char getGrade(int score){
		char getGradeResult;
		if(score >= 90){
			getGradeResult = 'A';
		}else if(score >= 80){
			getGradeResult = 'B';
		}else if(score >= 70){
			getGradeResult = 'C';
		}else if(score >= 60){
			getGradeResult = 'D';
		}else{
			getGradeResult = 'F';
		}
		return getGradeResult;
		// if문 안에서 return 할 경우 반드시 else문이 있거나 if문 밖에서 return 해야 함
	}

	public static int getNumber(){
		for(int i = 1; i < 100; i++){
			if(i % 5 == 0 && i % 7 == 0){
				return i;
				// 루프문에서 if문을 사용하여 조건에 따라 return할 경우 절대 else문을 사용하면 안됨
			}
		}
		return -1;
		//루프문은 그 자체로 들어가기 위한 조건이 있으므로 조건에 위배되면 아예 return이 안될 수도 있기 때문에
		//루프문 안에서 return 할 경우 반드시 루프문 밖에서도 return을 한번 더 해줘야 함.
	}

}
