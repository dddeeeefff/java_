class NewsPaper{
	String todayNews;
	boolean isTodayNews = false; // ����� ������ �Ǵ��� ����
	public void setTodayNews(String news){
		todayNews = news;
		isTodayNews = true;
		synchronized(this){
			notifyAll(); // wait() ������ ��� �����带 ����
		}
	}
	public String getTodayNews(){
		if(!isTodayNews){ // ���� ��簡 ������
			try{
				synchronized(this){
					wait();
					// ���� �������� �����带 �����·� ����� �޼ҵ�� notify~�� ���� ������ �����·� ����
				}
			}catch (Exception e){
				e.printStackTrace();
			}
		}
		return todayNews;
	}
}

class NewsWriter extends Thread{
	NewsPaper paper;
	public NewsWriter(NewsPaper paper){this.paper = paper;}
	public void run(){
		paper.setTodayNews("���������� �츮�� ��!!");
	}
}

class NewsReader extends Thread{
	NewsPaper paper;
	public NewsReader(NewsPaper paper){this.paper = paper;}
	public void run(){
		System.out.println("������ ���� : " + paper.getTodayNews());
	}
}

class NewsPaperSync {
	public static void main(String[] args) {
		NewsPaper paper = new NewsPaper();
		NewsWriter writer = new NewsWriter(paper);
		NewsReader reader1 = new NewsReader(paper);
		NewsReader reader2 = new NewsReader(paper);



		try{
			reader1.start();	reader2.start();
			Thread.sleep(1000);
			writer.start();		

			reader1.join();		reader2.join();		writer.join();		
		} catch (InterruptedException e){
			e.printStackTrace();
		}

	}
}
