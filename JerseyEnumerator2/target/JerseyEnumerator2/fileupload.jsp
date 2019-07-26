<%--
  Created by IntelliJ IDEA.
  User: kishore-pt3063
  Date: 24-07-2019
  Time: 04:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Upload Page</title>
</head>
<body>
<s:form action="upload" namespace="/" method="POST" enctype="multipart/form-data">
    <s:file name="uploadFile" label="Select a File to upload" />
    <s:submit value="submit" name="submit" />
</s:form>
</body>
</html>
