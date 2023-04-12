package rf.com.tienda;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import rf.tienda.util.Validator;

@SpringBootTest
class DaaTiendaIncienso2023ApplicationTests {

	private static Validator va;
	@BeforeAll
	static void setUpBeforeClass()
	{
		va=new Validator();
	}
	
	@Test
	void isAlfanumericTest()
	{
		String prueba1="123ased6";
		String prueba2="AEed123ase";
		String prueba3="@";
		assertEquals(va.isAlfanumeric(prueba1),true);
		assertEquals(va.isAlfanumeric(prueba2),true);
		assertEquals(va.isAlfanumeric(prueba3),false);


	}
	@Test
	void isVacioTest()
	{
		String prueba1="123ased";
		String prueba2="";
		String prueba3=null;

		assertEquals(va.isVacio(prueba1),false);
		assertEquals(va.isVacio(prueba2),true);
		assertEquals(va.isVacio(prueba3),true);


	}
	
	
	@Test
	void cumplePhoneNumberTest()
	{
		String telefono1="968123456789";
		String telefono2="968123";
		String telefono3="A123hyt234";
		String telefono4="968 123 456";

		assertEquals(va.cumplePhoneNumber(telefono1),true);
		assertEquals(va.cumplePhoneNumber(telefono2),false);
		assertEquals(va.cumplePhoneNumber(telefono3),false);
		assertEquals(va.cumplePhoneNumber(telefono4),true);

	

	}
	
	
	@Test
	void isEmailValidoTest()
	{
		
		String email1="juasgh@hotmail.com";
		String email2="juasgh@hotmail2.subdominio.com";
		String email3="juasgh@hotmail..com";
		String email4="juasgh@hotmail.c";
		assertEquals(va.isEmailValido(email1),true);
		assertEquals(va.isEmailValido(email2),true);
		assertEquals(va.isEmailValido(email3),false);
		assertEquals(va.isEmailValido(email4),false);




		
		
	}
	
	@Test
	void cumpleDNI()
	{
		String dni1="34.876.564-P";
		String dni2="76.876.564-f";
		String dni3="76.876.564-X";
		String dni4="76.876.564z";
		//comprobamos con un dni que tiene más de 12 dígitos
		String dni5="767.876.564-z";

		assertEquals(va.cumpleDNI(dni1),true);
		assertEquals(va.cumpleDNI(dni2),true);
		assertEquals(va.cumpleDNI(dni3),false);
		assertEquals(va.cumpleDNI(dni4),false);
		assertEquals(va.cumpleDNI(dni5),false);


		
		
		
	}
	
	@Test
	void cumpleRangoTest()
	{
		
		assertEquals(va.cumpleRango(10, 5, 11), true);
		assertEquals(va.cumpleRango(10.7, 5, 11), true);
		assertEquals(va.cumpleRango(10, 9, 11), true);
		assertEquals(va.cumpleRango(10.7, 9, 11), true);
		assertEquals(va.cumpleRango(10, 5, 10), false);
		assertEquals(va.cumpleRango(10, 10, 20), false);


		
	}
	
	@Test
	void cumpleLongitudMinTest()
	{
		assertEquals(va.cumpleLongitudMin("hola", 4), true);
		assertEquals(va.cumpleLongitudMin("hola", 3), true);
		assertEquals(va.cumpleLongitudMin("afortunado", 20), false);
		assertEquals(va.cumpleLongitudMin("afortunado", 11), false);

		
		
	}
	
	@Test
	void cumpleLongitudMaxTest()
	{
		assertEquals(va.cumpleLongitudMax("hola", 4), true);
		assertEquals(va.cumpleLongitudMax("hola", 5), true);
		assertEquals(va.cumpleLongitudMax("hola", 3), false);
		assertEquals(va.cumpleLongitudMax("hola", 2), false);

		
		
		
	}
	
	
	@Test
	void cumpleLongitudTest()
	{
		assertEquals(va.cumpleLongitud("hola", 3, 5), true);
		assertEquals(va.cumpleLongitud("hola", 4, 4), true);
		assertEquals(va.cumpleLongitud("hola", 5, 8), false);
		assertEquals(va.cumpleLongitud("hola", 2, 3), false);


		
		
	}
	
	@Test
	void valDateMinTest()
	{
		//creamos la primera fecha
		LocalDate fecha1=LocalDate.of(2023,4,11);
		LocalDate fecha2=LocalDate.of(2023,4,10);
		assertEquals(va.valDateMin(fecha1, fecha2), true);
		assertEquals(va.valDateMin(fecha2, fecha1), false);
		//que pasa si le meto la misma fecha
		assertEquals(va.valDateMin(fecha1, fecha1), false);

		
		
		
	}
	
