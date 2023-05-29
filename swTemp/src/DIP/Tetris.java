package DIP;

public class Tetris extends Games{
	public Tetris() {
		title = returnTitle();
		version = returnVersion();
	}

	public String returnTitle() {
		return "Tetris";
	}

	public String returnVersion() {
		return "v.1.3";
	}
}
