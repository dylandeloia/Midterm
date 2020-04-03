package pkgShapeTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgShape.Ellipse;

public class EllipseTest {
 
	@Test
	public void Ellipsetest() {
		Ellipse ell = new Ellipse(10,20);
		
		assertEquals(628.32,ell.Area(),0.01);
	}

}
