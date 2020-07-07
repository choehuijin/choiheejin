package org.edu.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ControllerAdviceException {
   private static final Logger logger = LoggerFactory.getLogger(ControllerAdviceException.class);
   @ExceptionHandler(Exception.class)
   public ModelAndView errorModelAndView(Exception ex, HttpServletRequest request ) {
	   ModelAndView modelAndView = new ModelAndView();
	   //클래스는 대문자로 시작 클래스 변수는 소문자로 시작
	   //모델앤뷰에서 셋뷰네임은 jsp파일명과 매칭되어야 함
	   modelAndView.setViewName("admin/error_controller");
	   modelAndView.addObject("exception", ex);
	   //에러 발생시 이전페이지 URL을 session 변수로 jsp로 보내는 코딩
	   String referer = request.getHeader("Referer");
	   //에러 이전 페이지의 Referer 값을 변수로 저장한 String referer를 
	   //세션으로 저장해서 jsp 페이지에 prePage 변수로 보내는 작업 (아래코드)
	   request.getSession().setAttribute("prevPage", referer);
	   //세션변수의 출현배경(아래)
	   //브라우저는 stateless(무상태 보존 없음) 기반이기 때문에
	   //링크 이동 시 이전 페이지의 저장 값이 이동한 페이지에서 사라지기 때문에 stateless 라고 함
	   //스테이트리스 상태에서 계속 값을 유지하려면 세션 변수를 사용하게 됌
	   return modelAndView;
   }
}