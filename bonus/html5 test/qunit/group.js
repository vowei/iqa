QUnit.module("group a", {
    setup: function () {
        console.log('group a setup');
    },
    teardown: function () {
        console.log('group a teardown');
    }
});

QUnit.test("test example 1", function (assert) {
    assert.ok(true, "this test is fine");
});
QUnit.test("test example 2", function (assert) {
    assert.ok(true, "this test is fine");
});

QUnit.module("group b");
QUnit.test("test example 3", function (assert) {
    assert.ok(true, "this test is fine");
});
QUnit.test("test example 4", function (assert) {
    assert.ok(true, "this test is fine");
});