	@Test
	void valDateMaxTest()
	{
		//creamos la primera fecha
		LocalDate fecha1=LocalDate.of(2023,4,11);
		LocalDate fecha2=LocalDate.of(2023,4,10);
		assertEquals(va.valDateMax(fecha2, fecha1), true);
		assertEquals(va.valDateMax(fecha1, fecha2), false);
		//que pasa si le meto la misma fecha
		assertEquals(va.valDateMax(fecha1, fecha1), false);

		
		
		
	}
	
	
	@Test
	void esFechaValida()
	{
		String fecha1="10/12/2010";
		String fecha2="00/00/0000";
		String fecha3="01/13/1020";

		assertEquals(va.esFechaValida(fecha1), true);
		assertEquals(va.esFechaValida(fecha2), false);
		assertEquals(va.esFechaValida(fecha3), false);
		

		
		
	}
	
	
	@Test
	void esPasswordValidaTest()
	{
		String pass1="Legalidad2022@";
		String pass2="pass@";
		String pass3="123456";
		assertEquals(va.esPasswordValida(pass1), true);
		assertEquals(va.esPasswordValida(pass2), false);
		assertEquals(va.esPasswordValida(pass3), false);

		
		
		
	}
	
	
	@Test
	void esIdProductoValidoTest()
	{
		String cod1="ADE12";
		String cod2="asE12";
		String cod3="AEE122";
		assertEquals(va.esIdProductoValido(cod1), true);
		assertEquals(va.esIdProductoValido(cod2), false);
		assertEquals(va.esIdProductoValido(cod3), false);

			
	}
	
	
	@Test
	void esDEscripcionValidaTest()
	{
		String desc1="son unas pocas palabras";
		String desc2="hola";
		String desc3="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque condimentum semper venenatis. Nulla facilisi. Nunc faucibus sollicitudin libero, vel consectetur elit tristique et. Morbi euismod bibendum elit, a elementum erat fermentum ac. Integer a nisi et nulla venenatis pharetra. In venenatis tempor dolor, at feugiat libero finibus vel. Duis tincidunt felis et rhoncus vestibulum. Fusce ultricies ante quam, in malesuada sapien lacinia in. Nullam maximus, elit id sagittis consequat, dolor arcu cursus elit, et eleifend elit nisl at orci. Pellentesque pellentesque volutpat mauris ac venenatis. Sed suscipit ante id diam bibendum, nec sollicitudin turpis hendrerit. Fusce vel libero vitae velit auctor bibendum. Nulla facilisi.";
		assertEquals(va.esDEscripcionValida(desc1), true);
		assertEquals(va.esDEscripcionValida(desc2), false);
		assertEquals(va.esDEscripcionValida(desc3), false);

	}
	
	
	@Test
	void esDesLargaValidaTest()
	{
		String desc1="son unas pocas palabras";
		String desc2="hola";
		String desc3="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque condimentum semper venenatis. Nulla facilisi. Nunc faucibus sollicitudin libero, vel consectetur elit tristique et. Morbi euismod bibendum elit, a elementum erat fermentum ac. Integer a nisi et nulla venenatis pharetra. In venenatis tempor dolor, at feugiat libero finibus vel. Duis tincidunt felis et rhoncus vestibulum. Fusce ultricies ante quam, in malesuada sapien lacinia in. Nullam maximus, elit id sagittis consequat, dolor arcu cursus elit, et eleifend elit nisl at orci. Pellentesque pellentesque volutpat mauris ac venenatis. Sed suscipit ante id diam bibendum, nec sollicitudin turpis hendrerit. Fusce vel libero vitae velit auctor bibendum. Nulla facilisi.";
		assertEquals(va.esDesLargaValida(desc1), true);
		assertEquals(va.esDesLargaValida(desc2), false);
		assertEquals(va.esDesLargaValida(desc3), true);
	
			
		
		
	}
	
	
	@Test
	void proPRecioValidoTest()
	{
		double precio=99.99;
		double precio2=1.01;
		double precio3=100.23;
		double precio4=0.00;
		assertEquals(va.proPRecioValido(precio), true);
		assertEquals(va.proPRecioValido(precio2), true);
		assertEquals(va.proPRecioValido(precio3), false);
		assertEquals(va.proPRecioValido(precio4), false);

	
		
		
	}

	
	@Test
	void proFecReposTest()
	{
		LocalDate fecha1=LocalDate.of(2023, 10, 2);
		LocalDate fecha2=LocalDate.of(2023, 2, 2);
		LocalDate fecha3=LocalDate.of(2023, 4, 11);
		assertEquals(va.proFecRepos(fecha1), true);
		assertEquals(va.proFecRepos(fecha2), false);
		assertEquals(va.proFecRepos(fecha3), false);

		
		

		
		
		
	}
	
}
