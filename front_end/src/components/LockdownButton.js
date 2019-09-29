import React from 'react';
import '../style/LockdownButton.css'

class LockdownButton extends React.Component{

  constructor(props) {
    super(props);
    this.state={
      ld: false
    }

    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleSubmit() {
    if(this.state.ld === false)
       {
         this.setState({ld: true});
         this.props.onChange(true);
      }
    else {
      this.setState({ld: false});
      this.props.onChange(false);
    };
    
  }

  render() {
  return (
    <div className="lbcontainer">
       <h1>Enter Lockdown: </h1>
        <label className="switch">
          <input onClick={this.handleSubmit} type="checkbox"/>
          <span className="slider round"></span>
        </label>
    </div>
  );
  }
  }

export default LockdownButton;
