package invention.core.items;


public class WritingUtensil extends InventionItem{
	
	public WritingUtensil(String name, int maxUses) {
		setUnlocalizedName(name);
		setMaxDamage(maxUses);
	}

}
