import React, { Component } from 'react'

class LoginForm extends Component {
    constructor(props) {
        super(props)

        this.state = { value: 'Name here!'};
        this.handleChange = this.handleChange.bind(this);
        this.takeInputData = this.takeInputData.bind(this);
    }

    handleChange(ourData){
        this.setState({ value : ourData.target.value });
    }

    takeInputData(ourData){
        alert('A name was submitted: '+this.state.value)
        ourData.preventDefault();
    }


    render() {
        return (
            <form onSubmit={this.takeInputData}>
                <label>
                    Name: 
                    <input type="text" value={this.state.value} onChange={this.handleChange}></input>
                </label>
                <input type="submit" value="Submit"></input>
            </form>
        )
    }
}

export default LoginForm
