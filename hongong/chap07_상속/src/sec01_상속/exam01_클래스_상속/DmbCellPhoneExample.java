package sec01_상속.exam01_클래스_상속;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// DmbCellPhone object 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("JavaPhone", "black", 10);
		
		// CellPhone class's field (inherited)
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("색상: " + dmbCellPhone.color);
		
		// DmbCellPhone class's field 
		System.out.println("채널: " + dmbCellPhone.channel);
		
		// CellPhone class's method (inherited)
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요.");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동입니다.");
		dmbCellPhone.sendVoice("반갑습니다!");
		dmbCellPhone.hangUp();
		
		// DmbCellPhone class's method
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}

}
