import React, { Component } from 'react'
import './RoutingDemo.css'
import { Router, Route, Switch } from "react-router"
import Employee from './Employee'
import Customer from './Customer'

class RoutingDemo extends Component {
    constructor(props) {
        super(props)

        this.state = {
                 
        }
    }

    render() {
        return (
            <div className="myDiv">
                <a href="home">Home</a> | <a href="customer">Customers</a> | <a href="employee">Employees</a>
                <hr/>
                <h1>Home Page - Welcome to DXC</h1>
                
            </div>
        )
    }
}

export default RoutingDemo
