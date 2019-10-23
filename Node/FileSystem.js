var fs = require('fs')
var fileData = fs.readFileSync("ReadMe.txt","utf8")

fs.writeFileSync("Data.txt",fileData)
var fileData1 = fs.readFileSync("Data.txt","utf8")
console.log(fileData1)

fs.unlinkSync("Unlink.txt")