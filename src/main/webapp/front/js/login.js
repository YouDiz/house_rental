function validateAccount() {
    var account = document.getElementById("account").value;
    var password = document.getElementById("password").value;
  
    $.ajax({
      url: "/checkAccount", // 后台Controller处理的URL
      type: "POST",
      data: {account: account, password: password}, // 发送的数据
      success: function(result) {
        if (result == "success") {
          // 验证通过，执行相应操作
        } else {
          // 验证失败，显示错误信息
          alert("账号或密码错误！");
        }
      }
    });
  }