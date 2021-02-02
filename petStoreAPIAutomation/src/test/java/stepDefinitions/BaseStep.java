package stepDefinitions;



import apiEngine.*;
import cucumberContexts.ScenarioContext;
import cucumberContexts.TestContext;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class BaseStep {
	private EndPoints endPoints;
	private UpdateEndPoints updateEndPoints;
    private ScenarioContext scenarioContext;
    public static final Logger logger = Logger.getLogger(BaseStep.class);
 
    public BaseStep(TestContext testContext) {
    	PropertyConfigurator.configure("configs/log4j.properties");
    	endPoints = testContext.getEndPoints();
    	updateEndPoints = testContext.getUpdateEndPoints();
    	scenarioContext = testContext.getScenarioContext();
    }
 
    public EndPoints getEndPoints() {
        return endPoints;
    }
    public UpdateEndPoints getUpdateEndPoints() {
        return updateEndPoints;
    }
    public ScenarioContext getScenarioContext() {
        return scenarioContext;
    }
    
    
}
