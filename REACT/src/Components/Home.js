import React, { Component } from 'react'
import { Router, Route, Switch } from "react-router"

class Home extends Component {
    constructor(props) {
        super(props)

        this.state = {
                 
        }
    }

    render() {
        return (
            <div className="myDiv"><br></br>
                Home Page - Welcome to DXC
                <hr/>
                
            </div>
        )
    }
}

export default Home
