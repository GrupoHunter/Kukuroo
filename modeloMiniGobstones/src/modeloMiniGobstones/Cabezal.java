package modeloMiniGobstones;

public class Cabezal {
	private Tablero tablero = new Tablero(9, 9);
	private int posicionX = 0;
	private int posicionY = 0;

	public void imprimirTablero() {
		if (this.posicionX < 0 || this.posicionY < 0) {
			System.out.println("UH!...Te caiste del tablero pibe!");
			this.posicionX = 0;
			this.posicionY = 0; // reseteo la posicion al origen
		} else {
			System.out.println("Cabezal en "
					+ this.posicionX
					+ " @ "
					+ this.posicionY
					+ "\n"
					+ "Cantidad de Bolitas: \n"
					+ this.tablero
							.imprimirCelda(this.posicionX, this.posicionY));
		}
	}

	public void poner(Color color) {
		this.tablero.ponerColor(this.posicionX, this.posicionY, color);
	}

	public void mover(Direccion direccion) {
		switch (direccion) {
		case Norte:
			this.posicionY++;
			break;
		case Este:
			this.posicionX++;
			break;
		case Sur:
			this.posicionY--;
			break;
		case Oeste:
			this.posicionX--;
			break;
		default:
			System.out.println("Es raro que llegue a este print :P");
			break;
		}
	}

	public boolean hayBolitas(Color color) {
		return this.getCeldaActual().hayBolitas(color);
	}

	public boolean puedeMover(Direccion dir) {
		//TODO fiaca......
		boolean bool = false; 
//		switch (dir) {
//		case Norte:
//			bool = (this.posicionY - 1) < 0;
//			break;
//		case Este:
//			this.posicionX++;
//			break;
//		case Sur:
//			this.posicionY--;
//			break;
//		case Oeste:
//			this.posicionX--;
//			break;
//		default:
//			System.out.println("Es raro que llegue a este print :P");
//			break;
//		}
		return bool;
	}

	public Celda getCeldaActual() {
		return this.tablero.getCelda(this.posicionX, this.posicionY);
	}

	public Tablero getTablero() {
		return tablero;
	}

	public int getPosicionX() {
		return posicionX;
	}

	public int getPosicionY() {
		return posicionY;
	}
}