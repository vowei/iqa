function KeyLogger(target) {
    if (!(this instanceof KeyLogger)) {
        return new KeyLogger(target);
    }
    this.target = target;
    this.log = [];

    var self = this;

    this.target.off("keydown")
        .on("keydown", function (event) {
        self.log.push(event.keyCode);
    });
}
