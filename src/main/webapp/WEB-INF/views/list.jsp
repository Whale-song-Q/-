<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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

function fenye(YM) {
	$("[name=YM]").val(YM);
	$("form").submit();
}
function check(own) {
	$("[name=check]").attr("checked",own.checked);
}
//查看详情
function lookGoods(id) {
	
	open("lookGoods.jsp?id="+id);
	
}
//添加
function addGoods() {
	
	location="addGoods.jsp";
	
}
function deleAll() {
	var ids=$("[name=check]:checked").map(function(){
		return this.value;
		
	}).get().join();
	if(confirm("是否删除下标为"+ids+"的元素？")){
		
		
		$.post("deleAll",{ids:ids},function(flag){
			if(flag){
				alert("删除成功！")
				location="list";
			}else{
				
				alert("删除失败！")
			}
			
			
		},"json")
		
	}
	
	
}
function toupdate(id) {
	
	location="toupdate?id="+id;
	
	
}
</script>

<body>


<h4 style="color:red">-*请通过商品名称查询*-</h4>
<table>

<tr>
  <td colspan="3">
	<form action="list" method="post">

	<input type="hidden" name="YM"/>
	<input type="text" name="mohu"/><button>查询</button>
	</form>
  </td>
  <td colspan="3">
  <input type="button" value="新增" onclick="addGoods()"/>
  <input type="button" value="批量删除" onclick="deleAll()"/>
  </td>

</tr>

  <tr>
    <td><input type="checkbox" onclick="check(this)"/>全选</td>
    <td>编号</td>
    <td>品牌</td>
    <td>分类</td>
    <td>发布时间</td>
    <td>操作</td>
  </tr>
	<c:forEach items="${list}" var="l" varStatus="count">
	    <tr>
	    <td><input type="checkbox"  name="check" value="${l.id}"/></td>
	    <td>${count.count+pageInfo.startRow-1}</td>
	    <td>${l.tbrand.tname}</td>
	    <td>${l.types.cname}</td>
	    <td>${l.datea}</td>
	    <td>
	    <input type="button" value="详情" onclick="lookGoods(${l.id})" />
	    <input type="button" value="编辑" onclick="toupdate(${l.id})" />
	    </td>
	  </tr>
	
	</c:forEach>
  <tr>
  <td colspan="6">
        <input type="button" value="首页" onclick="fenye(1)"/> 
      <input type="button" value="上一页" onclick="fenye(${pageInfo.prePage==0?1:pageInfo.prePage})"/>
      <input type="button" value="下一页" onclick="fenye(${pageInfo.nextPage==0?0:pageInfo.nextPage})"/>
      <input type="button" value="尾页" onclick="fenye(${pageInfo.pages})"/>
	       第${pageInfo.pageNum}/${pageInfo.pages},共${pageInfo.total}条
  </td>
  
  </tr>



</table>







</body>
</html>