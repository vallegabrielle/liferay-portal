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

package com.liferay.commerce.discount.model.impl;

import com.liferay.commerce.discount.model.CommerceDiscountCommerceAccountGroupRel;
import com.liferay.commerce.discount.model.CommerceDiscountCommerceAccountGroupRelModel;
import com.liferay.commerce.discount.model.CommerceDiscountCommerceAccountGroupRelSoap;
import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the CommerceDiscountCommerceAccountGroupRel service. Represents a row in the &quot;CDiscountCAccountGroupRel&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>CommerceDiscountCommerceAccountGroupRelModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CommerceDiscountCommerceAccountGroupRelImpl}.
 * </p>
 *
 * @author Marco Leo
 * @see CommerceDiscountCommerceAccountGroupRelImpl
 * @generated
 */
@JSON(strict = true)
public class CommerceDiscountCommerceAccountGroupRelModelImpl
	extends BaseModelImpl<CommerceDiscountCommerceAccountGroupRel>
	implements CommerceDiscountCommerceAccountGroupRelModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a commerce discount commerce account group rel model instance should use the <code>CommerceDiscountCommerceAccountGroupRel</code> interface instead.
	 */
	public static final String TABLE_NAME = "CDiscountCAccountGroupRel";

	public static final Object[][] TABLE_COLUMNS = {
		{"CDiscountCAccountGroupRelId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"commerceDiscountId", Types.BIGINT},
		{"commerceAccountGroupId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("CDiscountCAccountGroupRelId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("commerceDiscountId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("commerceAccountGroupId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table CDiscountCAccountGroupRel (CDiscountCAccountGroupRelId LONG not null primary key,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,commerceDiscountId LONG,commerceAccountGroupId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table CDiscountCAccountGroupRel";

	public static final String ORDER_BY_JPQL =
		" ORDER BY commerceDiscountCommerceAccountGroupRel.createDate DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY CDiscountCAccountGroupRel.createDate DESC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(
		com.liferay.commerce.discount.service.util.ServiceProps.get(
			"value.object.entity.cache.enabled.com.liferay.commerce.discount.model.CommerceDiscountCommerceAccountGroupRel"),
		true);

	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(
		com.liferay.commerce.discount.service.util.ServiceProps.get(
			"value.object.finder.cache.enabled.com.liferay.commerce.discount.model.CommerceDiscountCommerceAccountGroupRel"),
		true);

	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(
		com.liferay.commerce.discount.service.util.ServiceProps.get(
			"value.object.column.bitmask.enabled.com.liferay.commerce.discount.model.CommerceDiscountCommerceAccountGroupRel"),
		true);

	public static final long COMMERCEACCOUNTGROUPID_COLUMN_BITMASK = 1L;

	public static final long COMMERCEDISCOUNTID_COLUMN_BITMASK = 2L;

	public static final long CREATEDATE_COLUMN_BITMASK = 4L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static CommerceDiscountCommerceAccountGroupRel toModel(
		CommerceDiscountCommerceAccountGroupRelSoap soapModel) {

		if (soapModel == null) {
			return null;
		}

		CommerceDiscountCommerceAccountGroupRel model =
			new CommerceDiscountCommerceAccountGroupRelImpl();

		model.setCommerceDiscountCommerceAccountGroupRelId(
			soapModel.getCommerceDiscountCommerceAccountGroupRelId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setCommerceDiscountId(soapModel.getCommerceDiscountId());
		model.setCommerceAccountGroupId(soapModel.getCommerceAccountGroupId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<CommerceDiscountCommerceAccountGroupRel> toModels(
		CommerceDiscountCommerceAccountGroupRelSoap[] soapModels) {

		if (soapModels == null) {
			return null;
		}

		List<CommerceDiscountCommerceAccountGroupRel> models =
			new ArrayList<CommerceDiscountCommerceAccountGroupRel>(
				soapModels.length);

		for (CommerceDiscountCommerceAccountGroupRelSoap soapModel :
				soapModels) {

			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(
		com.liferay.commerce.discount.service.util.ServiceProps.get(
			"lock.expiration.time.com.liferay.commerce.discount.model.CommerceDiscountCommerceAccountGroupRel"));

	public CommerceDiscountCommerceAccountGroupRelModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _commerceDiscountCommerceAccountGroupRelId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCommerceDiscountCommerceAccountGroupRelId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _commerceDiscountCommerceAccountGroupRelId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return CommerceDiscountCommerceAccountGroupRel.class;
	}

	@Override
	public String getModelClassName() {
		return CommerceDiscountCommerceAccountGroupRel.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<CommerceDiscountCommerceAccountGroupRel, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry
				<String,
				 Function<CommerceDiscountCommerceAccountGroupRel, Object>>
					entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CommerceDiscountCommerceAccountGroupRel, Object>
				attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply(
					(CommerceDiscountCommerceAccountGroupRel)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<CommerceDiscountCommerceAccountGroupRel, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<CommerceDiscountCommerceAccountGroupRel, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(CommerceDiscountCommerceAccountGroupRel)this,
					entry.getValue());
			}
		}
	}

	public Map
		<String, Function<CommerceDiscountCommerceAccountGroupRel, Object>>
			getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map
		<String, BiConsumer<CommerceDiscountCommerceAccountGroupRel, Object>>
			getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function
		<InvocationHandler, CommerceDiscountCommerceAccountGroupRel>
			_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			CommerceDiscountCommerceAccountGroupRel.class.getClassLoader(),
			CommerceDiscountCommerceAccountGroupRel.class, ModelWrapper.class);

		try {
			Constructor<CommerceDiscountCommerceAccountGroupRel> constructor =
				(Constructor<CommerceDiscountCommerceAccountGroupRel>)
					proxyClass.getConstructor(InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException
							reflectiveOperationException) {

					throw new InternalError(reflectiveOperationException);
				}
			};
		}
		catch (NoSuchMethodException noSuchMethodException) {
			throw new InternalError(noSuchMethodException);
		}
	}

	private static final Map
		<String, Function<CommerceDiscountCommerceAccountGroupRel, Object>>
			_attributeGetterFunctions;
	private static final Map
		<String, BiConsumer<CommerceDiscountCommerceAccountGroupRel, Object>>
			_attributeSetterBiConsumers;

	static {
		Map<String, Function<CommerceDiscountCommerceAccountGroupRel, Object>>
			attributeGetterFunctions =
				new LinkedHashMap
					<String,
					 Function
						 <CommerceDiscountCommerceAccountGroupRel, Object>>();
		Map<String, BiConsumer<CommerceDiscountCommerceAccountGroupRel, ?>>
			attributeSetterBiConsumers =
				new LinkedHashMap
					<String,
					 BiConsumer<CommerceDiscountCommerceAccountGroupRel, ?>>();

		attributeGetterFunctions.put(
			"commerceDiscountCommerceAccountGroupRelId",
			new Function<CommerceDiscountCommerceAccountGroupRel, Object>() {

				@Override
				public Object apply(
					CommerceDiscountCommerceAccountGroupRel
						commerceDiscountCommerceAccountGroupRel) {

					return commerceDiscountCommerceAccountGroupRel.
						getCommerceDiscountCommerceAccountGroupRelId();
				}

			});
		attributeSetterBiConsumers.put(
			"commerceDiscountCommerceAccountGroupRelId",
			new BiConsumer<CommerceDiscountCommerceAccountGroupRel, Object>() {

				@Override
				public void accept(
					CommerceDiscountCommerceAccountGroupRel
						commerceDiscountCommerceAccountGroupRel,
					Object commerceDiscountCommerceAccountGroupRelIdObject) {

					commerceDiscountCommerceAccountGroupRel.
						setCommerceDiscountCommerceAccountGroupRelId(
							(Long)
								commerceDiscountCommerceAccountGroupRelIdObject);
				}

			});
		attributeGetterFunctions.put(
			"companyId",
			new Function<CommerceDiscountCommerceAccountGroupRel, Object>() {

				@Override
				public Object apply(
					CommerceDiscountCommerceAccountGroupRel
						commerceDiscountCommerceAccountGroupRel) {

					return commerceDiscountCommerceAccountGroupRel.
						getCompanyId();
				}

			});
		attributeSetterBiConsumers.put(
			"companyId",
			new BiConsumer<CommerceDiscountCommerceAccountGroupRel, Object>() {

				@Override
				public void accept(
					CommerceDiscountCommerceAccountGroupRel
						commerceDiscountCommerceAccountGroupRel,
					Object companyIdObject) {

					commerceDiscountCommerceAccountGroupRel.setCompanyId(
						(Long)companyIdObject);
				}

			});
		attributeGetterFunctions.put(
			"userId",
			new Function<CommerceDiscountCommerceAccountGroupRel, Object>() {

				@Override
				public Object apply(
					CommerceDiscountCommerceAccountGroupRel
						commerceDiscountCommerceAccountGroupRel) {

					return commerceDiscountCommerceAccountGroupRel.getUserId();
				}

			});
		attributeSetterBiConsumers.put(
			"userId",
			new BiConsumer<CommerceDiscountCommerceAccountGroupRel, Object>() {

				@Override
				public void accept(
					CommerceDiscountCommerceAccountGroupRel
						commerceDiscountCommerceAccountGroupRel,
					Object userIdObject) {

					commerceDiscountCommerceAccountGroupRel.setUserId(
						(Long)userIdObject);
				}

			});
		attributeGetterFunctions.put(
			"userName",
			new Function<CommerceDiscountCommerceAccountGroupRel, Object>() {

				@Override
				public Object apply(
					CommerceDiscountCommerceAccountGroupRel
						commerceDiscountCommerceAccountGroupRel) {

					return commerceDiscountCommerceAccountGroupRel.
						getUserName();
				}

			});
		attributeSetterBiConsumers.put(
			"userName",
			new BiConsumer<CommerceDiscountCommerceAccountGroupRel, Object>() {

				@Override
				public void accept(
					CommerceDiscountCommerceAccountGroupRel
						commerceDiscountCommerceAccountGroupRel,
					Object userNameObject) {

					commerceDiscountCommerceAccountGroupRel.setUserName(
						(String)userNameObject);
				}

			});
		attributeGetterFunctions.put(
			"createDate",
			new Function<CommerceDiscountCommerceAccountGroupRel, Object>() {

				@Override
				public Object apply(
					CommerceDiscountCommerceAccountGroupRel
						commerceDiscountCommerceAccountGroupRel) {

					return commerceDiscountCommerceAccountGroupRel.
						getCreateDate();
				}

			});
		attributeSetterBiConsumers.put(
			"createDate",
			new BiConsumer<CommerceDiscountCommerceAccountGroupRel, Object>() {

				@Override
				public void accept(
					CommerceDiscountCommerceAccountGroupRel
						commerceDiscountCommerceAccountGroupRel,
					Object createDateObject) {

					commerceDiscountCommerceAccountGroupRel.setCreateDate(
						(Date)createDateObject);
				}

			});
		attributeGetterFunctions.put(
			"modifiedDate",
			new Function<CommerceDiscountCommerceAccountGroupRel, Object>() {

				@Override
				public Object apply(
					CommerceDiscountCommerceAccountGroupRel
						commerceDiscountCommerceAccountGroupRel) {

					return commerceDiscountCommerceAccountGroupRel.
						getModifiedDate();
				}

			});
		attributeSetterBiConsumers.put(
			"modifiedDate",
			new BiConsumer<CommerceDiscountCommerceAccountGroupRel, Object>() {

				@Override
				public void accept(
					CommerceDiscountCommerceAccountGroupRel
						commerceDiscountCommerceAccountGroupRel,
					Object modifiedDateObject) {

					commerceDiscountCommerceAccountGroupRel.setModifiedDate(
						(Date)modifiedDateObject);
				}

			});
		attributeGetterFunctions.put(
			"commerceDiscountId",
			new Function<CommerceDiscountCommerceAccountGroupRel, Object>() {

				@Override
				public Object apply(
					CommerceDiscountCommerceAccountGroupRel
						commerceDiscountCommerceAccountGroupRel) {

					return commerceDiscountCommerceAccountGroupRel.
						getCommerceDiscountId();
				}

			});
		attributeSetterBiConsumers.put(
			"commerceDiscountId",
			new BiConsumer<CommerceDiscountCommerceAccountGroupRel, Object>() {

				@Override
				public void accept(
					CommerceDiscountCommerceAccountGroupRel
						commerceDiscountCommerceAccountGroupRel,
					Object commerceDiscountIdObject) {

					commerceDiscountCommerceAccountGroupRel.
						setCommerceDiscountId((Long)commerceDiscountIdObject);
				}

			});
		attributeGetterFunctions.put(
			"commerceAccountGroupId",
			new Function<CommerceDiscountCommerceAccountGroupRel, Object>() {

				@Override
				public Object apply(
					CommerceDiscountCommerceAccountGroupRel
						commerceDiscountCommerceAccountGroupRel) {

					return commerceDiscountCommerceAccountGroupRel.
						getCommerceAccountGroupId();
				}

			});
		attributeSetterBiConsumers.put(
			"commerceAccountGroupId",
			new BiConsumer<CommerceDiscountCommerceAccountGroupRel, Object>() {

				@Override
				public void accept(
					CommerceDiscountCommerceAccountGroupRel
						commerceDiscountCommerceAccountGroupRel,
					Object commerceAccountGroupIdObject) {

					commerceDiscountCommerceAccountGroupRel.
						setCommerceAccountGroupId(
							(Long)commerceAccountGroupIdObject);
				}

			});

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public long getCommerceDiscountCommerceAccountGroupRelId() {
		return _commerceDiscountCommerceAccountGroupRelId;
	}

	@Override
	public void setCommerceDiscountCommerceAccountGroupRelId(
		long commerceDiscountCommerceAccountGroupRelId) {

		_commerceDiscountCommerceAccountGroupRelId =
			commerceDiscountCommerceAccountGroupRelId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public long getCommerceDiscountId() {
		return _commerceDiscountId;
	}

	@Override
	public void setCommerceDiscountId(long commerceDiscountId) {
		_columnBitmask |= COMMERCEDISCOUNTID_COLUMN_BITMASK;

		if (!_setOriginalCommerceDiscountId) {
			_setOriginalCommerceDiscountId = true;

			_originalCommerceDiscountId = _commerceDiscountId;
		}

		_commerceDiscountId = commerceDiscountId;
	}

	public long getOriginalCommerceDiscountId() {
		return _originalCommerceDiscountId;
	}

	@JSON
	@Override
	public long getCommerceAccountGroupId() {
		return _commerceAccountGroupId;
	}

	@Override
	public void setCommerceAccountGroupId(long commerceAccountGroupId) {
		_columnBitmask |= COMMERCEACCOUNTGROUPID_COLUMN_BITMASK;

		if (!_setOriginalCommerceAccountGroupId) {
			_setOriginalCommerceAccountGroupId = true;

			_originalCommerceAccountGroupId = _commerceAccountGroupId;
		}

		_commerceAccountGroupId = commerceAccountGroupId;
	}

	public long getOriginalCommerceAccountGroupId() {
		return _originalCommerceAccountGroupId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(),
			CommerceDiscountCommerceAccountGroupRel.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CommerceDiscountCommerceAccountGroupRel toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, CommerceDiscountCommerceAccountGroupRel>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CommerceDiscountCommerceAccountGroupRelImpl
			commerceDiscountCommerceAccountGroupRelImpl =
				new CommerceDiscountCommerceAccountGroupRelImpl();

		commerceDiscountCommerceAccountGroupRelImpl.
			setCommerceDiscountCommerceAccountGroupRelId(
				getCommerceDiscountCommerceAccountGroupRelId());
		commerceDiscountCommerceAccountGroupRelImpl.setCompanyId(
			getCompanyId());
		commerceDiscountCommerceAccountGroupRelImpl.setUserId(getUserId());
		commerceDiscountCommerceAccountGroupRelImpl.setUserName(getUserName());
		commerceDiscountCommerceAccountGroupRelImpl.setCreateDate(
			getCreateDate());
		commerceDiscountCommerceAccountGroupRelImpl.setModifiedDate(
			getModifiedDate());
		commerceDiscountCommerceAccountGroupRelImpl.setCommerceDiscountId(
			getCommerceDiscountId());
		commerceDiscountCommerceAccountGroupRelImpl.setCommerceAccountGroupId(
			getCommerceAccountGroupId());

		commerceDiscountCommerceAccountGroupRelImpl.resetOriginalValues();

		return commerceDiscountCommerceAccountGroupRelImpl;
	}

	@Override
	public int compareTo(
		CommerceDiscountCommerceAccountGroupRel
			commerceDiscountCommerceAccountGroupRel) {

		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(),
			commerceDiscountCommerceAccountGroupRel.getCreateDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CommerceDiscountCommerceAccountGroupRel)) {
			return false;
		}

		CommerceDiscountCommerceAccountGroupRel
			commerceDiscountCommerceAccountGroupRel =
				(CommerceDiscountCommerceAccountGroupRel)object;

		long primaryKey =
			commerceDiscountCommerceAccountGroupRel.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		_setModifiedDate = false;
		_originalCommerceDiscountId = _commerceDiscountId;

		_setOriginalCommerceDiscountId = false;

		_originalCommerceAccountGroupId = _commerceAccountGroupId;

		_setOriginalCommerceAccountGroupId = false;

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<CommerceDiscountCommerceAccountGroupRel> toCacheModel() {
		CommerceDiscountCommerceAccountGroupRelCacheModel
			commerceDiscountCommerceAccountGroupRelCacheModel =
				new CommerceDiscountCommerceAccountGroupRelCacheModel();

		commerceDiscountCommerceAccountGroupRelCacheModel.
			commerceDiscountCommerceAccountGroupRelId =
				getCommerceDiscountCommerceAccountGroupRelId();

		commerceDiscountCommerceAccountGroupRelCacheModel.companyId =
			getCompanyId();

		commerceDiscountCommerceAccountGroupRelCacheModel.userId = getUserId();

		commerceDiscountCommerceAccountGroupRelCacheModel.userName =
			getUserName();

		String userName =
			commerceDiscountCommerceAccountGroupRelCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			commerceDiscountCommerceAccountGroupRelCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			commerceDiscountCommerceAccountGroupRelCacheModel.createDate =
				createDate.getTime();
		}
		else {
			commerceDiscountCommerceAccountGroupRelCacheModel.createDate =
				Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			commerceDiscountCommerceAccountGroupRelCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			commerceDiscountCommerceAccountGroupRelCacheModel.modifiedDate =
				Long.MIN_VALUE;
		}

		commerceDiscountCommerceAccountGroupRelCacheModel.commerceDiscountId =
			getCommerceDiscountId();

		commerceDiscountCommerceAccountGroupRelCacheModel.
			commerceAccountGroupId = getCommerceAccountGroupId();

		return commerceDiscountCommerceAccountGroupRelCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<CommerceDiscountCommerceAccountGroupRel, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry
				<String,
				 Function<CommerceDiscountCommerceAccountGroupRel, Object>>
					entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CommerceDiscountCommerceAccountGroupRel, Object>
				attributeGetterFunction = entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(
				attributeGetterFunction.apply(
					(CommerceDiscountCommerceAccountGroupRel)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<CommerceDiscountCommerceAccountGroupRel, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry
				<String,
				 Function<CommerceDiscountCommerceAccountGroupRel, Object>>
					entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CommerceDiscountCommerceAccountGroupRel, Object>
				attributeGetterFunction = entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(
				attributeGetterFunction.apply(
					(CommerceDiscountCommerceAccountGroupRel)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function
			<InvocationHandler, CommerceDiscountCommerceAccountGroupRel>
				_escapedModelProxyProviderFunction =
					_getProxyProviderFunction();

	}

	private long _commerceDiscountCommerceAccountGroupRelId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private long _commerceDiscountId;
	private long _originalCommerceDiscountId;
	private boolean _setOriginalCommerceDiscountId;
	private long _commerceAccountGroupId;
	private long _originalCommerceAccountGroupId;
	private boolean _setOriginalCommerceAccountGroupId;
	private long _columnBitmask;
	private CommerceDiscountCommerceAccountGroupRel _escapedModel;

}