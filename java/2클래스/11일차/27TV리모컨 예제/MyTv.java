package human28;

public class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void turnOnOff() {
//		if(this.isPowerOn == true) {
//			this.isPowerOn = false;
//		}
//		else {
//			this.isPowerOn = true;
//		}
		this.isPowerOn = ! this.isPowerOn;
		//boolean 형태는 true/false 2가지만 있기 때문에 NOT의 연산자를 처리할 수 있다.
	}
	void volumeUp() {
		if(this.volume < MAX_VOLUME) {
			this.volume++;
		}
	}
	void volumeDown() {
		if(this.volume > MIN_VOLUME) {
			this.volume--;
		}
	}
	void channelUp() {
		if(this.channel == MAX_CHANNEL) {
			this.channel = MAX_CHANNEL;
		}
		else {
			channel++;
		}
	}
	void channelDown() {
		if(this.channel == MIN_CHANNEL) {
			this.channel = MIN_CHANNEL;
		}
		else {
			this.channel--;
		}
	}
}
