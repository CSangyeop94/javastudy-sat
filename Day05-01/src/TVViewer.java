import kr.thejoeun.tv.TvInterFace;
import kr.thejoeun.tv.Nintendo;
import kr.samsung.tv.SamsungTv;
import kr.Lg.tv.LgTv;

public class TVViewer {

	public static void main(String args[]) {

		TvInterFace tv = new SamsungTv(); 
		//TvInterface tv = new LgTv(); 
		
		//-- ���� �� 4���� ��Ģ(�޼ҵ�)�� ����ϰھ�
		tv.turnOnTv();
		tv.turnOffTv();
		tv.volumUp();
		tv.volumDown();
		
		
		((Nintendo)tv).attachNintendo();
		((Nintendo)tv).dettachNintendo();
		
		TvInterFace arrTv[] = new TvInterFace[2];
		arrTv[0] = new SamsungTv();
		arrTv[1] = new LgTv();
		
	}
	
}