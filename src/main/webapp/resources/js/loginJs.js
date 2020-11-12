'use strict'




var password = false;
var userName = false;

inicio();

function inicio(){
    document.getElementById('formid:lab-pass').hidden = true;
    document.getElementById('formid:lab-user').hidden = true;
}

function validatePassword(){ 
    let pass = document.getElementById('formid:pass').value;
    console.log(pass.length)
    if (pass.length > 4){
        password = true;
        document.getElementById('formid:lab-pass').hidden = true;
    }else{
        password = false;
        document.getElementById('formid:lab-pass').hidden = false;
    }
    enabledButton();
}

function validateUser(){
    
    let user = document.getElementById('formid:user').value;
    console.log(user.length);
    if (user.length > 4){
        userName = true;
        document.getElementById('formid:lab-user').hidden = true;
    }else{
        document.getElementById('formid:lab-user').hidden = false;
        userName = false;
    }
    enabledButton();
}


function enabledButton (){
    if(userName && password){
      document.getElementById('formid:bt-log').disabled = false;
    }else{
      document.getElementById('formid:bt-log').disabled = true;
    }
}

function finish(){
    
    let user = document.getElementById('formid:user').value;
    let pass = document.getElementById('formid:pass').value;
       
    if (user.length > 4){
        userName = true;
    }else{
        userName = false;
    }
    
    if (pass.length > 6){
        password = true;
    }else{
        password = false;
    }
    
    enabledButton();
}




console.log(password + ',' + userName);
