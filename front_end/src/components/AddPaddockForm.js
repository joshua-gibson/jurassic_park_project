import React, {Component} from 'react';

class AddPaddockForm extends Component {
  constructor(props){
    super(props);
    this.state = {
      dinosaurCapacity: 0,
      name: null,
      visitorCapacity: 0,
      parkId: 1
    }
  }

  
  render (){
    return (
    <div>
       <h1>Create Paddock</h1>
       <form>
         <label htmlFor="dinosaurCapacity">Dinosaur Capacity: </label>
            <input id="dinosaurCapacity" 
                value={this.state.dinosaurCapacity} 
                type="number">
            </input>
         <label htmlFor="name">Paddock name: </label>
            <input id="name" 
                value={this.state.name} 
                type="text">
            </input>
         <label htmlFor="visitorCapacity">Visitor Capacity: </label>
            <input id="visitorCapacity" 
                value={this.state.visitorCapacity} 
                type="number">
            </input>
         <label htmlFor="parkId">Park id: </label>
            <input id="parkId" 
                value={this.state.parkId} 
                type="number">
            </input>
            <input type="submit"/>
       </form>
    </div>
    )};

  }

export default AddPaddockForm;
