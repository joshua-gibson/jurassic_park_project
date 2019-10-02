import React, { Component } from 'react'
import PageTitleBar from '../components/PageTitleBar'
import ParkMap from '../components/ParkMap'
import AddPaddockForm from '../components/AddPaddockForm'
import LockdownButton from '../components/LockdownButton'
import '../style/ParkMgmtContainer.css';


class ParkMgmtContainer extends Component {

    constructor(props) {
        super(props);
        this.state = {
            title: "Park Management",
            lockdown: false,
            paddocks: []

        };
        this.handleLockdown = this.handleLockdown.bind(this);
    }

    componentDidMount() {
        const url = "http://localhost:8080/parks/paddocks";

        fetch(url)
            .then(res => res.json())

            .then(paddocks => this.setState({
                paddocks: paddocks
            }))
            .catch(err => console.error);
    }

    handleLockdown(ld) {
        this.setState({lockdown: ld});
    }

    

    render() {
        return (
            <div className="container">
                <PageTitleBar className="title" title={this.state.title}/>
                <ParkMap onPaddockSelect={this.props.onPaddockSelect} 
                    lockdown={this.state.lockdown} 
                    paddocks={this.state.paddocks}/>
                <AddPaddockForm />
                <LockdownButton onChange={this.handleLockdown}/>
            </div>
        )
    }
}

export default ParkMgmtContainer;