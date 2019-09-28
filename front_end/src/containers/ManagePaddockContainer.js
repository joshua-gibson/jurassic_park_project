import React, { Component } from 'react'
import PageTitleBar from '../components/PageTitleBar'

class ManagePaddockContainer extends Component {

    constructor(props) {
        super(props);
        this.state = {
            title: "Manage Paddocks"
        };
    }

    render() {
        return (
            <>
                <PageTitleBar title={this.state.title}/>
                <h1>Manage Paddock Container</h1>

            </>
        )
    }
}

export default ManagePaddockContainer;