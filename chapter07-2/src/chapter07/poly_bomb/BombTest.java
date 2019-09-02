package chapter07.poly_bomb;

public class BombTest {
	public static void main(String[] args) {
//		Bomb[] bomb = new bomb[4]; //배열객체 생성 
//		bomb[0] = new Building();
//		bomb[1] = new Tree();
//		bomb[2] = new Car();
//		bomb[3] = new House();
		
		Bomb[] bomb = {new Building(),  new Tree(), new Car(), new House()}; //이 순서가 바뀌어버린다면 ?
//		for (int i = 0; i < bomb.length; i++) {
//			bomb[i].bomb();
//			bomb[i].sbomb(); //부모 거만 부름!
//			System.out.println("----------------------");
//		}
		
		//자식 거를 부르고 싶으면
		for (int i = 0; i < bomb.length; i++) {
			if(bomb[i] instanceof Building) {
				Building.sbomb();
				((Building)bomb[i]).sbomb(); //왜 정적멤버함수로 장난치냐! 인스턴스 써야지!하는 경고. 
				//bomb[i].sbomb();
			} else if(bomb[i] instanceof Tree) {
				((Tree)bomb[i]).sbomb();
			} else if(bomb[i] instanceof House) {
				((House)bomb[i]).sbomb();
			}else if(bomb[i] instanceof Car) {
				((Car)bomb[i]).sbomb();
			}
		}	
	}
}
