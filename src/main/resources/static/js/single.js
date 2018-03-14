$(function () {

    vbind_goods_featured_detail();

})

/*获取路径中的参数*/
function getQueryString(name) {
    var result = window.location.search.match(new RegExp("[\?\&]" + name + "=([^\&]+)", "i"));
    if (result == null || result.length < 1) {
        return "";
    }
    return result[1];
}

/*获取商品详细信息,并绑定数据*/
function vbind_goods_featured_detail() {
    var info = new Vue({
        el: "#goodsDetail",
        data() {
            return {
                goodsDetail: {},
                similarList: [],
                hisGoodsList: [],
                emailMessages: {
                    goodsid: "",
                    goodsname: "",
                    goodsownerid: "",
                    senduserid: "",
                    sendusername: "",
                    givewords: "",
                    giveprice: "",
                }
            }
        },
        methods: {
            goGivePriceWin() {
                var _self = this;
                $.get("/user/loginStatus", function (data) {
                    if (data.code == 200) {
                        _self.emailMessages.senduserid = data.data.id;
                        _self.emailMessages.sendusername = data.data.username;
                        $("#givePrice").show();
                        $("#givePrice").css("opacity", "1");
                    } else {
                        alert("您尚未登陆");
                        parent.location.reload()
                    }
                })

            },
            cancel() {
                $("#givePrice").css('display', 'none');
            },
            sendMessage() {
                var url = "goods/sendEmailMessage";
                var _this = this;
                $.post(url, _this.emailMessages, function (data) {
                    alert("您的消息已经发送到了卖家邮箱--等回复");
                    _this.cancel();
                });
            },
            similarGoodsDetail(goods) {
                var iframe_box = window.parent.document.getElementById('iframe_box');
                $(iframe_box).attr('src', "./single.html?id=" + goods.id)
            },
        },
        created: function () {
            var url = "/goods/getGoodsDetail?id=" + getQueryString("id");
            var _self = this;
            $.get(url, function (data) {
                _self.goodsDetail = data.data.goodsDetail;
                _self.similarList = data.data.similarList;
                _self.hisGoodsList = data.data.hisGoodsList;
                /**/
                _self.emailMessages.goodsid = _self.goodsDetail.id;//商品id
                _self.emailMessages.goodsname = _self.goodsDetail.name;//商品名
                _self.emailMessages.goodsownerid = _self.goodsDetail.userid;//货主id
            })
        },
        // mounted(){
        //
        // },
        updated: function () {
            $('.flexslider').flexslider({
                animation: "slide",
                controlNav: "thumbnails"
            });
            console.log("flexslider：" + "加载了");
        }
    })
}