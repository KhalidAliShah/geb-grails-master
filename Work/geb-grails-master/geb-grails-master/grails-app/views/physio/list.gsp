
<%@ page import="ahpra.Physio" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'physio.label', default: 'Physio')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-physio" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-physio" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
					
						<g:sortableColumn property="age" title="${message(code: 'physio.age.label', default: 'Age')}" />
					
						<g:sortableColumn property="anotherName" title="${message(code: 'physio.anotherName.label', default: 'Another Name')}" />
					
						<g:sortableColumn property="name" title="${message(code: 'physio.name.label', default: 'Name')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${physioInstanceList}" status="i" var="physioInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${physioInstance.id}">${fieldValue(bean: physioInstance, field: "age")}</g:link></td>
					
						<td>${fieldValue(bean: physioInstance, field: "anotherName")}</td>
					
						<td>${fieldValue(bean: physioInstance, field: "name")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${physioInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
