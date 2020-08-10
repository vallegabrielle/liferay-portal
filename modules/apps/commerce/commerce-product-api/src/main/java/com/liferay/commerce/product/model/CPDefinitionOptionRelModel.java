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

package com.liferay.commerce.product.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.LocaleException;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.LocalizedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.Locale;
import java.util.Map;

/**
 * The base model interface for the CPDefinitionOptionRel service. Represents a row in the &quot;CPDefinitionOptionRel&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.liferay.commerce.product.model.impl.CPDefinitionOptionRelModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.liferay.commerce.product.model.impl.CPDefinitionOptionRelImpl</code>.
 * </p>
 *
 * @author Marco Leo
 * @see CPDefinitionOptionRel
 * @generated
 */
@ProviderType
public interface CPDefinitionOptionRelModel
	extends BaseModel<CPDefinitionOptionRel>, GroupedModel, LocalizedModel,
			ShardedModel, StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a cp definition option rel model instance should use the {@link CPDefinitionOptionRel} interface instead.
	 */

	/**
	 * Returns the primary key of this cp definition option rel.
	 *
	 * @return the primary key of this cp definition option rel
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this cp definition option rel.
	 *
	 * @param primaryKey the primary key of this cp definition option rel
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this cp definition option rel.
	 *
	 * @return the uuid of this cp definition option rel
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this cp definition option rel.
	 *
	 * @param uuid the uuid of this cp definition option rel
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the cp definition option rel ID of this cp definition option rel.
	 *
	 * @return the cp definition option rel ID of this cp definition option rel
	 */
	public long getCPDefinitionOptionRelId();

	/**
	 * Sets the cp definition option rel ID of this cp definition option rel.
	 *
	 * @param CPDefinitionOptionRelId the cp definition option rel ID of this cp definition option rel
	 */
	public void setCPDefinitionOptionRelId(long CPDefinitionOptionRelId);

	/**
	 * Returns the group ID of this cp definition option rel.
	 *
	 * @return the group ID of this cp definition option rel
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this cp definition option rel.
	 *
	 * @param groupId the group ID of this cp definition option rel
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this cp definition option rel.
	 *
	 * @return the company ID of this cp definition option rel
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this cp definition option rel.
	 *
	 * @param companyId the company ID of this cp definition option rel
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this cp definition option rel.
	 *
	 * @return the user ID of this cp definition option rel
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this cp definition option rel.
	 *
	 * @param userId the user ID of this cp definition option rel
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this cp definition option rel.
	 *
	 * @return the user uuid of this cp definition option rel
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this cp definition option rel.
	 *
	 * @param userUuid the user uuid of this cp definition option rel
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this cp definition option rel.
	 *
	 * @return the user name of this cp definition option rel
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this cp definition option rel.
	 *
	 * @param userName the user name of this cp definition option rel
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this cp definition option rel.
	 *
	 * @return the create date of this cp definition option rel
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this cp definition option rel.
	 *
	 * @param createDate the create date of this cp definition option rel
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this cp definition option rel.
	 *
	 * @return the modified date of this cp definition option rel
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this cp definition option rel.
	 *
	 * @param modifiedDate the modified date of this cp definition option rel
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the cp definition ID of this cp definition option rel.
	 *
	 * @return the cp definition ID of this cp definition option rel
	 */
	public long getCPDefinitionId();

	/**
	 * Sets the cp definition ID of this cp definition option rel.
	 *
	 * @param CPDefinitionId the cp definition ID of this cp definition option rel
	 */
	public void setCPDefinitionId(long CPDefinitionId);

	/**
	 * Returns the cp option ID of this cp definition option rel.
	 *
	 * @return the cp option ID of this cp definition option rel
	 */
	public long getCPOptionId();

	/**
	 * Sets the cp option ID of this cp definition option rel.
	 *
	 * @param CPOptionId the cp option ID of this cp definition option rel
	 */
	public void setCPOptionId(long CPOptionId);

	/**
	 * Returns the name of this cp definition option rel.
	 *
	 * @return the name of this cp definition option rel
	 */
	public String getName();

	/**
	 * Returns the localized name of this cp definition option rel in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized name of this cp definition option rel
	 */
	@AutoEscape
	public String getName(Locale locale);

	/**
	 * Returns the localized name of this cp definition option rel in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized name of this cp definition option rel. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@AutoEscape
	public String getName(Locale locale, boolean useDefault);

	/**
	 * Returns the localized name of this cp definition option rel in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized name of this cp definition option rel
	 */
	@AutoEscape
	public String getName(String languageId);

	/**
	 * Returns the localized name of this cp definition option rel in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized name of this cp definition option rel
	 */
	@AutoEscape
	public String getName(String languageId, boolean useDefault);

	@AutoEscape
	public String getNameCurrentLanguageId();

	@AutoEscape
	public String getNameCurrentValue();

	/**
	 * Returns a map of the locales and localized names of this cp definition option rel.
	 *
	 * @return the locales and localized names of this cp definition option rel
	 */
	public Map<Locale, String> getNameMap();

	/**
	 * Sets the name of this cp definition option rel.
	 *
	 * @param name the name of this cp definition option rel
	 */
	public void setName(String name);

	/**
	 * Sets the localized name of this cp definition option rel in the language.
	 *
	 * @param name the localized name of this cp definition option rel
	 * @param locale the locale of the language
	 */
	public void setName(String name, Locale locale);

	/**
	 * Sets the localized name of this cp definition option rel in the language, and sets the default locale.
	 *
	 * @param name the localized name of this cp definition option rel
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	public void setName(String name, Locale locale, Locale defaultLocale);

	public void setNameCurrentLanguageId(String languageId);

	/**
	 * Sets the localized names of this cp definition option rel from the map of locales and localized names.
	 *
	 * @param nameMap the locales and localized names of this cp definition option rel
	 */
	public void setNameMap(Map<Locale, String> nameMap);

	/**
	 * Sets the localized names of this cp definition option rel from the map of locales and localized names, and sets the default locale.
	 *
	 * @param nameMap the locales and localized names of this cp definition option rel
	 * @param defaultLocale the default locale
	 */
	public void setNameMap(Map<Locale, String> nameMap, Locale defaultLocale);

	/**
	 * Returns the description of this cp definition option rel.
	 *
	 * @return the description of this cp definition option rel
	 */
	public String getDescription();

	/**
	 * Returns the localized description of this cp definition option rel in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized description of this cp definition option rel
	 */
	@AutoEscape
	public String getDescription(Locale locale);

	/**
	 * Returns the localized description of this cp definition option rel in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized description of this cp definition option rel. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@AutoEscape
	public String getDescription(Locale locale, boolean useDefault);

	/**
	 * Returns the localized description of this cp definition option rel in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized description of this cp definition option rel
	 */
	@AutoEscape
	public String getDescription(String languageId);

	/**
	 * Returns the localized description of this cp definition option rel in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized description of this cp definition option rel
	 */
	@AutoEscape
	public String getDescription(String languageId, boolean useDefault);

	@AutoEscape
	public String getDescriptionCurrentLanguageId();

	@AutoEscape
	public String getDescriptionCurrentValue();

	/**
	 * Returns a map of the locales and localized descriptions of this cp definition option rel.
	 *
	 * @return the locales and localized descriptions of this cp definition option rel
	 */
	public Map<Locale, String> getDescriptionMap();

	/**
	 * Sets the description of this cp definition option rel.
	 *
	 * @param description the description of this cp definition option rel
	 */
	public void setDescription(String description);

	/**
	 * Sets the localized description of this cp definition option rel in the language.
	 *
	 * @param description the localized description of this cp definition option rel
	 * @param locale the locale of the language
	 */
	public void setDescription(String description, Locale locale);

	/**
	 * Sets the localized description of this cp definition option rel in the language, and sets the default locale.
	 *
	 * @param description the localized description of this cp definition option rel
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	public void setDescription(
		String description, Locale locale, Locale defaultLocale);

	public void setDescriptionCurrentLanguageId(String languageId);

	/**
	 * Sets the localized descriptions of this cp definition option rel from the map of locales and localized descriptions.
	 *
	 * @param descriptionMap the locales and localized descriptions of this cp definition option rel
	 */
	public void setDescriptionMap(Map<Locale, String> descriptionMap);

	/**
	 * Sets the localized descriptions of this cp definition option rel from the map of locales and localized descriptions, and sets the default locale.
	 *
	 * @param descriptionMap the locales and localized descriptions of this cp definition option rel
	 * @param defaultLocale the default locale
	 */
	public void setDescriptionMap(
		Map<Locale, String> descriptionMap, Locale defaultLocale);

	/**
	 * Returns the ddm form field type name of this cp definition option rel.
	 *
	 * @return the ddm form field type name of this cp definition option rel
	 */
	@AutoEscape
	public String getDDMFormFieldTypeName();

	/**
	 * Sets the ddm form field type name of this cp definition option rel.
	 *
	 * @param DDMFormFieldTypeName the ddm form field type name of this cp definition option rel
	 */
	public void setDDMFormFieldTypeName(String DDMFormFieldTypeName);

	/**
	 * Returns the priority of this cp definition option rel.
	 *
	 * @return the priority of this cp definition option rel
	 */
	public double getPriority();

	/**
	 * Sets the priority of this cp definition option rel.
	 *
	 * @param priority the priority of this cp definition option rel
	 */
	public void setPriority(double priority);

	/**
	 * Returns the facetable of this cp definition option rel.
	 *
	 * @return the facetable of this cp definition option rel
	 */
	public boolean getFacetable();

	/**
	 * Returns <code>true</code> if this cp definition option rel is facetable.
	 *
	 * @return <code>true</code> if this cp definition option rel is facetable; <code>false</code> otherwise
	 */
	public boolean isFacetable();

	/**
	 * Sets whether this cp definition option rel is facetable.
	 *
	 * @param facetable the facetable of this cp definition option rel
	 */
	public void setFacetable(boolean facetable);

	/**
	 * Returns the required of this cp definition option rel.
	 *
	 * @return the required of this cp definition option rel
	 */
	public boolean getRequired();

	/**
	 * Returns <code>true</code> if this cp definition option rel is required.
	 *
	 * @return <code>true</code> if this cp definition option rel is required; <code>false</code> otherwise
	 */
	public boolean isRequired();

	/**
	 * Sets whether this cp definition option rel is required.
	 *
	 * @param required the required of this cp definition option rel
	 */
	public void setRequired(boolean required);

	/**
	 * Returns the sku contributor of this cp definition option rel.
	 *
	 * @return the sku contributor of this cp definition option rel
	 */
	public boolean getSkuContributor();

	/**
	 * Returns <code>true</code> if this cp definition option rel is sku contributor.
	 *
	 * @return <code>true</code> if this cp definition option rel is sku contributor; <code>false</code> otherwise
	 */
	public boolean isSkuContributor();

	/**
	 * Sets whether this cp definition option rel is sku contributor.
	 *
	 * @param skuContributor the sku contributor of this cp definition option rel
	 */
	public void setSkuContributor(boolean skuContributor);

	/**
	 * Returns the key of this cp definition option rel.
	 *
	 * @return the key of this cp definition option rel
	 */
	@AutoEscape
	public String getKey();

	/**
	 * Sets the key of this cp definition option rel.
	 *
	 * @param key the key of this cp definition option rel
	 */
	public void setKey(String key);

	/**
	 * Returns the price type of this cp definition option rel.
	 *
	 * @return the price type of this cp definition option rel
	 */
	@AutoEscape
	public String getPriceType();

	/**
	 * Sets the price type of this cp definition option rel.
	 *
	 * @param priceType the price type of this cp definition option rel
	 */
	public void setPriceType(String priceType);

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
	public String[] getAvailableLanguageIds();

	@Override
	public String getDefaultLanguageId();

	@Override
	public void prepareLocalizedFieldsForImport() throws LocaleException;

	@Override
	public void prepareLocalizedFieldsForImport(Locale defaultImportLocale)
		throws LocaleException;

	@Override
	public Object clone();

	@Override
	public int compareTo(CPDefinitionOptionRel cpDefinitionOptionRel);

	@Override
	public int hashCode();

	@Override
	public CacheModel<CPDefinitionOptionRel> toCacheModel();

	@Override
	public CPDefinitionOptionRel toEscapedModel();

	@Override
	public CPDefinitionOptionRel toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();

}