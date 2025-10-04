<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<div class="container">
	<h1>Enter Todo details</h1>
	
	<form:form method="post" modelAttribute="todo">
		
		<fieldset class="mb-3">
			<for:label path="description">Description</for:label>
			<form:input type="text" path="description" required="required"/>
			<form:errors path="description"  cssClass="text-warning"/>
		</fieldset>
		
		<fieldset class="mb-3">
			<for:label path="targetDate">Target Date</for:label>
			<form:input type="text" path="targetDate" id="targetDate" required="required"/>
			<form:errors path="targetDate"  cssClass="text-warning"/>
		</fieldset>
		
		<form:input type="hidden" path="id"/>
		
		<form:input type="hidden" path="done"/>
		
		<input type="submit" class = "btn btn-success">
	
	</form:form>
</div>
<%@ include file="common/footer.jspf" %>

<script type="text/javascript">
$('#targetDate').datepicker({
   	format: 'yyyy-mm-dd'
}); 
</script>

