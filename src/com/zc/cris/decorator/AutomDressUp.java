package com.zc.cris.decorator;


public class AutomDressUp extends DressUp{

	@Override
	public void show() {
		System.out.println("穿秋装");
		person.show();
	}
}
