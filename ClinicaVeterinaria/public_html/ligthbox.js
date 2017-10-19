function openModal() {
    $('#myModal').css("display", "block");
}

function closeModal() {
    $('#myModal').css("display", "none");
}

var slideIndex = 1;
showSlides(slideIndex);

function plusSlides(n) {
    showSlides(slideIndex += n);
}

function currentSlide(n) {
    showSlides(slideIndex = n);
}

function showSlides(n) {
    $(".mySlides").each(function(index, element){
        slideIndex = index;

        $(element).css("display", "none");
    });

    $(".demo").each(function(index, element){
        $(element).removeClass("active");
    });

    $(".mySlides:nth-child("+slideIndex+")").css("display", "block");
    dot = $(".demo:nth-child("+slideIndex+")");                                
    dot.addClass("active");

    $("#caption").html(dot.attr("alt"));
}
                    
                    
//document.getElementById("uploadBtn").onchange = function () {
//    document.getElementById("uploadFile").value = this.value;
//};