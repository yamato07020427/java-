package curriculum_D;

//共通のキャラクター情報
public class Character {
	protected String name;
	protected int hp;
	protected int at;
	protected int sp;
	
	public Character(String name, int hp, int at, int sp) {
		this.name = name;
		this.hp = hp;
		this.at = at;
		this.sp = sp;
	}
	
	//攻撃処理（targetのHPを減らす）
	public void attack(Character target) {
		//targetのHPを自分のAT分減らす
		target.hp -= this.at;
		System.out.println(this.name + "の攻撃！" + target.name + "に" + this.at + "のダメージ！");
		
	}
	//生存判定
	public boolean isAlive() {
		return this.hp > 0;
	}
	
	//ステータス表示
	public void showStatus(){
		System.out.println(name + "のステータス: HP=" + hp + " AT=" + at +" SP=" + sp);
		
	}
	

	

}
