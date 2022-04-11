
public class OpSuco extends CadOpiniaoMenu {
	
	public OpSuco()
	{
		super("Opiniao sobre os sucos do Menu!");
	}
	
	@Override
	public void Sabor(int notaSabor) {
		System.out.println("\nNota para o sabor: "+notaSabor);
		
	}

	@Override
	public void Higiene(int notaHigiene) {
		System.out.println("\nNota para a higiene: "+notaHigiene);
		
	}

	@Override
	public void Variedade(int notaVariedade) {
		System.out.println("\nNota para a variedade disponível: "+notaVariedade);
		
	}

	

}
