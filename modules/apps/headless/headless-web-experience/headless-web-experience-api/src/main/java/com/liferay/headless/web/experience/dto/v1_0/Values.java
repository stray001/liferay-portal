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

package com.liferay.headless.web.experience.dto.v1_0;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@XmlRootElement(name = "Values")
public class Values {

	public String getDataType() {
		return _dataType;
	}

	public String getFilterAndSortIdentifier() {
		return _filterAndSortIdentifier;
	}

	public Long getId() {
		return _id;
	}

	public String getInputControl() {
		return _inputControl;
	}

	public String getLabel() {
		return _label;
	}

	public String getName() {
		return _name;
	}

	public String getSelf() {
		return _self;
	}

	public Object getValue() {
		return _value;
	}

	public void setDataType(String dataType) {
		_dataType = dataType;
	}

	public void setFilterAndSortIdentifier(String filterAndSortIdentifier) {
		_filterAndSortIdentifier = filterAndSortIdentifier;
	}

	public void setId(Long id) {
		_id = id;
	}

	public void setInputControl(String inputControl) {
		_inputControl = inputControl;
	}

	public void setLabel(String label) {
		_label = label;
	}

	public void setName(String name) {
		_name = name;
	}

	public void setSelf(String self) {
		_self = self;
	}

	public void setValue(Object value) {
		_value = value;
	}

	private String _dataType;
	private String _filterAndSortIdentifier;
	private Long _id;
	private String _inputControl;
	private String _label;
	private String _name;
	private String _self;
	private Object _value;

}