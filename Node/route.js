function route(pathname,handle,response,postData)
{
    if(typeof handle[pathname] == 'function'){
        handle[pathname](response,postData)
    }
    else{
        console.log("No handlers foound")
    }
}
exports.route = route