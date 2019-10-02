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
    this.handleDinoCapChange = this.handleDinoCapChange.bind(this);
    this.handleNameChange = this.handleNameChange.bind(this);
    this.handleVisitorCapChange = this.handleVisitorCapChange.bind(this);
    this.handleParkChange = this.handleParkChange.bind(this);
    this.handleFormSubmit = this.handleFormSubmit.bind(this);
  }

  handleDinoCapChange(e){
    this.setState({
      dinosaurCapacity: e.target.value
    });
  }
  handleNameChange(e){
    this.setState({
      name: e.target.value
    });
  }
  handleVisitorCapChange(e){
    this.setState({
      visitorCapacity: e.target.value
    });
  }
  handleParkChange(e){
    this.setState({
      parkId: e.target.value
    });
  }

  handleFormSubmit(e){
    e.preventDefault();
    const newPaddock = {
      dinosaurCapacity: this.state.dinosaurCapacity,
      name: this.state.name,
      visitorCapacity: this.state.visitorCapacity,
      parkId: this.state.parkId
    };
    this.props.handlePaddockSubmit(newPaddock);
    this.setState({
      dinosaurCapacity: 0,
      name: null,
      visitorCapacity: 0,
      parkId: 1
    });
  }

  
  render (){
    return (
    <div>
       <h1>Create Paddock</h1>
       <form onSubmit={this.handleFormSubmit}>
         <label htmlFor="dinosaurCapacity">Dinosaur Capacity: </label>
            <input id="dinosaurCapacity" 
                value={this.state.dinosaurCapacity} 
                type="number"
                onChange={this.handleDinoCapChange}>
            </input>
         <label htmlFor="name">Paddock name: </label>
            <input id="name" 
                value={this.state.name} 
                type="text"
                onChange={this.handleNameChange}>
            </input>
         <label htmlFor="visitorCapacity">Visitor Capacity: </label>
            <input id="visitorCapacity" 
                value={this.state.visitorCapacity} 
                type="number"
                onChange={this.handleVisitorCapChange}>
            </input>
         <label htmlFor="parkId">Park id: </label>
            <input id="parkId" 
                value={this.state.parkId} 
                type="number"
                onChange={this.handleParkChange}>
            </input>
            <input type="submit"/>
       </form>
    </div>
    )};

  }

export default AddPaddockForm;
