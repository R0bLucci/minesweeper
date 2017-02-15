public class Cell {
	
	boolean mine;
	boolean flag;
	boolean revealed;
	int adjacent;

	public Cell(){
		this.mine = false;
		this.flag = false;
		this.revealed = false;
		this.adjacent = 0;
	}

}
