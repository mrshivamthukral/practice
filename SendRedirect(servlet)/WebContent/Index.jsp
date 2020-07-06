<html>
  <head>
      <style>
        .container{
                width:370px;    
                background-color:lightslategray; 
                padding:20px;
                color:white;
                position: absolute;
                top:50%;
                left:50%;
                transform: translate(-50%,-50%);
                border-radius: 20px;
        }
        .input{
                border: 2px solid gray;
                 
               justify-content: center;
                
                width: 220px;
                font-size: 18px;
            }
        
             .btn{
                width:50%;       
                border-radius: 50px;
                padding:5px;
                font-size: 13px;
                cursor: pointer;
                margin: 12px 0;
                color:rgb(36, 35, 35);
                
            } 
        
        
      </style>
  </head>
  <body >
    <form align="center" class="container" action="SendRedirect" >
      <h1>Enter Url</h1>
      <font color="white" size="4">
      ${MSG}</font><br/>
      <input class="input" type="text" name="page"/><br/><br/>
      <input class="btn" type="submit" value="Submit"/>
    </form>
  </body>
</html>