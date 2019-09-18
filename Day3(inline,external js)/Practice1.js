function check(){
                var userName = document.getElementById("username").value;
                var password = document.getElementById("password").value;
                var userNameError=document.getElementById("usernameerror");
                var passwordError=document.getElementById("passworderror");
                if(userName.length==0){
                    userNameError.innerHTML="<font color=red>Mandatory</font>";
                    return false;
                }
                else{
                    userNameError.innerHTML="";
                
                }
                if(password.length==0){
                    passwordError.innerHTML="<font color=red>Mandatory</font>";
                    return false;
                    
                }
                else if(password.length <6 || password.length >12){
                    
                    passwordError.innerHTML="<font color=yellow>Should be between 6-12</font>";
                    return false;
                    
                }
                else if(password.charAt(0)!="A"){
                    passwordError.innerHTML="<font color=yellow>Should start with \"A\"></font>";
                    return false;
                }
               
                
                else{
                    passwordError.innerHTML="";
                }
                
            }