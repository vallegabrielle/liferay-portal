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

package com.liferay.mobile.device.rules.internal.exportimport.data.handler.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.exportimport.test.util.lar.BaseStagedModelDataHandlerTestCase;
import com.liferay.layout.test.util.LayoutTestUtil;
import com.liferay.mobile.device.rules.model.MDRAction;
import com.liferay.mobile.device.rules.model.MDRRuleGroup;
import com.liferay.mobile.device.rules.model.MDRRuleGroupInstance;
import com.liferay.mobile.device.rules.service.MDRActionLocalService;
import com.liferay.mobile.device.rules.service.MDRRuleGroupInstanceLocalService;
import com.liferay.mobile.device.rules.service.MDRRuleGroupLocalService;
import com.liferay.mobile.device.rules.util.test.MDRTestUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.model.StagedModel;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.runner.RunWith;

/**
 * @author Máté Thurzó
 */
@RunWith(Arquillian.class)
public class MDRActionStagedModelDataHandlerTest
	extends BaseStagedModelDataHandlerTestCase {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new LiferayIntegrationTestRule();

	@Before
	@Override
	public void setUp() throws Exception {
		super.setUp();

		_layout = LayoutTestUtil.addLayout(stagingGroup);
	}

	@Override
	protected Map<String, List<StagedModel>> addDependentStagedModelsMap(
			Group group)
		throws Exception {

		Map<String, List<StagedModel>> dependentStagedModelsMap =
			new HashMap<>();

		MDRRuleGroup ruleGroup = MDRTestUtil.addRuleGroup(group.getGroupId());

		addDependentStagedModel(
			dependentStagedModelsMap, MDRRuleGroup.class, ruleGroup);

		MDRRuleGroupInstance ruleGroupInstance =
			MDRTestUtil.addRuleGroupInstance(
				group.getGroupId(), Layout.class.getName(), _layout.getPlid(),
				ruleGroup.getRuleGroupId());

		addDependentStagedModel(
			dependentStagedModelsMap, MDRRuleGroupInstance.class,
			ruleGroupInstance);

		return dependentStagedModelsMap;
	}

	@Override
	protected StagedModel addStagedModel(
			Group group,
			Map<String, List<StagedModel>> dependentStagedModelsMap)
		throws Exception {

		List<StagedModel> dependentStagedModels = dependentStagedModelsMap.get(
			MDRRuleGroupInstance.class.getSimpleName());

		MDRRuleGroupInstance ruleGroupInstance =
			(MDRRuleGroupInstance)dependentStagedModels.get(0);

		return MDRTestUtil.addAction(
			ruleGroupInstance.getRuleGroupInstanceId());
	}

	@Override
	protected StagedModel getStagedModel(String uuid, Group group)
		throws PortalException {

		return _mdrActionLocalService.getMDRActionByUuidAndGroupId(
			uuid, group.getGroupId());
	}

	@Override
	protected Class<? extends StagedModel> getStagedModelClass() {
		return MDRAction.class;
	}

	@Override
	protected void validateImport(
			Map<String, List<StagedModel>> dependentStagedModelsMap,
			Group group)
		throws Exception {

		List<StagedModel> ruleGroupDependentStagedModels =
			dependentStagedModelsMap.get(MDRRuleGroup.class.getSimpleName());

		Assert.assertEquals(
			ruleGroupDependentStagedModels.toString(), 1,
			ruleGroupDependentStagedModels.size());

		MDRRuleGroup ruleGroup =
			(MDRRuleGroup)ruleGroupDependentStagedModels.get(0);

		_mdrRuleGroupLocalService.getMDRRuleGroupByUuidAndGroupId(
			ruleGroup.getUuid(), group.getGroupId());

		List<StagedModel> ruleGroupInstanceDependentStagedModels =
			dependentStagedModelsMap.get(
				MDRRuleGroupInstance.class.getSimpleName());

		Assert.assertEquals(
			ruleGroupInstanceDependentStagedModels.toString(), 1,
			ruleGroupInstanceDependentStagedModels.size());

		MDRRuleGroupInstance ruleGroupInstance =
			(MDRRuleGroupInstance)ruleGroupInstanceDependentStagedModels.get(0);

		_mdrRuleGroupInstanceLocalService.
			getMDRRuleGroupInstanceByUuidAndGroupId(
				ruleGroupInstance.getUuid(), group.getGroupId());
	}

	@Override
	protected void validateImportedStagedModel(
			StagedModel stagedModel, StagedModel importedStagedModel)
		throws Exception {

		super.validateImportedStagedModel(stagedModel, importedStagedModel);

		MDRAction action = (MDRAction)stagedModel;
		MDRAction importedAction = (MDRAction)importedStagedModel;

		Assert.assertEquals(action.getName(), importedAction.getName());
		Assert.assertEquals(
			action.getDescription(), importedAction.getDescription());
		Assert.assertEquals(action.getType(), importedAction.getType());
	}

	private Layout _layout;

	@Inject
	private MDRActionLocalService _mdrActionLocalService;

	@Inject
	private MDRRuleGroupInstanceLocalService _mdrRuleGroupInstanceLocalService;

	@Inject
	private MDRRuleGroupLocalService _mdrRuleGroupLocalService;

}