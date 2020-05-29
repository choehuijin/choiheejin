<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<!DOCTYPE HTML>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scaleable=no">
<title>heejin</title>
<link rel="shortcut icon" href="/images/favicon/favicon.ico">
<link rel="apple-touch-icon-precomposed"
	href="/images/favicon/home-touch-icon.png">
<link rel="stylesheet" type="text/css" href="/resources/css/reset.css">
<link rel="stylesheet" type="text/css" href="/resources/css/common.css">
<link rel="stylesheet" type="text/css" href="/resources/css/user.css">
<style>

</style>
<script src="/resources/js/jquery.min.js"></script>
<script src="/resources/js/common.js"></script>
<!-- 사용자 스크립트 -->
<script>

</script>
</head>
<body>
<!-- 더미 데이터:CSS작업전 내용 -->
	<div id="wrap">
		<header class="header cfixed">
			<h1 class="logo">
				<a href="">LOGO</a>
			</h1>
			<nav>
				<ul class="gnb">
					<li><a href="/">HOME</a></li>
					<li><a href="/weare">WE ARE</a></li>
					<li><a href="/work">WORK</a></li>
					<li><a href="/blog">BLOG</a></li>
					<li><a href="/contactus">CONTACT US</a></li>
				</ul>
			</nav>
			<span class="menu-toggle-btn"> <span></span> <span></span> <span></span>
			</span>
		</header>
		<article class="slider">
	
		
			<img src="/resources/images/dog.jpg" alt="">
		</article>
		<section class="content">

			<section class="display-section">
				<div class="container">
					<h2 class="sec-tit">WE ARE</h2>
					<p class="desc">
						"휴먼 교육센터 디지털 컨버전스 과정 입니다." <br> "그리고, 지금은 화면 설계 시간 입니다."
					</p>
				</div>
			</section>

			<section class="promotion-section">
				<div class="container">
					<ul class="promo-list">
						<li><a href="#" onclick="return false"> 
						<img src="/resources/images/dog.jpg" alt="">
								<h3>HOME</h3>
								<p>휴먼 교육센터 디지털 컨버전스 과정 입니다.</p>
						</a></li>
					
					<li><a href="#" onclick="return false"> 
						<img src="/resources/images/dog.jpg" alt="">
								<h3>HOME</h3>
								<p>휴먼 교육센터 디지털 컨버전스 과정 입니다.</p>
						</a></li>
						
						<li><a href="#" onclick="return false"> 
						<img src="/resources/images/dog.jpg" alt="">
								<h3>HOME</h3>
								<p>휴먼 교육센터 디지털 컨버전스 과정 입니다.</p>
						</a></li>
						
						<li><a href="#" onclick="return false"> 
						<img src="/resources/images/dog.jpg" alt="">
								<h3>HOME</h3>
								<p>휴먼 교육센터 디지털 컨버전스 과정 입니다.</p>
						</a></li>
					
					</ul>
				</div>
			</section>
			
			<section class="blog-section">
			<div class="container">
				<h2 class="sec-tit">BLOG</h2>
				<ul class="blog-list">
					<li><a href="#" onclick="return false"><img src="/resources/images/dog.jpg"
							alt=""></a> <time datatime="2016-10-30">OCT 30, 2020</time> <a
						href=""><h3>타임스페이스는 사용자 중심의 웹페이지를 제작하는 회사 입니다.</h3></a></li>
					<li><a href="#" onclick="return false"><img src="/resources/images/dog.jpg"
							alt=""></a> <time datatime="2016-10-30">OCT 30, 2020</time> <a
						href=""><h3>타임스페이스는 사용자 중심의 웹페이지를 제작하는 회사 입니다.</h3></a></li>
					<li><a href="#" onclick="return false"><img src="/resources/images/dog.jpg"
							alt=""></a> <time datatime="2016-10-30">OCT 30, 2020</time> <a
						href=""><h3>타임스페이스는 사용자 중심의 웹페이지를 제작하는 회사 입니다.</h3></a></li>
				</ul>
			</div>
		</section>
		
			<section class="contact-section">
			<div class="container">
				<h2 class="sec-tit">CONTACT</h2>
				<div class="form-box">
					<form action="" method="">
						<fieldset class="cfixed">
							<legend class="blind">CANTACT US</legend>
							<div class="form">
								<label for="name" class="blind">name</label> <input type="text"
									id="name" placeholder="Name"> <label for="phone"
									class="blind">phone</label> <input type="tel" id="phone"
									placeholder="Phone"> <label for="email" class="blind">email</label>
								<input type="email" id="email" placeholder="Email Address">
							</div>
							<div class="textarea">
								<label for="message" class="blind">message</label>
								<textarea name="message" id="message" placeholder="Message"></textarea>
							</div>
						</fieldset>
						<div class="send-btn">
							<button>메세지 보내기</button>
						</div>

					</form>
				</div>
			</div>

		</section>
		
		<footer class="footer">
			<p class="copyright">LOGO</p>
		</footer>
	</div>
</body>
</html>