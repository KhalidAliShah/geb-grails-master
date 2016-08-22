<%@ page import="ahpra.Physio" %>



<div class="fieldcontain ${hasErrors(bean: physioInstance, field: 'age', 'error')} required">
	<label for="age">
		<g:message code="physio.age.label" default="Age" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="number" name="age" required="" value="${fieldValue(bean: physioInstance, field: 'age')}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: physioInstance, field: 'anotherName', 'error')} ">
	<label for="anotherName">
		<g:message code="physio.anotherName.label" default="Another Name" />
		
	</label>
	<g:textField name="anotherName" value="${physioInstance?.anotherName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: physioInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="physio.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${physioInstance?.name}"/>
</div>

