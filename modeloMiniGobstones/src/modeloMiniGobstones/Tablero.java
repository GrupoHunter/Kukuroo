package modeloMiniGobstones;

public class Tablero {
	private Celda [][] tablero;
	
	public Tablero(int x, int y){
		this.armarTablero(x, y);
	}

	private void armarTablero(int x, int y) {
		this.tablero = new Celda [x][y];
		for(int fila = 0 ; fila < x ; fila++ ){
		    for(int columna = 0 ; columna < y ; columna++ ){
		        this.tablero[fila][columna] = new Celda();
		    }
		}
	}
		
	public String print() {
		return this.tablero.toString();
	}

	public String imprimirCelda(int posicionX, int posicionY) {
		return this.getCelda(posicionX, posicionY).cantidasDeBolitas();
	}

	public Celda getCelda(int posicionX, int posicionY) {
		return this.tablero[posicionX][posicionY];
	}

	public void ponerColor(int posicionX, int posicionY, Color color) {
		this.tablero[posicionX][posicionY].agregarBolitas(color);
	}
}