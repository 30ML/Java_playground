package sec01_상속.exam01_클래스_상속;

public class DmbCellPhone extends CellPhone {
	// FIELD
	int channel;
	
	// CONSTRUCTOR
	DmbCellPhone(String model, String color, int channel) {
		this.model = model; // Inherited CellPhone 
		this.color = color; // Inherited CellPhone
		this.channel = channel;
	}
	
	// METHOD
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
