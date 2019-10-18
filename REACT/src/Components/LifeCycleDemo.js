import React, { Component } from 'react'

class LifeCycleDemo extends Component {
    constructor(props) {
        super(props)

        this.state = {
            name: "Rahul"
                 
        }
    }

    shouldComponentUpdate(){
        return true
    }

    componentWillMount(){

    }


    change(){
        this.setState({
            name : this.state.name = "Nair"
        })
    }

    render() {
        return (
            <div>
                <h1>Hello {this.state.name}</h1>
                <button onClick={() => this.change()}>Change</button>
            </div>
        )
    }
}

export default LifeCycleDemo
