<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=request.getContextPath() %>/css/index3.css">
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/My97DatePicker/WdatePicker.js"></script>
</head>
<script type="text/javascript">
  $(function() {
	
	  $.post("listTb",function(obj){
		  
		  for (var i in obj) {
			
			  $("#TB").append(" <option value='"+obj[i].tbid+"'>"+obj[i].tname+"</option>")
			  
		}
		  
		  
	  },"json")
	  
	  $.post("listTy",function(obj){
		  
		  for (var i in obj) {
			
			  $("#TY").append(" <option value='"+obj[i].cid+"'>"+obj[i].cname+"</option>")
			  
		}
		  
		  
	  },"json")
	  
})
function back() {
	history.back();
}

</script>

<body>
<h1>新加页面</h1>
<form action="addGoods" method="post">
<table>
 <tr>
 <td>名称</td>
 <td><input type="text" name="name"/></td>
 </tr>
  <tr>
 <td>品牌</td>
 <td>
<select name="tbrand.tbid" id="TB">
 <option value="-1">请选择品牌</option>
 </select>
 
 </td>
 </tr>
  <tr>
 <td>分类</td>
 <td>
 <select name="types.cid" id="TY">
 <option value="-1">请选择分类</option>
 </select>
 </td>
 </tr>
  <tr>
 <td>价格</td>
 <td><input type="text" name="price"/></td>
 </tr>
<tr>
 <td colspan="2">
 <button>保存</button><input type="button" value="关闭" onclick="back()"/>
 </td>
</tr>

</table>
</form>


</body>
</html>