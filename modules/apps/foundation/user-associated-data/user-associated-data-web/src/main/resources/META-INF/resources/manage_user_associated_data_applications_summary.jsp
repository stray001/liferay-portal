<%--
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
--%>

<%@ include file="/init.jsp" %>

<%
ManageUADApplicationsSummaryDisplay manageUADApplicationsSummaryDisplay = (ManageUADApplicationsSummaryDisplay)request.getAttribute(UserAssociatedDataWebKeys.MANAGE_UAD_APPLICATIONS_SUMMARY_DISPLAY);
%>

<div class="container-fluid container-fluid-max-xl container-form-lg">
	<div class="sheet sheet-lg">
		<div class="sheet-header">
			<h2 class="sheet-title"><liferay-ui:message key="application-data-review" /></h2>
		</div>

		<div class="sheet-section">
			<h3 class="sheet-subtitle"><liferay-ui:message key="status-summary" /></h3>
			<strong><liferay-ui:message key="remaining-items" />: </strong><%= manageUADApplicationsSummaryDisplay.getTotalCount() %>
		</div>

		<div class="sheet-section">
			<h3 class="sheet-subtitle"><liferay-ui:message key="applications" /></h3>

			<liferay-ui:search-container
				id="UADApplicationsSummaryDisplays"
				searchContainer="<%= manageUADApplicationsSummaryDisplay.getSearchContainer() %>"
			>
				<liferay-ui:search-container-row
					className="com.liferay.user.associated.data.web.internal.display.UADApplicationSummaryDisplay"
					escapedModel="<%= true %>"
					keyProperty="name"
					modelVar="uadApplicationsSummaryDisplay"
				>
					<liferay-ui:search-container-column-text
						cssClass="table-list-title"
						name="name"
						property="name"
					/>

					<liferay-ui:search-container-column-text
						name="items"
						property="count"
					/>

					<liferay-ui:search-container-column-text
						name="status"
					>
						<c:choose>
							<c:when test="<%= uadApplicationsSummaryDisplay.getCount() > 0 %>">
								<span class="label label-warning"><liferay-ui:message key="pending" /></span>
							</c:when>
							<c:otherwise>
								<span class="label label-success"><liferay-ui:message key="done" /></span>
							</c:otherwise>
						</c:choose>
					</liferay-ui:search-container-column-text>
				</liferay-ui:search-container-row>

				<liferay-ui:search-iterator />
			</liferay-ui:search-container>
		</div>
	</div>
</div>