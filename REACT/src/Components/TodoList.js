import React, { Component } from 'react'
class TodoList extends Component
{
    render()
    {
        
    
    return <ul>{this.props.comments.map(function(commentText) {
        return <li>{commentText}</li>;
    })}</ul>;
  }
}
export default TodoList;