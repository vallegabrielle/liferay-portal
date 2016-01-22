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

package com.liferay.portal.workflow.kaleo.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.util.Accessor;
import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the KaleoTimerInstanceToken service. Represents a row in the &quot;KaleoTimerInstanceToken&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see KaleoTimerInstanceTokenModel
 * @see com.liferay.portal.workflow.kaleo.model.impl.KaleoTimerInstanceTokenImpl
 * @see com.liferay.portal.workflow.kaleo.model.impl.KaleoTimerInstanceTokenModelImpl
 * @generated
 */
@ProviderType
@ImplementationClassName("com.liferay.portal.workflow.kaleo.model.impl.KaleoTimerInstanceTokenImpl")
public interface KaleoTimerInstanceToken extends KaleoTimerInstanceTokenModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoTimerInstanceTokenImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<KaleoTimerInstanceToken, Long> KALEO_TIMER_INSTANCE_TOKEN_ID_ACCESSOR =
		new Accessor<KaleoTimerInstanceToken, Long>() {
			@Override
			public Long get(KaleoTimerInstanceToken kaleoTimerInstanceToken) {
				return kaleoTimerInstanceToken.getKaleoTimerInstanceTokenId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<KaleoTimerInstanceToken> getTypeClass() {
				return KaleoTimerInstanceToken.class;
			}
		};

	public com.liferay.portal.workflow.kaleo.model.KaleoInstanceToken getKaleoInstanceToken()
		throws com.liferay.portal.kernel.exception.PortalException;

	public com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken getKaleoTaskInstanceToken();

	public com.liferay.portal.workflow.kaleo.model.KaleoTimer getKaleoTimer()
		throws com.liferay.portal.kernel.exception.PortalException;
}