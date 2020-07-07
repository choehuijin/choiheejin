package org.edu.vo;
public class PageVO {
   private int startBno;
   private int perPageNum;
 //다른 것들은 내장형 변수 int 사용하고 page는 Integer 클래스 변수 사용 한 이유
 //int는 null 이 없지만 Integer는 null이 가능하기 때문에 
 //(즉, jsp단에서 null로 값이 올 때 에러가 발생하지 않도록 하기 위해 Integer사용)
   private Integer page; 
   private int totalCount;
   private int endPage;
   private int startPage;
   private boolean prev;
   private boolean next;
   //검색용 변수 2개 추가
   private String searchType;
   private String searchKeyword;
   
   public String getSearchType() {
	return searchType;
}

public void setSearchType(String searchType) {
	this.searchType = searchType;
}

public String getSearchKeyword() {
	return searchKeyword;
}

public void setSearchKeyword(String searchKeyword) {
	this.searchKeyword = searchKeyword;
}

private void calcPage() {
	   //page 변수는 현재 jsp에서 클릭 한 페이지 번호이다.
	   int tempEnd = (int)(Math.ceil(page/10.0)*10);
	   //ceil 함수는 천장함수로 0.9는 -> 1출력 1.1은 -> 2출력
	   //반대되는 바닥함수로는 floor(), 반올림 함수로 round()가 있다.
	   //jsp에서 클릭한 페이지번호를 기준으로 끝 페이지를 계산한다.
	   this.startPage = tempEnd - 9; 
	   //시작페이지 계산 클릭한 page 번호 10일때까지 시작하는 페이지는 1
	   if(tempEnd * 10 > this.totalCount) {
		 //클릭한 page번호로 계산된 게시물 수가 실제 게시물 개수인 totalconnt보다 클 때  
	   this.endPage = (int)Math.ceil(this.totalCount/10.0);
	   }else {
	   ////클릭한 page번호로 계산된 게시물 수가 실제 게시물 개수인 totalconnt보다 작을 때
		   this.endPage = tempEnd;
   }
   this.prev = this.startPage !=1; //시작페이지 1보다 크면 무조건 이전 페이지가 있다.
   this.next = this.endPage *10 < this.totalCount;
   //현재 클릭한 page qjsghfh 계산된 게시물 수가 실제 개시물 개수보다 작다면 다음 페이지가 있음 true
   }

   public int getTotalCount() {
	      return totalCount;
	   }
	   public void setTotalCount(int totalCount) {
	      this.totalCount = totalCount;
	      calcPage();//totalCount 전체게시물개수가 있어야지 페이지계산을 할 수 있기 때문에
	   }
	   public int getEndPage() {
	      return endPage;
	   }
	   public void setEndPage(int endPage) {
	      this.endPage = endPage;
	   }
	   public int getStartPage() {
	      return startPage;
	   }
	   public void setStartPage(int startPage) {
	      this.startPage = startPage;
	   }
	   public boolean isPrev() {
	      return prev;
	   }
	   public void setPrev(boolean prev) {
	      this.prev = prev;
	   }
	   public boolean isNext() {
	      return next;
	   }
	   public void setNext(boolean next) {
	      this.next = next;
	   }
	   public Integer getPage() {
	      return page;
	   }
	   public void setPage(Integer page) {
	      this.page = page;
	   }
	   public int getStartBno() {
	      //DB쿼리에서 사용.. 시작데이터번호 = (jsp 클릭한 페이지번호 -1)*페이지당 보여지는 개수
	      startBno = (page - 1) * perPageNum;
	      return startBno;
	   }
	   public void setStartBno(int startBno) {
	      this.startBno = startBno;
	   }
	   public int getPerPageNum() {
	      return perPageNum;
	   }
	   public void setPerPageNum(int perPageNum) {
	      this.perPageNum = perPageNum;
	   }
}