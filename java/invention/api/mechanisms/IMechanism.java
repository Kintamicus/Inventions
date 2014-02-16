package invention.api.mechanisms;

import invention.api.techniques.ITechnique;

import java.util.List;

public interface IMechanism {
	
	public String getUnlocalizedName();
	public List<ITechnique> getRequiredTechniques();

}
