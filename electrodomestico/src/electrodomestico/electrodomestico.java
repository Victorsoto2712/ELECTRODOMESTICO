package electrodomestico;

/**Corresponde a la super clase de los electrodomesticos
 * la cual traera y dara los atributos a las demas clases hijas
 * @author Olidata
 *
 */
public class electrodomestico {

/**
*Estos seran los atributos que tendran los Electrodomesticos,
*primera se hara una prueba con valores predeterminados 
*
*/
		private int precioBase = 100000;
		private String color = "Blanco";
		private String consumo = "F";
		private char consumoEnergetico;
		private String peso = "5 kg";
		
		
		
		public electrodomestico() {
			super();
		}


		public electrodomestico(int precioBase, String peso) {
			super();
			this.precioBase = precioBase;
			this.peso = peso;
		}


		public electrodomestico(int precioBase, String color, String consumo, char consumoEnergetico, String peso) {
			super();
			this.precioBase = precioBase;
			this.color = color;
			this.consumo = consumo;
			this.consumoEnergetico = consumoEnergetico;
			this.peso = peso;
		}


		public void comprobarConsumoEnergetico () {
			if(this.consumoEnergetico=='A' |this.consumoEnergetico=='a') {
			}
			if(this.consumoEnergetico=='b' | this.consumoEnergetico=='B') {
			}
			if(this.consumoEnergetico=='c' | this.consumoEnergetico=='C') {
			}
			if(this.consumoEnergetico=='d' | this.consumoEnergetico=='D') {
			}
			if(this.consumoEnergetico=='e' | this.consumoEnergetico=='E') {
			}
			if(this.consumoEnergetico=='f' | this.consumoEnergetico=='F') {
			}
			else System.out.println("Ingrese una categoria de consumo de A para eficiente o F para muy deficiente");
			}
			
	
		
		
			
		public int getPrecioBase() {
			return precioBase;
		}


		public void setPrecioBase(int precioBase) {
			this.precioBase = precioBase;
		}


		public String getColor() {
			return color;
		}


		public void setColor(String color) {
			this.color = color;
		}


		public String getConsumo() {
			return consumo;
		}


		public void setConsumo(String consumo) {
			this.consumo = consumo;
		}


		public char getConsumoEnergetico() {
			return consumoEnergetico;
		}


		public void setConsumoEnergetico(char consumoEnergetico) {
			this.consumoEnergetico = consumoEnergetico;
		}


		public String getPeso() {
			return peso;
		}


		public String setPeso(String peso) {
			return this.peso = peso;
		}
	

		
				
		
	}


