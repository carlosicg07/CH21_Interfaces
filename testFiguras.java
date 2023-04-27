public class testFiguras {
	public static void main(String[] args) {
		Triangulo t1 = new  Triangulo("Triángulo t1", 20.0, 10.0, 15.0);
		Triangulo t2 = new  Triangulo("Bermudas", 87.0, 121.0, 101.0);
		
		Cuadrado c1 = new Cuadrado("Cuadrado c1", 7);
		Cuadrado c2 = new Cuadrado("Cuadri", 9);
		
		Rectangulo r1 = new Rectangulo("Rectangulo r1", 5, 7);
		Rectangulo r2 = new Rectangulo("Recti", 3.5, 4.5);
		
		Rombo x1 = new Rombo("Rombo x1", 5, 7, 4 );
		Rombo x2 = new Rombo("Rombi", 3, 4, 2);
		
		Romboide y1 = new Romboide("Romboide x1", 5, 7);
		Romboide y2 = new Romboide("Rombois", 3, 4);
		
		// TODO: Aquí se deben instanciar las otras figuras geométricas

		imprimirCalculo(t1);
		imprimirCalculo(t2);
		
		imprimirCalculo(c1);
		imprimirCalculo(c2);
		
		imprimirCalculo(r1);
		imprimirCalculo(r2);
		
		imprimirCalculo(x1);
		imprimirCalculo(x2);
		
		imprimirCalculo(y1);
		imprimirCalculo(y2);

		// TODO: Aquí se debe probar cada figura con el método imprimirCalculo
		
	}//main

	public static void imprimirCalculo(Calculadora t) {
		System.out.println(t);
		System.out.println("+========================================");
		System.out.println("|El área de ["+t.getName()+"] es: " + t.calcularArea() + 
				"\n" + "|El perímetro de ["+t.getName()+"] es: " + t.calcularPerimetro());
		System.out.println("+========================================");
	}//imprimirCalculo

}//class testFiguras