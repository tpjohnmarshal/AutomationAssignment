package cucumberContexts;

import apiEngine.EndPoints;
import apiEngine.UpdateEndPoints;
import dataProvider.ConfigReader;
import enums.Context;

/*
 * This class contains the logic to setup the Context between Tests
 * If Tests are dependent to execute the steps, then they can use the same context to share data
 */
public class TestContext {
	private EndPoints endPoints = new EndPoints(ConfigReader.getInstance().getBaseUrl(), ConfigReader.getInstance().getApiKey());
	private UpdateEndPoints updateEndPoints = new UpdateEndPoints(ConfigReader.getInstance().getBaseUrl());
	private ScenarioContext scenarioContext;

	public TestContext() {
		scenarioContext = new ScenarioContext();
		scenarioContext.setContext(Context.API_KEY,  ConfigReader.getInstance().getApiKey());
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
