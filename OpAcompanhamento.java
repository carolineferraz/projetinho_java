
public class OpAcompanhamento extends CadOpiniaoMenu{
	
//	private String nomeItem;

	public OpAcompanhamento() {
		super("Opinião sobre os acompanhamentos do Menu!");
//		this.nomeItem = nomeItem;
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

//	public String getNomeItem() {
//		return nomeItem;
//	}
//
//	public void setNomeItem(String nomeItem) {
//		this.nomeItem = nomeItem;
//	}
	
	

}
