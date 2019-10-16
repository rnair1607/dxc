import React, { Component } from 'react'
import "bootstrap/dist/css/bootstrap.css"

class VisitorCount extends Component {
    constructor(props) {
        super(props)

        this.state = {
            numberOfUsers : 0
                 
        }
    }

    visitorValidate(){
        
        this.setState({
            numberOfUsers : this.state.numberOfUsers +1
        })
    }
    

    render() {
        return (
            <div>
                Visitor Count: {this.state.numberOfUsers}<br></br>
                <button className={'btn btn-light'} onClick={() => this.visitorValidate()}>Click here</button>
            </div>)
        
    }
}

export default VisitorCount
