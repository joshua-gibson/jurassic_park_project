import React, { Component } from 'react'
import PageTitleBar from '../components/PageTitleBar'
import ParkMap from '../components/ParkMap'
import AddVisitorForm from '../components/AddVisitorForm'
import LockdownButton from '../components/LockdownButton'

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
      const visitors = this.state.visitors += newVisitors;
      this.setState({visitors: visitors});
    }

    render() {
        return (
            <>
                <PageTitleBar title={this.state.title}/>
                <h1>Park Management Container</h1>
                <ParkMap/>
                <AddVisitorForm handleNewVisitors={this.handleNewVisitors}/>
                <LockdownButton/>
            </>
        )
    }
}

export default ParkMgmtContainer;
