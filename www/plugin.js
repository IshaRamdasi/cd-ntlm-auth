
var exec = require('cordova/exec');

var PLUGIN_NAME = 'CdNtlmAuth';

var CdNtlmAuth = {
  download: function(link, cb) {
    exec(cb, null, PLUGIN_NAME, 'download', [link]);
  }
};

module.exports = CdNtlmAuth;
