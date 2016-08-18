package pe.edu.upc.entity;

public class Fruta {

//Atributos de instancia --> objeto	
	 private String color;
	 private String sabor;
	 
	 //atributo de clase
	 public static String LugarOrigen="UPC";

	 //Constructores (inicializa color y sabor)
		public Fruta(String color, String sabor) {
			super();
			this.color = color;
			this.sabor = sabor;
		}

		//Metodos
		
		public static void SoyunMetodoGlobal(){
			
		}
		
		public void SoyunMetodoObjeto(){
			
		}
		
		
		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getSabor() {
			return sabor;
		}

		public void setSabor(String sabor) {
			this.sabor = sabor;
		}
		
		@Override
			public String toString() {
				// TODO Auto-generated method stub
				return super.toString()+"-"+this.getColor();
			}

}
