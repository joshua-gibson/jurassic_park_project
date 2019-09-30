import React, {Component} from 'react';

class AddVisitorForm extends Component {

  constructor(props){
    super(props);
    this.state = {
      visitors: 0
    }
    this.handleVisitorChange = this.handleVisitorChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);


  }

  handleSubmit(event){
    event.preventDefault();
    const newVisitors = {
      visitors: this.state.salary
    }
    this.props.handleNewVisitors(newVisitors);
  }

  handleVisitorChange(event){
    this.setState({visitors: event.target.value});
  }

render(){
  return (
    <div>
       <h2>Visitors currently in Park: {this.props.visitors}</h2>
       <h3>Add Visitors</h3>
       <form onSubmit={this.handleSubmit}>
       <label htmlFor="visitors">No Of Visitors</label>
       <input id="visitors"
       value={this.state.visitors}
       type="number"
       onChange={this.handleVisitorChange}/>
       <input type="submit" />
       </form>
    </div>
  )};

  }

export default AddVisitorForm;
