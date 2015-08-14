function Downloader() {
    this.completed = false;
    this.future = { content: '' };
}

Downloader.prototype.download = function (url, callback) {
    console.log("start downloading " + url + " ...");
    var self = this;
    setTimeout(function () {
        self.completed = true;
        self.future.content = "42";

        callback();
    }, 2000);

    return self.future;
}