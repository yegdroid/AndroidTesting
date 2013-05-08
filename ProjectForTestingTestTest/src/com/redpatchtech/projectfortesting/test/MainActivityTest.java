package com.redpatchtech.projectfortesting.test;

import junit.framework.Assert;

import com.jayway.android.robotium.solo.Solo;
import com.redpatchtech.projectfortesting.MainActivity;

import android.test.ActivityInstrumentationTestCase2;
@SuppressWarnings("unchecked")
public class MainActivityTest extends
		ActivityInstrumentationTestCase2 {

	private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME="com.redpatchtech.projectfortesting.MainActivity"; 
	private static Class launcherActivityClass;
	static{
		try{
			launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME); 
		} 
		catch (ClassNotFoundException e)
		{
			throw new RuntimeException(e);
		} 
	}
	
	
	private Solo solo;
	
	public MainActivityTest() throws ClassNotFoundException {
		
		super(launcherActivityClass);
		
	}
	
	@Override
	protected void setUp() throws Exception 
	{
		solo = new Solo(getInstrumentation(),getActivity()); 
	}

	public void testPreferenceIsSaved() throws Exception {

		
		
		solo.clickOnButton("Button");
		
		Assert.assertTrue(solo.searchText("Clicked"));
          
}

@Override
public void tearDown() throws Exception {
  solo.finishOpenedActivities();
}
}
