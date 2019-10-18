import React, { Component } from 'react'

class Day1Assignment1 extends Component {
    constructor(props) {
        super(props)

        this.state = {
            comment : '',
            msg : '',
            btnmsg : 'Submit',
            placeHolder : 'Comment here',
            edit : false
                 
        };
        this.handleChange = this.handleChange.bind(this);
        this.submitComment = this.submitComment.bind(this);
        this.editComment = this.editComment.bind(this);
    }

    handleChange(data){
        this.setState({
            comment : data.target.value
        })
    }

    submitComment(ourData){
        this.setState({
            msg : ''+this.state.comment,
            btnmsg : 'Edit',
            comment : '',
            placeHolder : 'Edit here',
            edit : true


        })
        ourData.preventDefault();
    }

    editComment(ourData){
        this.setState({
            msg :''+this.state.comment,
            btnmsg : 'Submit',
            comment : '',
            placeHolder : 'Comment here',
            edit : false
        })
        ourData.preventDefault();
    }

    render() {
        if(this.state.edit === false){
            return (
                <div>
                    <form>
                        <br></br>
                        <input type="text" placeholder={this.state.placeHolder} value={this.state.comment} onChange={this.handleChange}></input><br></br><br></br>
                        <button type="submit" className="btn btn-outline-dark" onClick={this.submitComment}>{this.state.btnmsg}</button><br></br>
                        <br></br>
                        {this.state.msg}
                    </form>
                </div>
            )
        }
        else{
            return(
                <div>
                    <form>
                        <br></br>
                        <input type="text" placeholder={this.state.placeHolder} value={this.state.comment} onChange={this.handleChange}></input><br></br><br></br>
                        <button type="submit" className="btn btn-outline-dark" onClick={this.editComment}>{this.state.btnmsg}</button><br></br>
                        <br></br>
                        {this.state.msg}
                    </form>
                </div>
            )
        }
    }
}

export default Day1Assignment1
