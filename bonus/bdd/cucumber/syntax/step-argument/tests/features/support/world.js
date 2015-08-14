var World = function(callback) {
    this.After(function(callback) {
	this.quit(callback);
    });

    callback(this);
}

module.exports = World;
