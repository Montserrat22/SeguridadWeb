'use strict'



var userName = false;
var password = false;
var lastName = false;
var correo = false;

inicio();

function inicio(){
    document.getElementById('form-regi:lab-ape').hidden = true;
    document.getElementById('form-regi:lab-name').hidden = true;
    document.getElementById('form-regi:lab-cont').hidden = true;
    document.getElementById('form-regi:lab-cont2').hidden = true;
    document.getElementById('form-regi:lab-correo').hidden = true;
}

function validatePassword(){ 
    let pass = document.getElementById('form-regi:regi-pass').value;
    
    if (pass.length > 4){
        document.getElementById('form-regi:lab-cont').hidden = true;
    }else{
        document.getElementById('form-regi:lab-cont').hidden = false;
    }
    enabledButton();
}


function confirmPassword(){ 
    let pass = document.getElementById('form-regi:regi-pass').value;
    let pass2 = document.getElementById('form-regi:regi-pass2').value;   
      
    if (pass === pass2){
        password = true;
        document.getElementById('form-regi:lab-cont2').hidden = false;
    }else{
        password = false;
        document.getElementById('form-regi:lab-cont2').hidden = true;
    }
    enabledButton();
}

function validateUser(){
    
    let user = document.getElementById('form-regi:regi-name').value;

    if (user.length >= 3 || user.length<20){
        userName = true;
        document.getElementById('form-regi:lab-name').hidden = true;
    }else{
        document.getElementById('form-regi:lab-name').hidden = false;
        userName = false;
    }
    enabledButton();
}

function validateApell(){
    
    let user = document.getElementById('form-regi:regi-ape').value;

    if (user.length > 3|| user.length<20){
        lastName = true;
        document.getElementById('form-regi:lab-ape').hidden = true;
    }else{
        document.getElementById('form-regi:lab-ape').hidden = false;
        lastName = false;
    }
    enabledButton();
}

function validateCorreo(){
    
    let email = document.getElementById('form-regi:regi-correo').value;

    let val = /^[-\w.%+]{1,64}@(?:[A-Z0-9-]{1,63}\.){1,125}[A-Z]{2,63}$/i;
    if (val.test(email)){
        document.getElementById('form-regi:lab-correo').hidden = true;
        correo = true;
        console.log(correo);
    } else {
        document.getElementById('form-regi:lab-correo').hidden = false;
        correo = false;
    }
    
    enabledButton();
}


function enabledButton (){
    console.log(userName + ',' + password+ ',' + lastName+ ',' + correo);
    if(userName && password && lastName && correo){
      document.getElementById('form-regi:bt-regis').disabled = false;
    }else{
      document.getElementById('form-regi:bt-regis').disabled = true;
    }
}

function finish(){
    
    let user = document.getElementById('form-regi:user').value;
    let pass = document.getElementById('form-regi:pass').value;
       
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


