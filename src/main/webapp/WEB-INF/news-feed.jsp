<%@page import="net.learnbyproject.helper.Keys"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <jsp:include page="/WEB-INF/head_tag.jsp">
        <jsp:param name="title" value="Your news feed" />
    </jsp:include>

    <body>
        <%@include file="/WEB-INF/top_nav.jsp" %>
        <section class="container-fluid" id="main-body">
            <div class="row no-pad">
                <div class="col-md-2 no-pad">

                    <div class="left-tool-section">
                        <h4>Topics</h4>
                        <a href="https://www.sciencedaily.com/#:~:text=ScienceDaily%3A%20Your%20source%20for%20the%20latest%20research%20news"><i class="fa fa-location-arrow" aria-hidden="true"></i> Science </a>
                        <a href="https://www.livemint.com/ai"><i class="fa fa-graduation-cap" aria-hidden="true"></i> AI Updates</a>
                        <a href="https://www.goodreads.com/shelf/show/continuous-reading"><i class="fa fa-building" aria-hidden="true"></i>Books</a>
                        <a href="https://www.socialmediatoday.com/content/6-tactics-initiate-conversation-social-media"><i class="fa fa-graduation-cap" aria-hidden="true"></i> How to TalkTheTalk?</a>
                    </div>

                    <div class="left-tool-section">
                        <h4>MOODS</h4>
                        <a href="https://www.insightoftheday.com/"><i class="fa fa-industry" aria-hidden="true"></i> Motivate me</a>
                        <a href="https://www.crazygames.com/"><i class="fa fa-gamepad" aria-hidden="true"></i> Games</a>
                        <a href="https://www.youtube.com/"><i class="fa fa-heart-o" aria-hidden="true"></i> Entertain me</a>
                        <a href="https://www.netflix.com/in/"><i class="fa fa-picture-o" aria-hidden="true"></i> Chill</a>
                        <a href="https://www.swiggy.com/"><i class="fa fa-gamepad" aria-hidden="true"></i> Order Food</a>
                    </div>

                    <div class="left-tool-section">
                        <h4>COOK!!</h4>
                        <a href="https://www.eatingwell.com/recipes/"><i class="fa fa-bicycle" aria-hidden="true"></i> Healthy</a>
                        <a href="https://www.seriouseats.com/homemade-junk-food-recipes-fries-poutine-jalapeno-poppers"><i class="fa fa-music" aria-hidden="true"></i> Junk</a>
                        <a href="https://www.eatingwell.com/recipes/17989/drinks/smoothies/"><i class="fa fa-fax" aria-hidden="true"></i> Juices</a>
                        <a href="https://www.joyofbaking.com/"><i class="fa fa-deaf" aria-hidden="true"></i> Bakes</a>
                        <a href="https://www.vegrecipesofindia.com/recipes/desserts-recipes/"><i class="fa fa-credit-card-alt" aria-hidden="true"></i> Sweets</a>
                    </div>
                </div>
                <div class="col-md-5 no-pad">
                    <div class="middle-section" id="post-form">
                        <div id="post-form-header">
                            <span id="post-form-close-button">x</span>
                        </div>
                        <div id="post-form-body">
                            <img class="avatar-small" src="data:image/png;base64,${sessionScope[Keys.USER].avatar}">
                            <div id="post-form-editor" contenteditable>

                            </div>
                        </div>
                        <div id="post-form-footer">
                            <div class="row no-pad">
                                <div class="col-md-6 no-pad">
                                    <a href="">
                                        <i class="fa fa-user-plus" aria-hidden="true"></i>
                                    </a>
                                    <a href="">
                                        <i class="fa fa-map-marker" aria-hidden="true"></i>
                                    </a>
                                    <a href="">
                                        <i class="fa fa-smile-o" aria-hidden="true"></i>
                                    </a>
                                </div>
                                <div class="col-md-6 no-pad" style="text-align:right;">
                                    <a href="#" id="button-public">
                                        <i class="fa fa-globe" aria-hidden="true"></i> Public <i class="fa fa-caret-down" aria-hidden="true"></i>
                                    </a>
                                    <a href="#" id="button-post">
                                        Post
                                    </a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <c:set var="list" value="${sessionScope[Keys.POST_LIST]}" />
                    <c:forEach var="post" items="${list}">
                        <div class="middle-section user-post">
                            <div class="user-post-header">
                                <img class="avatar42" src="data:image/png;base64,${post.author.avatar}">
                                <span>
                                    <a href="/">
                                        ${post.author.firstName} ${post.author.lastName}
                                    </a>
                                    <p class="help-block">${post.creationDate} <i class="fa fa-globe" aria-hidden="true"></i></p>
                                </span>
                            </div>
                            <div class="user-post-body">
                                ${post.content}
                            </div>

                            <div class="user-post-tool">
                                <a href=""><i class="fa fa-thumbs-up" aria-hidden="true"></i> Like</a>
                                <a href=""><i class="fa fa-comment" aria-hidden="true"></i> Comment</a>
                                <a href=""><i class="fa fa-share" aria-hidden="true"></i> Share</a>
                            </div>
                            <div class="user-post-info">
                                <span class="like-icon"><i class="fa fa-thumbs-up" aria-hidden="true"></i></span>
                                <a href="">Dan Hover, John Doe and 18 Others</a>
                            </div>

                            <div class="user-post-comment-list">
                                <c:forEach var="comment" items="${post.commentList}">
                                    <div class="user-post-comment-item">
                                        <img class="avatar42" src="data:image/png;base64,${comment.author.avatar}">
                                        <a href="/">${comment.author.firstName} ${comment.author.lastName}</a> 
                                        <span>
                                            ${comment.content}
                                            <div class="help-block">
                                                <a href="#">Like</a>.
                                                <a href="#">Reply</a>.
                                                ${comment.creationDate}
                                            </div>
                                        </span>
                                    </div> 
                                </c:forEach>
                            </div>

                            <div class="user-post-reply-form">
                                <img class="avatar42" src="data:image/png;base64,${sessionScope[Keys.USER].avatar}">
                                <div class="user-post-reply-editor" contenteditable="true">
                                </div>
                                <span>
                                    <button type="button" class="button-add-comment" post-id="${post.id}">add</button>
                                </span>
                            </div>
                        </div>     
                    </c:forEach>
                </div>
                <div class="col-md-3 no-pad">
                    <div class="middle-right-section">
                        <div class="middle-right-section-body">
                            <div class="middle-right-section-body-title">
                                <label>PEOPLE YOU MAY KNOW</label>
                            </div>
                            <div id="suggested-friend-list"></div>  

                        </div>
                    </div>
                </div>
                <div class="col-md-2 no-pad" id="friend-list">
                    
                </div>
            </div>
        </section>

        <script>
            $(function () {
                // Handle add comment
                $('.user-post-reply-form button').click(function() {
                    let postId = $(this).attr('post-id');
                    let commentContent = $(this).parent().siblings('.user-post-reply-editor').html();
                    let action = "add-comment";
                    $.ajax({
                        url: 'posts',
                        type: 'POST',
                        dataType: 'json',
                        data: {
                            'comment-content': commentContent,
                            'post-id': postId,
                            'action': action
                        },
                        success: function (data) {
                            if (data.result === "OK") {
                                // reload current page to re-sort posts
                                location.reload();
                            } else {
                                alert('Cannot add new comment. Try again later!');
                            }
                        },
                        error: function () {
                            alert('Serious errors. Sorry!');
                        }
                    });
                });
                // Handle add post request
                $('#button-post').click(function (e) {
                    e.preventDefault();
                    let postContent = $('#post-form-editor').html();
                    let action = "add-post";
                    $.ajax({
                        url: 'posts',
                        type: 'POST',
                        dataType: 'json',
                        data: {
                            'post-content': postContent,
                            'action': action
                        },
                        success: function (data) {
                            if (data.result === "OK") {
                                // reload current page to re-sort posts
                                location.reload();
                            } else {
                                alert('Cannot add new post. Try again later!');
                            }
                        },
                        error: function () {
                            alert('Serious errors. Sorry!');
                        }
                    });
                });

                $.ajax({
                    url: 'friend-list',
                    type: 'POST',
                    success: function (data) {
                        $('#friend-list').html(data);
                    },
                    error: function (e) {
                        alert('Error loading ajax: ' + e);
                    }
                });
                $.ajax({
                    url: 'get-suggested-friend-list',
                    type: 'Post',
                    success: function (data) {
                        $('#suggested-friend-list').html(data);
                    },
                    error: function () {
                        alert('cannot load suggested friends');
                    }
                });
                var viewportHeight = $(window).height();
                $("#online-list ul").css("max-height", viewportHeight);
            });
        </script>
        <script src="js/app.js"></script>
    </body>

</html>
