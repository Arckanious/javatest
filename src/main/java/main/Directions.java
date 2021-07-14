package main;

public enum Directions {
	RIGHT,
	LEFT,
	UP,
	DOWN;


	static String toString(Directions direcao) {
		switch (direcao) {
		case RIGHT:
			return "right";
		case LEFT:
			return "left";
		case UP:
			return "up";
		case DOWN:
			return "down";
		default:
			return "parado";
		}
	}

}