import React, { Component } from 'react'
import './RoutingDemo.css'


class RoutingDemo extends Component {
    constructor(props) {
        super(props)

        this.state = {
                 
        }
    }

    render() {
        return (
            <div className="myDiv">
                <a href="Home">Home</a> | <a href="Customer">Customers</a> | <a href="Employee">Employees</a>
                <hr/>
                
                
            </div>
        )
    }
}

export default RoutingDemo
