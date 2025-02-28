<%@page import="org.json.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="TodoBoard.Board"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>


<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

	
	*{
		margin:0px;
		padding:0px;
	}
	
ul {
	background: #faf9f8;
	box-shadow: 1px 1px 1px 1px #edeceb;
	border-radius: 5px;
}

li {
	list-style: none;
	line-height: 30px;
	padding-left: 20px;
}
	
	button{
		width: 50px;
		height: 30px;
		color: #2564cf;
		background-color: white;
		border: 1px solid #e1dfdd;
		transition: all 0.2s ;
		
	}
	button:hover{
		background: #faf9f8;
	}
	hr{
		background:#e1dfdd;
  		height:1px;
    	border:0;
    	margin-top: 15px;
    	margin-bottom: 15px;
	}
	header{
		width: 100%;
		height:48px;
		background-color: #2564cf;
		/*border: 1px solid black;*/
		
		position: relative;
		display: flex;
	}
	header img{
		width: 15px;
		height: 15px;
		margin-left: 10px;
		margin-top: 14px;
	}
	header .title{
		color: white;
		font-size: 16px;
		font-weight: bold;
		margin-left: 40px;
		position: relative;
		top: 12px;
​
	}
	header .wrapSearch{
		width: 400px;
		height: 32px;
		background-color: white;
		border-radius: 5px;
		margin: 0 auto;
		margin-top: 7px;
		
		z-index: 9999;
		
	}
	.wrapSearch img{
		position: relative;
		top: -5px;
	}
	header .searchInsert{
		width: 300px;
		height: 20px;
		outline: none;
		border: none;
		margin-left: 10px;
		position: relative;
		top: -23px;
		left: 22px;
		
	}
	.logOutIcon{
		width: 35px;
		height: 35px;
		
		position: absolute;
		right: 10px;
		top: -8px;
		
		filter: invert(100%) sepia(0%) saturate(7499%) hue-rotate(169deg) brightness(125%) contrast(98%);
	}
	
	.wrapContents{
		display: flex;
	}
	nav{
		width: 15%;
		height: 900px;
		border-right: 1px solid #edeceb;
		padding-top: 15px;
		position: relative;
	}
	.wrapMenu{
		width: 90%;
		height: 50px;
		line-height: 50px;
		text-align: left;
		padding-left: 30px;
	}
	.wrapMenu img{
		margin-right: 5px;
		position: relative;
		top: 2px;
	}
	.wrapMenu:hover{
		background-color: #eff6fc;
	}
	a{
		color: black;
		text-decoration: none;
		font-size: 14px;
	}
	a:hover{
		font-weight: bold;
	}
	
	section{
		width: 85%;
		height: 900px;
		background-color: #faf9f8;
		/*border: 1px solid black;*/
		padding-top: 20px;
	}
	.todayToDoTitle{
		font-size: 20px;
		color: #292827;
		font-weight: bold;
		margin-left: 25px;
	}
	.toDo{
		width: 97%;
		height: 52px;
		border: 1px solid #edeceb;
		background-color: white;
		box-shadow: 1px 1px 1px #edeceb;
		border-radius: 5px;
		margin: 10px auto;
		line-height: 52px;
		
		position: relative;
	}
	
	/*.checkBox {
        /* border: 1px solid black; 
        float: left;
        margin-left: 70px;
        margin-top: -65px;
        cursor: pointer;
      }
      */
      
      .checkBox{
		  position: relative;
		  top: 3px;
	  }
      
      .toDo label{
		  padding-left: 5px;
	  }
      
      #toDoInsert{
		  width: 90.5%;
		  height: 46px;
		  outline: none;
		  border: none;
		  padding-left: 5px;
		
	  }
      input[type="checkbox"] {
	    width: 1rem;
	    height: 1rem;
	    border-radius: 50%;
	    border: 1px solid #999;
	    appearance: none;
	    cursor: pointer;
	    transition: background 0.2s;
	    
	    margin-left: 10px;
  }
      
      input[type="checkbox"]:checked {
        appearance: none;
        background-color: #2564cf;
        width: 1rem;
        height: 1rem;
        border: 2px solid black;
        border-radius: 50%;
      }
      .wrapButton{
		 position: absolute;
		 right: 15px;
		 top: 0px;
	  }
	  
	  .code {
	display: none;
}

