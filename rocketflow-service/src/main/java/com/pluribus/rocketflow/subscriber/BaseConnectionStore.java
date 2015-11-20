package com.pluribus.rocketflow.subscriber;

import com.pluribus.data.entity.ConnectionEntity;
import com.pluribus.rocketflow.core.EventObserver;
import com.pluribus.rocketflow.event.ConnectionEventBundle;

public abstract class BaseConnectionStore extends EventObserver<ConnectionEventBundle> {

	public BaseConnectionStore() {
		super();
	}

	
	protected boolean compare(ConnectionEntity src, ConnectionEntity dst) {
		if (!src.getFlowLocator().equals(dst.getFlowLocator())) {
			return false;
		}
		
		return src.getCurState().equals(dst.getCurState());
	}

}