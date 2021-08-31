

function validateForm() {
    // window.location.href = "google.com";

  
    // console.log(baseurl)
        let username = document.getElementById("username").value;
        let password = document.getElementById("password").value;
        if(password!="a"){
            alert("Wrong password");
            return false;
        }

        if(username=="mario"){
            localStorage.setItem("userId", 3);
        }else if(username=="ari"){
            localStorage.setItem("userId", 1);
        }else if(username=="nelson"){
            localStorage.setItem("userId", 2);
        }else if(username=="eliezer"){
            localStorage.setItem("userId", 4);
        }else{
            alert("Wrong password");
            return false;
        }


        window.location.href = "chat-app.html";

        return false;

}

