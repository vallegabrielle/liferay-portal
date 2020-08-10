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

package com.liferay.commerce.bom.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.AuditedModel;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the CommerceBOMFolderApplicationRel service. Represents a row in the &quot;CBOMFolderApplicationRel&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.liferay.commerce.bom.model.impl.CommerceBOMFolderApplicationRelModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.liferay.commerce.bom.model.impl.CommerceBOMFolderApplicationRelImpl</code>.
 * </p>
 *
 * @author Luca Pellizzon
 * @see CommerceBOMFolderApplicationRel
 * @generated
 */
@ProviderType
public interface CommerceBOMFolderApplicationRelModel
	extends AuditedModel, BaseModel<CommerceBOMFolderApplicationRel>,
			ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a commerce bom folder application rel model instance should use the {@link CommerceBOMFolderApplicationRel} interface instead.
	 */

	/**
	 * Returns the primary key of this commerce bom folder application rel.
	 *
	 * @return the primary key of this commerce bom folder application rel
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this commerce bom folder application rel.
	 *
	 * @param primaryKey the primary key of this commerce bom folder application rel
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the commerce bom folder application rel ID of this commerce bom folder application rel.
	 *
	 * @return the commerce bom folder application rel ID of this commerce bom folder application rel
	 */
	public long getCommerceBOMFolderApplicationRelId();

	/**
	 * Sets the commerce bom folder application rel ID of this commerce bom folder application rel.
	 *
	 * @param commerceBOMFolderApplicationRelId the commerce bom folder application rel ID of this commerce bom folder application rel
	 */
	public void setCommerceBOMFolderApplicationRelId(
		long commerceBOMFolderApplicationRelId);

	/**
	 * Returns the company ID of this commerce bom folder application rel.
	 *
	 * @return the company ID of this commerce bom folder application rel
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this commerce bom folder application rel.
	 *
	 * @param companyId the company ID of this commerce bom folder application rel
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this commerce bom folder application rel.
	 *
	 * @return the user ID of this commerce bom folder application rel
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this commerce bom folder application rel.
	 *
	 * @param userId the user ID of this commerce bom folder application rel
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this commerce bom folder application rel.
	 *
	 * @return the user uuid of this commerce bom folder application rel
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this commerce bom folder application rel.
	 *
	 * @param userUuid the user uuid of this commerce bom folder application rel
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this commerce bom folder application rel.
	 *
	 * @return the user name of this commerce bom folder application rel
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this commerce bom folder application rel.
	 *
	 * @param userName the user name of this commerce bom folder application rel
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this commerce bom folder application rel.
	 *
	 * @return the create date of this commerce bom folder application rel
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this commerce bom folder application rel.
	 *
	 * @param createDate the create date of this commerce bom folder application rel
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this commerce bom folder application rel.
	 *
	 * @return the modified date of this commerce bom folder application rel
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this commerce bom folder application rel.
	 *
	 * @param modifiedDate the modified date of this commerce bom folder application rel
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the commerce bom folder ID of this commerce bom folder application rel.
	 *
	 * @return the commerce bom folder ID of this commerce bom folder application rel
	 */
	public long getCommerceBOMFolderId();

	/**
	 * Sets the commerce bom folder ID of this commerce bom folder application rel.
	 *
	 * @param commerceBOMFolderId the commerce bom folder ID of this commerce bom folder application rel
	 */
	public void setCommerceBOMFolderId(long commerceBOMFolderId);

	/**
	 * Returns the commerce application model ID of this commerce bom folder application rel.
	 *
	 * @return the commerce application model ID of this commerce bom folder application rel
	 */
	public long getCommerceApplicationModelId();

	/**
	 * Sets the commerce application model ID of this commerce bom folder application rel.
	 *
	 * @param commerceApplicationModelId the commerce application model ID of this commerce bom folder application rel
	 */
	public void setCommerceApplicationModelId(long commerceApplicationModelId);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		CommerceBOMFolderApplicationRel commerceBOMFolderApplicationRel);

	@Override
	public int hashCode();

	@Override
	public CacheModel<CommerceBOMFolderApplicationRel> toCacheModel();

	@Override
	public CommerceBOMFolderApplicationRel toEscapedModel();

	@Override
	public CommerceBOMFolderApplicationRel toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();

}