<%--
  Created by IntelliJ IDEA.
  User: Marco
  Date: 27/05/2016
  Time: 01:22 AM
  To change this template use File | Settings | File Templates.
--%>



<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <link rel="stylesheet"  type="text/css" href="Bootstrap/css/bootstrap.css" >
    <script src="Bootstrap\js\bootstrap.js" ></script>

</head>
<body>
<form class="form-horizontal" role="form" action="Employees" method="get">
    <div class="form-group">
        <label for="employee_id" class="col-lg-2 control-label">employee_id</label>
        <div class="col-lg-10">
            <input type="text" class="form-control" id="employee_id"
                   placeholder="employee_id">

        </div>
    </div>
    <div class="form-group">
        <label for="first_name" class="col-lg-2 control-label">first_name</label>
        <div class="col-lg-10">
            <input type="text" class="form-control" id="first_name"
                   placeholder="first_name">
        </div>
    </div>
    <div class="form-group">
        <label for="last_name" class="col-lg-2 control-label">last_name</label>
        <div class="col-lg-10">
            <input type="text" class="form-control" id="last_name"
                   placeholder="last_name">
        </div>
    </div>
    <div class="form-group">
        <label for="email" class="col-lg-2 control-label">email</label>
        <div class="col-lg-10">
            <input type="email" class="form-control" id="email"
                   placeholder="email">
        </div>
    </div>
    <div class="form-group">
        <label for="phone_number" class="col-lg-2 control-label">phone_number</label>
        <div class="col-lg-10">
            <input type="text" class="form-control" id="phone_number"
                   placeholder="phone_number">
        </div>
    </div>
    <div class="form-group">
        <label for="hire_date" class="col-lg-2 control-label">hire_date</label>
        <div class="col-lg-10">
            <input type="text" class="form-control" id="hire_date"
                   placeholder="hire_date">
        </div>
    </div>

    <div class="form-group">
        <label for="job_id" class="col-lg-2 control-label">job_id</label>
        <div class="col-lg-10">
            <input type="text" class="form-control" id="job_id"
                   placeholder="job_id">
        </div>
    </div>

    <div class="form-group">
        <label for="salary" class="col-lg-2 control-label">salary</label>
        <div class="col-lg-10">
            <input type="text" class="form-control" id="salary"
                   placeholder="salary">
        </div>
    </div>
    <div class="form-group">
        <label for="commission_pct" class="col-lg-2 control-label">commission_pct</label>
        <div class="col-lg-10">
            <input type="text" class="form-control" id="commission_pct"
                   placeholder="commission_pct">
        </div>
    </div>
    <div class="form-group">
        <label for="manager_id" class="col-lg-2 control-label">manager_id</label>
        <div class="col-lg-10">
            <input type="text" class="form-control" id="manager_id"
                   placeholder="manager_id">
        </div>
    </div>
    <div class="form-group">
        <label for="department_id" class="col-lg-2 control-label">department_id</label>
        <div class="col-lg-10">
            <input type="text" class="form-control" id="department_id"
                   placeholder="department_id">
        </div>
    </div>

    <div class="form-group">
        <div class="col-lg-offset-2 col-lg-10">
            <button type="submit" class="btn btn-default">Add</button>
        </div>
    </div>
</form>
</body>
</html>
