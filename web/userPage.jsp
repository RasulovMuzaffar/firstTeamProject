
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Страница справки </title>

        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" id="css-main" href="assets/css/oneui.css">
    </head>
    <body>
        <div id="page-container" class="sidebar-l sidebar-mini sidebar-o side-scroll header-navbar-fixed">
            <nav id="sidebar">

                <div id="sidebar-scroll">

                    <div class="sidebar-content">

                        <div class="side-header side-content bg-white-op">

                            <button class="btn btn-link text-gray pull-right hidden-md hidden-lg" type="button" data-toggle="layout" data-action="sidebar_close">
                                <i class="fa fa-times"></i>
                            </button>


                            <a class="h5 text-white" href="#">
                                <i class="fa fa-circle-o-notch text-primary"></i> <span class="h4 font-w600 sidebar-mini-hide">АРМ Вагон</span>
                            </a>
                        </div>



                        <div class="side-content">
                            <ul class="nav-main">
                                <li>
                                    <a href="base_pages_dashboard.html"><i class="si si-speedometer"></i><span class="sidebar-mini-hide">Справка</span></a>
                                </li>

                            </ul>
                        </div>

                    </div>

                </div>

            </nav>

            <header id="header-navbar" class="content-mini content-mini-full">
                <ul class="nav-header pull-right">
                    <li>
                        <div class="btn-group">
                            <button class="btn btn-default btn-image dropdown-toggle" data-toggle="dropdown" type="button">
                                <img src="assets/img/avatars/avatar10.jpg" alt="Avatar">
                                <span class="caret"></span>
                            </button>
                            <ul class="dropdown-menu dropdown-menu-right">
                                <li class="dropdown-header">Профиль</li>

                                <li>
                                    <a tabindex="-1" href="base_pages_profile.html">
                                        <i class="si si-user pull-right"></i>
                                        <span class="badge badge-success pull-right">1</span>Профиль пользователя
                                    </a>
                                </li>
                                <li class="divider"></li>
                                <li class="dropdown-header">Действия</li>
                                <li>
                                    <a tabindex="-1" href="base_pages_login.html">
                                        <i class="si si-logout pull-right"></i>Выйти
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </li>

                </ul>
            </header>
            <main id="main-container">
                тут будет что то 
            </main>

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


<!--        <script src="//maps.googleapis.com/maps/api/js?key="></script>
        <script src="assets/js/plugins/gmapsjs/gmaps.min.js"></script>-->

        <script src="assets/js/pages/base_comp_maps_full.js"></script>
    </body>
</html>
