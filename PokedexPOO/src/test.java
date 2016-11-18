import classe.*;
import pokemon.*;
import categoria.*;
public class test {

	public static void main(String[] args)
	{
		Tipo[] t = new Tipo[2];
		t[0]= new Grama("Grama");
		t[1]= new Voador("Voador");
		Categoria c = new Seed("SEED");
		Pokemon p = new Pokemon(1,"Bubasalrur",((float)10.0),((float)1.0),t,c);
		System.out.println(p);
	}
}