.searchBtn {
	background-image:
		url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAACXBIWXMAAAsTAAALEwEAmpwYAAAD8UlEQVR4nO2ZXYhVVRTH9wyRJUhZ2kPRJxolOXPPXufaKNFEJSQiROJLpuOcte6ZDIbwqcfpgxChh4pejMowggrR6NGPpl5E8+61TjPCwBSEQUnYx0NYJjU39h0v3Ls9907es891bswfztu9/31++2PttdZRakEL6m71j8htAZondImfA5IX7KNL/HyAyVMQl+9TqtKj5qsCNPdr4j2AMg0klZYP8k+AvA9QHlHzRYVhXqVRPgXimTkB0qFMWOINVw1gcGz8Go38CqBcbAuAGh+NcmAAT9/UUYjVOyeWAsmXTV+K5G9APgHEHwHK60DymibZD8jHAOV889WRMwGavo5AFIZ5uSaeTAdg1iQ7IC4va/b/gV3Hrw8w2QTEh9KB+DeIkwdzhYC4vFijfJXyAj8A8tNqrNJ7JX5BZNam+qGcK1Jyb34gxO+lrUK4Y/L2dj1XbTl9rSZ+N8V30k6cf4hINqasxNHBofHrvPiT7E7x3618Rygg+cZZ/mmvUWas0gvIB53z8lc4PHGPtzHCyGxzYv8/YZQEyrPWRVNLAOVHZ6y3vQ0AJMed8Lpf5SRNEjv3yx8Ql2/IbNw/Inc13to8E6BZoXLSoN3GKGfqYQKUZzIbAzK5UcrLG7cQkLzhHPr3VVYB8V7nkL+ocpam5FFnzKnspihf1JuGJbNZ5SyIy8sckIt2y2UyddMRTeUBlbsqPZrkz/pxM4d69/7INXWokxuGs2QPlwzZNESQyKxVuavSA8gXvK6IRjnS6TNSGObl7g2f+YwA8ltOKHxJ5awgMo/5j1okWxtvWhYvb9tCGuVNJ03Zp3x0RGxuVW9cGOGVKs8Smvh7JyXa6sVckxx2tteHKicB8k5nW523yaQnc9niZr+aDCjPWhdNLdEkZ52DvtffCGOVXptjOTP1bXHbyZu9joG2rdQwYRfWUHK38ilNUrq8guPPbTPBjz/vSandX1U+VSQpaJKfU0rRahSDuHxHu94rRqcXpfUCAHnC1yRVBfHXWhP/kgZRF1XO2irySrsoECcPuZnDpZU457Xm+S8QzpOEURL1PZvc0tyzvBgieRKIP0v1QP4VUNZcTYjGqDbbr/qk1mkE4g808Xi1dG3+v+/CKHmgYxC2JWrLTyAzCsi/twVLl0F8bFuxHYeo/T6IzJ12tm1i1w6AtiuHvN4bQDsQ9QoicyuQvAwkp6pN7DmCg0Z5J4jMw14BskK46h+SG8MSP17dfii7Zr9amVF7yHMtzIot7okaBBBvV/NZxTkgZjPf/wME8pCazwrQ9LW8J7oBonYgm3y06R6I1jA8AygjqtvU3wDTpRANMMQnuxqipsx9owUtSHW9/gVC5jtJi6WCCwAAAABJRU5ErkJggg==");
	background-size: cover;
	background-position: center;
	width: 30px;
	height: 30px;
	border: none;
}
​
​
</style>

<script>

window.addEventListener("load", test);

