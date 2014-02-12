package invention.api.notes;

import invention.api.techniques.ITechnique;

import java.util.ArrayList;
import java.util.List;

public interface ILogBook {
	List<ILogBookEntry> entries = new ArrayList<ILogBookEntry>();
	
	public void addEntry(ILogBookEntry entry);
	public boolean hasTechnique(ITechnique technique);

}
