package kr.samsung.tv;
import kr.thejoeun.tv.Nintendo;
import kr.thejoeun.tv.TvInterFace;


public class SamsungTv implements TvInterFace,Nintendo{

	@Override
	public void turnOnTv() {
		// TODO Auto-generated method stub
		System.out.println("�Ｚ Tv Ű��");
	}

	@Override
	public void turnOffTv() {
		// TODO Auto-generated method stub
		System.out.println("�Ｚ Tv ����");
	}

	@Override
	public void volumUp() {
		// TODO Auto-generated method stub
		System.out.println("�Ｚ Tv ����Ű���");
	}

	@Override
	public void volumDown() {
		// TODO Auto-generated method stub
		System.out.println("�Ｚ Tv ����������");
	}

	@Override
	public void attachNintendo() {
		// TODO Auto-generated method stub
		System.out.println("���ٵ� ���̱�");
	}

	@Override
	public void dettachNintendo() {
		// TODO Auto-generated method stub
		System.out.println("���ٵ� ����");
	}
	
	
	
}
