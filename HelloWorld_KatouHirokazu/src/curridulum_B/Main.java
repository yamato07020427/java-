package curridulum_B;

public class Main {

	public static void main(String[] args) {
		Greeting greeting = new Greeting();
		greeting.sayHello(); //sayhello()メソッドを呼び出す

		Animal animal = new Animal(); //インスタンスの作成

		animal.setName("ライオン"); //名前をセット
		animal.setLength(2.1); //体長をセット
		animal.setSpeed(80); //速度をセット

		System.out.println("動物名：" + animal.getName());
		System.out.println("体長：" + animal.getLength() + "m");
		System.out.println("速度：" + animal.getSpeed() + "km/h");
	}

}
