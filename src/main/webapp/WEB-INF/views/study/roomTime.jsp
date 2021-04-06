<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>룸 예약시간</title>
    <script  src="http://code.jquery.com/jquery-latest.min.js"></script>
    <script>
       function serviceCheck(){
    	   alert("예약진행중 [serviceCheck 진입]");
    	   $.ajax({
               url:"/serviceCheck",
               type:"get",
               data:{
                  //"id":$("#id").val(),"pw":$("#pw").val()
               },
               contentType:"application/json",
               success:function(data){
            	   alert("예약 성공");
                  if(data.serviceCheck==1){
                     alert(data.message);
                     location.href="../main";
                  }else{
                     alert(data.message);
                  }
               },
               error:function(){
            	   alert("예약실패");
               }
    	   });

       }
    
    </script>
</head>
<body>
	<h2>룸 예약시간</h2>

	<form action="">
		<h3>공간선택</h3>
		<h2>스터디룸</h2>
		<select name=job>
			<option value="" selected>선택하세요.
			<option name=""id=""value="룸 01 ">룸 1
			<option name=""id=""value="룸 02 ">룸 2
			<option name=""id=""value="룸 03 ">룸 3
			<option name=""id=""value="룸 04 ">룸 4
			<option name=""id=""value="룸 05 ">룸 5
		</select><br>
		<h2>날짜선택</h2>
		<input type="text"name=""id=""value="날짜 (yyyy-MM-dd)"><br>
		<h2>시간선택</h2>
		<select name=job>
			<option value="" selected>선택하세요.
			<option name="RS_date1"id=""value="09시 ">09:00 - 10:00
			<option name="RS_date1"id=""value="10시 ">10:00 - 11:00
			<option name="RS_date1"id=""value="11시 ">11:00 - 12:00
			<option name="RS_date1"id=""value="12시 ">12:00 - 13:00
			<option name="RS_date1"id=""value="13시 ">13:00 - 14:00
			<option name="RS_date1"id=""value="14시 ">14:00 - 15:00
			<option name="RS_date1"id=""value="15시 ">15:00 - 16:00
			<option name="RS_date1"id=""value="16시 ">16:00 - 17:00
			<option name="RS_date1"id=""value="17시 ">17:00 - 18:00
			<option name="RS_date1"id=""value="18시 ">18:00 - 19:00
		</select><br>
	<input type="button" onclick="serviceCheck()" class="btn_login" value="예약하기">

	</form>

</body>
</html>