package game;

public class Player{
	//attributes
	public int id;
	private boolean status;		//I decided to make this a private class
								//to prevent unauthorized altercations
	public Strig userName;

	//constructor(s)
	Public Player(int id, String userName){
		this.id = id;
		this.userName = userName;
		status = true;
	}

	//methods
	//since the status is private I need to create a getter and setter
	public boolean getStatus(){		//getter
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

	public String toString(){
		return userName + "\n" + id + "\n" + status;
	}
}