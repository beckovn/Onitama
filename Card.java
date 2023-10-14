import java.util.ArrayList;

public class Card {
//Name(Set of moves, name)
	private String name;
	private int[][] moves;
	private int color;

	public static ArrayList<Card> allCards = new ArrayList<Card>();

	public static Card tiger;
	public static Card dragon;
	public static Card frog;
	public static Card rabbit;
	public static Card crab;
	public static Card elephant;
	public static Card goose;
	public static Card rooster;
	public static Card monkey;
	public static Card mantis;
	public static Card horse;
	public static Card ox;
	public static Card crane;
	public static Card boar;
	public static Card eel;
	public static Card cobra;
        public static Card tanuki;
	public static Card mouse;
	public static Card iguana;
	public static Card bear;
	public static Card rat;
	public static Card giraffe;
	public static Card lobster;
	public static Card hornet;
	public static Card centipede;
	public static Card phoenix;
	public static Card steer;
	public static Card panda;
        public static Card goat;
	public static Card sheep;
        public static Card viper;
        public static Card sea_snake;

	public String toString() {
		return name;
	}

	public static void init() {
		tiger    = new Card(new int[][] {{0,2},  {0,-1}}                 ,"Tiger", Board.blue);
		dragon   = new Card(new int[][] {{-2,1}, {-1,-1}, {1,-1}, {2,1}} ,"Dragon", Board.red);
		frog     = new Card(new int[][] {{-2,0}, {-1,1},  {1,-1}}        ,"Frog", Board.red);
		rabbit   = new Card(new int[][] {{1,1},  {-1,-1}, {2,0}}         ,"Rabbit", Board.blue);
		crab     = new Card(new int[][] {{2,0},  {-2,0},  {0,1}}         ,"Crab", Board.blue);
		elephant = new Card(new int[][] {{1,0},  {-1,0},  {1,1},  {-1,1}},"Elephant", Board.red);
		goose    = new Card(new int[][] {{-1,1}, {1,-1},  {-1,0}, {1,0}} ,"Goose", Board.blue);
		rooster  = new Card(new int[][] {{-1,-1},{1,1},   {-1,0}, {1,0}} ,"Rooster", Board.red);
		monkey   = new Card(new int[][] {{1,1},  {-1,-1}, {1,-1}, {-1,1}},"Monkey", Board.blue);
		mantis   = new Card(new int[][] {{0,-1}, {-1,1},  {1,1}}         ,"Mantis", Board.red);
		horse    = new Card(new int[][] {{-1,0}, {0,1},   {0,-1}}        ,"Horse", Board.red);
		ox       = new Card(new int[][] {{1,0},  {0,1},   {0,-1}}        ,"Ox", Board.blue);
		crane    = new Card(new int[][] {{-1,-1},{1,-1},  {0,1}}         ,"Crane", Board.blue);
		boar     = new Card(new int[][] {{-1,0}, {1,0},   {0,1}}         ,"Boar", Board.red);
		eel      = new Card(new int[][] {{-1,1}, {-1,-1}, {1,0}}         ,"Eel", Board.blue);
		cobra    = new Card(new int[][] {{1,1},  {1,-1},  {-1,0}}        ,"Cobra", Board.red);
                tanuki    = new Card(new int[][] {{0,1},  {2,1},  {-1,-1}}        ,"Tanuki", Board.blue);
		mouse    = new Card(new int[][] {{0,1},  {1,0},  {-1,-1}}        ,"Mouse", Board.red);
                iguana    = new Card(new int[][] {{0,1},  {-2,1},  {1,-1}}        ,"Iguana", Board.red);
		bear    = new Card(new int[][] {{0,1},  {-1,1},  {1,-1}}        ,"Bear", Board.blue);
                rat    = new Card(new int[][] {{-1,0},  {0,1},  {1,-1}}        ,"Rat", Board.blue);
                giraffe    = new Card(new int[][] {{-2,1},  {2,1},  {0,-1}}        ,"Giraffe", Board.red);
                lobster    = new Card(new int[][] {{-1,1},  {1,1},  {-1,-2},  {1,-2}}        ,"Lobster", Board.blue);
                hornet    = new Card(new int[][] {{0,1},  {1,0},  {-1,-2}}        ,"Hornet", Board.red);
                centipede    = new Card(new int[][] {{-1,0},  {0,1},  {2,-2}}        ,"Centipede", Board.red);
                phoenix    = new Card(new int[][] {{-2,0},  {-1,1},  {1,1},  {2,0}}        ,"Phoenix", Board.blue);
                steer    = new Card(new int[][] {{-1,0},  {-1,-1},  {1,0}, {1,-1}}        ,"Steer", Board.red);
                panda    = new Card(new int[][] {{0,1},  {1,1},  {-1,-1}}        ,"Panda", Board.blue);
                goat	 = new Card(new int[][] {{-1,0}, {0,-1},  {1,1}}    ,"Goat",    Board.red);
                sheep	 = new Card(new int[][] {{-1,1}, {0,-1},  {1,0}}    ,"Sheep",   Board.blue);
                viper	 = new Card(new int[][] {{-2,0}, {0,1},   {1,-1}}   ,"Viper",	  Board.red);
		sea_snake = new Card(new int[][] {{-1,-1},{0,1},   {2,0}}   ,"Sea Snake",Board.blue);
	}

	Card(int [][] moves, String name, int color) {
		this.moves = moves;
		this.name  = name;
		this.color = color;

		allCards.add(this);
	}

	public Card(Card c) {
		moves = c.getMoves();
		name  = c.getName();
		color = c.getColor();
	}

	public int [][] getMoves() {
		return moves;
	}

	public String getName() {
		return name;
	}

	public int getColor() {
		return color;
	}

	public String getColorString() {
		String col = "Blue";
		if(color == Board.red) col = "Red";
		return col;
	}

	public static Card getCardByName(String name) {
		for(Card c : allCards)
			if(c.name == name)
				return c;
		return null;
	}

	public boolean equals(Card c) {
		return c.getName().equals(name);
	}
}
