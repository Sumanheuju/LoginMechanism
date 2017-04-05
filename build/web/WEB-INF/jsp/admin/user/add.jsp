<%@include file="../../header.jsp" %>
<div class="container">
    <h1>Add Users !!</h1>

    <form method="post" action="${SITE_URL}/admin/user/save">
        <div class="form-group">
            <label for="userName">Username</label>
            <input type="text" class="form-control" name="userName" placeholder="Username">
        </div>
        <div class="form-group">
            <label for="email">Email</label>
            <input type="email" class="form-control" name="email" placeholder="Email">
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" class="form-control" name="password" placeholder="Password">
        </div>
        <div class="form-group"> 
            <input type="hidden" name='id'>
        </div>

        <div class="checkbox">
            <label>
                <input type="checkbox" name="status"> Status
            </label>
        </div>

        <button type="submit" class="btn btn-default">Submit</button>
    </form>
</div>

<%@include file="../../footer.jsp" %>