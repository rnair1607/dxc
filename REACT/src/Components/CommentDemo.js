import React from 'react'
class Comment extends React.Component 
{
	constructor(props){
		super(props)
    this.edit = this.edit.bind(this)
    this.save = this.save.bind(this)
    this.remove = this.remove.bind(this)
    this.state = {editing: false}
  }
  edit(e){
    this.setState({editing:true})
    e.preventDefault()
  }
  remove(e){
    this.props.remove(this.props.index)
    e.preventDefault()
  }
  save(e) {
     this.setState({editing:false})
     this.props.update(this.refs.newValue.value, this.props.index)
    e.preventDefault()
  }
   renderNormal(){
    return(
        <div>
          <h1>{this.props.children}</h1>
          <button onClick={this.edit}>Edit</button>
	<button onClick={this.remove}>Remove</button>
        </div>
      )
  }
  renderForm(){
    return(
        <div>
          <textarea ref="newValue" defaultValue={this.props.children}></textarea>
          <button onClick={this.save}>Save</button>
          
        </div>
      )
  }
  render(){
   if (this.state.editing)
    	return this.renderForm()
    return this.renderNormal()
  }
}
export default Comment

class Board extends React.Component {
	constructor(props){
  	super(props)
    this.updateComment = this.updateComment.bind(this)
    this.removeComment = this.removeComment.bind(this)
		this.addButton = this.addButton.bind(this)
    this.state = {
    	comments: [
      'Default Comment 1 !', 'Default Comment 2 !', 'Default Comment 3 !'
      ]
    }
  }
  removeComment(i){
     console.log("Removing Comment " + i)
    var arr = this.state.comments
    arr.splice(i, 1)
    this.setState({comments:arr})
  }

  updateComment(newtext, i){
  console.log('updating ' + i)
  	var arr = this.state.comments
		arr[i] = newtext
    this.setState({comments:arr})
  }

	addButton(e){
		this.add('Default Comment')
		e.preventDefault()
	}  

	  add(text)
	 {
		  console.log('tryin 2 add')
		   var arr = this.state.comments
		   arr.push(text)
		   this.setState({comments:arr})

	  }
	  render () {
  	return (

	    	<div>
	      	<button ref='buttonToAdd' onClick={this.addButton}>Add More Comments </button>
		      {
		        	this.state.comments.map((text, i)=>{
          	return <Comment update={this.updateComment} remove={this.removeComment} key={i} index={i} >{text}</Comment>
          })
        }
      </div>
    )
  }
}