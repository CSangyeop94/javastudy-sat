package kr.thejoeun.tv.kr.samsung.tv;
import kr.thejoeun.tv.TvInterFace;

public class SamsungTv implements TvInterFace{
	
	@Override
	public void turnOnTv() {
		System.out.println("�ＺTVŰ��");
	}

	@Override
	public void turnOffTv() {
		System.out.println("�ＺTV����");
	}

	@Override
	public void volumUp() {
		System.out.println("�ＺTV �����ø���");
	}

	@Override
	public void volumDown() {
		System.out.println("�ＺTV ����������");
	}

}
