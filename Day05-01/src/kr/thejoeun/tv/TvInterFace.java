package kr.thejoeun.tv;
import kr.samsung.tv.*;
import kr.Lg.tv.LgTv;

// �������̽��� class �� �ƴ� interface��
// ���� �����Ҷ��� class Ŭ�������� �ƴ�
// interface �������̽���


public interface TvInterFace {
		

	void turnOnTv();
	void turnOffTv();
	void volumUp();
	void volumDown();
	default void turn() {
		System.out.println("����");
	}
	
}
