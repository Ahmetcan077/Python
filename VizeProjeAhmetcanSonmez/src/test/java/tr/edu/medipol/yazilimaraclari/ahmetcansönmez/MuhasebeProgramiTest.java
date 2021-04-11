package tr.edu.medipol.yazilimaraclari.ahmetcansönmez;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.*;

public class MuhasebeProgramiTest {

		MuhasebeProgrami testInstance = new MuhasebeProgrami();
		
		public void testMuhasebeProgrami_hesapla(){

			int hesap = MuhasebeProgrami.ucretHesapla(10, 25);
	
			if(hesap != 250) {
				fail("hata");
			}
				
	}

}
