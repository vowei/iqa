QUnit.test("a test", function (assert) {
    expect(1);

    var $body = $("body");
    $body.on("click", function () {
        assert.ok(true, "body was clicked!");
    });
    $body.trigger("click");
});
