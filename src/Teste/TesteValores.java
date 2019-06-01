package Teste;
import org.junit.Test;
import junit.framework.TestCase;

public class TesteValores extends TestCase {

	private Valores val;
	
	protected void setUp() throws Exception {
		super.setUp();
		val = new Valores();
		val.insert(5);
		val.insert(12);
		val.insert(1);
		val.insert(30);
		val.insert(152);
		val.insert(6);
		}
	
	@Test
	public void testInserir() {

		assertEquals(false,val.insert(-10));
	}
	
	@Test
	public void testDelete() {
		assertEquals(0, val.delete(3));
	}
	
	@Test
	public void testMean() {
		assertEquals(10.0, val.mean());
	}
	
	@Test
	public void testSize() {
		assertEquals(5, val.size());
	}
	
	@Test
	public void testGreater() {
		assertEquals(8, val.greater());
	}
	
	@Test
	public void testLower() {
		assertEquals(1, val.lower());
	}
}
