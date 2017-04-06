<%@include file="header.jsp" %>
    <div class="container">
        <h1>Login Mechanism !!</h1>
        <form method="post" action="${SITE_URL}/login">
        <div class="form-group">
            <label for="email">Email</label>
            <input type="email" class="form-control" name="email" placeholder="Email">
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" class="form-control" name="password" placeholder="Password">
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-primary">Login</button>
        </div>
        
    </form>
    
</div>

<div class="container">
    <a href="${SITE_URL}/admin/user/show"><button class='btn btn-success'>Users</button></a>
    <a href="${SITE_URL}/admin/user/register"><button class='btn btn-primary'>Register</button></a>
</div>

<%@include file="footer.jsp" %>

