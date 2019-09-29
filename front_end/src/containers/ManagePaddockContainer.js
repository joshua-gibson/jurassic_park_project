import React, { Component } from 'react'
import PageTitleBar from '../components/PageTitleBar'
import '../style/ManagePaddockContainer.css';

class ManagePaddockContainer extends Component {

    constructor(props) {
        super(props);
        this.state = {
            title: "Manage Paddocks"
        };
    }

    render() {
        return (
            <div className="container">
                <PageTitleBar className="title" title={this.state.title}/>
                <h1>Manage Paddock Container</h1>

            </div>
        )
    }
}

export default ManagePaddockContainer;