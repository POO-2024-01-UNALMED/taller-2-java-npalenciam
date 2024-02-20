package test;

public class Auto {
	int precio;
	int registro;
	String modelo;
	String marca;
	Motor motor;
	Asiento [] asientos;
	static int cantidadCreados;
	
	int cantidadAsientos () {
		int numeroAsientos = 0;
		for (int i = 0 ; i < asientos.length ; i++) {
			if (asientos[i] != null) {
				numeroAsientos++;
			}
		}
		return numeroAsientos;
	}
	
	String verificarIntegridad() {
		if (this.registro == this.motor.registro) {
			for (int i = 0; i < asientos.length ; i++) {
				if (asientos[i] != null && asientos[i].registro != registro) {
					return "Las piezas no son originales" ;
				}
			}
			return "Auto original";
		}
		else {
			return "Las piezas no son originales";
		}
	}
}
