<%-- 
    Document   : login.jsp
    Created on : Jan 21, 2019, 3:28:39 PM
    Author     : learnbyproject.net
--%>
<%@page import="java.util.Objects"%>
<%@page import="net.learnbyproject.helper.Keys"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <jsp:include page="/WEB-INF/head_tag.jsp">
        <jsp:param name="title" value="Login" />
    </jsp:include>

    <body>
        <nav class="container-fluid" id="main-nav-login">
            <div class="container">
                <div class="row">
                    <div class="col-md-6">
                        <a href="./news-feed.jsp" id="logo-large">TalkTheTalk</a>
                    </div>
                </div>
            </div>
        </nav>

        <section class="container-fluid" style="background-color: #4d078f; margin-top:-30px;">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <form action="login" method="post" id="body-login-form">
                            <label>Login to TalkTheTalk</label>
                            <div class="alert-danger">
                                <%--<%= Objects.toString(session.getAttribute(Keys.ERROR), "")  %>--%>
                                ${sessionScope[Keys.ERROR]}
                            </div>
                            <input type="text" name="user-login-id" placeholder="Email address or phone number" />
                            <input type="password" name="user-login-password" placeholder="Password" />
                            <button type="submit" id="btn-login">Login</button>
                            <a href="./register.jsp">Signup for TalkTheTalk?</a>
                        </form>
                    </div>
                </div>
            </div>
        </section>
            TalkTheTalk &copy; 2016
        </footer>
    </body>

</html>
