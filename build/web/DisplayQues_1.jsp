<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="d" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="session.jsp" %>
<s:form action="Question">
    <h4>Question :<s:property value="ques.questionid"/></h4> <h5><s:property value="ques.question"/></h5>
<h5><s:radio value="a" name="ans" list="ques.opt1" /></h5>
<h5><s:radio value="b" name="ans" list="ques.opt2" /></h5>
<h5><s:radio value="c" name="ans" list="ques.opt3" /></h5>
<h5><s:radio value="d" name="ans" list="ques.opt4" /></h5>
<h5><s:submit value="Next" name="navigate" /></h5>
<h5><s:submit value="Prev" name="navigate" /></h5>
</s:form>
<s:form action="result">
    <h5><s:submit value="Submit" name="navigate" /></h5>
</s:form>
<h5>YOUR CURRENT ANSWER IS.. ${sessionScope.prevans}</h5>