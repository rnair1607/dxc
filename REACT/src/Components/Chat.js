import React from 'react'

const Chat = () => {

    function display(){
        console.log("Display Called!")
    }
    
    return (
       
        <div>
            <button className="btn btn-info" onClick={display()}>Display</button>
        </div>
    )
}

export default Chat;
