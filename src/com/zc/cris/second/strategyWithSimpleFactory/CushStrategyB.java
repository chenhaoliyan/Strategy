package com.zc.cris.second.strategyWithSimpleFactory;

public class CushStrategyB implements CushStrategy {

	@Override
	public Double returnCush(Double money) {
		
		//打八折
		return money*0.8;
	}

	

}
