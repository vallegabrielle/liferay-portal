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

package com.liferay.item.selector.criteria.file.criterion;

import com.liferay.item.selector.BaseItemSelectorCriterion;
import com.liferay.item.selector.ItemSelectorReturnType;
import com.liferay.item.selector.criteria.DefaultItemSelectorReturnType;

import java.util.Set;

/**
 * @author Roberto Díaz
 */
public class FileItemSelectorCriterion extends BaseItemSelectorCriterion {

	public FileItemSelectorCriterion() {
		super(_AVAILABLE_ITEM_SELECTOR_RETURN_TYPES);
	}

	private static final Set<ItemSelectorReturnType>
		_AVAILABLE_ITEM_SELECTOR_RETURN_TYPES = getInmutableSet(
			DefaultItemSelectorReturnType.BASE_64,
			DefaultItemSelectorReturnType.FILE_ENTRY,
			DefaultItemSelectorReturnType.URL);

}