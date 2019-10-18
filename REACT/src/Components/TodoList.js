import React, { Component } from 'react'
class TodoList extends Component
{
    render()
    {
        
        var createComment = function(commentText) {
            return <li>{commentText}</li>;
        };
    return <ul>{this.props.comments.map(createComment)}</ul>;
  }
}
export default TodoList;