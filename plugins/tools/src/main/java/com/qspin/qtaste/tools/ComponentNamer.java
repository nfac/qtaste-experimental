package com.qspin.qtaste.tools;

import java.awt.Component;
import java.util.HashMap;
import java.util.Map;

public final class ComponentNamer extends AbstractGUIAnalyzer {

	public ComponentNamer()
	{
		super();
		mMapChildIndex = new HashMap<Component, Integer>();
		mMapName = new HashMap<Component, String>();
	}
	
	public synchronized int setNameToComponent(Component pComponent, int idx)
	{
		if (pComponent.getName() == null || pComponent.getName().isEmpty()) {
//			pComponent.setName(pComponent.getParent().getName() + "_Component_" + idx);
			pComponent.setName(getChildName(pComponent.getParent()));
			System.out.println("set component name to : " + pComponent.getName());
			idx += 1;
		} else {
			System.out.println("component name is : " + pComponent.getName());
		}
		return idx;
	}
	
	private String getChildName(Component pComponent)
	{
		if ( pComponent == null )
		{
			return "NoParent_"+Integer.toString(mNullParentIndex++);
		}
		if ( !mMapChildIndex.containsKey(pComponent) )
		{
			mMapChildIndex.put(pComponent, 0);
			mMapName.put(pComponent, "parent"+mParentIndex+"_child");
			mParentIndex++;
		}
		int childIndex = mMapChildIndex.get(pComponent);
		mMapChildIndex.put(pComponent, childIndex+1);
		return mMapName.get(pComponent)+childIndex;
	}
	
	private Map<Component, Integer> mMapChildIndex;
	private Map<Component, String> mMapName;
	private int mNullParentIndex = 0;
	private int mParentIndex = 0;
	@Override
	protected boolean preProcess() {
		return true;
	}

	@Override
	protected void processComponent(Component pComponent) {
		setNameToComponent(pComponent, 0);
	}

	@Override
	protected boolean postProcess() {
		return true;
	}
}