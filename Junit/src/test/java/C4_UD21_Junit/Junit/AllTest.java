package C4_UD21_Junit.Junit;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AllTest {

	Geometria obj[] = new Geometria[10];
	
	@BeforeEach
	public void before() {
		
		obj[0] = new Geometria();
		
		for (int i = 1; i < obj.length; i++) {
			
			obj[i] = new Geometria(i);
					
		}
		
	}
	
	@Test
	public void TestAreaCuadrado() {
		
		int resultado = obj[0].areaCuadrado(3);
		int waiting = 9;
		assertEquals(resultado, waiting);
		
	}
	
	@Test
	public void TestAreaPentagono() {
		
		int resultado = obj[0].areaPentagono(7, 4);
		int waiting = 14;
		assertEquals(resultado, waiting);
		
	}
	
	@Test
	public void TestAreaRectangulo() {
		
		int resultado = obj[0].areaRectangulo(6, 3);
		int waiting = 18;
		assertEquals(resultado, waiting);
		
	}
	
	@Test
	public void TestAreaCirculo() {
		
		double resultado = obj[0].areaCirculo(10);
		double waiting = 314.16;
		int delta = 1;
		assertEquals(resultado, waiting, delta);
		
	}
	
	@Test
	public void TestAreaRombo() {
		
		int resultado = obj[0].areaRombo(5, 6);
		int waiting = 15;
		assertEquals(resultado, waiting);
		
	}
	
	@Test
	public void TestAreaRomboide() {
		
		int resultado = obj[0].areaRomboide(5, 6);
		int waiting = 30;
		assertEquals(resultado, waiting);
		
	}
	
	@Test
	public void TestAreaTrapecio() {
		
		int resultado = obj[0].areaTrapecio(9, 1, 4);
		int waiting = 20;
		assertEquals(resultado, waiting);
		
	}
	
	@Test
	public void TestAreaTriangulo() {
		
		int resultado = obj[0].areaTriangulo(2, 4);
		int waiting = 4;
		assertEquals(resultado, waiting);
		
	}
	
	@Test
	public void TestGetArea() {
		
		double resultado = obj[0].getArea();
		double waiting = 0;
		assertEquals(resultado, waiting);
		
	}
	
	@Test
	public void TestToString() {
		
		String resultado = obj[0].toString();
		String waiting = "Geometria [id=9, nom=Default, area=" + obj[0].getArea() + "]";
		assertEquals(resultado, waiting);
		
	}
	
	@Test
	public void TestGetNom() {
		
		String resultado = obj[0].getNom();
		String waiting = "Default";
		assertEquals(resultado, waiting);
		
	}
	
	@Test
	public void TestGetId() {
		
		int resultado = obj[0].getId();
		int waiting = 9;
		assertEquals(resultado, waiting);
		
	}
	
	@Test
	public void TestSetArea() {
		
		obj[0].setArea(2);
		int waiting = 2;
		assertEquals(obj[0].getArea(), waiting);
		
	}
	
	@Test
	public void TestSetId() {
		
		obj[0].setId(2);
		int waiting = 2;
		assertEquals(obj[0].getId(), waiting);
		
	}
	
	@Test
	public void TestSetNom() {
		
		obj[0].setNom("Hola");
		String waiting = "Hola";
		assertEquals(obj[0].getNom(), waiting);
		
	}
	
	public void testFailure() throws Exception {
		
	    fail();
	    
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void TesAutoBot() throws AWTException {
		
		Calculadora calculadora = new Calculadora();
		
		//Inicializamos la calculadora
		calculadora.main(null);
		
		//Creamos un bot que movera el ratón
		Robot bot = new Robot();
		
		//Ponemos un delay de 0,5 segundos para que se vea lo que pasa
		bot.setAutoDelay(100);
		
		//Centramos en mouse en una pantalla FullHD, a mi me salia la ventana de java en sea zona
		bot.mouseMove(1000, 560);
		
		//Clicamos un numero
		bot.mousePress(InputEvent.BUTTON1_MASK);
		bot.mouseRelease(InputEvent.BUTTON1_MASK);
		
		//Clicamos un operador
		bot.mouseMove(1080, 560);
		bot.mousePress(InputEvent.BUTTON1_MASK);
		bot.mouseRelease(InputEvent.BUTTON1_MASK);
		
		//Clicamos otro numero
		bot.mouseMove(1000, 620);
		bot.mousePress(InputEvent.BUTTON1_MASK);
		bot.mouseRelease(InputEvent.BUTTON1_MASK);
		
		//Terminamos con el igual
		bot.mouseMove(1000, 680);
		bot.mousePress(InputEvent.BUTTON1_MASK);
		bot.mouseRelease(InputEvent.BUTTON1_MASK);
		
		//Otro igual para subir el porcentaje, sabiendo que no hara nada
		bot.mousePress(InputEvent.BUTTON1_MASK);
		bot.mouseRelease(InputEvent.BUTTON1_MASK);
		
		//Ponemos un número negativo para saber que funciona esa parte
		bot.mouseMove(1080, 620);
		bot.mousePress(InputEvent.BUTTON1_MASK);
		bot.mouseRelease(InputEvent.BUTTON1_MASK);
		bot.mouseMove(920, 620);
		bot.mousePress(InputEvent.BUTTON1_MASK);
		bot.mouseRelease(InputEvent.BUTTON1_MASK);
		
	}
	

}
