import React from 'react';
import ReactDOM from'react-dom'

function Clock({date}) {
    return (
        <div>
            <h1>Hello</h1>
            <h2>Time: {date.toLocaleTimeString()}</h2>      
        </div>
    )
}

function display()
{
    ReactDOM.render(
        <div>
            <Clock date={new Date()}/>
        </div>,
        document.getElementById("root")
    );
}
setInterval(display,1000);


