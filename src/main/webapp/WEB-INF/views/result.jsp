<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@include file="/WEB-INF/views/template/header.jsp" %>


<%--<div>
    <table>
        <c:forEach items="${products}" var="product">
            <tr>
                <td>${product.OEExpense}</td>
                <td><c:out value="${product.OEStaticPressure}" /></td>
            </tr>
        </c:forEach>
    </table>
</div>--%>


<div id="myDiv" style="width: 600px; height: 600px;">

<script>
    var trace1 = {
        x: [1, 2, 3],
        y: [4, 3, 2],
        type: 'scatter'
    };

    var trace2 = {
        x: [2, 3, 4],
        y: [5, 3, 1],
        xaxis: 'x2',
        yaxis: 'y2',
        type: 'scatter'
    };

    var data = [trace1, trace2];

    var layout = {
        yaxis2: {
            domain: [0.6, 0.95],
            anchor: 'x2'
        },
        xaxis2: {
            domain: [0.6, 0.95],
            anchor: 'y2'
        }
    };

    Plotly.newPlot('myDiv', data, layout);
</script>

<%@include file="/WEB-INF/views/template/footer.jsp" %>
