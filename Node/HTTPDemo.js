var http = require("http");
var url = require("url");
var fs = require('fs')
function Start(port, route, handle) {
  http
    .createServer(function(request, response) {
      var pathname = url.parse(request.url).pathname;
      /* res.writeHead(200, { "Content-Type": "text/html" }); */

      if(request.url === '/favicon.ico'){
        response.writeHead(200,{"Content-Type" : "text/x-icon"})
        response.end()
        return
      } 

      var postData = "";
      request.setEncoding("utf8");
      var chunkCount = 0

      request.addListener("data", function(data) {
        var chunkno=++chunkCount
        postData += data;
        
        fs.writeFileSync("./DXC/Cust/Emp/TextboxData"+chunkno+".txt",postData)  
        console.log("new file created")
        
        
        console.log("Successfully written data into TextBox: ")

        console.log("###started");
      });

      request.addListener("end", function() {
        console.log("######end");
        route(pathname, handle,response, postData);
      });

      //res.write("<marquee><center><h1>Hello World!</h1></center></marquee>");
      // res.end();
    })
    .listen(port);
}

exports.Start = Start;
