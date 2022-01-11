package game;

import java.util.Random;

public class Game{
	//attributes
	public int timeTilSnap;
	public ArrayList<Player> players = new ArrayList<>();

	//constructor(s)
	public Game(int timeTilSnap){
		this.timeTilSnap = timeTilSnap;
	}

	//load users and their info from file
	public Game(BufferedReader br)throws IOException{
		timeTilSnap = Integer.parseInt(br.readLine());
		while(br.ready()){
			Player p = new Player(br);
			players.add(p);
		}
	}

	//methods
	public void addPlayer(Player player){
		players.add(player);
	}

	public void snap(ArrayList<Player> players){
		int s = players.howManyRemain();
		int f = 0.5 * s;
		int i = 0;
		Random rand = new Random();

		while(i < f){
			int r = nextInt(f);
			if(players[r].getStatus()){
				players[r].die();
				i++;
			}
		}
	}

	public int howManyRemain(){
		int s = players.size();
		int t = 0;
		for(int i = 0; i < s; i++){
			if(players[i].getStatus()){
				t++;
			}
		}
		return t;
	}

	//save user data
	public void save(){

	}

	public String toString(){
		String str = new String();
		for(int i = 0; i < players.size(); i++){
			str += players.get(i).toString();
		}
		return str;
	}
}