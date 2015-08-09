test("ok断言的用法", function() {
    ok(true, "true值导致断言通过！" );
    ok("非空字符串", "非空字符串也可以通过断言！");
    ok(false, "false导致断言失败！");
    ok(0, "0导致断言失败！");
    ok(NaN, "NaN导致断言失败！");
    ok("", "空字符串导致断言失败！");
    ok(null, "null导致断言失败！");
    ok(undefined, "undefined导致断言失败！");
});
