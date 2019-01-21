<#include "parts/security.ftl">
<#import "parts/common.ftl" as c>

<@c.page>
<div class="container"></div>
<div class="row justify-content-md-center">
    <div class="row" style="height: 80vh;">
        <div class="row align-self-center">
            <div class="col-3">
                <#--<img src="https://www.ecomadeinamerica.com/wp-content/uploads/2017/02/identity1.jpg" style="width: 100%;" alt="">-->
                img
            </div>
            <div class="col">
                <h1> Welcome to my app called "Clean City"!</h1>
                <div class="">
                    Get some greeting from me!
                    <a href="/greeting">get greeting</a></div>
            </div>
        </div>
    </div>
</div>


    <a href="/search"><button style="position: absolute; position: absolute;
  bottom: 5%;
  left: 50%;
  transform: translate(-50%, -50%);
  padding:8px 30px;
  border-radius: 19px;" class="btn btn-outline-success my-2 my-sm-0" type="submit">What's about your city?</button></a>

</@c.page>

