<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div id="div-peserta">
		<form id="form-peserta" action="${pageContext.request.contextPath }/peserta/update" method="POST">
			<label>Nama : </label>
			<input type="hidden" name="id" value="${peserta.id }" />
			<input type="text" name="nama" value="${peserta.nama }" /><br/>
			<label>nomer hp : </label>
			<input type="text" name="noHp" value="${peserta.noHp}"/><br/>
			<label>alamat : </label>
			<input type="text" name="alamat" value="${peserta.alamat }" /><br/>
			<input type="submit" name="submit" value="update" />
		</form>
		<hr/>
		<table>
			<thead>
				<tr>
					<th>Nama</th>
					<th>Alamat</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${pesertas }" var="peserta">
					<tr>
						<td>${peserta.nama }</td>
						<td>${peserta.alamat }</td>
						<td>
						<a href="${pageContext.request.contextPath }/peserta/view-edit?idpeserta=${peserta.id}">edit</a> 
						<a onclick='onDelete("${peserta.id }");' href="#">delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
<script type="text/javascript">
	function  onDelete(id){
		var conf = confirm("Are you sure delete data ?");
		if(conf){
window.location='${pageContext.request.contextPath}/peserta/delete/'+id
		}
		return false;
	}
	
</script>
</html>