<#macro page>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <title>CleanCity</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous"/>

    <link rel="stylesheet" type="text/css" href="style.css"/>

    <script src='https://www.google.com/recaptcha/api.js'></script>
</head>
<body>


    <#include "navbar.ftl">



<#--<div class="bluredBg" style="width: 100vw; height: 100vh; background: url(<#if springMacroRequestContext.requestUri?contains("/login")>'static/2222.gif'</#if>) center center fixed no-repeat;-webkit-background-size: cover;-moz-background-size: cover;-o-background-size: cover;background-size: cover;position: absolute; top: 0px; z-index: -1111 ">-->
<#--</div>-->


<#--<div class="overlay"></div>-->

<#--<!-- Sidebar &ndash;&gt;-->
<#--<nav class="navbar navbar-inverse navbar-fixed-top" id="sidebar-wrapper" role="navigation">-->
    <#--<ul class="nav sidebar-nav">-->
        <#--<li class="sidebar-brand">-->
            <#--<a href="#">-->
                <#--Brand-->
            <#--</a>-->
        <#--</li>-->
        <#--<li>-->
            <#--<a href="#">Home</a>-->
        <#--</li>-->
        <#--<li>-->
            <#--<a href="#">About</a>-->
        <#--</li>-->
        <#--<li>-->
            <#--<a href="#">Events</a>-->
        <#--</li>-->
        <#--<li>-->
            <#--<a href="#">Team</a>-->
        <#--</li>-->
        <#--<li class="dropdown">-->
            <#--<a href="#" class="dropdown-toggle" data-toggle="dropdown">Works <span class="caret"></span></a>-->
            <#--<ul class="dropdown-menu" role="menu">-->
                <#--<li class="dropdown-header">Dropdown heading</li>-->
                <#--<li><a href="#">Action</a></li>-->
                <#--<li><a href="#">Another action</a></li>-->
                <#--<li><a href="#">Something else here</a></li>-->
                <#--<li><a href="#">Separated link</a></li>-->
                <#--<li><a href="#">One more separated link</a></li>-->
            <#--</ul>-->
        <#--</li>-->
        <#--<li>-->
            <#--<a href="#">Services</a>-->
        <#--</li>-->
        <#--<li>-->
            <#--<a href="#">Contact</a>-->
        <#--</li>-->
        <#--<li>-->
            <#--<a href="https://twitter.com/maridlcrmn">Follow me</a>-->
        <#--</li>-->
    <#--</ul>-->
<#--</nav>-->

<div class="container-fluid mt-4">
    <#nested>
</div>
<#--<#include "social.ftl">-->


<#--<script src="https://maps.googleapis.com/maps/api/js?key=YOUR_API_KEY&callback=initMap"-->
        <#--async defer></script>-->
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
<script>
    $(document).ready(function () {
        var trigger = $('.hamburger'),
                overlay = $('.overlay'),
                isClosed = false;

        trigger.click(function () {
            hamburger_cross();
        });

        function hamburger_cross() {

            if (isClosed == true) {
                overlay.hide();
                trigger.removeClass('is-open');
                trigger.addClass('is-closed');
                isClosed = false;
            } else {
                overlay.show();
                trigger.removeClass('is-closed');
                trigger.addClass('is-open');
                isClosed = true;
            }
        }

        $('[data-toggle="offcanvas"]').click(function () {
            $('#wrapper').toggleClass('toggled');
        });
    });
</script>
</body>
</html>
</#macro>
