$(document).ready(function () {

    // init_header_href();

    init_index_utils();

    vbind_index_info();

});

/*初始化工具*/
function init_index_utils() {
    /*回到顶补*/
    var defaults = {
        containerID: 'toTop', // fading element id
        containerHoverID: 'toTopHover', // fading element hover id
        scrollSpeed: 1200,
        easingType: 'linear'
    };
    // $().UItoTop({easingType: 'easeOutQuart'});
    /*图片轮播js*/
    $(".scroll").click(function (event) {
        event.preventDefault();
        $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);
    });

    $('.alert-close1').on('click', function (c) {
        $('.message1').fadeOut('slow', function (c) {
            $('.message1').remove();
        });
    });
}

// /*header 点击事件加载*/
// function init_header_href() {
//
//     $("#wishlist").click(function () {
//         $("#iframe_box").attr('src', "./wishlist.html")
//     });
//
//     $("#contact").click(function () {
//         $("#iframe_box").attr('src', "./contact.html")
//     });
//
//     $("#checkout").click(function () {
//         $("#iframe_box").attr('src', "./checkout.html")
//     });
//
//     $("#addgoods").click(function () {
//         $("#iframe_box").attr('src', "./addgoods.html")
//     });
//     $("#login").click(function () {
//         $("#iframe_box").attr('src', "./login.html")
//     })
// }

//*vue进行数据以及事件的绑定*/
function vbind_index_info() {
    var indexInfo = new Vue({
        el: '#indexInfo',
        data() {
            return {
                loginInfo: {
                    personalInfo: "",
                    loginStatus: false,
                    username: "",
                    password: "",
                    message: "",
                },
                registerInfo:{
                    username: "",
                    password: "",
                },
                email: '',
                repassword:"",
                isMatching:"",
                isUsed:"",
                keyword: "",
                rules:{
                    username: [{required: true, message: '必填:姓名', trigger: 'blur'}],
                    email: [{required: true, message: '必填:电子邮箱', trigger: 'blur'}, {
                        type: 'email',
                        message: '邮箱格式不正确',
                        trigger: 'blur'
                    }],
                },
            }
        },
        methods: {
            //跳出登陆注册弹窗
            goWin(num) {
                if(num == 0){
                    $("#login").show();
                    $("#login").css("opacity", "1");
                }else {
                    $("#regist").show();
                    $("#regist").css("opacity", "1");
                }
            },
            //退出登陆弹出窗口
            cancel(num) {
                num == 0 ?  $("#login").css("display", 'none'):$("#regist").css("display", 'none')
            },
            //登陆
            goLogin() {
                var url = "/user/login";
                var _this = this;
                $.post(url, {username: _this.loginInfo.username, password: _this.loginInfo.password}, function (data) {
                    if (data.code == 200) {
                        _this.loginInfo.loginStatus = true;
                        _this.loginInfo.username = data.data.username;
                        $("#login").css("display", 'none');
                    } else if (data.code == 400) {
                        /*用户名密码错误*/
                        _this.loginInfo.message = data.message
                    } else {
                        _this.message = "服务器罢工了，稍后再试"
                    }
                })
            },

            //判断该用户名字是否存在
            isExist(){
                var url = "/user/isExist";
                var _this = this;
                $.get(url,_this.registerInfo.username,function (data) {
                    if(data.code == 500){
                        _this.isUsed = "该用户名已经被使用";
                    }
                })
            },
            //注册
            goRegist() {
                var url = "/user/register";
                var _this = this;
                $.post(url,{username: _this.registerInfo.username, password: _this.registerInfo.password,email:_this.email}, function (data) {
                    if (data.code == 200) {
                        //注册成功
                        alert("注册成功");
                        $("#regist").css("display", 'none');
                    } else {
                        _this.message = "服务器罢工了，稍后再试"
                    }
                })
            },
            //退出登陆
            goLogout() {
                var url = "/user/checkout";
                var _this = this;
                $.post(url, function (data) {
                    _this.loginInfo.loginStatus = false;
                })
            },
            search() {
                alert(this.keyword)
            },
            goBackProject(){
                var _this = this;
                window.location.href="http://localhost:8082?username="+_this.loginInfo.username+"&password="+_this.loginInfo.password
            },
        },
        created: function () {
            var url = "/user/loginStatus";
            var _this = this;
            $.get(url, function (data) {
                if(data.code == 200){
                    _this.loginInfo.loginStatus = true;
                    _this.loginInfo.username = data.data.username;
                }else {
                    _this.loginInfo.loginStatus = false;
                }
            })
        },
        updated: function () {
        }
    })
}





