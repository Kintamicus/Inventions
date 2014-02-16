package invention.api.experiments;

import invention.api.techniques.ITechnique;
import invention.core.experiments.ExperimentType;

public interface IExperiment {
	
	public String getUnlocalizedName();
	public String getUnlocalizedDiscription();
	
	public ExperimentType getExperimentType();
	
	public ITechnique requiredTechnique();
}
