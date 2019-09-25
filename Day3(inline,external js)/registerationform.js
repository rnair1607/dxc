function check(){
    var userName = document.getElementById("userId").value;
    var password = document.getElementById("password").value;
    var confirmPassword = document.getElementById("confirmPassword").value;
    var fullName = document.getElementById("fullName").value;
    var gender = document.getElementsByName("gender").value;
    var qualification = document.getElementById("qualification").value;
    var alertBy = document.getElementById("alertby").value;
    var userNameError = document.getElementById("usererror");
    var passwordError = document.getElementById("passworderror");
    var confirmPasswordError = document.getElementById("confirmpassworderror");
    var fullNameError = document.getElementById("fullnameerror");
    var genderError = document.getElementById("gendererror");
    var qualificationError = document.getElementById("qualificationerror");
    var alertError = document.getElementById("alerterror");
    
    if(userName.length == 0){
        userNameError.innerHTML="<font color = red> Required</font>";
    }
    else{
        userNameError.innerHTML="";
    }
    if(password.length==0){
        passwordError.innerHTML="<font color = red> Please enter a password</font>";
        
    }
    else{
        passwordError.innerHTML="";
    }
    if(confirmPassword.length==0){
        confirmPasswordError.innerHTML="<font color = red> Please enter the same password</font>";
    }
    else{
        confirmPasswordError.innerHTML="";
    }
    if(confirmPassword != password){
        confirmPasswordError.innerHTML="<font color = red>Password doesn't match</font>";
    }
    else{
        confirmPasswordError.innerHTML="";
    }
    if(fullName.length == 0){
        fullNameError.innerHTML="<font color = red>Please enter your Full Name</font>";
        
    }
    else{
        fullNameError.innerHTML="";
    }
    if(qualification == "---" ){
        qualificationError.innerHTML="<font color=red>Please select one qualification</font>";
    }
    else{
        qualificationError.innerHTML="";
    }
    if(alertBy != SMS && alertBy != mail){
        alertError.innerHTML="<font color=red>Please one way of getting notifications</font>";
    }
    else{
        alertError.innerHTML="";
    }
}