import React, {Component} from 'react';
import '../style/form.css';

class AddPaddockForm extends Component {
  constructor(props){
    super(props);
    this.state = {
      dinosaurCapacity: 0,
      name: "",
      visitorCapacity: 0
    }
    this.handleDinoCapChange = this.handleDinoCapChange.bind(this);
    this.handleNameChange = this.handleNameChange.bind(this);
    this.handleVisitorCapChange = this.handleVisitorCapChange.bind(this);
    this.handleFormSubmit = this.handleFormSubmit.bind(this);
    this.handlePaddockSubmit = this.handlePaddockSubmit.bind(this);
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

  handlePaddockSubmit(){
    const paddockData = {
        "name": `${this.state.name}`,
        "visitorCapcity": `${this.state.visitorCapacity}`,
        "dinosaurCapacity": `${this.state.dinosaurCapacity}`,
        "park": `http://localhost:8080/park/1`
    };
    console.log(paddockData);


    fetch('http://localhost:8080/paddocks', {
        method: 'POST',
        body: JSON.stringify(paddockData),
        headers: {'Content-Type': 'application/json'}
    })
    .catch(err => console.error);
}

  handleFormSubmit(e){
    e.preventDefault();
    const newPaddock = {
      dinosaurCapacity: this.state.dinosaurCapacity,
      name: this.state.name,
      visitorCapacity: this.state.visitorCapacity,
      parkId: this.state.parkId
    };
    this.handlePaddockSubmit(newPaddock);
    this.setState({
      dinosaurCapacity: 0,
      name: "",
      visitorCapacity: 0,
      parkId: 1
    });
  }




  render (){
    return (
    <div className="paddockForm">
       <h2>Create New Paddock</h2>
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
            <input type="submit"/>
       </form>
    </div>
    )};

  }

export default AddPaddockForm;
