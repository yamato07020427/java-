package curridulum_B;

public class Animal {
	private String name; //動物名
	private double length; //体長
	private int speed; //速度

	//setterでデータを設定する
	public void setName(String name) {
		this.name = name; //this.nameのnameはこのクラスの中のname
	}

	public void setLength(double length) {
		this.length = length; //this.lengthのlengthはこのクラスの中のlength
	}

	public void setSpeed(int speed) {
		this.speed = speed; //this.speedのspeedはこのクラスの中のspeed
	}

	//getterで外部からデータを取り出す
	public String getName() {
		return this.name;
	}

	public double getLength() {
		return this.length;
	}

	public int getSpeed() {
		return this.speed;
	}

}


