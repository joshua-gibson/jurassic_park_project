import React, { Component } from 'react'
import PageTitleBar from '../components/PageTitleBar'
import ParkMap from '../components/ParkMap'
import AddVisitorForm from '../components/AddVisitorForm'
import LockdownButton from '../components/LockdownButton'
import '../style/ParkMgmtContainer.css';


class ParkMgmtContainer extends Component {

    constructor(props) {
        super(props);
        this.state = {
            title: "Park Management",
            visitors: 0
        };

        this.handleNewVisitors = this.handleNewVisitors.bind(this);

    }

    handleNewVisitors(newVisitors){
      let currentVistors = this.state.visitors;
      let newVisitorTotal = currentVistors += parseInt(newVisitors);
      this.setState({visitors: newVisitorTotal});
    }

    render() {
        return (
            <div className="container">
                <PageTitleBar className="title" title={this.state.title}/>
                <ParkMap/>
                <AddVisitorForm currentvisitors={this.state.visitors} handleNewVisitors={this.handleNewVisitors}/>
                <LockdownButton/>
            </div>
        )
    }
}

export default ParkMgmtContainer;
