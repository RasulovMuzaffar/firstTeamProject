<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Арм вогон</title>
        <link rel="shortcut icon" href="assets/img/favicons/favicon.png">
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" id="css-main" href="assets/css/oneui.css">
    </head>
    <body>
<!--        <h1>Авторизация!</h1>
        <form action="auth" method="POST">
            <h4>Логин:</h4>
            <input type="text" name="username"/>
            <h4>Пароль:</h4>
            <input type="password" name="password"/>
            <input type="text" name="ip" value="${pageContext.request.remoteHost}"/>
            <input type="submit" value="OK"/>
        </form>-->

        <!--//////////////////////////////////-->
                <div class="content overflow-hidden">
                    <div class="row">
                        <div class="col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3 col-lg-4 col-lg-offset-4">
                             Login Block 
                            <div class="block block-themed animated fadeIn">
                                <div class="block-header bg-primary">
                                    <h3 class="block-title">Войти</h3>
                                </div>
                                <div class="block-content block-content-full block-content-narrow">
                                    <h1 class="h2 font-w600 push-30-t push-5">АРМ Вагон</h1>
                                    <p>Пожалуйста авторизируйтесь</p>
                                    <div class="alert alert-danger alert-dismissable">
                                        <p>Не верный логин и, или пароль</p>
                                    </div>
                                    <form class="form-horizontal" action="auth" method="post" onsubmit="validFormLogin(this);return false;">
                                        <div class="form-group">
                                            <div class="col-xs-12">
                                                <div class="form-material form-material-primary floating">
                                                    <input class="form-control" type="text" id="login-username" name="username">
                                                    <label for="login-username">Введите ваш логин</label>
                                                    <div id="login-username-error" class="help-block text-right animated fadeInDown"  style="display:none; color:red;">Пожалуйста введите свой логин</div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-xs-12">
                                                <div class="form-material form-material-primary floating">
                                                    <input class="form-control" type="password" id="login-password"  name="password">
                                                    <label for="login-password">Введин ваш пароль</label>
                                                    <div id="login-password-error" class="help-block text-right animated fadeInDown" id="errorPasswordAut" style="display:none; color:red;">Пожалуйста введите свой пароль</div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-xs-12 col-sm-6 col-md-4">
                                                <button class="btn btn-block btn-primary" name="send" type="submit"><i class="si si-login pull-right"></i> Войти</button>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                    <script src="assets/js/core/jquery.min.js"></script>
                    <script src="assets/js/core/bootstrap.min.js"></script>
                    <script src="assets/js/core/jquery.slimscroll.min.js"></script>
                    <script src="assets/js/core/jquery.scrollLock.min.js"></script>
                    <script src="assets/js/core/jquery.appear.min.js"></script>
                    <script src="assets/js/core/jquery.countTo.min.js"></script>
                    <script src="assets/js/core/jquery.placeholder.min.js"></script>
                    <script src="assets/js/core/js.cookie.min.js"></script>
                    <script src="assets/js/app.js"></script>
                    <script src="assets/js/plugins/jquery-validation/jquery.validate.min.js"></script>
                    <script src="assets/js/pages/base_pages_login.js"></script>
                    <script src="assets/js/jqueryVagon.js"></script> 
    </body>
</html>
