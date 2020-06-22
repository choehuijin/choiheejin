package kr.or.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class OpenApi {
   
   //외부연계 메서드
   public static void serviceApi() {
      BufferedReader br = null; //HRD넷에서 전송 받은 데이터를 일시 저장하는 저수지 같은 역할
      String urlstr = "http://www.hrd.go.kr/jsp/HRDP/HRDPO00/HRDPOA60/HRDPOA60_1.jsp?returnType=XML"
    		  + "&authKey=yKt63a6Wtxfq282kkIdQAZVXtSlPW5GF&pageNum=1&pageSize=10"
    		  + "&srchTraStDt=20200622&srchTraEndDt=20200922&outType=1&sort=ASC&sortCol=TR_STT_DT";
      try {
         URL url = new URL(urlstr);
         HttpURLConnection urlconnection = (HttpURLConnection) url.openConnection();
      urlconnection.setRequestMethod("GET");
      br = new BufferedReader(new InputStreamReader(urlconnection.getInputStream(),"euc-kr"));
      String result = "";
    		  String line;
    		  while((line= br.readLine()) !=null) {
    			  result = result + line + "\n";
    			  //1부터 100까지 더하는 로직과 같음
    		  }
    			  System.out.println(result);
      
      } catch (MalformedURLException e) {
         e.printStackTrace();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }

   public static void main(String[] args) {
      serviceApi();
   }

}