import React, { Component } from 'react'
import './LoginValidation.css'

class LoginValidation extends Component {
    constructor(props) {
        super(props)

        this.state = {
            fullName : '',
            errors : {
                fullName : '',
                password : '',
                email : ''
            }
                 
        }
    }
    doValidation = (e) => {
        e.preventDefault()
        const {name,value} = e.target;
        let errors = this.state.errors;
        
        switch (name){
            case 'fullName':
                errors.fullName = value.length <3 ? 'Full Name should be at least 3 characters' : ''
                break;

            case 'password':
                errors.password = value.length < 6 ? 'Passwords should be at least 6 characters' : ''
                break;
            
            case 'email':
                errors.email = value.length < 6 ? 'email should contain "@" and ".com"' : ''
                    break;

            default: 
                break;
        }

        this.setState ({
            errors, [name] : value
        })

    }

    

    

    render() {
        return (
            <div className='wrapper'>
            <div className='form-wrapper'>
                <h2>Enter Details</h2>
                <form onSubmit = {this.doValidation}>
                <div className='fullName'>
                    <label for="fullName">Full Name</label><input type="text" id="fullname" name="fullName" onChange={this.doValidation} /><span className="error">{this.state.errors.fullName}</span><br/>
                    <label for="email">Email</label><input type="email" id="email" name="email" onChange={this.doValidation} /><span className="error">{this.state.errors.email}</span><br/>
                    <label for="password">Password</label><input type="password" id="password" name="password" onChange={this.doValidation} /><span className="error">{this.state.errors.password}</span>
                </div>
                <div className='submit'>
                    <input type="submit" />
                </div>
                </form>
            </div>
        </div>
        )
    }

}
export default LoginValidation
