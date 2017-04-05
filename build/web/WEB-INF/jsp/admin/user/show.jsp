<%@include file="../../header.jsp" %>
<div class="container">

    <h3>User's Details:</h3>
    <table class='table table-striped table-hover table-bordered'>
        <tr>
            <th>ID</th>
            <th>Username</th>
            <th>Email</th>
<!--            <th>Password</th>-->
            <th>Added-Date</th>
<!--            <th>Last-Login</th>-->
            <th>Status</th>
            <th>Action</th>
        </tr>

        <c:forEach var="u" items="${users}">
            <tr>
                <td>${u.id}</td>
                <td>${u.userName}</td>
                <td>${u.email}</td>
<!--                <td>${u.password}</td>-->
                <td>${u.addedDate}</td>
<!--                <td>${u.lastLogin}</td>-->
                <td>${u.status}</td>
                <td>
                    
                </td>
            </tr>

        </c:forEach>
    </table>
    <p class="pull-right">
        <a href="${SITE_URL}/"><button class='btn btn-danger'>Back</button></a>

    </p>
</div>
<%@include file="../../footer.jsp" %>