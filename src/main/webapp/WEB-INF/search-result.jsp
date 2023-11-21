<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="list" value="${requestScope.results}" />
<c:if test = "${list.size() == 0}">
    <h4>No results</h4>
</c:if>

<c:forEach var="friend" items="${list}">
    <div class="search-result-box-content-item">
        <img src="data:image/png;base64,${friend.avatar}">
        <span>
            <a href="">${friend.lastName} ${friend.firstName}</a>
        </span>
        <button id="${friend.id}"><i class="fa fa-user-plus" aria-hidden="true"></i> 
                Add friend
            </button> 
    </div>
</c:forEach>
<script>
    $(function () {
        $('.search-result-box-content-item button').click(function () {
            var friendId = $(this).attr('id');
            $.ajax({
                url: 'get-suggested-friend-list',
                type: 'POST',
                data: {
                    action: 'add-friend',
                    friendId: friendId
                },
                success: function (data) {
                    $('#suggested-friend-list').html(data);
                    $('#friend-list').load("friend-list");
                },
                error: function () {
                    alert('Cannot add friend');
                }
            });
        });
    });
</script>
