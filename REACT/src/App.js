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

function App() {
  return (
    <div className="App">
      {/* {/* {/* {/* <Welcome name="Rahul" place="Ahmedabad"></Welcome>
      <Comments commentsText="Yo"></Comments>
      <Like name="Rahul"></Like>
      <TagPeople name = "Rahul"></TagPeople> 
      <VisitorCount></VisitorCount> 
      <Name name="Rahul" designation="Software Engineer"></Name> 
      <Chat></Chat> */}
      <Clock></Clock>
    </div>
  );
}

export default App;
