// JavaScript code
showTime();
function showTime(){
    date = new Date();
    year = date.getFullYear();
    month = date.getMonth() + 1;
    day = date.getDate();
    hour = date.getHours();
    minute = date.getMinutes();
    second = date.getSeconds();
    
    document.getElementById("current_date").innerHTML = month + "/" + day + "/" + year + "<br>" + hour + ":" + minute + ":" + second ;
    setTimeout("showTime()", 1000);
}








