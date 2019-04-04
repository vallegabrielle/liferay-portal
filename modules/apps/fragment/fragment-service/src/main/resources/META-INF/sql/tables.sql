create table FragmentCollection (
	uuid_ VARCHAR(75) null,
	fragmentCollectionId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	fragmentCollectionKey VARCHAR(75) null,
	name VARCHAR(75) null,
	description STRING null,
	lastPublishDate DATE null
);

create table FragmentEntry (
	uuid_ VARCHAR(75) null,
	fragmentEntryId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	fragmentCollectionId LONG,
	fragmentEntryKey VARCHAR(75) null,
	name VARCHAR(75) null,
	css STRING null,
	html STRING null,
	js STRING null,
	previewFileEntryId LONG,
	type_ INTEGER,
	lastPublishDate DATE null,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null
);

create table FragmentEntryLink (
	uuid_ VARCHAR(75) null,
	fragmentEntryLinkId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	originalFragmentEntryLinkId LONG,
	fragmentEntryId LONG,
	classNameId LONG,
	classPK LONG,
	css STRING null,
	html STRING null,
	js STRING null,
	editableValues STRING null,
	namespace VARCHAR(75) null,
	position INTEGER,
	rendererKey VARCHAR(75) null,
	lastPropagationDate DATE null,
	lastPublishDate DATE null
);