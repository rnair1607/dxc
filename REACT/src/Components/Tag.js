import React, { Component } from 'react'

class TagPeople extends Component
{
    constructor()
    {
        super()
        this.state = {
            Message : "Pls subscribe!",
            quotes: "Hello"
        }
    }

    subscribeMe(){
        this.setState({
            Message: "Thank you for subscribing!",
            quotes: "Now you are one among us!"
        })
    }

    render()
    {
        return <div><h4>{this.props.name} tagged you in a post.</h4> <h4>{this.state.Message}</h4>
        <h4>{this.state.quotes}</h4>
        <button onClick={() => this.subscribeMe()}>Subscribe</button></div>

    }

}export default TagPeople