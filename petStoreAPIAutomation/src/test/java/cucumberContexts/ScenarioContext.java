package cucumberContexts;

import java.util.HashMap;
import java.util.Map;

import enums.Context;

/*
 * This class contains the logic to setup the Context between scenarios
 * If scenarios are dependent to execute the steps, then they can use the same context to share data
 */
public class ScenarioContext {
	private Map<String, Object> scenarioContext;

	public ScenarioContext() {
		scenarioContext = new HashMap<String, Object>();
	}

	public void setContext(Context key, Object value) {
		scenarioContext.put(key.toString(), value);
	}

	public Object getContext(Context key) {
		return scenarioContext.get(key.toString());
	}

	public Boolean isContains(Context key) {
		return scenarioContext.containsKey(key.toString());
	}
}
