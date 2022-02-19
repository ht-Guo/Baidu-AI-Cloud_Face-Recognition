function list() {
    $.get("../Sys_User/findAll",function (data) {
        $.each(data,function (i,v) {
            var str = "<tr>";
            str+="<td>"+v.uidf+"</td>";
            str+="<td>"+v.username+"</td>";
            str+="<td>"+v.truename+"</td>";
            str+="<td>"+v.mobilePhone+"</td>";
            str+="<td>"+v.email+"</td>";
            str+="<td>"+v.state+"</td>";
            str+="</tr>";
            $("#tbody").append(str);
        })
    })
}
$(function () {
    list();
})