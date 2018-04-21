import java.util.ArrayList;

public class Node {
	private int row;
	private int column;
	private int weight;
	private ArrayList<Node> cardinalTargets = new ArrayList<Node>();
	private ArrayList<Node> diagonalTargets = new ArrayList<Node>();
	
	
	public Node(int row, int colum, int weight) {
		this.row = row;
		this.column = column;
		this.weight = weight;
		
		
	}


	public int getWeight() {
		return weight;
	}
	
	
}
