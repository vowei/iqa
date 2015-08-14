// conf.js
exports.config = {
    seleniumAddress: 'http://localhost:4444/wd/hub',
    specs: ['e2espec.js'],
    multiCapabilities: [{
	browserName: 'firefox'
    }]
}