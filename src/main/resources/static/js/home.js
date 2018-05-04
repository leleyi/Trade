$(function () {

    init_home_control()

    vbind_goods_featured_list(function () {
        var iframe_box = window.parent.document.getElementById('iframe_box');
        // $(iframe_box).height = $(iframe_box).contentWindow.document.documentElement.scrollHeight;
    });

});
/*初始化控件*/
function init_home_control() {
    /*最新商品滚动*/
    $("#flexiselDemo2").flexisel({
        visibleItems: 4,
        animationSpeed: 1000,
        autoPlay: true,
        autoPlaySpeed: 3000,
        pauseOnHover: true,
        enableResponsiveBreakpoints: true,
        responsiveBreakpoints: {
            portrait: {
                changePoint: 480,
                visibleItems: 1
            },
            landscape: {
                changePoint: 640,
                visibleItems: 2
            },
            tablet: {
                changePoint: 768,
                visibleItems: 3
            }
        }
    });
    /*轮播滚动控件*/
    $("#flexiselDemo1").flexisel({
        visibleItems: 4,
        animationSpeed: 1000,
        autoPlay: true,
        autoPlaySpeed: 3000,
        pauseOnHover: true,
        enableResponsiveBreakpoints: true,
        responsiveBreakpoints: {
            portrait: {
                changePoint: 480,
                visibleItems: 1
            },
            landscape: {
                changePoint: 640,
                visibleItems: 2
            },
            tablet: {
                changePoint: 768,
                visibleItems: 3
            }
        }
    });
}

//*vue进行数据以及事件的绑定*/
function vbind_goods_featured_list(callback) {

    var adv = new Vue({
        el:'#adv_list',
        data:{
            advList:[]
        },
        methods: {
            goodsDetail: function (goods) {
                var iframe_box = window.parent.document.getElementById('iframe_box');
                $(iframe_box).attr('src', "./single.html?id=" + goods.id)
            },
        },
        created: function () {
            var url = "/goods/getAdvList";
            var _self = this;
            $.get(url, function (data) {
                _self.advList = data.data;
            })
        },
        updated:function () {
            $("#slider1").responsiveSlides({
                auto: true,
                speed: 500,
                namespace: "callbacks",
                pager: true,
            });

        }
    })

    var featured = new Vue({
        el: "#featured_list",
        data: {
            itemList: []
        },
        methods: {
            goodsDetail: function (goods) {
                var iframe_box = window.parent.document.getElementById('iframe_box');
                $(iframe_box).attr('src', "./single.html?id=" + goods.id)
            },
            enjoyGoods(goods){
                var url = "/goods/enjoyGoods";
                $.get(url,{id:goods.id},function (data) {
                    goods.enjoy +=1;
                })
            }
        },
        created: function () {
            var url = "/goods/getFeaturedList";
            var _self = this;
            $.get(url, function (data) {
                _self.itemList = data.data;
            })
        }
    });

    var newest = new Vue({
        el: "#newest_list",
        data: {
            newestList: [],
        },
        methods: {
            goodsDetail: function (goods) {
                var iframe_box = window.parent.document.getElementById('iframe_box');
                $(iframe_box).attr('src', "./single.html?id=" + goods.id)
            },
            enjoyGoods(goods){
                var url = "/goods/enjoyGoods";
                $.get(url,{id:goods.id},function (data) {
                    goods.enjoy +=1;
                })
            }
        },
        created: function () {
            var url = "/goods/getNewestList";
            var _self = this;
            $.get(url, function (data) {
                _self.newestList = data.data;
                //  init_goods_href();
            })
        }
    })

    //渲染完毕之后改变窗体大小
    callback();

}

