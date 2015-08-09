var product = function(input) {
    var reg = /(\+|\-)?[0-9]+(\.[0-9]*)?/;
    return reg.test(input); 
}

module.exports = product;
