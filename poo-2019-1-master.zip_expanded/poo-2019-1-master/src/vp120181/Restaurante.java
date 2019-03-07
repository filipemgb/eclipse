package vp120181;
import java.util.ArrayList;
import java.util.List;
public class Restaurante{
	List<PratoPrincipal> pratoprincipal = new ArrayList <PratoPrincipal>();
	
	
	String sobremesa;
	String mesa;
	String garcom;
	
	public Restaurante (String pratoprincipal, String sobremesa, String mesa, String garcom) {
		this.pratoprincipal = pratoprincipal;
		this.sobremesa = sobremesa;
		this.mesa = mesa;
		this.garcom = garcom;
	}

}