function test(){
	$.ajax({
		type:"get",
		url:"/TodoTeamProject/mainData",
		dataType:"json",
		success:function(data){
			output='';
			$.each(data,function(){ 
				output+= '<span>';
				output+='<div class="toDo"><input type="checkbox" class="checkBox"><label for="toDo2">';
				output+= this.contents;
				output+= '</label><div class="wrapButton"><button onclick="selectContents('+ this.code + ')">수정</button><button>삭제</button></div></div>';
				output+= '</span>';
			});
			document.getElementById('disp').innerHTML = output;
		} 
	});
};

function test2(){
	$.ajax({
		type:"get",
		url:"/TodoTeamProject/completeData",
		dataType:"json",
		success:function(data){
			output='';
			$.each(data,function(){ 
				output+= '<span>';
				output+='<div class="toDo"><input type="checkbox" class="checkBox"><label for="toDo2">';
				output+= this.contents;
				output+= '</label><div class="wrapButton"><button onclick="selectContents('+ this.code + ')">수정</button><button>삭제</button></div></div>';
				output+= '</span>';
			});
			document.getElementById('disp').innerHTML = output;
		} 
	});
};
</script>




<script>
	window.addEventListener("load", test);

	function test() {
		$
				.ajax({
					type : "get",
					url : "/TodoTeamProject/mainData",
					dataType : "json",
					success : function(data) {
						output = '';
						$
								.each(
										data,
										function() {
											output += '<span>';
											output += '<p class="code">'
													+ this.code + "</p>";
											output += '<div class="toDo"><input type="checkbox" class="checkBox"><label for="toDo2">';
											output += this.contents;
											output += '</label><div class="wrapButton"><button onclick="selectContents('
													+ this.code
													+ ')">수정</button><button class="deleteButton">삭제</button></div></div>';
											output += '</span>';
										});
						document.getElementById('disp').innerHTML = output;
					}
				});
	};

	function selectContents(itemCode) {
		// Redirect to update.jsp with the item ID
		window.location.href = 'update?code=' + itemCode;
	}

	// 김민지 - 추가
	function addList() {

		let contents = $("input[name='contents']").val();

		$
				.ajax({
					type : "post",
					url : "/TodoTeamProject/register",
					data : "contents=" + contents,
					dataType : "text",
					success : function(data) {
						let output = '';
						output += '<span>';
						output += '<div class="toDo"><input type="checkbox" class="checkBox"><label for="toDo2">';
						output += contents;
						output += '</label><div class="wrapButton"><button onclick="selectContents('
								+ this.code
								+ ')">수정</button><button class="deleteButton" >삭제</button></div></div>';
						output += '</span>';

						$("#disp").append(output);

					},
					error : function(err) {
						alert("요청에 실패했습니다");
					}
				});

	}

	// 김민지 - 삭제

	$(document).on('click', '.deleteButton', function() {
		$(this).closest('span').remove();
		let code = $(this).closest('span').find('.code').text().trim();
		deleteList(code);

	});

	function deleteList(code) {

		$.ajax({
			type : "post",
			url : "/TodoTeamProject/delete",
			data : "code=" + code,
			dataType : "text",
			success : function(data) {

				$(code).remove();
			},
			error : function(err) {
				alert("삭제 요청에 실패했습니다.");
			}
		});
	}

