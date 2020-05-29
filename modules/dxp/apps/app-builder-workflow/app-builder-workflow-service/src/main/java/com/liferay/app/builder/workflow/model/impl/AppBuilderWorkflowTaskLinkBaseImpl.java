/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.liferay.app.builder.workflow.model.impl;

import com.liferay.app.builder.workflow.model.AppBuilderWorkflowTaskLink;
import com.liferay.app.builder.workflow.service.AppBuilderWorkflowTaskLinkLocalServiceUtil;

/**
 * The extended model base implementation for the AppBuilderWorkflowTaskLink service. Represents a row in the &quot;AppBuilderWorkflowTaskLink&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AppBuilderWorkflowTaskLinkImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AppBuilderWorkflowTaskLinkImpl
 * @see AppBuilderWorkflowTaskLink
 * @generated
 */
public abstract class AppBuilderWorkflowTaskLinkBaseImpl
	extends AppBuilderWorkflowTaskLinkModelImpl
	implements AppBuilderWorkflowTaskLink {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a app builder workflow task link model instance should use the <code>AppBuilderWorkflowTaskLink</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			AppBuilderWorkflowTaskLinkLocalServiceUtil.
				addAppBuilderWorkflowTaskLink(this);
		}
		else {
			AppBuilderWorkflowTaskLinkLocalServiceUtil.
				updateAppBuilderWorkflowTaskLink(this);
		}
	}

}