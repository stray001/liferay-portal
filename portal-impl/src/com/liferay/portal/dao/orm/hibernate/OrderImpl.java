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

package com.liferay.portal.dao.orm.hibernate;

import com.liferay.portal.kernel.dao.orm.Order;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

/**
 * @author Brian Wing Shun Chan
 */
public class OrderImpl implements Order {

	public OrderImpl(org.hibernate.criterion.Order order) {
		_order = order;
	}

	public org.hibernate.criterion.Order getWrappedOrder() {
		return _order;
	}


	@Override
	public String toString() {
		StringBundler sb = new StringBundler(3);

		sb.append("{_order=");

		if (_order != null) {
			sb.append(_order.toString());
		}
		else {
			sb.append(StringPool.NULL);
		}

		sb.append("}");

		return sb.toString();
	}

	private final org.hibernate.criterion.Order _order;

}