package game;

public class Player{
	//attributes
	public int id;
	private Player_status status;		//I decided to make this a private class
								//to prevent unauthorized altercations
	public String userName;
	private String password;
	public int currentGameNum;

	//constructor(s)
	Public Player(int id, String userName, String password){
		this.id = id;
		this.userName = userName;
		this.password
		status = WAITING;
		currentGameNum = -1;
	}

	PUblic Player(BufferedReader br)throws IOException{
		id = Integer.parseInt(br.readLine());
		status = Player_status.valueOf(br.readLine());  //decode?
		userName = br.readLine();
		password = br.readLine();		//decode
		currentGameNum = Integer.parseInt(br.readLine());
	}

	//methods
	//since the status is private I need to create a getter and setter
	public Player_status getStatus(){		//getter
		return status;
	}

	public void die(){		//setter
		status = false;
	}

	public int getId(){		//for checking if dead-superfluous?
		return id;
	}

	public String getUserName(){		//superfluous?
		return userName;
	}

	public boolean isPasswordCorrect(String attempt){
		return password.equals(attempt);
	}

	public void joinGame(int gameNum){
		currentGameNum = gameNum;
		status = INGAME_ALIVE;
	}

	public void save(BufferedWriter bw)throws IOException{		//needs encoding!!
		bw.write(id + "\n" + status.toString() + "\n" + userName + "\n" + password + "\n" + currentGameNum + "\n");
	}

	public String toString(){
		return userName + "\n" + id + "\n" + status;
	}
}