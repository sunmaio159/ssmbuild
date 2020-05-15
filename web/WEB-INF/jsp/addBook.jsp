<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增书籍</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>
                        新增书籍
                    </small>
                </h1>
            </div>
        </div>
    </div>
    <%--<form action="${pageContext.request.contextPath}/book/AddBook" method="post">
        书籍名称<input id="bookName" name="bookName" />
        书籍数量<input id="bookCounts" name="bookCounts"/>
        书籍描述<input id="detail" name="detail"/>
        <input type="submit" value="提交">
    </form>--%>

    <form class="form-horizontal" action="${pageContext.request.contextPath}/book/AddBook" method="post">
        <div class="form-group">
            <label for="bookName" class="col-sm-2 control-label">书籍名称</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="bookName" name="bookName" placeholder="bookName" required>
            </div>
        </div>
        <div class="form-group">
            <label for="bookCounts" class="col-sm-2 control-label">书籍数量</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="bookCounts" name="bookCounts" placeholder="bookCounts" required>
            </div>
        </div>
        <div class="form-group">
            <label for="detail" class="col-sm-2 control-label">书籍描述</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="detail" name="detail" placeholder="detail" required>
            </div>
        </div>
        <button type="submit" class="btn btn-primary">添加</button>
    </form>
</div>
</body>
</html>
