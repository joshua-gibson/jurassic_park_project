import React, { Component } from 'react'
import PageTitleBar from '../components/PageTitleBar'
import ParkMap from '../components/ParkMap'
import AddVisitorForm from '../components/AddVisitorForm'
import LockdownButton from '../components/LockdownButton'

class ParkMgmtContainer extends Component {

    constructor(props) {
        super(props);
        this.state = {
            title: "Park Management"
        };
    }

    render() {
        return (
            <>
                <PageTitleBar title={this.state.title}/>
                <h1>Park Management Container</h1>
                <ParkMap/>
                <AddVisitorForm/>
                <LockdownButton/>
            </>
        )
    }
}

export default ParkMgmtContainer;