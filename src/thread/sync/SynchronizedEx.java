package thread.sync;

public class SynchronizedEx
{

	public static void main(String[] args)
	{
		SharedPrinter p = new SharedPrinter(); // 공유 데이터 생성
		
		String [] engText = { "Wise men say, ",
									"only fools rush in",
									"But I can't help, ",
									"falling in love with you",
									"Shall I stay? ",
									"Would it be a sin?",
									"If I can't help, ",
									"falling in love with you" };
		String [] korText = { "동해물과 백두산이 마르고 닳도록, ",
									"하느님이 보우하사 우리 나라 만세",
									"무궁화 삼천리 화려강산, ",
									"대한 사람 대한으로 길이 보전하세",
									"남산 위에 저 소나무, 철갑을 두른 듯",
									"바람서리 불변함은 우리 기상일세.",
									"무궁화 삼천리 화려강산, ",
									"대한 사람 대한으로 길이 보전하세" };
		
		Thread th1 = new WorkerThread(p, engText);//영문출력스레드
		Thread th2 = new WorkerThread(p, korText);//국문출력스레드

		th1.start();
		th2.start();
	}

}
