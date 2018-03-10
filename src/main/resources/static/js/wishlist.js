$(function () {

    parent.$("#header-bottom").hide();
    parent.$("#header_buttom_in").hide();

    // $('#myTab a:last').tab('show');
    $('#myTab a').click(function () {
        $(this).tab('show');
    })

    init_my_goods_list();
})

/*个人物品列表*/
function init_my_goods_list() {
    var myGoods = new Vue({
        el:'#my_goods_list',
        data: {
            myGoodsList: []
        },
        created: function () {
            var url = "/goods/getMyGoodsList?id=1";
            var _self = this;
            $.get(url, function (data) {
                _self.myGoodsList = data.data;
            })
        }
    })
}