import React, { Component } from 'react';

class HomeWork extends Component{
    constructor(props){
        super(props)

        this.state={
            companyName : '',
            companyDescription : '',
            companyList : [],
            descriptionList : []
            

        }
        this.handleChange1 = this.handleChange1.bind(this)
        this.handleChange2 = this.handleChange2.bind(this)
        this.submitEntry = this.submitEntry.bind(this)
    }

    handleChange1(data){
        this.setState({
            companyName : data.target.value
        })
    }

    handleChange2(data){
        this.setState({
            companyDescription : data.target.value
        })
    }

    submitEntry(ourData){
        ourData.preventDefault()
        var nextCompany = this.state.companyList.concat([this.state.companyName])
        var nextdescription = this.state.descriptionList.concat([this.state.companyDescription])
        this.setState({
            companyName : '',
            companyDescription : '',
            companyList : nextCompany,
            descriptionList : nextdescription
        })

    }

    render(){
        return(
            <div className="container">
                <form >
                    <div className="col-8"> 
                        <div className="row">
                            
                                <input type="text" name="cmpName" id="cmpId" value={this.state.companyName} onChange={this.handleChange1} placeholder="Company Name"></input>
                            
                            
                                <textarea name="dscpName" id="dscpId" value={this.state.companyDescription} onChange={this.handleChange2} placeholder="Company Description"></textarea>

                                <button type='submit' className="btn btn-outline-dark" onClick={this.submitEntry}>Submit</button>

                                <table className="table table-striped">
                                    <thead>
                                        <td>Name</td><td>Description</td>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td>{this.state.companyList.map(name=><ul className="list-group"><li className="list-group-item">{name}</li></ul>)}</td><td>{this.state.descriptionList.map(name=><ul className="list-group"><li className="list-group-item">{name}</li></ul>)}</td>
                                        </tr>
                                        
                                    </tbody>
                                </table>
                        
                        </div>
                    </div>
                </form>
            </div>
        )
    }

}
export default HomeWork