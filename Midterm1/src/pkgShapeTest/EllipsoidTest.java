package pkgShapeTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgShape.Ellipsoid;

public class EllipsoidTest {

	@Test
	public void Ellipsoidtest() {
		Ellipsoid ellip = new Ellipsoid(10,20,25);
		
		assertEquals(20943.95,ellip.Volume(),0.01);
		
	}

}
