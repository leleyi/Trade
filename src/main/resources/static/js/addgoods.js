$(function () {

    parent.$("#header-bottom").hide();
    parent.$("#header_buttom_in").hide();

    // $('#myTab a:last').tab('show');
    $('#myTab a').click(function () {
        $(this).tab('show');
    })

})
