<#include "/parts/security.ftl">

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand" href="/">Navbar</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="/">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="/addreport">Add report <span class="sr-only"></span></a>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="/search">Search <span class="sr-only"></span></a>
            </li>
        </ul>

        <#if isRegistrated>
            <span class="mx-4" style="color: #ffffff;">${name?if_exists}</span>
            <form action="/logout" method="post">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Sign Out</button>
            </form>
                    <#else>
            <form action="/login" method="get">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Sign In</button>
            </form>
        </#if>
    </div>
</nav>