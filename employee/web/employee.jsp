<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-cn">
	<head>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
		<meta name="renderer" content="webkit">
		<title></title>
		<link rel="stylesheet" href="css/pintuer.css">
		<link rel="stylesheet" href="css/admin.css">
		<link rel="stylesheet" href="css/bootstrap.css">
		<link rel="stylesheet" href="css/amazeui.min.css">
		<link rel="stylesheet" href="css/admin1.css">
		<link rel="stylesheet" href="css/app.css">
		<script src="js/jquery.js"></script>
		<script src="js/pintuer.js"></script>
		<script src="js/amazeui.min.js"></script>
		<script src="js/app.js"></script>
		<script src="js/plugs.js"></script>
	</head>
	<body>
		<form method="post" action="">
			<div class="panel admin-panel" style="border: 1px solid #ddd;">
				<div class="panel-head"><span class="icon-magic"> 员工管理</strong></div>
				<div class="padding border-bottom">
					<style>
						ul li{
				display: inline;
			}
		</style>
					<ul class="search">
						<li>
							<a href="addEmp.html" style="margin-top:10px ;" class="btn btn-success" target="right">添加员工</a>
							<button style="margin-top:10px ;" class="btn btn-danger">批量删除</button>
						</li>

						<li>
							<form action="/EmployeeServlet?method=toEmployeeView" method="post">
								<div class="am-u-sm-12 am-u-md-3" style="position: absolute;right:220px;top:65px">
										<select id="dept" name="deptno" data-am-selected="{btnSize: 'sm'}" style="display: none;">
											<option value="0">
												请选择部门
											</option>
											<option value="0">
												研发部
											</option>
										</select>
								</div>

								<div class="am-u-sm-12 am-u-md-3" style="position: absolute;right:10px;top:68px">
									<div class="am-input-group am-input-group-sm">
										<input class="am-form-field" placeholder="请输入员工姓名" name="ename" type="text">
										<span class="am-input-group-btn">
										<button type="submit" class="btn btn-primary">查询</button>
									</div>
								</div>
							</form>
		</li>
		</ul>
		</div>
		<table class="table table-hover text-center">
			<tr>
				<th><input type="checkbox" name="id[]" value="1" /></th>
				<th>编号</th>
				<th>姓名</th>
				<th>工种</th>
				<th>月薪</th>
				<th>入职日期</th>
				<th>上级领导</th>
				<th>所在部门</th>
				<th>操作</th>
			</tr>
			<tr>
				<td>
					<input type="checkbox" name="id[]" value="1" />
				</td>
				<td>7369</td>
				<td>神夜</td>
				<td>13420925611</td>
				<td>564379992@qq.com</td>
				<td>深圳市民治街道</td>
				<td>这是一套后台UI</td>
				<td>2016-07-01</td>
				<td>
					<a href="updateEmp.html" class="btn btn-info" target="right">修改</a>
					<button class="btn btn-warning">删除</button>
				</td>
			</tr>
			<tr>
				<td>
					<input type="checkbox" name="id[]" value="1" />
				</td>
				<td>7369</td>
				<td>神夜</td>
				<td>13420925611</td>
				<td>564379992@qq.com</td>
				<td>深圳市民治街道</td>
				<td>这是一套后台UI</td>
				<td>2016-07-01</td>
				<td>
					<a href="updateEmp.html" class="btn btn-info" target="right">修改</a>
					<button class="btn btn-warning">删除</button>
				</td>
			</tr>
			<tr>
				<td colspan="8">
					<nav aria-label="Page navigation">
						<ul class="pagination">
							<li>
								<a href="#" aria-label="Previous">
									<span aria-hidden="true">&laquo;</span>
								</a>
							</li>
							<li><a href="#">1</a></li>
							<li><a href="#">2</a></li>
							<li><a href="#">3</a></li>
							<li><a href="#">4</a></li>
							<li><a href="#">5</a></li>
							<li>
								<a href="#" aria-label="Next">
									<span aria-hidden="true">&raquo;</span>
								</a>
							</li>
						</ul>
					</nav>
					</div>
				</td>
			</tr>
		</table>
		</div>
		</form>
		<script type="text/javascript">
			function del(id) {
				if (confirm("您确定要删除吗?")) {

				}
			}

			$("#checkall").click(function() {
				$("input[name='id[]']").each(function() {
					if (this.checked) {
						this.checked = false;
					} else {
						this.checked = true;
					}
				});
			})

			function DelSelect() {
				var Checkbox = false;
				$("input[name='id[]']").each(function() {
					if (this.checked == true) {
						Checkbox = true;
					}
				});
				if (Checkbox) {
					var t = confirm("您确认要删除选中的内容吗？");
					if (t == false) return false;
				} else {
					alert("请选择您要删除的内容!");
					return false;
				}
			}
		</script>
		
	</body>
</html>
