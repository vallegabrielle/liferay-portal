/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.layout.page.template.admin.web.internal.importer;

import com.liferay.layout.page.template.importer.PortletPreferencesPortletConfigurationImporter;

import java.util.Map;

import org.osgi.service.component.annotations.Component;

/**
 * @author Jürgen Kappler
 */
@Component(service = PortletPreferencesPortletConfigurationImporter.class)
public class PortletPreferencesPortletConfigurationImporterImpl
	implements PortletPreferencesPortletConfigurationImporter {

	@Override
	public void importPortletConfiguration(
		long plid, String portletId, Map<String, Object> portletConfiguration) {
	}

}