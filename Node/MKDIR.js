var fs = require('fs')

fs.mkdir("./DXC/Cust/Emp", {recursive : true }, () => {
    fs.writeFileSync("./DXC/Cust/Emp/data.txt","R")
})