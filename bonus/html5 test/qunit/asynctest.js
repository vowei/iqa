QUnit.asyncTest(
    "asynchronous test: one second later!",
    function (assert) {
    expect(1);

    setTimeout(function () {
        assert.ok(true,
            "Passed and ready to resume!");
        QUnit.start();
    }, 1000);
});
