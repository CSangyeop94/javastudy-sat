package kr.Lg.tv;
import kr.thejoeun.tv.TvInterFace;

public class LgTv implements TvInterFace{

	@Override
	public void turnOnTv() {
		// TODO Auto-generated method stub
		System.out.println("LG Tv Ű��");
	}

	@Override
	public void turnOffTv() {
		// TODO Auto-generated method stub
		System.out.println("LG Tv ����");
	}

	@Override
	public void volumUp() {
		// TODO Auto-generated method stub
		System.out.println("LG Tv ����Ű���");
	}

	@Override
	public void volumDown() {
		// TODO Auto-generated method stub
		System.out.println("LG Tv ����������");
	}
	
}
