package game;

public class Game{
	//attributes
	public int timeTilSnap;
	public ArrayList<Player> players = new ArrayList<>();

	//constructor(s)
	public Game(int timeTilSnap){
		this.timeTilSnap = timeTilSnap;
	}

	//methods
	public void addPlayer(Player player){
		players.add(player);
	}

	public ArrayList<Player> snap(ArrayList<Player> players){
		//I need to decide how to prform the snap math so that is
		//random and has something to de with how the nubers are assinged
	}

	public int howManyRemain(){
		return players.size();
	}

	public String toString(){
		String str = new String();
		for(int i = 0; i < players.size(); i++){
			str += players.get(i).toString();
		}
		return str;
	}
}