const inputEmail = document.querySelector('#inputId');
const btnRecover = document.querySelector('#btnRecover');
const okMessage = document.querySelector('#okMessage');
const error = document.querySelector('#error')
const emptyemail = document.querySelector('#Empttyemail');
const invalidEmail = document.querySelector('#InvalidEmail');

const er = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;



addEventListener();
function addEventListener(){
    document.addEventListener('DOMContentLoaded', startApp);
    inputEmail.addEventListener('blur', validateEmail);
    btnRecover.addEventListener('click', emailSent);
}



function startApp(){
    btnRecover.disabled= true;
}


function validateEmail(e){  
    if (e.target.value.length > 0) {
        if (er.test(e.target.value)) {
           btnRecover.disabled=false;
            invalidEmail.classList.add('visually-hidden');
            emptyemail.classList.add('visually-hidden');
           
        }else{
            invalidEmail.classList.remove('visually-hidden');
            emptyemail.classList.add('visually-hidden');
        }
    }else{
        emptyemail.classList.remove('visually-hidden');
        invalidEmail.classList.add('visually-hidden');
    }
}


function emailSent(e){
    e.preventDefault();
    okMessage.classList.remove('visually-hidden');
    btnRecover.disabled=true;
}

