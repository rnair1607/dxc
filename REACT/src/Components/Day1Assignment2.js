import React, { Component } from 'react'
import TodoList from './TodoList'

class Day1Assignment2 extends Component {
    constructor(props) 
    {
        super(props);
        this.state = ({
            items: [],
            text: ''

        });
        this.onChange = this.onChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    onChange(e) {
        this.setState({text: e.target.value});
    }

    handleSubmit(e) 
    {
        e.preventDefault();
        var nextItems = this.state.items.concat([this.state.text]);
        var nextText = '';
        this.setState({items: nextItems, text: nextText});
    }

    render() {
        return (
        <div>
            <h3>Comments</h3>
            <input onChange={this.onChange} value={this.state.text} />
            <button>{'Add #' + (this.state.items.length + 1)}</button>
            <TodoList items={this.state.items} />
            <form onSubmit={this.handleSubmit}>
               
            </form>
        </div>
        );
    }
}

export default Day1Assignment2
