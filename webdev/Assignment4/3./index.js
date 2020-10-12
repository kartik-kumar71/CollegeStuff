$("#bt1").on("click", function() {
    $("div.circle").animate({
        left: '250px',
        opacity: '0.5',
        height: '150px',
        width: '150px'
    });
});

$("#hid").on("click", function() {
    if ($("div.circle").is(":visible")) {
        $("div.circle").hide();
    }
    else {
        $("div.circle").show();
    }
});


$("#fo").on("click", function() {
    $("div.circle").fadeOut();
});


$("#fi").on("click", function() {
    $("div.circle").fadeIn();
});


$("#ad").on("click", function() {
    if ($("p").length) {
        $("p").remove();
    }
    else {
        $("#ad").before("<p>This is some text</p>");
    }
});


$("#cs").on("click", function() {
    $("div.square").css({"height":"75px","width":"75px","background-color":"#0000ff"});
});

$("#dm").on("click", function() {
    var w = $("div.rectangle").width();
    var h = $("div.rectangle").height();
    $("div.rectangle").prepend("<p>"+w+"</p>");
    $("div.rectangle").prepend("<p>"+h+"</p>");
});