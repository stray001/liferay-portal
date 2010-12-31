/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
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

package com.liferay.portal.upgrade.v5_2_3.util;

import java.sql.Types;

/**
 * @author	  Brian Wing Shun Chan
 * @generated
 */
public class WikiPageTable {

	public static final String TABLE_NAME = "WikiPage";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", new Integer(Types.VARCHAR)},
		{"pageId", new Integer(Types.BIGINT)},
		{"resourcePrimKey", new Integer(Types.BIGINT)},
		{"groupId", new Integer(Types.BIGINT)},
		{"companyId", new Integer(Types.BIGINT)},
		{"userId", new Integer(Types.BIGINT)},
		{"userName", new Integer(Types.VARCHAR)},
		{"createDate", new Integer(Types.TIMESTAMP)},
		{"modifiedDate", new Integer(Types.TIMESTAMP)},
		{"nodeId", new Integer(Types.BIGINT)},
		{"title", new Integer(Types.VARCHAR)},
		{"version", new Integer(Types.DOUBLE)},
		{"minorEdit", new Integer(Types.BOOLEAN)},
		{"content", new Integer(Types.CLOB)},
		{"summary", new Integer(Types.VARCHAR)},
		{"format", new Integer(Types.VARCHAR)},
		{"head", new Integer(Types.BOOLEAN)},
		{"parentTitle", new Integer(Types.VARCHAR)},
		{"redirectTitle", new Integer(Types.VARCHAR)}
	};

	public static final String TABLE_SQL_CREATE = "create table WikiPage (uuid_ VARCHAR(75) null,pageId LONG not null primary key,resourcePrimKey LONG,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,nodeId LONG,title VARCHAR(255) null,version DOUBLE,minorEdit BOOLEAN,content TEXT null,summary STRING null,format VARCHAR(75) null,head BOOLEAN,parentTitle VARCHAR(75) null,redirectTitle VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP = "drop table WikiPage";

	public static final String[] TABLE_SQL_ADD_INDEXES = {
		"create index IX_A2001730 on WikiPage (format)",
		"create index IX_C8A9C476 on WikiPage (nodeId)",
		"create index IX_E7F635CA on WikiPage (nodeId, head)",
		"create index IX_65E84AF4 on WikiPage (nodeId, head, parentTitle)",
		"create index IX_46EEF3C8 on WikiPage (nodeId, parentTitle)",
		"create index IX_1ECC7656 on WikiPage (nodeId, redirectTitle)",
		"create index IX_997EEDD2 on WikiPage (nodeId, title)",
		"create index IX_E745EA26 on WikiPage (nodeId, title, head)",
		"create unique index IX_3D4AF476 on WikiPage (nodeId, title, version)",
		"create index IX_9C0E478F on WikiPage (uuid_)",
		"create unique index IX_899D3DFB on WikiPage (uuid_, groupId)"
	};

}