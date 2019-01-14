<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="loginModal" class="modal fade" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document" style="width: 30%;">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h3 class="modal-title">用户登陆</h3>
            </div>
            <div class="modal-body">
                <div class="row" style="margin: 1rem;">
                    <div class="col-md-12">
                        <form class="form-horizontal" role="form" id="form1">
                            <div class="form-group">
                                <!--<label for="account" style="font-size: large;">账 号</label>-->
                                <input type="text" class="form-control" id="account" name="account1" placeholder="账号/手机/邮箱"/>
                            </div>
                            <div class="form-group">
                                <!--<label for="password" style="font-size: large;">密 码</label>-->
                                <input type="password" class="form-control" id="password" name="password1" placeholder="密 码"/>
                            </div>
                        </form>

                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary"  onclick="longin()">登陆</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
<script>
   function longin() {
       $.ajax({
           type: "POST",
           url: "/all",
           data: $("#form1").serialize(),
           success: function (data) {
               window.location.href="index.jsp"
           }
       })
   };
</script>