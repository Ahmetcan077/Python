package tr.edu.medipol.yazilimaraclari.ahmetcansönmez;

public class MuhasebeProgrami {


	public static void main(String[] args) {
		System.out.println(ucretHesapla(10, 25));
	}

		public static int ucretHesapla(int calisilanSaat, int saatlikUcret) {
		return calisilanSaat * saatlikUcret;
	}


	}
