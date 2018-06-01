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

package com.liferay.asset.display.page.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.asset.display.page.model.AssetDisplayPageEntry;
import com.liferay.asset.display.page.model.AssetDisplayPageEntryModel;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the AssetDisplayPageEntry service. Represents a row in the &quot;AssetDisplayPageEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link AssetDisplayPageEntryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AssetDisplayPageEntryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssetDisplayPageEntryImpl
 * @see AssetDisplayPageEntry
 * @see AssetDisplayPageEntryModel
 * @generated
 */
@ProviderType
public class AssetDisplayPageEntryModelImpl extends BaseModelImpl<AssetDisplayPageEntry>
	implements AssetDisplayPageEntryModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a asset display page entry model instance should use the {@link AssetDisplayPageEntry} interface instead.
	 */
	public static final String TABLE_NAME = "AssetDisplayPageEntry";
	public static final Object[][] TABLE_COLUMNS = {
			{ "assetDisplayPageEntryId", Types.BIGINT },
			{ "assetEntryId", Types.BIGINT },
			{ "layoutPageTemplateEntryId", Types.BIGINT },
			{ "type_", Types.INTEGER }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("assetDisplayPageEntryId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("assetEntryId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("layoutPageTemplateEntryId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("type_", Types.INTEGER);
	}

	public static final String TABLE_SQL_CREATE = "create table AssetDisplayPageEntry (assetDisplayPageEntryId LONG not null primary key,assetEntryId LONG,layoutPageTemplateEntryId LONG,type_ INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table AssetDisplayPageEntry";
	public static final String ORDER_BY_JPQL = " ORDER BY assetDisplayPageEntry.assetDisplayPageEntryId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY AssetDisplayPageEntry.assetDisplayPageEntryId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.asset.display.page.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.asset.display.page.model.AssetDisplayPageEntry"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.asset.display.page.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.asset.display.page.model.AssetDisplayPageEntry"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.asset.display.page.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.asset.display.page.model.AssetDisplayPageEntry"),
			true);
	public static final long ASSETENTRYID_COLUMN_BITMASK = 1L;
	public static final long LAYOUTPAGETEMPLATEENTRYID_COLUMN_BITMASK = 2L;
	public static final long ASSETDISPLAYPAGEENTRYID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.asset.display.page.service.util.ServiceProps.get(
				"lock.expiration.time.com.liferay.asset.display.page.model.AssetDisplayPageEntry"));

	public AssetDisplayPageEntryModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _assetDisplayPageEntryId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAssetDisplayPageEntryId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _assetDisplayPageEntryId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return AssetDisplayPageEntry.class;
	}

	@Override
	public String getModelClassName() {
		return AssetDisplayPageEntry.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("assetDisplayPageEntryId", getAssetDisplayPageEntryId());
		attributes.put("assetEntryId", getAssetEntryId());
		attributes.put("layoutPageTemplateEntryId",
			getLayoutPageTemplateEntryId());
		attributes.put("type", getType());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long assetDisplayPageEntryId = (Long)attributes.get(
				"assetDisplayPageEntryId");

		if (assetDisplayPageEntryId != null) {
			setAssetDisplayPageEntryId(assetDisplayPageEntryId);
		}

		Long assetEntryId = (Long)attributes.get("assetEntryId");

		if (assetEntryId != null) {
			setAssetEntryId(assetEntryId);
		}

		Long layoutPageTemplateEntryId = (Long)attributes.get(
				"layoutPageTemplateEntryId");

		if (layoutPageTemplateEntryId != null) {
			setLayoutPageTemplateEntryId(layoutPageTemplateEntryId);
		}

		Integer type = (Integer)attributes.get("type");

		if (type != null) {
			setType(type);
		}
	}

	@Override
	public long getAssetDisplayPageEntryId() {
		return _assetDisplayPageEntryId;
	}

	@Override
	public void setAssetDisplayPageEntryId(long assetDisplayPageEntryId) {
		_assetDisplayPageEntryId = assetDisplayPageEntryId;
	}

	@Override
	public long getAssetEntryId() {
		return _assetEntryId;
	}

	@Override
	public void setAssetEntryId(long assetEntryId) {
		_columnBitmask |= ASSETENTRYID_COLUMN_BITMASK;

		if (!_setOriginalAssetEntryId) {
			_setOriginalAssetEntryId = true;

			_originalAssetEntryId = _assetEntryId;
		}

		_assetEntryId = assetEntryId;
	}

	public long getOriginalAssetEntryId() {
		return _originalAssetEntryId;
	}

	@Override
	public long getLayoutPageTemplateEntryId() {
		return _layoutPageTemplateEntryId;
	}

	@Override
	public void setLayoutPageTemplateEntryId(long layoutPageTemplateEntryId) {
		_columnBitmask |= LAYOUTPAGETEMPLATEENTRYID_COLUMN_BITMASK;

		if (!_setOriginalLayoutPageTemplateEntryId) {
			_setOriginalLayoutPageTemplateEntryId = true;

			_originalLayoutPageTemplateEntryId = _layoutPageTemplateEntryId;
		}

		_layoutPageTemplateEntryId = layoutPageTemplateEntryId;
	}

	public long getOriginalLayoutPageTemplateEntryId() {
		return _originalLayoutPageTemplateEntryId;
	}

	@Override
	public int getType() {
		return _type;
	}

	@Override
	public void setType(int type) {
		_type = type;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			AssetDisplayPageEntry.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public AssetDisplayPageEntry toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (AssetDisplayPageEntry)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		AssetDisplayPageEntryImpl assetDisplayPageEntryImpl = new AssetDisplayPageEntryImpl();

		assetDisplayPageEntryImpl.setAssetDisplayPageEntryId(getAssetDisplayPageEntryId());
		assetDisplayPageEntryImpl.setAssetEntryId(getAssetEntryId());
		assetDisplayPageEntryImpl.setLayoutPageTemplateEntryId(getLayoutPageTemplateEntryId());
		assetDisplayPageEntryImpl.setType(getType());

		assetDisplayPageEntryImpl.resetOriginalValues();

		return assetDisplayPageEntryImpl;
	}

	@Override
	public int compareTo(AssetDisplayPageEntry assetDisplayPageEntry) {
		long primaryKey = assetDisplayPageEntry.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AssetDisplayPageEntry)) {
			return false;
		}

		AssetDisplayPageEntry assetDisplayPageEntry = (AssetDisplayPageEntry)obj;

		long primaryKey = assetDisplayPageEntry.getPrimaryKey();

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
		AssetDisplayPageEntryModelImpl assetDisplayPageEntryModelImpl = this;

		assetDisplayPageEntryModelImpl._originalAssetEntryId = assetDisplayPageEntryModelImpl._assetEntryId;

		assetDisplayPageEntryModelImpl._setOriginalAssetEntryId = false;

		assetDisplayPageEntryModelImpl._originalLayoutPageTemplateEntryId = assetDisplayPageEntryModelImpl._layoutPageTemplateEntryId;

		assetDisplayPageEntryModelImpl._setOriginalLayoutPageTemplateEntryId = false;

		assetDisplayPageEntryModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<AssetDisplayPageEntry> toCacheModel() {
		AssetDisplayPageEntryCacheModel assetDisplayPageEntryCacheModel = new AssetDisplayPageEntryCacheModel();

		assetDisplayPageEntryCacheModel.assetDisplayPageEntryId = getAssetDisplayPageEntryId();

		assetDisplayPageEntryCacheModel.assetEntryId = getAssetEntryId();

		assetDisplayPageEntryCacheModel.layoutPageTemplateEntryId = getLayoutPageTemplateEntryId();

		assetDisplayPageEntryCacheModel.type = getType();

		return assetDisplayPageEntryCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{assetDisplayPageEntryId=");
		sb.append(getAssetDisplayPageEntryId());
		sb.append(", assetEntryId=");
		sb.append(getAssetEntryId());
		sb.append(", layoutPageTemplateEntryId=");
		sb.append(getLayoutPageTemplateEntryId());
		sb.append(", type=");
		sb.append(getType());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.liferay.asset.display.page.model.AssetDisplayPageEntry");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>assetDisplayPageEntryId</column-name><column-value><![CDATA[");
		sb.append(getAssetDisplayPageEntryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assetEntryId</column-name><column-value><![CDATA[");
		sb.append(getAssetEntryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>layoutPageTemplateEntryId</column-name><column-value><![CDATA[");
		sb.append(getLayoutPageTemplateEntryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>type</column-name><column-value><![CDATA[");
		sb.append(getType());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = AssetDisplayPageEntry.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			AssetDisplayPageEntry.class, ModelWrapper.class
		};
	private long _assetDisplayPageEntryId;
	private long _assetEntryId;
	private long _originalAssetEntryId;
	private boolean _setOriginalAssetEntryId;
	private long _layoutPageTemplateEntryId;
	private long _originalLayoutPageTemplateEntryId;
	private boolean _setOriginalLayoutPageTemplateEntryId;
	private int _type;
	private long _columnBitmask;
	private AssetDisplayPageEntry _escapedModel;
}