$(document).ready(function () {
    // init_confirm_button();
    vbind_userinfo()
});

/*header 点击事件加载*/
function vbind_userinfo() {
    var loginForm= new Vue({
        el: "#loginForm",
     //   props:["loginStatus"],
        data() {
            return {
                username: "",
                password: "",
                message:""
            }
        },
        methods: {
            postLoginRequest(){
                var url = "/user/login";
                var _this = this;
                $.post(url,{ username: _this.username,password:_this.password} , function (data) {
                    if(data.code == 200){
                        // var value = window.parent.document.getElementById('tmpValue').innerHTML = "个人信息"
                        // alert(window.parent.document.getElementById('tmpValue').value)
                        // // window.parent.vbind_index_info()
                        // window.parent.vbind_index_info()
                        parent.location.reload();
                        var iframe_box = window.parent.document.getElementById('iframe_box');
                        userinfo ={
                            loginStatus:true,
                            personalInfo:"",
                            username:"",
                            keyword:"",
                            password:""
                        };
                        // iframe_box.contentWindow.vbind_index_info(data)
                        // window.parent.document.getElementById('personalInfo').href ="http://localhost:8080?username=";
                        // window.parent.document.getElementById('personalGoods').href ="http://localhost:8080?username=";
                        // window.parent.document.getElementById('personalInfo').innerHTML = "个人信息"
                    }else if(data.code == 400){
                        var iframe_box = window.parent.document.getElementById('iframe_box');
                        $(iframe_box).attr('src', "./home.html");
                        _this.message = data.message
                    }else {
                        _this.message = "服务器罢工了，稍后再试"
                    }
                })
            }
        },
        updated:function(){

        }
    })

    var registerForm = new Vue({
        el: "#registerForm",
        data() {
            return {
                email:"",
                username: "",
                password: "",
                message:"",
                phone:"",
            }
        },
        methods: {
            postRegisterRequest(){
                var url = "/user/regist";
                var _this = this;
                $.post(url,{ username: _this.username,password:_this.password,email:_this.email,phone:_this.phone} , function (data) {
                    if(data.code == 200){
                        var iframe_box = window.parent.document.getElementById('iframe_box');
                        $(iframe_box).attr('src', "./login.html");
                    }else if(data.code == 400){
                        _this.message = data.message
                    }else {
                        _this.message = "服务器罢工了，稍后再试"
                    }
                })
            }
        },
    });
}





