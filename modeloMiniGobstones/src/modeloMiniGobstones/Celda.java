package modeloMiniGobstones;

public class Celda {
	private int rojo = 0, verde = 0, azul = 0, negro = 0;

	public void agregarBolitas(Color color) {
		switch (color) {
		case Rojo:
			this.rojo ++;
			break;
		case Verde:
			this.verde++;
			break;
		case Azul:
			this.azul++;
			break;
		case Negro:
			this.negro++;
			break;
		default:
			break;
		}
	}

	public boolean hayBolitas(Color color) {
		boolean bool = false;
		switch (color) {
		case Rojo:
			bool = this.rojo > 0;
			break;
		case Verde:
			bool = this.verde > 0;
			break;
		case Azul:
			bool = this.azul > 0;
			break;
		case Negro:
			bool = this.negro > 0;
			break;
		default:
			break;
		}
		return bool;
	}

	public String cantidasDeBolitas() {
		return "Rojo: "+this.rojo+"\n Verde: "+this.verde+"\n Azul: "+this.azul+"\n Negro: "+this.negro;
	}
	
}
