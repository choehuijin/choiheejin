<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>html 테스트 입니다.</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script src="/resources/js/user.js"></script>
<style></style>
</head>
<body>
	<h1>HTML이란?</h1>
	<h2>HTML의 역사</h2>
	<h3>팀 버너리스에 대해</h3>
	<h4>HTML의 태그</h4>
	<h5>HTML의 태그</h5>
	<a href="htmltest">페이지 다시 로딩- 불러오기</a>
	<img src="resources/images/dog.jpg" alt="개와고양이">
	<p>
		<strong> 이것은 </strong> 문답입니다. <br> <b>이것은</b> 문단입니다.
	</p>
	<p>이것은 &nbsp;&nbsp;&nbsp;&nbsp; &amp; &lt; &gt; &copy;
		&nbsp;&nbsp;&nbsp;&nbsp;특수문자 입니다.
	<hr>
	이것은 문단입니다.
	</p>
	<ul>
		<li>리스트1</li>
		<li>리스트2</li>
	</ul>
	<ol>
		<li>리스트1</li>
		<li>리스트2</li>
	</ol>
	<div>
		<h2>회원가입 폼 입니다.</h2>
		<form method="get" action="/htmltest">
			성별을 선택해 주세요 <select name="gender">
				<option value="M">남자</option>
				<option value="F">여자</option>
			</select> <br> <input type="text" name="userid" placeholder="user ID">
			<input ="password" name="password" placeholder="user password">
			<input type="file" name="upload_file">
			<textarea name="contents" cols="100" rows="5">여기에 글을 입력하세요.</textarea>
			<input type="submit" name="submit" value="회원가입" class="login">
		</form>
	</div>
	<br>
	<table summary="00학교 00반 성적표" style="border: 1px solid black">
	<!-- 인라인 스타일 주기 -->
	<caption>이 테이블은 학생들의 성적표 입니다.</caption>
<tr>
<th>이름</th>
<th>성적</th>
</tr>
<tr>
<td colspan="2">BBB</td>
</tr>
<tr>
<td>CCC</td>
<td>C</td>
</tr>
</table>

</body>
</html>