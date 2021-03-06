<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!-- Include the above in your HEAD tag -->

<div class="tile">
  <div class="tile-header">
    <h2 style="color: white; opacity: .75; font-size: 4rem; display: flex; justify-content: center; align-items: center; height: 100%;">SIGN IN</h2>
  </div>
  
  <div class="tile-body">
    <form id="form">
      <label class="form-input">
        <i class="material-icons">person</i>
        <input type="text" name="email" placeholder="email" value="Username" autofocus="true" required />
        <span class="label">Username</span>
        <span class="underline"></span>
      </label>
      
      <label class="form-input">
        <i class="material-icons">lock</i>
        <input type="password" name="password" placeholder="password" required />
        <span class="label">Password</span>
        <div class="underline"></div>
      </label>
      
      <div class="submit-container clearfix" style="margin-top: 2rem;">          
        <div id="submit" role="button" type="button" class="btn btn-irenic float-right" tabindex="0">
          <span>Iniciar Sesi�n</span>
        </div>
        
        <div class="login-pending">
          <div class=spinner>
            <span class="dot1"></span>
            <span class="dot2"></span>
          </div>
          
          <div class="login-granted-content">
            <i class="material-icons">done</i>
          </div>
        </div>
      </div>
    </form>
  </div>
</div>

