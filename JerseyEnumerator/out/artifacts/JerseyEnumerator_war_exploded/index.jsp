<%--
  Created by IntelliJ IDEA.
  User: patch-junint-7
  Date: 10-07-2019
  Time: 03:14 PM
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
  <title>Jersey Page</title>
</head>
<body>
<%--  <a href="rest/mainresource/download">Click here</a>--%>
<form action="rest/mainresource/upload" method="post" enctype="multipart/form-data">

  <p>Select a file : <input type="file" name="file" accept=".json" /></p>
  <input type="submit" value="Upload File" />

</form>
</body>
</html>
