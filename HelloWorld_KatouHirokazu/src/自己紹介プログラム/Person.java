package 自己紹介プログラム;

class Person {
	//インスタンスフィールドの定義
	String name;
	int age;
	double height;
	double weight;
	
	//Personが作られる度に人数を数えるためのクラス変数
	public static int count = 0;
	
	//コンストラクタの定義と各インスタンスフィールドに値をセット
	Person(String name, int age , double height , double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++; //Personが生成されるたびに+1する
	}
	
	//インスタンスメソッド「bmi」を定義
	public double bmi(){
		//bmiメソッドでインスタンスのBMIを返すようにする
		return weight / (height * height); 
	}
	
	//インスタンスメソッド「print」を定義
	public void print() {
		System.out.println("名前は" + this.name + "です。");
		System.out.println("年は" + this.age + "です。");
		System.out.println("BMIは" + String.format("%.1f", Math.floor(this.bmi())) + "です。");
	}
	

	

}
