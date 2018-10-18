package abstraction;

public class GameImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GameObject[] gameObjects = new GameObject[2];
		
		gameObjects[0] = new Player();
		System.out.println(gameObjects[0].no);		
		gameObjects[1] = new Menu();
		System.out.println(gameObjects[1].no);
		
//		for(GameObject obj : gameObjects){
//			obj.draw();			
//		}
	}

}
