/*
 * The contents of this file are subject to the OpenMRS Public License
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.openhmis.commons.api;

import java.util.EventListener;

import javax.swing.event.EventListenerList;

/**
 * An {@link EventListenerList} that provides a 'fire' helper method.
 */
//public class FireableEventListenerList extends EventListenerList {
public class FireableEventListenerList {
	public <T extends EventListener> void fire(Class<T> cls, EventRaiser<T> eventRaiser) {
		//		T[] listeners = this.getListeners(cls);
		//
		//		for (T listener : listeners) {
		//			eventRaiser.fire(listener);
		//		}
	}
}
