import React, { Component } from 'react'

class LoginForm2 extends Component {
    constructor(props) {
        super(props)

        this.state = {
            firstName : "",
            lastName : "",
            msg : ""

                 
        };
        this.handleChange1 = this.handleChange1.bind(this);
        this.handleChange2 = this.handleChange2.bind(this);
        this.takeInputData = this.takeInputData.bind(this);
    }

    handleChange1(ourData){
        this.setState({
            firstName: ourData.target.value
        })
    }


    handleChange2(ourData){
        this.setState({
            lastName: ourData.target.value
        })
    }

    takeInputData(ourData){
        this.setState({
            msg : 'Welcome '+this.state.firstName+' '+this.state.lastName

        })
        ourData.preventDefault();

    }

    render() {
        return (
            <div className="container">
                <form className="form-group" >
                    <div className="col-6">
                        <div className="row">
                            <div className="col-4">
                                First Name: 
                            </div>
                            <div className="col-8">
                                <input type="text" className="form-control" value={this.state.firstName} onChange={this.handleChange1} placeholder="First name"></input><br></br>
                            </div>
                        </div>
                        <div className="row">
                            <div className="col-4">
                                Last Name:
                            </div>
                            <div className="col-8">
                                <input type="text" className="form-control" value={this.state.lastName} onChange={this.handleChange2} placeholder="Last name"></input><br></br>
                            </div>
                        </div>
                        <button type="submit" className="btn btn-outline-info" onClick={this.takeInputData} >Submit</button>
                        
                    </div>
                    {this.state.msg}
                </form>
                
            </div>
        )
    }
}

export default LoginForm2
