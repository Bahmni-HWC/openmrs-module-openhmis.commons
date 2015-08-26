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
package org.openmrs.module.openhmis.commons.api.entity.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.openmrs.OpenmrsObject;
import org.openmrs.module.openhmis.commons.api.entity.model.BaseCustomizableObject;
import org.openmrs.module.openhmis.commons.api.entity.security.IObjectAuthorizationPrivileges;

// @formatter:off
/**
 * Base data service for {@link org.openmrs.module.openhmis.commons.api.entity.model.BaseCustomizableObject} models.
 * @param <E> The model class.
 */
public abstract class BaseCustomizableObjectDataServiceImpl<E extends BaseCustomizableObject<?>,
			P extends IObjectAuthorizationPrivileges>
		extends BaseObjectDataServiceImpl<E, P> {
// @formatter:on
	@Override
	@SuppressWarnings("unchecked")
	protected Collection<? extends OpenmrsObject> getRelatedObjects(E entity) {
		Collection<? extends OpenmrsObject> result = super.getRelatedObjects(entity);
		
		if (result == null) {
			result = new ArrayList<OpenmrsObject>();
		}
		
		Collection attributes = entity.getAttributes();
		if (attributes != null && attributes.size() > 0) {
			result.addAll(attributes);
		}
		
		return result;
	}
}
