$(function() {
    $("#sub").on("click",function() {
        if ($('input[name="gender"]:checked').length == 0) {
            alert("Please select gender");
        }

        if ($('input[name="checkbox1"]:checked').length == 0) {
            alert("Please accept privacy policy");
        }

        if ($("#day").val() == "") {
            alert("Please select day");
        }

        if ($("#month").val() == "") {
            alert("Please select month");
        }

        if ($("#nat").val() == "") {
            alert("Please select nationality");
        }

        if ($("#country").val() == "") {
            alert("Please select country");
        }

    });
});