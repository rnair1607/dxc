var fs = require('fs')
var i = 0

var myReadStream = fs.createReadStream(__dirname+'/ReadMe.txt','utf-8')
var myWriterStream = fs.createWriteStream(__dirname+'/WriteMe.txt')

myReadStream.pipe(myWriterStream)
console.log("done")