var requestHandlers = require('./requestHandler')
var server = require('./HTTPDemo')
var route = require('./route')

var handle = {}

handle["/"] = requestHandlers.start
handle["/start"] = requestHandlers.start
handle["/upload"] = requestHandlers.upload
handle["/download"] = requestHandlers.download
handle["/imageUpload"] = requestHandlers.imageUpload

server.Start(8001,route.route,handle)