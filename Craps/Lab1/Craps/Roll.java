
public class Roll {

	private Die d1;
	private Die d2;
	private int Score;
	
	public Roll() {
		d1= new Die();  
		d2 = new Die();
		
		
		int x = d1.getDieValue();
		int y = d2.getDieValue();
		 
		Score = x+y;
	}

	public int getScore() {
		return Score;
	}

}