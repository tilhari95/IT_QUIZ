<%@taglib prefix="s" uri="/struts-tags" %>
<h1>Question Bank</h1>

<table border="1">
    <tr>
        <th>QUES ID</th>
        <th> QUESTION</th>
        <th>OPT 1</th>
        <th>OPT 2</th>
        <th>OPT 3</th>
        <th>OPT 4</th>
        <th>ANSWER</th>
        
    </tr>
    <s:iterator value="es">
        <tr>
            <td><s:property value="questionid" /> </td>
            <td><s:property value="question" /> </td>
            <td><s:property value="opt1" /> </td>
            <td><s:property value="opt2" /> </td>
            <td><s:property value="opt3" /> </td>
            <td><s:property value="opt4" /> </td>
            <td><s:property value="answer" /> </td>
            
            
            
        </tr>
    </s:iterator>
       
</table>
