<%@taglib prefix="s" uri="/struts-tags" %>
<h1>Frequently Asked Questions</h1>

<table border="1">
    <tr>
        <th>QUES ID</th>
        <th> QUESTION</th>
        <th>ANSWER</th>
        
    </tr>
    <s:iterator value="es">
        <tr>
            <td><s:property value="faqid" /> </td>
            <td><s:property value="ques" /> </td>
            <td><s:property value="ans" /> </td>
            
            
            
        </tr>
    </s:iterator>
        <s:form action="ASK" >
            <h5>Ask Question....!!</h5>
            <s:textarea name="ques" ></s:textarea>
            <s:submit value="SUBMIT" />
        </s:form>
            
</table>
