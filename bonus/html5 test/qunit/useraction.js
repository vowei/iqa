QUnit.test(
    "keylogger api behavior", function (assert) {
    var event,
        $doc = $(document),
        keys = KeyLogger($doc);

    // trigger event
    event = $.Event("keydown");
    event.keyCode = 9;
    $doc.trigger(event);

    // verify expected behavior
    assert.equal(
        keys.log.length, 1, "a key was logged");
    assert.equal(
        keys.log[0], 9, "correct key was logged");
});
