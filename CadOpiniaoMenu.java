
public abstract class CadOpiniaoMenu {
	
	private String itemMenu;

	public CadOpiniaoMenu(String itemMenu) {
		super();
		this.itemMenu = itemMenu;
	}
	
	abstract public void Sabor(int notaSabor);
	abstract public void Higiene(int notaHigiene);
	abstract public void Variedade(int notaVariedade);

	public String getItemMenu() {
		return itemMenu;
	}

	public void setItemMenu(String itemMenu) {
		this.itemMenu = itemMenu;
	}
	
	

}
