<%@page import="sample.user.UserError"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
      .gradient-custom-3 {
/* fallback for old browsers */
background: #84fab0;

/* Chrome 10-25, Safari 5.1-6 */
background: -webkit-linear-gradient(to right, rgba(132, 250, 176, 0.5), rgba(143, 211, 244, 0.5));

/* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
background: linear-gradient(to right, rgba(132, 250, 176, 0.5), rgba(143, 211, 244, 0.5))
}
.gradient-custom-4 {
/* fallback for old browsers */
background: #84fab0;

/* Chrome 10-25, Safari 5.1-6 */
background: -webkit-linear-gradient(to right, rgba(132, 250, 176, 1), rgba(143, 211, 244, 1));

/* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
background: linear-gradient(to right, rgba(132, 250, 176, 1), rgba(143, 211, 244, 1))
}
    </style>
</head>
<body>
    <%
            UserError userError = (UserError) request.getAttribute("USER_ERROR");
            if (userError == null) {
                userError = new UserError();
            }
        %>
  <section class="vh-100 bg-image"
  style="background-image: url('https://mdbcdn.b-cdn.net/img/Photos/new-templates/search-box/img4.webp');">
  <div class="mask d-flex align-items-center h-100 gradient-custom-3">
    <div class="container h-100">
      <div class="row d-flex justify-content-center align-items-center h-100">
        <div class="col-12 col-md-9 col-lg-7 col-xl-6">
          <div class="card" style="border-radius: 15px;">
            <div class="card-body p-5">
              <h2 class="text-uppercase text-center mb-5">Create an account</h2>

              <form action="MainController" method="post">
                   
                  
                <div data-mdb-input-init class="form-outline mb-4">
                    <label class="form-label" for="form3Example1cg">User ID</label> 
                  <input type="text" name="userID" id="form3Example1cg" class="form-control form-control-lg" required="" />
               
                </div>
                   <div id="error-message" style="display: none;">
                                <%= userError.getUserID()%>
                            </div>
                <div data-mdb-input-init class="form-outline mb-4">
                       <label class="form-label" for="form3Example3cg">Full Name</label>
                  <input type="text" name="fullName" id="form3Example3cg" class="form-control form-control-lg" />
                 
                </div>
                            <div id="error-message" style="display: none;">
                                <%= userError.getFullName()%>
                            </div>
                 <div data-mdb-input-init class="form-outline mb-4">
                      <label class="form-label" for="form3Example3cg">Role ID</label>
                  <input type="text" name="roleID" id="form3Example3cg" class="form-control form-control-lg" />
                 
                </div>           
                      <div id="error-message" style="display: none;">
                                <%= userError.getRoleID()%>
                            </div>      
                            
                <div data-mdb-input-init class="form-outline mb-4">
                    <label class="form-label" for="form3Example4cg">Password</label>
                  <input type="password" name="password"id="form3Example4cg" class="form-control form-control-lg" />
                 
                </div>

                <div data-mdb-input-init class="form-outline mb-4">
                     <label class="form-label" for="form3Example4cdg">Repeat your password</label>
                  <input type="password" name="confirm" id="form3Example4cdg" class="form-control form-control-lg" />
          
                </div>

               
                <div class="d-flex justify-content-center">
                    <input type="submit" data-mdb-button-init name="action" value="Create"
                    data-mdb-ripple-init class="btn btn-success btn-block btn-lg gradient-custom-4 text-body"/>
                </div>
                            <p class="text-success">${success} </p>
                <p class="text-center text-muted mt-5 mb-0">Have already an account? <a href="Login.jsp"
                    class="fw-bold text-body"><u>Login here</u></a></p>
                   <script>
                const errorMessage = document.getElementById("error-message");
                if (errorMessage.textContent.trim() !== "") {
                    // Show the error message using your preferred method (e.g., alert, modal)
                    alert(errorMessage.textContent); // Example using an alert
                }
            </script>     
              </form>

            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
</body>
</html>
