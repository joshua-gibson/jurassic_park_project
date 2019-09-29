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
            lockdown: false
        };
        this.handleLockdown = this.handleLockdown.bind(this);
    }

    handleLockdown(ld) {
        this.setState({lockdown: ld});
    }

    render() {
        return (
            <div className="container">
                <PageTitleBar className="title" title={this.state.title}/>
                <ParkMap/>
                <AddVisitorForm/>
                <LockdownButton onChange={this.handleLockdown}/>
            </div>
        )
    }
}

export default ParkMgmtContainer;