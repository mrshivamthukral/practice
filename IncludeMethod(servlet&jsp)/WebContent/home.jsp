
<!DOCTYPE html>
<html>
<head>
<style>
	.content{
             
             height: 517px;
             transform:translate(0,30%);
             
         }
           p{
           margin: 0px;
           padding: 0px;                 
           } 
           
           
           
</style>
</head>
<body>

<header>
<jsp:include page="header.html"/>
</header>
<div class="content" align="center">
<h2>Hello ${UN}</h2>
<h2>!welcome to my website every thing is going good!!!!!</h2>
<h2>Include Method is Working properly?</h2>
</div>
<footer>
<jsp:include page="footer.html"/>
</footer>


</body>
</html>