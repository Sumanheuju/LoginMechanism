<%@include file="../../header.jsp" %>
<div class="container">

    <h3>User's Details:</h3>
    <table class='table table-striped table-hover table-bordered'>
        <tr>
            <th>ID</th>
            <th>FirstName</th>
            <th>LastName</th>
            <th>Username</th>
            <th>Email</th>
<!--            <th>Password</th>-->
<!--            <th>Added-Date</th>-->
<!--            <th>Last-Login</th>-->
<!--            <th>Status</th>-->
            <th>LinkedIn Link</th>
            <th>Github Link</th>
            <th>Action</th>
        </tr>

        <c:forEach var="u" items="${users}">
            <tr>
                <td>${u.id}</td>
                <td>${u.userProfile.firstName}</td>
                <td>${u.userProfile.lastName}</td>
                <td>${u.userName}</td>
                <td>${u.email}</td>
<!--                <td>${u.password}</td>-->
<!--                <td>${u.addedDate}</td>-->
<!--                <td>${u.lastLogin}</td>-->
<!--                <td>${u.status}</td>-->
                <td>${u.userProfile.linkedinLink}</td>
                <td>${u.userProfile.githubLink}</td>
                <td>
                    <a href="${SITE_URL}/edit/{id}"><button class='btn btn-success'><span class="glyphicon glyphicon-pencil"></span></button></a>
                    <a href="${SITE_URL}/delete/{id}"><button class='btn btn-danger'><span class="glyphicon glyphicon-trash"></button></a>
                </td>
            </tr>

        </c:forEach>
    </table>
    <p class="pull-right">
        <a href="${SITE_URL}/login"><button class='btn btn-danger'>Back</button></a>

    </p>
</div>
<%@include file="../../footer.jsp" %>