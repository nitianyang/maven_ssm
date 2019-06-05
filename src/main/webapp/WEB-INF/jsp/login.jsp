<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%
    String path = request.getContextPath();
%>
<html>

<body>
    <form action="<%=path%>/valid"  method="post">
        username:  <input type="text"  name="name"/><font color="red" >${err.name} </font><br/>
        userpwd: <input type="password"  name="password"/><font color="red" >${err.password}</font><br/>
        <input type="submit"  value="submit"  />
    </form>
</body>


</html>