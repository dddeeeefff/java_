class StringEx2 {
	public static void main(String[] args) {
		String file1 = "test.jpg";  String file2 = "test.gif";
		String file3 = "test.doc";  String file4 = "test.zip";

		imgfile(file1);  imgfile(file2);  imgfile(file3);  imgfile(file4);

	}
	public static void imgfile(String file){
		/*
		�޾ƿ� ���ϸ� ���ڸ� �̿��Ͽ� �̹��� �������� �˻��� �� ����ϴ� �޼ҵ�
		���ϸ��� Ȯ���ڸ� �����Ͽ� �̹��� ���� Ȯ�������� ���θ� �˻�
		1. ���ϸ��� Ȯ���� �κи� ����
		 - ������ ���� ���� ���ں��� ������ �߶�� : ������ ��(lastIndexOf()), �ڸ�(substring())
		2. ������ Ȯ���ڰ� �̹��� ������ Ȯ�������� �˻� �� ���
		 - �̹��� Ȯ���� : jpg, gif, pug, jpeg
		*/
		int dot = file.lastIndexOf('.');      // file ���ڿ����� ������ ���� ��ġ�� dot�� ����
		String ext = file.substring(dot + 1); // file ���ڿ����� ������ ���� ���� ���ں��� ������ ����
		
		if(ext.equals("jpg") || ext.equals("gif") || ext.equals("png") || ext.equals("jpeg")){
			System.out.println(file + " ��(��) �̹��� ������ �½��ϴ�");
		}else{
			System.out.println(file + " ��(��) �̹��� ������ �ƴմϴ�");
		}
		


	}
}



