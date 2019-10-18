/* eslint-disable no-unused-vars */
import React from 'react';
import logo from './logo.svg';
import './App.css';
import Welcome from'./Components/welcome'
import Comments from './Components/Comments'
import Like from './Components/Like'
import TagPeople from './Components/Tag'
import VisitorCount from './Components/VisitorCount';
import Name from './Components/PropsNameandDesignation';
import Chat from './Components/Chat';
import Clock from './Components/Clock';
import LifeCycleDemo from './Components/LifeCycleDemo';
import UserLogin from './Components/UserLogin';
import LoginForm from './Components/LoginForm';
import LoginForm2 from './Components/LoginForm2';
import TodoApp from './Components/TodoApp';
import Day1Assignment2 from './Components/Day1Assignment2';
import Day1Assignment1 from './Components/Day1Assignment1';


function App() {
  return (
    <div className="App">
      {/* {/* {/* {/* {/* {/* {/* {/* {/* <Welcome name="Rahul" place="Ahmedabad"></Welcome>
      <Comments commentsText="Yo"></Comments>
      <Like name="Rahul"></Like>
      <TagPeople name = "Rahul"></TagPeople> 
      <VisitorCount></VisitorCount> 
      <Name name="Rahul" designation="Software Engineer"></Name> 
  <Chat></Chat> */}
      {/* <Clock></Clock>  */}
      {/* <LifeCycleDemo></LifeCycleDemo>   */}
      {/* <UserLogin></UserLogin>   */}
      {/* <LoginForm></LoginForm> */}
      {/* <LoginForm2></LoginForm2> */}
       <TodoApp></TodoApp>
      {/* <Day1Assignment2></Day1Assignment2> */}
      {/* <Day1Assignment1></Day1Assignment1> */}
    </div>
  );
}

export default App;
