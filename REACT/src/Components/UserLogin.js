import React, { Component } from 'react'
import { thisExpression } from '@babel/types'

class UserLogin extends Component {
    constructor(props) {
        super(props)

        this.state = {
            validUser : true,
            loginCount : 0,
            logoutCount : 0
                 
        }
    }

    changeTrue()
    {
        this.setState({
            validUser : this.state.validUser = true,
            loginCount : this.state.loginCount += 1
        })
    }

    changeFalse(){
        this.setState({
            validUser : this.state.validUser = false,
            logoutCount: this.state.logoutCount += 1 
        })
    }

    render() {

        if(this.state.validUser)
            return (
                <div>
                    <h1></h1>
                    <h2><button className="btn btn-outline-dark" onClick={() => this.changeFalse()}>Logout</button><br/>logout count: {this.state.logoutCount}<br/>login count: {this.state.loginCount}</h2>

                </div>)
        
        else
            return (
                <div>
                    <h1></h1>
                    <h2><button className="btn btn-outline-dark" onClick={() => this.changeTrue()}>Login</button><br/>logout count: {this.state.logoutCount}<br/>login count: {this.state.loginCount}</h2>

                </div>)


        
        
        
    }
}

export default UserLogin
