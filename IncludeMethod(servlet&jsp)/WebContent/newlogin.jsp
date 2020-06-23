
<!DOCTYPE html>
<html>
    <head>
        <style>
            @import "https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css";
             body{
                    font-family: sans-serif;
                    background-image: url(image6.jpg);
            		background-size: cover;
                   
             }
            .login-box{
            	width:370px;    
                background-color:lightslategray; 
                padding:20px;
                color:white;
                position: absolute;
                top:50%;
                left:30%;
                transform: translate(-50%,-50%);
                 box-sizing: border-box; 
                border-radius: 20px;
            }
           
            .login-box h1{
               /*  float: left; */
                font-size: 40px;
                border-bottom: 6px solid #4caf50;
                margin-top: 0px;
                padding-top: 0px;
               display: inline;
            }
            
            .textbox{
                width:100%;
                overflow: hidden;
                font-size: 20px;
                padding:8px 0;
                margin: 8px 0;
                border-bottom: 1px solid #4caf50;
            }
            .textbox i{
                width:26px;
                float: left;
                text-align: center;
            }
            .textbox input{
                border: none;
                outline: none;
                background: none;
                color: white;
                width: 220px;
                float: left;
                margin: 0 10px;
                font-size: 16px;
            }
        
            .btn{
                width: 100%;
                background:#4caf50;
                border: 2px solid #4caf50;
                border-radius: 50px;
                padding:5px;
                font-size: 18px;
                cursor: pointer;
                margin: 12px 0;
                color:white;
                
            }
            
             ::-webkit-input-placeholder{
                 color:white;
                  transition: opacity .5s ease-in; 
                
             }
             :focus::-webkit-input-placeholder{
                 opacity: 0.4;
                 transition: opacity .5s ease-in-out;
             }
          
	    
         .content{
             
             height: 537px;
             
         }
           p{
           margin: 0px;
           padding: 0px;                 
           } 
          
           a{
           	margin:20px;
           	font-size: 19px;
           	font-style:  italic;
           	color:window;
           }
            
        </style>
    </head>
<body >

    <header >
<jsp:include page="header.html"/>
</header>
<div class="content"> 
 <div align="center" class="login-box">
  <form action="mylogin"> 
  
    <h1> Login Form</h1>
    <h5>
            <% Object obj=request.getAttribute("Msg");
             if(obj!=null){
             out.println(obj);
             }
             %>
        </h5>    
       
    <div class="textbox">
   
        <i class="fa fa-user" aria-hidden="true"></i>
       
        <input type="text" placeholder="Username" name="Uname"/>
    </div>
    <div class="textbox">
        <i class="fa fa-lock" aria-hidden="true"></i>
        
        <input type="password" placeholder="Password" name="password"/>
    </div>
   <input class="btn" type="submit" value="LogIn"/>
<a href="register.jsp">New user signup</a>
</form>
 </div>
</div>
<footer>
<jsp:include page="footer.html"/>
</footer>
</body>
</html>









