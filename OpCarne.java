
public class OpCarne extends CadOpiniaoMenu {
	
//	private String nomeItem;

	public OpCarne() {
		super("Opini�o sobre as Carnes do Menu!");
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
		System.out.println("\nNota para a variedade dispon�vel: "+notaVariedade);
		
	}

//	public String getNomeItem() {
//		return nomeItem;
//	}
//
//	public void setNomeItem(String nomeItem) {
//		this.nomeItem = nomeItem;
//	}
	
	

}
