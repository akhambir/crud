<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@include file="/WEB-INF/views/template/header.jsp" %>
<center>
    <spring:form class="form-inline" method="post" action="/product">

    <div class="form-group mx-sm-3">
        <div class="d-inline-flex p-2">Expense [m³/h]</div>
        <input name="OEExpense" type="number" class="form-control" placeholder="0">

        <div class="d-inline-flex p-2">Pressure [Pa]</div>
        <input name="OEStaticPressure" type="number" class="form-control" placeholder="0">

        <div class="form-group mx-sm-3">
            Limit (+/-)
            <input name="limit" type="number" class="form-control" placeholder="0">
        </div>

        <button type="submit" class="btn btn-primary">Search</button>

    </div>
    </spring:form>
</center>