</script>
</head>
<body>


	<div class="wrapOutside">

		<header>
			<img
				src="data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wBDABQODxIPDRQSEBIXFRQYHjIhHhwcHj0sLiQySUBMS0dARkVQWnNiUFVtVkVGZIhlbXd7gYKBTmCNl4x9lnN+gXz/2wBDARUXFx4aHjshITt8U0ZTfHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHx8fHz/wAARCABUAFUDASIAAhEBAxEB/8QAGwABAAMBAQEBAAAAAAAAAAAAAAQFBgMCAQf/xAArEAACAgEDAgUEAgMAAAAAAAABAgADBAUREgYxEyFBUZEyYXGhIoEUQrH/xAAZAQACAwEAAAAAAAAAAAAAAAADBAABAgX/xAAfEQADAQEBAQADAQEAAAAAAAAAAQIRAxIxBCFhEzL/2gAMAwEAAhEDEQA/AISqzsFUEsTsAPWWqdPZroGJqQn/AFZjv+hPHTyo2prz23Ckr+Zro927VDxC3PmqWsweTjW4tprvQqw/c5TSdUKngUN5c+RA/G0zcPzv3Og7ny8OuNjW5VoroQsx/UsX6ezUQsDU5H+qsd/2JO6XVPAvby58gD+Npexbr3qaxBY5prWfn7KyMVYEMDsQfSfJZ9Qqi6m3DbcqC35lZGpr1KYFrHhLwtNyM4nwVAUd2Y7CdsvRMvFqNjBLFHfgd9po9HVF0zH4bbFdzt7+smEAgg9vWKV+RSr+B1yTR+fxOmQFXItCfSHIH43iOi58qtem1bK24up3Bl2nUzhALMZWf1IfYfG0oYmK5zf/AEjSpz8JOdnW513iXEeXkqjsBI0RNpJLEZb0k4Odbg3eJSR5+TKexEtX6mcoRXjKr+hL7j42lDExXOKetGldL9I922vda1ljcnY7kzxETZksdN1e7AU18RZV34k7bfgyRl9Q3X1GumoU8vIty3P9SmiDfKG9aNe6SzRERCGTrjY75V6U1DdmPxNCnTWOEHiXWl/UrsB/yVegWpVqa8ztyUqD95r4p36VNYg/KE1rMXqenPp9oUtzRvpbaQpouqLU8Omrf+fLlt7CZ2H5U6hNg7SVYibpmnPqFpUNwRfqbaXL9NY5Q+HdaH9C2xH/ACc+l7U8O6rf+fLlt7iX8V7dbV4g3OJc6zB5OO+Le9No2ZT8zlLLX7Ut1N+B34qFJ+8rY5DblNi9LHhb6Vopza/GvcpUewXuZKzOnEWkti2OXA34vsd/iWWjWpbplPA/QvEj2Ikx3VELuQFUbkmI12tWMzznyYAjY7GJ0vcWX2OvZmJHzE6Aqc5OTWM+tAi5DbD3AJ+SJBiU5T+otNr4erLHtcvYxdj3JO88xEso9V2PU4etijDsQdpMfWM+xCjZDbH2AB+QJBiU5T+otNr4IiJZR2xsu/Ectj2MhPfbsf6nTJ1LLyk4X3sy+wAA/UixK8rdwvX8EREsolabif5uYlJOy92P2msTTMKtAgxqiB6soJ+TMtpGWuHnJY/0EcWPsDNiliWIHrdWQ+YIPlEvyXSr+DHJLDMa7pteG6W0Datztx9jKiXfUWdVeUopYOEO7MO2/tKSM8vThegV56/Rb6FpteY723jetDtx9zL99MwrEKHGqAPqqgH5EpOnc6qgvRcwQOd1Y9t/aaN7ErQvY6qg8ySfKKd3asPzU+TF6lif4WY9IO691P2kWTdXy1zM57E+gDip9wJCjsb5W/Ras39Gl0XSaDjLkZCCx381DeYA/EmZmkYmRSVSlKn2/iyLt5/1OOhZ9V2JXQWC21jjxJ7j3EnZmZTh0my1wPLyX1J+0Qur/wBP6NSp8mIdSjsjd1OxiLXNlrue7MSf7idEUPMREhBERIQRESEEREhBERIQRESEP//Z">
			<p class="title">To Do</p>

			<div class="wrapSearch">
				<img width="30px" height="30px"
					src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAACXBIWXMAAAsTAAALEwEAmpwYAAAD8UlEQVR4nO2ZXYhVVRTH9wyRJUhZ2kPRJxolOXPPXufaKNFEJSQiROJLpuOcte6ZDIbwqcfpgxChh4pejMowggrR6NGPpl5E8+61TjPCwBSEQUnYx0NYJjU39h0v3Ls9907es891bswfztu9/31++2PttdZRakEL6m71j8htAZondImfA5IX7KNL/HyAyVMQl+9TqtKj5qsCNPdr4j2AMg0klZYP8k+AvA9QHlHzRYVhXqVRPgXimTkB0qFMWOINVw1gcGz8Go38CqBcbAuAGh+NcmAAT9/UUYjVOyeWAsmXTV+K5G9APgHEHwHK60DymibZD8jHAOV889WRMwGavo5AFIZ5uSaeTAdg1iQ7IC4va/b/gV3Hrw8w2QTEh9KB+DeIkwdzhYC4vFijfJXyAj8A8tNqrNJ7JX5BZNam+qGcK1Jyb34gxO+lrUK4Y/L2dj1XbTl9rSZ+N8V30k6cf4hINqasxNHBofHrvPiT7E7x3618Rygg+cZZ/mmvUWas0gvIB53z8lc4PHGPtzHCyGxzYv8/YZQEyrPWRVNLAOVHZ6y3vQ0AJMed8Lpf5SRNEjv3yx8Ql2/IbNw/Inc13to8E6BZoXLSoN3GKGfqYQKUZzIbAzK5UcrLG7cQkLzhHPr3VVYB8V7nkL+ocpam5FFnzKnspihf1JuGJbNZ5SyIy8sckIt2y2UyddMRTeUBlbsqPZrkz/pxM4d69/7INXWokxuGs2QPlwzZNESQyKxVuavSA8gXvK6IRjnS6TNSGObl7g2f+YwA8ltOKHxJ5awgMo/5j1okWxtvWhYvb9tCGuVNJ03Zp3x0RGxuVW9cGOGVKs8Smvh7JyXa6sVckxx2tteHKicB8k5nW523yaQnc9niZr+aDCjPWhdNLdEkZ52DvtffCGOVXptjOTP1bXHbyZu9joG2rdQwYRfWUHK38ilNUrq8guPPbTPBjz/vSandX1U+VSQpaJKfU0rRahSDuHxHu94rRqcXpfUCAHnC1yRVBfHXWhP/kgZRF1XO2irySrsoECcPuZnDpZU457Xm+S8QzpOEURL1PZvc0tyzvBgieRKIP0v1QP4VUNZcTYjGqDbbr/qk1mkE4g808Xi1dG3+v+/CKHmgYxC2JWrLTyAzCsi/twVLl0F8bFuxHYeo/T6IzJ12tm1i1w6AtiuHvN4bQDsQ9QoicyuQvAwkp6pN7DmCg0Z5J4jMw14BskK46h+SG8MSP17dfii7Zr9amVF7yHMtzIot7okaBBBvV/NZxTkgZjPf/wME8pCazwrQ9LW8J7oBonYgm3y06R6I1jA8AygjqtvU3wDTpRANMMQnuxqipsx9owUtSHW9/gVC5jtJi6WCCwAAAABJRU5ErkJggg==">
				<form action="searchtest" method="post">
					<input type="text" name="searchTerm" class="searchInsert"
						placeholder="검색어를 입력하세요">
					<!-- <input type="button" value=""
						class="searchBtn"> -->
				</form>

				<c:if test="${empty searchResults}">

				</c:if>

				<c:if test="${not empty searchResults}">
					<div class="box">
						<ul>
							<c:forEach items="${searchResults}" var="result">
								<li>${result}</li>
							</c:forEach>
						</ul>
					</div>
				</c:if>

			</div>

			<a href="/TodoTeamProject/logout"><img class="logOutIcon"
				src="https://img.icons8.com/material/24/000000/exit.png" alt="exit" /></a>
		</header>

		<div class="wrapContents">
			<nav>
				<div class="wrapMenu">
					<img width="17px" height="17px"
						src="https://img.icons8.com/ios/50/000000/sun--v1.png"
						alt="sun--v1" /> <a href="">오늘 할 일</a>
				</div>

				<div class="wrapMenu">
					<img width="17px" height="17px"
						src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAAACXBIWXMAAAsTAAALEwEAmpwYAAACaklEQVR4nO1WPWgUQRRe1EsTtRfEn0ZLC0HUCNe4sHfzfbOeuIWNCQa2FbEVrhERJJrKxiaIFpoujdhoZRQTJDaCTcSgWKv4Q2JUPnwLx7IX7vY2V+XBwDLvfd/3Zt7Mmw2CLduyElav13cAuEHyC8nPAK6naVoLhmUAZkj+7RwA7gxF3Ht/0QS/OeeOxXF8EsAPzcm3qeKtVmuPhG3V57N5kuOW1FfFbFoCJO+a+L28D8BDS2KmMsE0TWve+8MAzgC4CuC3tjuKor352DiOD5D8CWAdQFuYRqNxSAe2L9EkSXaSnCT5JKttblzrhtVtKIj/DuCxzoe4NxSP/x+olRzBO5JzJG+q1htdtyRJRkhOWOycYTtvygqAE4XgNE1rAD5Z8Cvv/aVms7k/GNDEIS5xGvfHwrKQPGgBH9rt9ragYhOnuKWh89Kt9r9IrjnnjlSdgDgBrEojDMPRwiAAt20Xlqpsrda6F4x7qmtgGIajAN5b4K2qEsgWBmC56+ozIzmm+2xJXAkGNHEYlzjHegJ57xM1FJJ/ALCsuLDWmNadc+f6BU8PWgphbeunBwFfrmD7p8qAZw18tmwCKqUt4lGZBOYtgeNlE1BrtwSe9w0G8NoSKDy5SZJsd85d0NB3F45TxrFYJoGX9pdzusDXAPCm46FZIhnl40iG5p8vfQa8/WZFUbTbnunFDuG3NrLXbkHx3vtdxjFpvtkyCUxkv1kAXlgfz4SWs63X0DOtuQ7/qnZQWJsbL9W/ST5QMzKSNQBPTXgkH685+Ug+U6xhhL3f7Yz0ZAD2OeeOqgS9YhQrjLClhbcsGJL9A6x5gYBpUb/TAAAAAElFTkSuQmCC"
						alt="sun--v1" /> <a href="">중요</a>
				</div>

				<div class="wrapMenu">
					<img width="17px" height="17px"
						src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAAACXBIWXMAAAsTAAALEwEAmpwYAAABu0lEQVR4nO1ZQUoDQRAcUPIMfYTmoFFy362anOYXBkE/IuITlHhSiSeNv4n6APUoiTQmMAwkYWczOwl0wZyyqe7q6eme7TVGoVAoNh4ATkjeA/gA8EtymmLhn/sdwIBkp7bj3W53l+RNKoe5WtC1+BAtIKfz9ETUSRuf6KksywPnXMskgnOuZa09JDn0bE96vd5xZTLJeY9kmMTjJSD54Nm/M1UhB3ZOIJE3DcP+78RcwLgygV9tUqbNIohNvzqZqvDz32QC6/iQu/owWCqA27wDJhOoAqg7sJkpVBTFPsk3kj8ARgD2wmestecAPmWR7MdwMJWAmWH/ovfq/16W5WlQRSZyOazCkVQAgO/A+Ffw38uwDAK4qMKRWsBoWfTCq7jsQPiGtYoj+RkQg7MovizI3/7sFVRutWeRHFNtZNROHA9qCjFdI8u6A1xDI8sqAGtoZLkFjOo2sqwCijU0suQCsO1jFWQebAFo1x1sDbwIPJuGQfLRE3AbQ9AJDuJQopJ6uAugLQELSvBRFKGMtsNy2PQCcBUdEfm4kFHERJx3zu2YupD5vIy45TA18IlpLLai00ahUChMk/gDm9RZhN0AqSYAAAAASUVORK5CYII="
						alt="sun--v1" /> <a href="">완료된 일정</a>
				</div>

				<hr>

				<div class="wrapMenu">
					<img width="17px" height="17px"
						src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAEIAAABCCAYAAADjVADoAAAACXBIWXMAAAsTAAALEwEAmpwYAAAEBUlEQVR4nO2bS4gcVRSGr0aJLnxEVPABigg+CISI4M5GwbHo8/+np8GajZIs1IYIPhYuXCjjQkTwAZpFXIi4ECUYUYhiIAuXGggikk0EHyg+ozJqwPGRGTnagbatmalbde/0ren64d/11D3nm3vPfdQt51rVU6/XO1dEtrh1kIhckmXZZpeSOp3OaQD2klw2A3hlMBicHqOtbrd7Dcmjw3b+APCgS0Uk7zwJYcQPRGrrwGg7AE6o6lUuBQF4bhyE9ZAYbZH8pgD6nEtBJPcUBPdGjLYA/DDelojc7lIQpxFEnudn2swwapIvFoB4e/x3IUzyx4K2BuO/i1Kse73e5fZfB/BVQRBJ2ooogCMkH1HVs2pDILmT5OKkE6vpL1X1+soQVDUnuZRAIiF6yC8istUbQr/fv5Dkz5NOILAPOedO8QJB8tEEAo/hm31BHEog6Bh+0gsEgG8TCDqGX/MFsZBA0MENYH8Lgi2I5bZHsB0ay22N4KrF8qlpL5afqOqNXhBWAgHgIwAHG+QvhnEfnJmZOc8bwio9Ys41SAB2A3in0+mcUechC00Hoaq62pH//Pz8qVmWXdrv9y/a0CBWkvUQko+R/H4kt89V9f48zzdNBQgR2QLg/VWK6j7rKRsahPx75nm4xAxzx4YFIeUhmA9UApFl2dkAXgLwNcmf1sFHReTuSBBsuv20EggUvOlaBy+p6g2hIQxBHKkK4oMJgFhe6wVwFQhD76kKYv+EQMxGgLAI4OqqIK4jeWydIez9zzQXBoK9utg5ntxCWRCmPM/PIXmLvQuJaRG5TUS2RegJS4UFGA2cPu3GTsXT9yUA9xQ+FA0DEQVC00D0YkFoEogsyzYDeK9CsT1RalGGhoAg+Xw0CE0BISLbKrytt9/vKt0IGgACwKu+PQHAXb6NLJQFYYcZJO+1FWaN88XXbY1QNj7b6JH8LSoEXxAAHqpQsQstIt0y8dkFsugQfEEw4BUCAC+UjO/N6BAqgHg3FAiSz4YaFrUh+IIAMAvgrwAQjqvqtYGGxceqKrUg+IIwqep2qxUAnqhiu7vd7XYvc/WGxeKwYM+utDP1FhKdPu3O5OiwAPC7JS8iO2ypvdbf/++4vqkgAJwP4DMAb9nZQZnkT4rklWVqUCNAVBVJ2D3uUFeH5lzDZMduw49q/lmKTyUIAA+P70WmFcTugrVFC4ItCLY9ggGGxncFNWLgGiSSLxfksM/3IYcLHmKXKW4SkSsa4B226izI4RkvEAAeD7ijTMYicqv3J8ckj0868MD+sNJmjOQggeBD2bb4211VAbiP5J8JJFLHxwB0XF2JyFY7MQbwawJJlfbw88ynbcfqQirP802qenECM8KazrLsgqDJuynW38Jd7bA6CVvsAAAAAElFTkSuQmCC"
						alt="sun--v1" /> <a href="">To Do Memo</a>
				</div>
			</nav>

			<section>

				<p class="todayToDoTitle">오늘 할 일</p>

				<div class="toDo">
					<input type="checkbox" class="checkBox"> <input type="text"
						id="toDoInsert" name="contents" placeholder="작업 추가">
					<button class="insertBtn" onclick="addList()">추가</button>
				</div>
				<div id="disp"></div>
		</div>



		</section>
	</div>

	</div>

	<div id="disp"></div>





</body>
</html>