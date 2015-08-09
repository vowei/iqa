var World = function(callback) {
    this.testValue = "123";

    callback(this);
};

exports.World = World;
