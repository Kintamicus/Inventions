package invention.api.notes;

import invention.api.techniques.ITechnique;

import java.util.ArrayList;
import java.util.List;

public interface ILogBook {
	List<ILogBookTab> entries = new ArrayList<ILogBookTab>();
	
	public void addEntry(ILogBookTab entry);
	public boolean hasTechnique(ITechnique technique);

}
